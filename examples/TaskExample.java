package examples;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import io.tekton.crd.model.tasks.v1.Tasks;
import io.tekton.crd.model.tasks.v1.Spec;
import io.tekton.crd.model.tasks.v1.Step;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Example demonstrating how to use the generated Java classes
 * to parse and work with Tekton Task CRDs.
 */
public class TaskExample {
    
    private static final ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());
    
    public static void main(String[] args) throws IOException {
        // Example 1: Parse a Task YAML file
        parseTaskFromFile();
        
        // Example 2: Create a Task programmatically
        createTaskProgrammatically();
    }
    
    /**
     * Example of parsing a Task YAML file into Java objects
     */
    public static void parseTaskFromFile() throws IOException {
        System.out.println("=== Parsing Task from YAML file ===");
        
        // Create a sample task YAML content
        String taskYaml = """
            apiVersion: tekton.dev/v1
            kind: Task
            metadata:
              name: hello-world-task
              namespace: default
            spec:
              description: A simple hello world task
              steps:
              - name: echo
                image: ubuntu
                script: |
                  echo "Hello World!"
              - name: goodbye
                image: ubuntu
                script: |
                  echo "Goodbye!"
            """;
        
        // Write to temporary file for demonstration
        File tempFile = File.createTempFile("task", ".yaml");
        tempFile.deleteOnExit();
        java.nio.file.Files.writeString(tempFile.toPath(), taskYaml);
        
        // Parse the YAML file into Java objects
        Tasks task = yamlMapper.readValue(tempFile, Tasks.class);
        
        // Access the parsed data
        System.out.println("Task Name: " + task.getMetadata().getName());
        System.out.println("Task Namespace: " + task.getMetadata().getNamespace());
        System.out.println("Task Description: " + task.getSpec().getDescription());
        
        List<Step> steps = task.getSpec().getSteps();
        System.out.println("Number of steps: " + steps.size());
        
        for (int i = 0; i < steps.size(); i++) {
            Step step = steps.get(i);
            System.out.println("Step " + (i + 1) + ": " + step.getName() + " (image: " + step.getImage() + ")");
        }
        
        System.out.println();
    }
    
    /**
     * Example of creating a Task programmatically using the generated classes
     */
    public static void createTaskProgrammatically() throws IOException {
        System.out.println("=== Creating Task programmatically ===");
        
        // Create a new Task using the generated classes
        Tasks task = new Tasks();
        
        // Set API version and kind
        task.setApiVersion("tekton.dev/v1");
        task.setKind("Task");
        
        // Create and set metadata
        io.tekton.crd.model.tasks.v1.Metadata metadata = 
            new io.tekton.crd.model.tasks.v1.Metadata();
        metadata.setName("programmatic-task");
        metadata.setNamespace("tekton-pipelines");
        task.setMetadata(metadata);
        
        // Create spec
        Spec spec = new Spec();
        spec.setDescription("A task created programmatically");
        
        // Create steps
        Step buildStep = new Step();
        buildStep.setName("build");
        buildStep.setImage("maven:3.8-openjdk-17");
        buildStep.setScript("mvn clean compile");
        
        Step testStep = new Step();
        testStep.setName("test");
        testStep.setImage("maven:3.8-openjdk-17");
        testStep.setScript("mvn test");
        
        spec.setSteps(List.of(buildStep, testStep));
        task.setSpec(spec);
        
        // Convert back to YAML
        String taskYaml = yamlMapper.writeValueAsString(task);
        System.out.println("Generated Task YAML:");
        System.out.println(taskYaml);
        
        // Demonstrate accessing the data
        System.out.println("Task created with " + task.getSpec().getSteps().size() + " steps:");
        for (Step step : task.getSpec().getSteps()) {
            System.out.println("- " + step.getName() + " using image " + step.getImage());
        }
    }
} 