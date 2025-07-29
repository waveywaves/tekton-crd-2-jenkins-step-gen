
package io.tekton.crd.model.taskruns.v1beta1;

import java.util.LinkedHashMap;
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
 * Condition defines a readiness condition for a Knative resource.
 * See: https://github.com/kubernetes/community/blob/master/contributors/devel/sig-architecture/api-conventions.md#typical-status-properties
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lastTransitionTime",
    "message",
    "reason",
    "severity",
    "status",
    "type"
})
@Generated("jsonschema2pojo")
public class Condition {

    /**
     * LastTransitionTime is the last time the condition transitioned from one status to another.
     * We use VolatileTime in place of metav1.Time to exclude this from creating equality.Semantic
     * differences (all other things held constant).
     * 
     */
    @JsonProperty("lastTransitionTime")
    @JsonPropertyDescription("LastTransitionTime is the last time the condition transitioned from one status to another.\nWe use VolatileTime in place of metav1.Time to exclude this from creating equality.Semantic\ndifferences (all other things held constant).")
    private String lastTransitionTime;
    /**
     * A human readable message indicating details about the transition.
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("A human readable message indicating details about the transition.")
    private String message;
    /**
     * The reason for the condition's last transition.
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("The reason for the condition's last transition.")
    private String reason;
    /**
     * Severity with which to treat failures of this type of condition.
     * When this is not specified, it defaults to Error.
     * 
     */
    @JsonProperty("severity")
    @JsonPropertyDescription("Severity with which to treat failures of this type of condition.\nWhen this is not specified, it defaults to Error.")
    private String severity;
    /**
     * Status of the condition, one of True, False, Unknown.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Status of the condition, one of True, False, Unknown.")
    @NotNull
    private String status;
    /**
     * Type of condition.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of condition.")
    @NotNull
    private String type;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * LastTransitionTime is the last time the condition transitioned from one status to another.
     * We use VolatileTime in place of metav1.Time to exclude this from creating equality.Semantic
     * differences (all other things held constant).
     * 
     */
    @JsonProperty("lastTransitionTime")
    public String getLastTransitionTime() {
        return lastTransitionTime;
    }

    /**
     * LastTransitionTime is the last time the condition transitioned from one status to another.
     * We use VolatileTime in place of metav1.Time to exclude this from creating equality.Semantic
     * differences (all other things held constant).
     * 
     */
    @JsonProperty("lastTransitionTime")
    public void setLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
    }

    public Condition withLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    /**
     * A human readable message indicating details about the transition.
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * A human readable message indicating details about the transition.
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public Condition withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * The reason for the condition's last transition.
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * The reason for the condition's last transition.
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    public Condition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Severity with which to treat failures of this type of condition.
     * When this is not specified, it defaults to Error.
     * 
     */
    @JsonProperty("severity")
    public String getSeverity() {
        return severity;
    }

    /**
     * Severity with which to treat failures of this type of condition.
     * When this is not specified, it defaults to Error.
     * 
     */
    @JsonProperty("severity")
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Condition withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Status of the condition, one of True, False, Unknown.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Status of the condition, one of True, False, Unknown.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Condition withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Type of condition.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type of condition.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Condition withType(String type) {
        this.type = type;
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

    public Condition withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Condition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lastTransitionTime");
        sb.append('=');
        sb.append(((this.lastTransitionTime == null)?"<null>":this.lastTransitionTime));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("severity");
        sb.append('=');
        sb.append(((this.severity == null)?"<null>":this.severity));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.severity == null)? 0 :this.severity.hashCode()));
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lastTransitionTime == null)? 0 :this.lastTransitionTime.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Condition) == false) {
            return false;
        }
        Condition rhs = ((Condition) other);
        return ((((((((this.severity == rhs.severity)||((this.severity!= null)&&this.severity.equals(rhs.severity)))&&((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lastTransitionTime == rhs.lastTransitionTime)||((this.lastTransitionTime!= null)&&this.lastTransitionTime.equals(rhs.lastTransitionTime))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
