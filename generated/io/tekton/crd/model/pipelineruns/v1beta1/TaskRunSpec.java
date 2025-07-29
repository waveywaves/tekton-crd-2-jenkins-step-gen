
package io.tekton.crd.model.pipelineruns.v1beta1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PipelineTaskRunSpec  can be used to configure specific
 * specs for a concrete Task
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "computeResources",
    "metadata",
    "pipelineTaskName",
    "sidecarOverrides",
    "stepOverrides",
    "taskPodTemplate",
    "taskServiceAccountName"
})
@Generated("jsonschema2pojo")
public class TaskRunSpec {

    /**
     * Compute resources to use for this TaskRun
     * 
     */
    @JsonProperty("computeResources")
    @JsonPropertyDescription("Compute resources to use for this TaskRun")
    @Valid
    private ComputeResources computeResources;
    /**
     * PipelineTaskMetadata contains the labels or annotations for an EmbeddedTask
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("PipelineTaskMetadata contains the labels or annotations for an EmbeddedTask")
    @Valid
    private Metadata__1 metadata;
    @JsonProperty("pipelineTaskName")
    private String pipelineTaskName;
    @JsonProperty("sidecarOverrides")
    @Valid
    private List<SidecarOverride> sidecarOverrides = new ArrayList<SidecarOverride>();
    @JsonProperty("stepOverrides")
    @Valid
    private List<StepOverride> stepOverrides = new ArrayList<StepOverride>();
    /**
     * PodTemplate holds pod specific configuration
     * 
     */
    @JsonProperty("taskPodTemplate")
    @JsonPropertyDescription("PodTemplate holds pod specific configuration")
    @Valid
    private TaskPodTemplate taskPodTemplate;
    @JsonProperty("taskServiceAccountName")
    private String taskServiceAccountName;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Compute resources to use for this TaskRun
     * 
     */
    @JsonProperty("computeResources")
    public ComputeResources getComputeResources() {
        return computeResources;
    }

    /**
     * Compute resources to use for this TaskRun
     * 
     */
    @JsonProperty("computeResources")
    public void setComputeResources(ComputeResources computeResources) {
        this.computeResources = computeResources;
    }

    public TaskRunSpec withComputeResources(ComputeResources computeResources) {
        this.computeResources = computeResources;
        return this;
    }

    /**
     * PipelineTaskMetadata contains the labels or annotations for an EmbeddedTask
     * 
     */
    @JsonProperty("metadata")
    public Metadata__1 getMetadata() {
        return metadata;
    }

    /**
     * PipelineTaskMetadata contains the labels or annotations for an EmbeddedTask
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata__1 metadata) {
        this.metadata = metadata;
    }

    public TaskRunSpec withMetadata(Metadata__1 metadata) {
        this.metadata = metadata;
        return this;
    }

    @JsonProperty("pipelineTaskName")
    public String getPipelineTaskName() {
        return pipelineTaskName;
    }

    @JsonProperty("pipelineTaskName")
    public void setPipelineTaskName(String pipelineTaskName) {
        this.pipelineTaskName = pipelineTaskName;
    }

    public TaskRunSpec withPipelineTaskName(String pipelineTaskName) {
        this.pipelineTaskName = pipelineTaskName;
        return this;
    }

    @JsonProperty("sidecarOverrides")
    public List<SidecarOverride> getSidecarOverrides() {
        return sidecarOverrides;
    }

    @JsonProperty("sidecarOverrides")
    public void setSidecarOverrides(List<SidecarOverride> sidecarOverrides) {
        this.sidecarOverrides = sidecarOverrides;
    }

    public TaskRunSpec withSidecarOverrides(List<SidecarOverride> sidecarOverrides) {
        this.sidecarOverrides = sidecarOverrides;
        return this;
    }

    @JsonProperty("stepOverrides")
    public List<StepOverride> getStepOverrides() {
        return stepOverrides;
    }

    @JsonProperty("stepOverrides")
    public void setStepOverrides(List<StepOverride> stepOverrides) {
        this.stepOverrides = stepOverrides;
    }

    public TaskRunSpec withStepOverrides(List<StepOverride> stepOverrides) {
        this.stepOverrides = stepOverrides;
        return this;
    }

    /**
     * PodTemplate holds pod specific configuration
     * 
     */
    @JsonProperty("taskPodTemplate")
    public TaskPodTemplate getTaskPodTemplate() {
        return taskPodTemplate;
    }

