
package io.tekton.crd.model.customruns.v1beta1;

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
 * CustomRunSpec defines the desired state of CustomRun
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customRef",
    "customSpec",
    "params",
    "retries",
    "serviceAccountName",
    "status",
    "statusMessage",
    "timeout",
    "workspaces"
})
@Generated("jsonschema2pojo")
public class Spec {

    /**
     * TaskRef can be used to refer to a specific instance of a task.
     * 
     */
    @JsonProperty("customRef")
    @JsonPropertyDescription("TaskRef can be used to refer to a specific instance of a task.")
    @Valid
    private CustomRef customRef;
    /**
     * Spec is a specification of a custom task
     * 
     */
    @JsonProperty("customSpec")
    @JsonPropertyDescription("Spec is a specification of a custom task")
    @Valid
    private CustomSpec customSpec;
    /**
     * Params is a list of Param
     * 
     */
    @JsonProperty("params")
    @JsonPropertyDescription("Params is a list of Param")
    @Valid
    private List<Param__1> params = new ArrayList<Param__1>();
    /**
     * Used for propagating retries count to custom tasks
     * 
     */
    @JsonProperty("retries")
    @JsonPropertyDescription("Used for propagating retries count to custom tasks")
    private Integer retries;
    @JsonProperty("serviceAccountName")
    private String serviceAccountName;
    /**
     * Used for cancelling a customrun (and maybe more later on)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Used for cancelling a customrun (and maybe more later on)")
    private String status;
    /**
     * Status message for cancellation.
     * 
     */
    @JsonProperty("statusMessage")
    @JsonPropertyDescription("Status message for cancellation.")
    private String statusMessage;
    /**
     * Time after which the custom-task times out.
     * Refer Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration
     * 
     */
    @JsonProperty("timeout")
    @JsonPropertyDescription("Time after which the custom-task times out.\nRefer Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration")
    private String timeout;
    /**
     * Workspaces is a list of WorkspaceBindings from volumes to workspaces.
     * 
     */
    @JsonProperty("workspaces")
    @JsonPropertyDescription("Workspaces is a list of WorkspaceBindings from volumes to workspaces.")
    @Valid
    private List<Workspace> workspaces = new ArrayList<Workspace>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * TaskRef can be used to refer to a specific instance of a task.
     * 
     */
    @JsonProperty("customRef")
    public CustomRef getCustomRef() {
        return customRef;
    }

    /**
     * TaskRef can be used to refer to a specific instance of a task.
     * 
     */
    @JsonProperty("customRef")
    public void setCustomRef(CustomRef customRef) {
        this.customRef = customRef;
    }

    public Spec withCustomRef(CustomRef customRef) {
        this.customRef = customRef;
        return this;
    }

    /**
     * Spec is a specification of a custom task
     * 
     */
    @JsonProperty("customSpec")
    public CustomSpec getCustomSpec() {
        return customSpec;
    }

    /**
     * Spec is a specification of a custom task
     * 
     */
    @JsonProperty("customSpec")
    public void setCustomSpec(CustomSpec customSpec) {
        this.customSpec = customSpec;
    }

    public Spec withCustomSpec(CustomSpec customSpec) {
        this.customSpec = customSpec;
        return this;
    }

    /**
     * Params is a list of Param
     * 
     */
    @JsonProperty("params")
    public List<Param__1> getParams() {
        return params;
    }

    /**
     * Params is a list of Param
     * 
     */
    @JsonProperty("params")
    public void setParams(List<Param__1> params) {
        this.params = params;
    }

    public Spec withParams(List<Param__1> params) {
        this.params = params;
        return this;
    }

    /**
     * Used for propagating retries count to custom tasks
     * 
     */
    @JsonProperty("retries")
    public Integer getRetries() {
        return retries;
    }

