
package io.tekton.crd.model.taskruns.v1;

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
 * TaskRunSpec defines the desired state of TaskRun
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "computeResources",
    "debug",
    "params",
    "podTemplate",
    "retries",
    "serviceAccountName",
    "sidecarSpecs",
    "status",
    "statusMessage",
    "stepSpecs",
    "taskRef",
    "taskSpec",
    "timeout",
    "workspaces"
})
@Generated("jsonschema2pojo")
public class Spec {

    /**
     * Compute resources to use for this TaskRun
     * 
     */
    @JsonProperty("computeResources")
    @JsonPropertyDescription("Compute resources to use for this TaskRun")
    @Valid
    private ComputeResources computeResources;
    /**
     * TaskRunDebug defines the breakpoint config for a particular TaskRun
     * 
     */
    @JsonProperty("debug")
    @JsonPropertyDescription("TaskRunDebug defines the breakpoint config for a particular TaskRun")
    @Valid
    private Debug debug;
    /**
     * Params is a list of Param
     * 
     */
    @JsonProperty("params")
    @JsonPropertyDescription("Params is a list of Param")
    @Valid
    private List<Param> params = new ArrayList<Param>();
    /**
     * PodTemplate holds pod specific configuration
     * 
     */
    @JsonProperty("podTemplate")
    @JsonPropertyDescription("PodTemplate holds pod specific configuration")
    @Valid
    private PodTemplate podTemplate;
    /**
     * Retries represents how many times this TaskRun should be retried in the event of task failure.
     * 
     */
    @JsonProperty("retries")
    @JsonPropertyDescription("Retries represents how many times this TaskRun should be retried in the event of task failure.")
    private Integer retries;
    @JsonProperty("serviceAccountName")
    private String serviceAccountName;
    /**
     * Specs to apply to Sidecars in this TaskRun.
     * If a field is specified in both a Sidecar and a SidecarSpec,
     * the value from the SidecarSpec will be used.
     * This field is only supported when the alpha feature gate is enabled.
     * 
     */
    @JsonProperty("sidecarSpecs")
    @JsonPropertyDescription("Specs to apply to Sidecars in this TaskRun.\nIf a field is specified in both a Sidecar and a SidecarSpec,\nthe value from the SidecarSpec will be used.\nThis field is only supported when the alpha feature gate is enabled.")
    @Valid
    private List<SidecarSpec> sidecarSpecs = new ArrayList<SidecarSpec>();
    /**
     * Used for cancelling a TaskRun (and maybe more later on)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Used for cancelling a TaskRun (and maybe more later on)")
    private String status;
    /**
     * Status message for cancellation.
     * 
     */
    @JsonProperty("statusMessage")
    @JsonPropertyDescription("Status message for cancellation.")
    private String statusMessage;
    /**
     * Specs to apply to Steps in this TaskRun.
     * If a field is specified in both a Step and a StepSpec,
     * the value from the StepSpec will be used.
     * This field is only supported when the alpha feature gate is enabled.
     * 
     */
    @JsonProperty("stepSpecs")
    @JsonPropertyDescription("Specs to apply to Steps in this TaskRun.\nIf a field is specified in both a Step and a StepSpec,\nthe value from the StepSpec will be used.\nThis field is only supported when the alpha feature gate is enabled.")
    @Valid
    private List<StepSpec> stepSpecs = new ArrayList<StepSpec>();
    /**
     * no more than one of the TaskRef and TaskSpec may be specified.
     * 
     */
    @JsonProperty("taskRef")
    @JsonPropertyDescription("no more than one of the TaskRef and TaskSpec may be specified.")
    @Valid
    private TaskRef taskRef;
    /**
     * Specifying TaskSpec can be disabled by setting
     * `disable-inline-spec` feature flag.
     * See Task.spec (API version: tekton.dev/v1)
     * 
     */
    @JsonProperty("taskSpec")
    @JsonPropertyDescription("Specifying TaskSpec can be disabled by setting\n`disable-inline-spec` feature flag.\nSee Task.spec (API version: tekton.dev/v1)")
    private Object taskSpec;
    /**
     * Time after which one retry attempt times out. Defaults to 1 hour.
     * Refer Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration
     * 
     */
    @JsonProperty("timeout")
    @JsonPropertyDescription("Time after which one retry attempt times out. Defaults to 1 hour.\nRefer Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration")
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

    public Spec withComputeResources(ComputeResources computeResources) {
        this.computeResources = computeResources;
        return this;
    }

    /**
     * TaskRunDebug defines the breakpoint config for a particular TaskRun
     * 
     */
    @JsonProperty("debug")
    public Debug getDebug() {
        return debug;
    }

