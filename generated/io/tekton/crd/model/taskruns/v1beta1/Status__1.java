
package io.tekton.crd.model.taskruns.v1beta1;

import java.util.Date;
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
 * CloudEventDeliveryState reports the state of a cloud event to be sent.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "condition",
    "message",
    "retryCount",
    "sentAt"
})
@Generated("jsonschema2pojo")
public class Status__1 {

    /**
     * Current status
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("Current status")
    private String condition;
    /**
     * Error is the text of error (if any)
     * (Required)
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("Error is the text of error (if any)")
    @NotNull
    private String message;
    /**
     * RetryCount is the number of attempts of sending the cloud event
     * (Required)
     * 
     */
    @JsonProperty("retryCount")
    @JsonPropertyDescription("RetryCount is the number of attempts of sending the cloud event")
    @NotNull
    private Integer retryCount;
    /**
     * SentAt is the time at which the last attempt to send the event was made
     * 
     */
    @JsonProperty("sentAt")
    @JsonPropertyDescription("SentAt is the time at which the last attempt to send the event was made")
    private Date sentAt;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Current status
     * 
     */
    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    /**
     * Current status
     * 
     */
    @JsonProperty("condition")
    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Status__1 withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Error is the text of error (if any)
     * (Required)
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Error is the text of error (if any)
     * (Required)
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public Status__1 withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * RetryCount is the number of attempts of sending the cloud event
     * (Required)
     * 
     */
    @JsonProperty("retryCount")
    public Integer getRetryCount() {
        return retryCount;
    }

    /**
     * RetryCount is the number of attempts of sending the cloud event
     * (Required)
     * 
     */
    @JsonProperty("retryCount")
    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    public Status__1 withRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    /**
     * SentAt is the time at which the last attempt to send the event was made
     * 
     */
    @JsonProperty("sentAt")
    public Date getSentAt() {
        return sentAt;
    }

    /**
     * SentAt is the time at which the last attempt to send the event was made
     * 
     */
    @JsonProperty("sentAt")
    public void setSentAt(Date sentAt) {
        this.sentAt = sentAt;
    }

    public Status__1 withSentAt(Date sentAt) {
        this.sentAt = sentAt;
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

    public Status__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Status__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("retryCount");
        sb.append('=');
        sb.append(((this.retryCount == null)?"<null>":this.retryCount));
        sb.append(',');
        sb.append("sentAt");
        sb.append('=');
        sb.append(((this.sentAt == null)?"<null>":this.sentAt));
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
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.sentAt == null)? 0 :this.sentAt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.retryCount == null)? 0 :this.retryCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Status__1) == false) {
            return false;
        }
        Status__1 rhs = ((Status__1) other);
        return ((((((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition)))&&((this.sentAt == rhs.sentAt)||((this.sentAt!= null)&&this.sentAt.equals(rhs.sentAt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.retryCount == rhs.retryCount)||((this.retryCount!= null)&&this.retryCount.equals(rhs.retryCount))));
    }

}
