package io.tekton.crd.generator;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

@Command(
    name = "crd-java-generator",
    mixinStandardHelpOptions = true,
    version = "1.0.0",
    description = "Generate Java code from Tekton Custom Resource Definitions (CRDs)"
)
public class CrdJavaGenerator implements Callable<Integer> {
    
    private static final Logger logger = LoggerFactory.getLogger(CrdJavaGenerator.class);

    @Parameters(
        index = "0",
        description = "Directory containing CRD YAML files"
    )
    private File crdDirectory;

    @Option(
        names = {"-o", "--output"},
        description = "Output directory for generated Java code (default: ./generated)"
    )
    private File outputDirectory = new File("generated");

    @Option(
        names = {"-p", "--package"},
        description = "Base package name for generated classes (default: io.tekton.crd.model)"
    )
    private String basePackage = "io.tekton.crd.model";

    @Option(
        names = {"-v", "--verbose"},
        description = "Enable verbose logging"
    )
    private boolean verbose = false;

    private final CrdProcessor crdProcessor = new CrdProcessor();

    public static void main(String[] args) {
        int exitCode = new CommandLine(new CrdJavaGenerator()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() throws Exception {
        if (verbose) {
            System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
        }

        logger.info("Starting CRD Java code generation...");
        logger.info("CRD Directory: {}", crdDirectory.getAbsolutePath());
        logger.info("Output Directory: {}", outputDirectory.getAbsolutePath());
        logger.info("Base Package: {}", basePackage);

        // Validate input directory
        if (!crdDirectory.exists() || !crdDirectory.isDirectory()) {
            logger.error("CRD directory does not exist or is not a directory: {}", crdDirectory);
            return 1;
        }

        // Create output directory if it doesn't exist
        if (!outputDirectory.exists()) {
            boolean created = outputDirectory.mkdirs();
            if (!created) {
                logger.error("Failed to create output directory: {}", outputDirectory);
                return 1;
            }
        }

        try {
            // Process all CRD files
            crdProcessor.processDirectory(crdDirectory.toPath(), outputDirectory.toPath(), basePackage);
            logger.info("Java code generation completed successfully!");
            return 0;
        } catch (Exception e) {
            logger.error("Error during code generation", e);
            return 1;
        }
    }
} 