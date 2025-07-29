
package io.tekton.crd.model.pipelineruns.v1;

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
    "podTemplate",
    "serviceAccountName",
    "sidecarSpecs",
    "stepSpecs",
    "timeout"
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
    /**
     * PodTemplate holds pod specific configuration
     * 
     */
    @JsonProperty("podTemplate")
    @JsonPropertyDescription("PodTemplate holds pod specific configuration")
    @Valid
    private PodTemplate podTemplate;
    @JsonProperty("serviceAccountName")
    private String serviceAccountName;
    @JsonProperty("sidecarSpecs")
    @Valid
    private List<SidecarSpec> sidecarSpecs = new ArrayList<SidecarSpec>();
    @JsonProperty("stepSpecs")
    @Valid
    private List<StepSpec> stepSpecs = new ArrayList<StepSpec>();
    /**
     * Time after which the TaskRun times out.
     * Refer Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration
     * 
     */
    @JsonProperty("timeout")
    @JsonPropertyDescription("Time after which the TaskRun times out.\nRefer Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration")
    private String timeout;
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

    /**
     * PodTemplate holds pod specific configuration
     * 
     */
    @JsonProperty("podTemplate")
    public PodTemplate getPodTemplate() {
        return podTemplate;
    }

    /**
     * PodTemplate holds pod specific configuration
     * 
     */
    @JsonProperty("podTemplate")
    public void setPodTemplate(PodTemplate podTemplate) {
        this.podTemplate = podTemplate;
    }

    public TaskRunSpec withPodTemplate(PodTemplate podTemplate) {
        this.podTemplate = podTemplate;
        return this;
    }

    @JsonProperty("serviceAccountName")
    public String getServiceAccountName() {
        return serviceAccountName;
    }

    @JsonProperty("serviceAccountName")
    public void setServiceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
    }

    public TaskRunSpec withServiceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
        return this;
    }

    @JsonProperty("sidecarSpecs")
    public List<SidecarSpec> getSidecarSpecs() {
        return sidecarSpecs;
    }

    @JsonProperty("sidecarSpecs")
    public void setSidecarSpecs(List<SidecarSpec> sidecarSpecs) {
        this.sidecarSpecs = sidecarSpecs;
    }

    public TaskRunSpec withSidecarSpecs(List<SidecarSpec> sidecarSpecs) {
        this.sidecarSpecs = sidecarSpecs;
        return this;
    }

    @JsonProperty("stepSpecs")
    public List<StepSpec> getStepSpecs() {
        return stepSpecs;
    }

    @JsonProperty("stepSpecs")
    public void setStepSpecs(List<StepSpec> stepSpecs) {
        this.stepSpecs = stepSpecs;
    }

    public TaskRunSpec withStepSpecs(List<StepSpec> stepSpecs) {
        this.stepSpecs = stepSpecs;
        return this;
    }

    /**
     * Time after which the TaskRun times out.
     * Refer Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration
     * 
     */
    @JsonProperty("timeout")
    public String getTimeout() {
        return timeout;
    }

    /**
     * Time after which the TaskRun times out.
     * Refer Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration
     * 
     */
    @JsonProperty("timeout")
    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public TaskRunSpec withTimeout(String timeout) {
        this.timeout = timeout;
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
        sb.append("podTemplate");
        sb.append('=');
        sb.append(((this.podTemplate == null)?"<null>":this.podTemplate));
        sb.append(',');
        sb.append("serviceAccountName");
        sb.append('=');
        sb.append(((this.serviceAccountName == null)?"<null>":this.serviceAccountName));
        sb.append(',');
        sb.append("sidecarSpecs");
        sb.append('=');
        sb.append(((this.sidecarSpecs == null)?"<null>":this.sidecarSpecs));
        sb.append(',');
        sb.append("stepSpecs");
        sb.append('=');
        sb.append(((this.stepSpecs == null)?"<null>":this.stepSpecs));
        sb.append(',');
        sb.append("timeout");
        sb.append('=');
        sb.append(((this.timeout == null)?"<null>":this.timeout));
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
        result = ((result* 31)+((this.sidecarSpecs == null)? 0 :this.sidecarSpecs.hashCode()));
        result = ((result* 31)+((this.serviceAccountName == null)? 0 :this.serviceAccountName.hashCode()));
        result = ((result* 31)+((this.computeResources == null)? 0 :this.computeResources.hashCode()));
        result = ((result* 31)+((this.podTemplate == null)? 0 :this.podTemplate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stepSpecs == null)? 0 :this.stepSpecs.hashCode()));
        result = ((result* 31)+((this.pipelineTaskName == null)? 0 :this.pipelineTaskName.hashCode()));
        result = ((result* 31)+((this.timeout == null)? 0 :this.timeout.hashCode()));
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
        return ((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.sidecarSpecs == rhs.sidecarSpecs)||((this.sidecarSpecs!= null)&&this.sidecarSpecs.equals(rhs.sidecarSpecs))))&&((this.serviceAccountName == rhs.serviceAccountName)||((this.serviceAccountName!= null)&&this.serviceAccountName.equals(rhs.serviceAccountName))))&&((this.computeResources == rhs.computeResources)||((this.computeResources!= null)&&this.computeResources.equals(rhs.computeResources))))&&((this.podTemplate == rhs.podTemplate)||((this.podTemplate!= null)&&this.podTemplate.equals(rhs.podTemplate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stepSpecs == rhs.stepSpecs)||((this.stepSpecs!= null)&&this.stepSpecs.equals(rhs.stepSpecs))))&&((this.pipelineTaskName == rhs.pipelineTaskName)||((this.pipelineTaskName!= null)&&this.pipelineTaskName.equals(rhs.pipelineTaskName))))&&((this.timeout == rhs.timeout)||((this.timeout!= null)&&this.timeout.equals(rhs.timeout))));
    }

}
