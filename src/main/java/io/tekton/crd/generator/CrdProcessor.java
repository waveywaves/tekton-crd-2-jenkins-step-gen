package io.tekton.crd.generator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.rules.RuleFactory;
import com.sun.codemodel.JCodeModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class CrdProcessor {
    
    private static final Logger logger = LoggerFactory.getLogger(CrdProcessor.class);
    private final ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());
    private final ObjectMapper jsonMapper = new ObjectMapper();

    public void processDirectory(Path crdDirectory, Path outputDirectory, String basePackage) throws IOException {
        logger.info("Processing CRD directory: {}", crdDirectory);

        try (Stream<Path> files = Files.walk(crdDirectory)) {
            List<Path> yamlFiles = files
                .filter(Files::isRegularFile)
                .filter(path -> path.toString().toLowerCase().endsWith(".yaml") || 
                               path.toString().toLowerCase().endsWith(".yml"))
                .toList();

            logger.info("Found {} YAML files", yamlFiles.size());

            for (Path yamlFile : yamlFiles) {
                try {
                    processCrdFile(yamlFile, outputDirectory, basePackage);
                } catch (Exception e) {
                    logger.error("Error processing file: {}", yamlFile, e);
                    // Continue processing other files
                }
            }
        }
    }

    private void processCrdFile(Path crdFile, Path outputDirectory, String basePackage) throws IOException {
        logger.info("Processing CRD file: {}", crdFile.getFileName());

        // Parse the YAML file
        JsonNode crdRoot = yamlMapper.readTree(crdFile.toFile());
        
        // Validate this is a CRD
        if (!isCrd(crdRoot)) {
            logger.warn("File {} is not a valid CRD, skipping", crdFile.getFileName());
            return;
        }

        String crdName = extractCrdName(crdRoot);
        logger.info("Processing CRD: {}", crdName);

        // Extract all versions and their schemas
        JsonNode versions = crdRoot.at("/spec/versions");
        if (!versions.isArray()) {
            logger.warn("No versions found in CRD {}, skipping", crdName);
            return;
        }

        for (JsonNode version : versions) {
            processVersion(crdName, version, outputDirectory, basePackage);
        }
    }

    private void processVersion(String crdName, JsonNode version, Path outputDirectory, String basePackage) {
        String versionName = version.at("/name").asText();
        JsonNode schema = version.at("/schema/openAPIV3Schema");
        
        if (schema.isMissingNode()) {
            logger.warn("No schema found for version {} of CRD {}", versionName, crdName);
            return;
        }

        try {
            logger.info("Generating classes for CRD {} version {}", crdName, versionName);
            
            // Create package directory for this CRD and version
            String packageName = String.format("%s.%s.%s", basePackage, sanitizePackageName(crdName), versionName);
            String className = toPascalCase(crdName);
            
            // Generate Java classes from the schema
            generateJavaClasses(schema, outputDirectory, packageName, className);
            
        } catch (Exception e) {
            logger.error("Error generating classes for CRD {} version {}", crdName, versionName, e);
        }
    }

    private void generateJavaClasses(JsonNode schema, Path outputDirectory, String packageName, String className) throws IOException {
        // Convert JsonNode to JSON string for jsonschema2pojo
        String schemaJson = jsonMapper.writeValueAsString(schema);
        
        // Configure the code generator
        GenerationConfig config = new DefaultGenerationConfig() {
            @Override
            public boolean isGenerateBuilders() {
                return true;
            }
            
            @Override
            public boolean isUsePrimitives() {
                return false;
            }
            
            @Override
            public boolean isIncludeJsr303Annotations() {
                return true;
            }
            
            @Override
            public String getTargetPackage() {
                return packageName;
            }
        };

        SchemaMapper mapper = new SchemaMapper(
            new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()),
            new SchemaGenerator()
        );

        // Generate the Java classes
        File outputDir = outputDirectory.toFile();
        try {
            JCodeModel codeModel = new JCodeModel();
            mapper.generate(
                codeModel,
                className,
                packageName,
                schemaJson
            );
            codeModel.build(outputDir);
        } catch (Exception e) {
            logger.error("Failed to generate classes for {}: {}", className, e.getMessage());
            throw new IOException("Code generation failed", e);
        }

        logger.info("Generated Java classes in package: {}", packageName);
    }

    private boolean isCrd(JsonNode root) {
        return "CustomResourceDefinition".equals(root.at("/kind").asText()) &&
               root.at("/apiVersion").asText().startsWith("apiextensions.k8s.io/");
    }

    private String extractCrdName(JsonNode crd) {
        String fullName = crd.at("/metadata/name").asText();
        // Extract the resource name (e.g., "pipelines" from "pipelines.tekton.dev")
        return fullName.split("\\.")[0];
    }

    private String sanitizePackageName(String name) {
        // Convert to lowercase and replace non-alphanumeric characters with underscores
        return name.toLowerCase().replaceAll("[^a-z0-9]", "_");
    }

    private String toPascalCase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;
        
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            } else {
                capitalizeNext = true;
            }
        }
        
        return result.toString();
    }
} 