    /**
     * Used for propagating retries count to custom tasks
     * 
     */
    @JsonProperty("retries")
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public Spec withRetries(Integer retries) {
        this.retries = retries;
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

    public Spec withServiceAccountName(String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
        return this;
    }

    /**
     * Used for cancelling a customrun (and maybe more later on)
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Used for cancelling a customrun (and maybe more later on)
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Spec withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Status message for cancellation.
     * 
     */
    @JsonProperty("statusMessage")
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Status message for cancellation.
     * 
     */
    @JsonProperty("statusMessage")
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public Spec withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * Time after which the custom-task times out.
     * Refer Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration
     * 
     */
    @JsonProperty("timeout")
    public String getTimeout() {
        return timeout;
    }

    /**
     * Time after which the custom-task times out.
     * Refer Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration
     * 
     */
    @JsonProperty("timeout")
    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public Spec withTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Workspaces is a list of WorkspaceBindings from volumes to workspaces.
     * 
     */
    @JsonProperty("workspaces")
    public List<Workspace> getWorkspaces() {
        return workspaces;
    }

    /**
     * Workspaces is a list of WorkspaceBindings from volumes to workspaces.
     * 
     */
    @JsonProperty("workspaces")
    public void setWorkspaces(List<Workspace> workspaces) {
        this.workspaces = workspaces;
    }

    public Spec withWorkspaces(List<Workspace> workspaces) {
        this.workspaces = workspaces;
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

    public Spec withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Spec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customRef");
        sb.append('=');
        sb.append(((this.customRef == null)?"<null>":this.customRef));
        sb.append(',');
        sb.append("customSpec");
        sb.append('=');
        sb.append(((this.customSpec == null)?"<null>":this.customSpec));
        sb.append(',');
        sb.append("params");
        sb.append('=');
        sb.append(((this.params == null)?"<null>":this.params));
        sb.append(',');
        sb.append("retries");
        sb.append('=');
        sb.append(((this.retries == null)?"<null>":this.retries));
        sb.append(',');
        sb.append("serviceAccountName");
        sb.append('=');
        sb.append(((this.serviceAccountName == null)?"<null>":this.serviceAccountName));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("statusMessage");
        sb.append('=');
        sb.append(((this.statusMessage == null)?"<null>":this.statusMessage));
        sb.append(',');
        sb.append("timeout");
        sb.append('=');
        sb.append(((this.timeout == null)?"<null>":this.timeout));
        sb.append(',');
        sb.append("workspaces");
        sb.append('=');
        sb.append(((this.workspaces == null)?"<null>":this.workspaces));
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
        result = ((result* 31)+((this.retries == null)? 0 :this.retries.hashCode()));
        result = ((result* 31)+((this.customSpec == null)? 0 :this.customSpec.hashCode()));
        result = ((result* 31)+((this.serviceAccountName == null)? 0 :this.serviceAccountName.hashCode()));
        result = ((result* 31)+((this.workspaces == null)? 0 :this.workspaces.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.customRef == null)? 0 :this.customRef.hashCode()));
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        result = ((result* 31)+((this.statusMessage == null)? 0 :this.statusMessage.hashCode()));
        result = ((result* 31)+((this.timeout == null)? 0 :this.timeout.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Spec) == false) {
            return false;
        }
        Spec rhs = ((Spec) other);
        return (((((((((((this.retries == rhs.retries)||((this.retries!= null)&&this.retries.equals(rhs.retries)))&&((this.customSpec == rhs.customSpec)||((this.customSpec!= null)&&this.customSpec.equals(rhs.customSpec))))&&((this.serviceAccountName == rhs.serviceAccountName)||((this.serviceAccountName!= null)&&this.serviceAccountName.equals(rhs.serviceAccountName))))&&((this.workspaces == rhs.workspaces)||((this.workspaces!= null)&&this.workspaces.equals(rhs.workspaces))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.customRef == rhs.customRef)||((this.customRef!= null)&&this.customRef.equals(rhs.customRef))))&&((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params))))&&((this.statusMessage == rhs.statusMessage)||((this.statusMessage!= null)&&this.statusMessage.equals(rhs.statusMessage))))&&((this.timeout == rhs.timeout)||((this.timeout!= null)&&this.timeout.equals(rhs.timeout))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
