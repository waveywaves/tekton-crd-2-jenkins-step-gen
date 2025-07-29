
package io.tekton.crd.model.pipelineruns.v1beta1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SkippedTask is used to describe the Tasks that were skipped due to their When Expressions
 * evaluating to False. This is a struct because we are looking into including more details
 * about the When Expressions that caused this Task to be skipped.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "reason",
    "whenExpressions"
})
@Generated("jsonschema2pojo")
public class SkippedTask {

    /**
     * Name is the Pipeline Task name
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name is the Pipeline Task name")
    @NotNull
    private String name;
    /**
     * Reason is the cause of the PipelineTask being skipped.
     * (Required)
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("Reason is the cause of the PipelineTask being skipped.")
    @NotNull
    private String reason;
    /**
     * WhenExpressions is the list of checks guarding the execution of the PipelineTask
     * 
     */
    @JsonProperty("whenExpressions")
    @JsonPropertyDescription("WhenExpressions is the list of checks guarding the execution of the PipelineTask")
    @Valid
    private List<WhenExpression__2> whenExpressions = new ArrayList<WhenExpression__2>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Name is the Pipeline Task name
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name is the Pipeline Task name
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public SkippedTask withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Reason is the cause of the PipelineTask being skipped.
     * (Required)
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Reason is the cause of the PipelineTask being skipped.
     * (Required)
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    public SkippedTask withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * WhenExpressions is the list of checks guarding the execution of the PipelineTask
     * 
     */
    @JsonProperty("whenExpressions")
    public List<WhenExpression__2> getWhenExpressions() {
        return whenExpressions;
    }

    /**
     * WhenExpressions is the list of checks guarding the execution of the PipelineTask
     * 
     */
    @JsonProperty("whenExpressions")
    public void setWhenExpressions(List<WhenExpression__2> whenExpressions) {
        this.whenExpressions = whenExpressions;
    }

    public SkippedTask withWhenExpressions(List<WhenExpression__2> whenExpressions) {
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

    public SkippedTask withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SkippedTask.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.whenExpressions == null)? 0 :this.whenExpressions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SkippedTask) == false) {
            return false;
        }
        SkippedTask rhs = ((SkippedTask) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.whenExpressions == rhs.whenExpressions)||((this.whenExpressions!= null)&&this.whenExpressions.equals(rhs.whenExpressions))));
    }

}
