
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
 * PipelineRunTaskRunStatus contains the name of the PipelineTask for this TaskRun and the TaskRun's Status
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pipelineTaskName",
    "status",
    "whenExpressions"
})
@Generated("jsonschema2pojo")
public class TaskRunsProperty {

    /**
     * PipelineTaskName is the name of the PipelineTask.
     * 
     */
    @JsonProperty("pipelineTaskName")
    @JsonPropertyDescription("PipelineTaskName is the name of the PipelineTask.")
    private String pipelineTaskName;
    /**
     * Status is the TaskRunStatus for the corresponding TaskRun
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Status is the TaskRunStatus for the corresponding TaskRun")
    @Valid
    private Status__2 status;
    /**
     * WhenExpressions is the list of checks guarding the execution of the PipelineTask
     * 
     */
    @JsonProperty("whenExpressions")
    @JsonPropertyDescription("WhenExpressions is the list of checks guarding the execution of the PipelineTask")
    @Valid
    private List<WhenExpression__3> whenExpressions = new ArrayList<WhenExpression__3>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * PipelineTaskName is the name of the PipelineTask.
     * 
     */
    @JsonProperty("pipelineTaskName")
    public String getPipelineTaskName() {
        return pipelineTaskName;
    }

    /**
     * PipelineTaskName is the name of the PipelineTask.
     * 
     */
    @JsonProperty("pipelineTaskName")
    public void setPipelineTaskName(String pipelineTaskName) {
        this.pipelineTaskName = pipelineTaskName;
    }

    public TaskRunsProperty withPipelineTaskName(String pipelineTaskName) {
        this.pipelineTaskName = pipelineTaskName;
        return this;
    }

    /**
     * Status is the TaskRunStatus for the corresponding TaskRun
     * 
     */
    @JsonProperty("status")
    public Status__2 getStatus() {
        return status;
    }

    /**
     * Status is the TaskRunStatus for the corresponding TaskRun
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status__2 status) {
        this.status = status;
    }

    public TaskRunsProperty withStatus(Status__2 status) {
        this.status = status;
        return this;
    }

    /**
     * WhenExpressions is the list of checks guarding the execution of the PipelineTask
     * 
     */
    @JsonProperty("whenExpressions")
    public List<WhenExpression__3> getWhenExpressions() {
        return whenExpressions;
    }

    /**
     * WhenExpressions is the list of checks guarding the execution of the PipelineTask
     * 
     */
    @JsonProperty("whenExpressions")
    public void setWhenExpressions(List<WhenExpression__3> whenExpressions) {
        this.whenExpressions = whenExpressions;
    }

    public TaskRunsProperty withWhenExpressions(List<WhenExpression__3> whenExpressions) {
        this.whenExpressions = whenExpressions;
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

    public TaskRunsProperty withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TaskRunsProperty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pipelineTaskName");
        sb.append('=');
        sb.append(((this.pipelineTaskName == null)?"<null>":this.pipelineTaskName));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("whenExpressions");
        sb.append('=');
        sb.append(((this.whenExpressions == null)?"<null>":this.whenExpressions));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.pipelineTaskName == null)? 0 :this.pipelineTaskName.hashCode()));
        result = ((result* 31)+((this.whenExpressions == null)? 0 :this.whenExpressions.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskRunsProperty) == false) {
            return false;
        }
        TaskRunsProperty rhs = ((TaskRunsProperty) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.pipelineTaskName == rhs.pipelineTaskName)||((this.pipelineTaskName!= null)&&this.pipelineTaskName.equals(rhs.pipelineTaskName))))&&((this.whenExpressions == rhs.whenExpressions)||((this.whenExpressions!= null)&&this.whenExpressions.equals(rhs.whenExpressions))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
