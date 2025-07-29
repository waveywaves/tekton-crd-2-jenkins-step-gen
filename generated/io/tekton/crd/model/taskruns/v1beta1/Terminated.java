
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
 * Details about a terminated container
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "containerID",
    "exitCode",
    "finishedAt",
    "message",
    "reason",
    "signal",
    "startedAt"
})
@Generated("jsonschema2pojo")
public class Terminated {

    /**
     * Container's ID in the format '<type>://<container_id>'
     * 
     */
    @JsonProperty("containerID")
    @JsonPropertyDescription("Container's ID in the format '<type>://<container_id>'")
    private String containerID;
    /**
     * Exit status from the last termination of the container
     * (Required)
     * 
     */
    @JsonProperty("exitCode")
    @JsonPropertyDescription("Exit status from the last termination of the container")
    @NotNull
    private Integer exitCode;
    /**
     * Time at which the container last terminated
     * 
     */
    @JsonProperty("finishedAt")
    @JsonPropertyDescription("Time at which the container last terminated")
    private Date finishedAt;
    /**
     * Message regarding the last termination of the container
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("Message regarding the last termination of the container")
    private String message;
    /**
     * (brief) reason from the last termination of the container
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("(brief) reason from the last termination of the container")
    private String reason;
    /**
     * Signal from the last termination of the container
     * 
     */
    @JsonProperty("signal")
    @JsonPropertyDescription("Signal from the last termination of the container")
    private Integer signal;
    /**
     * Time at which previous execution of the container started
     * 
     */
    @JsonProperty("startedAt")
    @JsonPropertyDescription("Time at which previous execution of the container started")
    private Date startedAt;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Container's ID in the format '<type>://<container_id>'
     * 
     */
    @JsonProperty("containerID")
    public String getContainerID() {
        return containerID;
    }

    /**
     * Container's ID in the format '<type>://<container_id>'
     * 
     */
    @JsonProperty("containerID")
    public void setContainerID(String containerID) {
        this.containerID = containerID;
    }

    public Terminated withContainerID(String containerID) {
        this.containerID = containerID;
        return this;
    }

    /**
     * Exit status from the last termination of the container
     * (Required)
     * 
     */
    @JsonProperty("exitCode")
    public Integer getExitCode() {
        return exitCode;
    }

    /**
     * Exit status from the last termination of the container
     * (Required)
     * 
     */
    @JsonProperty("exitCode")
    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    public Terminated withExitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * Time at which the container last terminated
     * 
     */
    @JsonProperty("finishedAt")
    public Date getFinishedAt() {
        return finishedAt;
    }

    /**
     * Time at which the container last terminated
     * 
     */
    @JsonProperty("finishedAt")
    public void setFinishedAt(Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    public Terminated withFinishedAt(Date finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * Message regarding the last termination of the container
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Message regarding the last termination of the container
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public Terminated withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * (brief) reason from the last termination of the container
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * (brief) reason from the last termination of the container
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    public Terminated withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Signal from the last termination of the container
     * 
     */
    @JsonProperty("signal")
    public Integer getSignal() {
        return signal;
    }

    /**
     * Signal from the last termination of the container
     * 
     */
    @JsonProperty("signal")
    public void setSignal(Integer signal) {
        this.signal = signal;
    }

    public Terminated withSignal(Integer signal) {
        this.signal = signal;
        return this;
    }

    /**
     * Time at which previous execution of the container started
     * 
     */
    @JsonProperty("startedAt")
    public Date getStartedAt() {
        return startedAt;
    }

    /**
     * Time at which previous execution of the container started
     * 
     */
    @JsonProperty("startedAt")
    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public Terminated withStartedAt(Date startedAt) {
        this.startedAt = startedAt;
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

    public Terminated withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Terminated.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("containerID");
        sb.append('=');
        sb.append(((this.containerID == null)?"<null>":this.containerID));
        sb.append(',');
        sb.append("exitCode");
        sb.append('=');
        sb.append(((this.exitCode == null)?"<null>":this.exitCode));
        sb.append(',');
        sb.append("finishedAt");
        sb.append('=');
        sb.append(((this.finishedAt == null)?"<null>":this.finishedAt));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("signal");
        sb.append('=');
        sb.append(((this.signal == null)?"<null>":this.signal));
        sb.append(',');
        sb.append("startedAt");
        sb.append('=');
        sb.append(((this.startedAt == null)?"<null>":this.startedAt));
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
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.exitCode == null)? 0 :this.exitCode.hashCode()));
        result = ((result* 31)+((this.startedAt == null)? 0 :this.startedAt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.containerID == null)? 0 :this.containerID.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.signal == null)? 0 :this.signal.hashCode()));
        result = ((result* 31)+((this.finishedAt == null)? 0 :this.finishedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Terminated) == false) {
            return false;
        }
        Terminated rhs = ((Terminated) other);
        return (((((((((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason)))&&((this.exitCode == rhs.exitCode)||((this.exitCode!= null)&&this.exitCode.equals(rhs.exitCode))))&&((this.startedAt == rhs.startedAt)||((this.startedAt!= null)&&this.startedAt.equals(rhs.startedAt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.containerID == rhs.containerID)||((this.containerID!= null)&&this.containerID.equals(rhs.containerID))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.signal == rhs.signal)||((this.signal!= null)&&this.signal.equals(rhs.signal))))&&((this.finishedAt == rhs.finishedAt)||((this.finishedAt!= null)&&this.finishedAt.equals(rhs.finishedAt))));
    }

}