    /**
     * PodTemplate holds pod specific configuration
     * 
     */
    @JsonProperty("taskPodTemplate")
    public void setTaskPodTemplate(TaskPodTemplate taskPodTemplate) {
        this.taskPodTemplate = taskPodTemplate;
    }

    public TaskRunSpec withTaskPodTemplate(TaskPodTemplate taskPodTemplate) {
        this.taskPodTemplate = taskPodTemplate;
        return this;
    }

    @JsonProperty("taskServiceAccountName")
    public String getTaskServiceAccountName() {
        return taskServiceAccountName;
    }

    @JsonProperty("taskServiceAccountName")
    public void setTaskServiceAccountName(String taskServiceAccountName) {
        this.taskServiceAccountName = taskServiceAccountName;
    }

    public TaskRunSpec withTaskServiceAccountName(String taskServiceAccountName) {
        this.taskServiceAccountName = taskServiceAccountName;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public TaskRunSpec withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TaskRunSpec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("computeResources");
        sb.append('=');
        sb.append(((this.computeResources == null)?"<null>":this.computeResources));
        sb.append(',');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("pipelineTaskName");
        sb.append('=');
        sb.append(((this.pipelineTaskName == null)?"<null>":this.pipelineTaskName));
        sb.append(',');
        sb.append("sidecarOverrides");
        sb.append('=');
        sb.append(((this.sidecarOverrides == null)?"<null>":this.sidecarOverrides));
        sb.append(',');
        sb.append("stepOverrides");
        sb.append('=');
        sb.append(((this.stepOverrides == null)?"<null>":this.stepOverrides));
        sb.append(',');
        sb.append("taskPodTemplate");
        sb.append('=');
        sb.append(((this.taskPodTemplate == null)?"<null>":this.taskPodTemplate));
        sb.append(',');
        sb.append("taskServiceAccountName");
        sb.append('=');
        sb.append(((this.taskServiceAccountName == null)?"<null>":this.taskServiceAccountName));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.taskPodTemplate == null)? 0 :this.taskPodTemplate.hashCode()));
        result = ((result* 31)+((this.computeResources == null)? 0 :this.computeResources.hashCode()));
        result = ((result* 31)+((this.taskServiceAccountName == null)? 0 :this.taskServiceAccountName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sidecarOverrides == null)? 0 :this.sidecarOverrides.hashCode()));
        result = ((result* 31)+((this.pipelineTaskName == null)? 0 :this.pipelineTaskName.hashCode()));
        result = ((result* 31)+((this.stepOverrides == null)? 0 :this.stepOverrides.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskRunSpec) == false) {
            return false;
        }
        TaskRunSpec rhs = ((TaskRunSpec) other);
        return (((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.taskPodTemplate == rhs.taskPodTemplate)||((this.taskPodTemplate!= null)&&this.taskPodTemplate.equals(rhs.taskPodTemplate))))&&((this.computeResources == rhs.computeResources)||((this.computeResources!= null)&&this.computeResources.equals(rhs.computeResources))))&&((this.taskServiceAccountName == rhs.taskServiceAccountName)||((this.taskServiceAccountName!= null)&&this.taskServiceAccountName.equals(rhs.taskServiceAccountName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sidecarOverrides == rhs.sidecarOverrides)||((this.sidecarOverrides!= null)&&this.sidecarOverrides.equals(rhs.sidecarOverrides))))&&((this.pipelineTaskName == rhs.pipelineTaskName)||((this.pipelineTaskName!= null)&&this.pipelineTaskName.equals(rhs.pipelineTaskName))))&&((this.stepOverrides == rhs.stepOverrides)||((this.stepOverrides!= null)&&this.stepOverrides.equals(rhs.stepOverrides))));
    }

}
