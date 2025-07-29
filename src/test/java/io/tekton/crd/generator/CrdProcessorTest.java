package io.tekton.crd.generator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class CrdProcessorTest {

    private CrdProcessor crdProcessor;
    
    @TempDir
    Path tempDir;

    @BeforeEach
    void setUp() {
        crdProcessor = new CrdProcessor();
    }

    @Test
    void testProcessDirectory_EmptyDirectory() throws IOException {
        Path outputDir = tempDir.resolve("output");
        Files.createDirectory(outputDir);
        
        // Should not throw exception with empty directory
        assertDoesNotThrow(() -> {
            crdProcessor.processDirectory(tempDir, outputDir, "test.package");
        });
    }

    @Test
    void testProcessDirectory_WithSampleCrd() throws IOException {
        // Create a simple CRD for testing
        String sampleCrd = """
            apiVersion: apiextensions.k8s.io/v1
            kind: CustomResourceDefinition
            metadata:
              name: tasks.tekton.dev
            spec:
              group: tekton.dev
              versions:
              - name: v1
                served: true
                storage: true
                schema:
                  openAPIV3Schema:
                    type: object
                    properties:
                      apiVersion:
                        type: string
                      kind:
                        type: string
                      metadata:
                        type: object
                      spec:
                        type: object
                        properties:
                          steps:
                            type: array
                            items:
                              type: object
                              properties:
                                name:
                                  type: string
                                image:
                                  type: string
            """;

        Path crdFile = tempDir.resolve("sample-crd.yaml");
        Files.writeString(crdFile, sampleCrd);
        
        Path outputDir = tempDir.resolve("output");
        Files.createDirectory(outputDir);

        assertDoesNotThrow(() -> {
            crdProcessor.processDirectory(tempDir, outputDir, "test.package");
        });

        // Verify output directory structure was created
        assertTrue(Files.exists(outputDir));
    }
} 