    /**
     * TaskRunDebug defines the breakpoint config for a particular TaskRun
     * 
     */
    @JsonProperty("debug")
    public void setDebug(Debug debug) {
        this.debug = debug;
    }

    public Spec withDebug(Debug debug) {
        this.debug = debug;
        return this;
    }

    /**
     * Params is a list of Param
     * 
     */
    @JsonProperty("params")
    public List<Param> getParams() {
        return params;
    }

    /**
     * Params is a list of Param
     * 
     */
    @JsonProperty("params")
    public void setParams(List<Param> params) {
        this.params = params;
    }

    public Spec withParams(List<Param> params) {
        this.params = params;
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

    public Spec withPodTemplate(PodTemplate podTemplate) {
        this.podTemplate = podTemplate;
        return this;
    }

    /**
     * Retries represents how many times this TaskRun should be retried in the event of task failure.
     * 
     */
    @JsonProperty("retries")
    public Integer getRetries() {
        return retries;
    }

    /**
     * Retries represents how many times this TaskRun should be retried in the event of task failure.
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
     * Specs to apply to Sidecars in this TaskRun.
     * If a field is specified in both a Sidecar and a SidecarSpec,
     * the value from the SidecarSpec will be used.
     * This field is only supported when the alpha feature gate is enabled.
     * 
     */
    @JsonProperty("sidecarSpecs")
    public List<SidecarSpec> getSidecarSpecs() {
        return sidecarSpecs;
    }

    /**
     * Specs to apply to Sidecars in this TaskRun.
     * If a field is specified in both a Sidecar and a SidecarSpec,
     * the value from the SidecarSpec will be used.
     * This field is only supported when the alpha feature gate is enabled.
     * 
     */
    @JsonProperty("sidecarSpecs")
    public void setSidecarSpecs(List<SidecarSpec> sidecarSpecs) {
        this.sidecarSpecs = sidecarSpecs;
    }

    public Spec withSidecarSpecs(List<SidecarSpec> sidecarSpecs) {
        this.sidecarSpecs = sidecarSpecs;
        return this;
    }

    /**
     * Used for cancelling a TaskRun (and maybe more later on)
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Used for cancelling a TaskRun (and maybe more later on)
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
     * Specs to apply to Steps in this TaskRun.
     * If a field is specified in both a Step and a StepSpec,
     * the value from the StepSpec will be used.
     * This field is only supported when the alpha feature gate is enabled.
     * 
     */
    @JsonProperty("stepSpecs")
    public List<StepSpec> getStepSpecs() {
        return stepSpecs;
    }

    /**
     * Specs to apply to Steps in this TaskRun.
     * If a field is specified in both a Step and a StepSpec,
     * the value from the StepSpec will be used.
     * This field is only supported when the alpha feature gate is enabled.
     * 
     */
    @JsonProperty("stepSpecs")
    public void setStepSpecs(List<StepSpec> stepSpecs) {
        this.stepSpecs = stepSpecs;
    }

    public Spec withStepSpecs(List<StepSpec> stepSpecs) {
        this.stepSpecs = stepSpecs;
        return this;
    }

    /**
     * no more than one of the TaskRef and TaskSpec may be specified.
     * 
     */
    @JsonProperty("taskRef")
    public TaskRef getTaskRef() {
        return taskRef;
    }

    /**
     * no more than one of the TaskRef and TaskSpec may be specified.
     * 
     */
    @JsonProperty("taskRef")
    public void setTaskRef(TaskRef taskRef) {
        this.taskRef = taskRef;
    }

    public Spec withTaskRef(TaskRef taskRef) {
        this.taskRef = taskRef;
        return this;
    }

    /**
     * Specifying TaskSpec can be disabled by setting
     * `disable-inline-spec` feature flag.
     * See Task.spec (API version: tekton.dev/v1)
     * 
     */
    @JsonProperty("taskSpec")
    public Object getTaskSpec() {
        return taskSpec;
    }

    /**
     * Specifying TaskSpec can be disabled by setting
     * `disable-inline-spec` feature flag.
     * See Task.spec (API version: tekton.dev/v1)
     * 
     */
    @JsonProperty("taskSpec")
    public void setTaskSpec(Object taskSpec) {
        this.taskSpec = taskSpec;
    }

    public Spec withTaskSpec(Object taskSpec) {
        this.taskSpec = taskSpec;
        return this;
    }

    /**
     * Time after which one retry attempt times out. Defaults to 1 hour.
     * Refer Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration
     * 
     */
    @JsonProperty("timeout")
    public String getTimeout() {
        return timeout;
    }

    /**
     * Time after which one retry attempt times out. Defaults to 1 hour.
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
        sb.append("computeResources");
        sb.append('=');
        sb.append(((this.computeResources == null)?"<null>":this.computeResources));
        sb.append(',');
        sb.append("debug");
        sb.append('=');
        sb.append(((this.debug == null)?"<null>":this.debug));
        sb.append(',');
        sb.append("params");
        sb.append('=');
        sb.append(((this.params == null)?"<null>":this.params));
        sb.append(',');
        sb.append("podTemplate");
        sb.append('=');
        sb.append(((this.podTemplate == null)?"<null>":this.podTemplate));
        sb.append(',');
        sb.append("retries");
        sb.append('=');
        sb.append(((this.retries == null)?"<null>":this.retries));
        sb.append(',');
        sb.append("serviceAccountName");
        sb.append('=');
        sb.append(((this.serviceAccountName == null)?"<null>":this.serviceAccountName));
        sb.append(',');
        sb.append("sidecarSpecs");
        sb.append('=');
        sb.append(((this.sidecarSpecs == null)?"<null>":this.sidecarSpecs));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("statusMessage");
        sb.append('=');
        sb.append(((this.statusMessage == null)?"<null>":this.statusMessage));
        sb.append(',');
        sb.append("stepSpecs");
        sb.append('=');
        sb.append(((this.stepSpecs == null)?"<null>":this.stepSpecs));
        sb.append(',');
        sb.append("taskRef");
        sb.append('=');
        sb.append(((this.taskRef == null)?"<null>":this.taskRef));
        sb.append(',');
        sb.append("taskSpec");
        sb.append('=');
        sb.append(((this.taskSpec == null)?"<null>":this.taskSpec));
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
        result = ((result* 31)+((this.debug == null)? 0 :this.debug.hashCode()));
        result = ((result* 31)+((this.serviceAccountName == null)? 0 :this.serviceAccountName.hashCode()));
        result = ((result* 31)+((this.podTemplate == null)? 0 :this.podTemplate.hashCode()));
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        result = ((result* 31)+((this.stepSpecs == null)? 0 :this.stepSpecs.hashCode()));
        result = ((result* 31)+((this.taskSpec == null)? 0 :this.taskSpec.hashCode()));
        result = ((result* 31)+((this.statusMessage == null)? 0 :this.statusMessage.hashCode()));
        result = ((result* 31)+((this.timeout == null)? 0 :this.timeout.hashCode()));
        result = ((result* 31)+((this.retries == null)? 0 :this.retries.hashCode()));
        result = ((result* 31)+((this.taskRef == null)? 0 :this.taskRef.hashCode()));
        result = ((result* 31)+((this.sidecarSpecs == null)? 0 :this.sidecarSpecs.hashCode()));
        result = ((result* 31)+((this.computeResources == null)? 0 :this.computeResources.hashCode()));
        result = ((result* 31)+((this.workspaces == null)? 0 :this.workspaces.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
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
        return ((((((((((((((((this.debug == rhs.debug)||((this.debug!= null)&&this.debug.equals(rhs.debug)))&&((this.serviceAccountName == rhs.serviceAccountName)||((this.serviceAccountName!= null)&&this.serviceAccountName.equals(rhs.serviceAccountName))))&&((this.podTemplate == rhs.podTemplate)||((this.podTemplate!= null)&&this.podTemplate.equals(rhs.podTemplate))))&&((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params))))&&((this.stepSpecs == rhs.stepSpecs)||((this.stepSpecs!= null)&&this.stepSpecs.equals(rhs.stepSpecs))))&&((this.taskSpec == rhs.taskSpec)||((this.taskSpec!= null)&&this.taskSpec.equals(rhs.taskSpec))))&&((this.statusMessage == rhs.statusMessage)||((this.statusMessage!= null)&&this.statusMessage.equals(rhs.statusMessage))))&&((this.timeout == rhs.timeout)||((this.timeout!= null)&&this.timeout.equals(rhs.timeout))))&&((this.retries == rhs.retries)||((this.retries!= null)&&this.retries.equals(rhs.retries))))&&((this.taskRef == rhs.taskRef)||((this.taskRef!= null)&&this.taskRef.equals(rhs.taskRef))))&&((this.sidecarSpecs == rhs.sidecarSpecs)||((this.sidecarSpecs!= null)&&this.sidecarSpecs.equals(rhs.sidecarSpecs))))&&((this.computeResources == rhs.computeResources)||((this.computeResources!= null)&&this.computeResources.equals(rhs.computeResources))))&&((this.workspaces == rhs.workspaces)||((this.workspaces!= null)&&this.workspaces.equals(rhs.workspaces))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
