
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
 * PipelineRunSpec defines the desired state of PipelineRun
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "params",
    "pipelineRef",
    "pipelineSpec",
    "status",
    "taskRunSpecs",
    "taskRunTemplate",
    "timeouts",
    "workspaces"
})
@Generated("jsonschema2pojo")
public class Spec {

    /**
     * Params is a list of parameter names and values.
     * 
     */
    @JsonProperty("params")
    @JsonPropertyDescription("Params is a list of parameter names and values.")
    @Valid
    private List<Param> params = new ArrayList<Param>();
    /**
     * PipelineRef can be used to refer to a specific instance of a Pipeline.
     * 
     */
    @JsonProperty("pipelineRef")
    @JsonPropertyDescription("PipelineRef can be used to refer to a specific instance of a Pipeline.")
    @Valid
    private PipelineRef pipelineRef;
    /**
     * Specifying PipelineSpec can be disabled by setting
     * `disable-inline-spec` feature flag.
     * See Pipeline.spec (API version: tekton.dev/v1)
     * 
     */
    @JsonProperty("pipelineSpec")
    @JsonPropertyDescription("Specifying PipelineSpec can be disabled by setting\n`disable-inline-spec` feature flag.\nSee Pipeline.spec (API version: tekton.dev/v1)")
    private Object pipelineSpec;
    /**
     * Used for cancelling a pipelinerun (and maybe more later on)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Used for cancelling a pipelinerun (and maybe more later on)")
    private String status;
    /**
     * TaskRunSpecs holds a set of runtime specs
     * 
     */
    @JsonProperty("taskRunSpecs")
    @JsonPropertyDescription("TaskRunSpecs holds a set of runtime specs")
    @Valid
    private List<TaskRunSpec> taskRunSpecs = new ArrayList<TaskRunSpec>();
    /**
     * TaskRunTemplate represent template of taskrun
     * 
     */
    @JsonProperty("taskRunTemplate")
    @JsonPropertyDescription("TaskRunTemplate represent template of taskrun")
    @Valid
    private TaskRunTemplate taskRunTemplate;
    /**
     * Time after which the Pipeline times out.
     * Currently three keys are accepted in the map
     * pipeline, tasks and finally
     * with Timeouts.pipeline >= Timeouts.tasks + Timeouts.finally
     * 
     */
    @JsonProperty("timeouts")
    @JsonPropertyDescription("Time after which the Pipeline times out.\nCurrently three keys are accepted in the map\npipeline, tasks and finally\nwith Timeouts.pipeline >= Timeouts.tasks + Timeouts.finally")
    @Valid
    private Timeouts timeouts;
    /**
     * Workspaces holds a set of workspace bindings that must match names
     * with those declared in the pipeline.
     * 
     */
    @JsonProperty("workspaces")
    @JsonPropertyDescription("Workspaces holds a set of workspace bindings that must match names\nwith those declared in the pipeline.")
    @Valid
    private List<Workspace> workspaces = new ArrayList<Workspace>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Params is a list of parameter names and values.
     * 
     */
    @JsonProperty("params")
    public List<Param> getParams() {
        return params;
    }

    /**
     * Params is a list of parameter names and values.
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
     * PipelineRef can be used to refer to a specific instance of a Pipeline.
     * 
     */
    @JsonProperty("pipelineRef")
    public PipelineRef getPipelineRef() {
        return pipelineRef;
    }

    /**
     * PipelineRef can be used to refer to a specific instance of a Pipeline.
     * 
     */
    @JsonProperty("pipelineRef")
    public void setPipelineRef(PipelineRef pipelineRef) {
        this.pipelineRef = pipelineRef;
    }

    public Spec withPipelineRef(PipelineRef pipelineRef) {
        this.pipelineRef = pipelineRef;
        return this;
    }

    /**
     * Specifying PipelineSpec can be disabled by setting
     * `disable-inline-spec` feature flag.
     * See Pipeline.spec (API version: tekton.dev/v1)
     * 
     */
    @JsonProperty("pipelineSpec")
    public Object getPipelineSpec() {
        return pipelineSpec;
    }

    /**
     * Specifying PipelineSpec can be disabled by setting
     * `disable-inline-spec` feature flag.
     * See Pipeline.spec (API version: tekton.dev/v1)
     * 
     */
    @JsonProperty("pipelineSpec")
    public void setPipelineSpec(Object pipelineSpec) {
        this.pipelineSpec = pipelineSpec;
    }

    public Spec withPipelineSpec(Object pipelineSpec) {
        this.pipelineSpec = pipelineSpec;
        return this;
    }

    /**
     * Used for cancelling a pipelinerun (and maybe more later on)
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Used for cancelling a pipelinerun (and maybe more later on)
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
     * TaskRunSpecs holds a set of runtime specs
     * 
     */
    @JsonProperty("taskRunSpecs")
    public List<TaskRunSpec> getTaskRunSpecs() {
        return taskRunSpecs;
    }

    /**
     * TaskRunSpecs holds a set of runtime specs
     * 
     */
    @JsonProperty("taskRunSpecs")
    public void setTaskRunSpecs(List<TaskRunSpec> taskRunSpecs) {
        this.taskRunSpecs = taskRunSpecs;
    }

    public Spec withTaskRunSpecs(List<TaskRunSpec> taskRunSpecs) {
        this.taskRunSpecs = taskRunSpecs;
        return this;
    }

    /**
     * TaskRunTemplate represent template of taskrun
     * 
     */
    @JsonProperty("taskRunTemplate")
    public TaskRunTemplate getTaskRunTemplate() {
        return taskRunTemplate;
    }

    /**
     * TaskRunTemplate represent template of taskrun
     * 
     */
    @JsonProperty("taskRunTemplate")
    public void setTaskRunTemplate(TaskRunTemplate taskRunTemplate) {
        this.taskRunTemplate = taskRunTemplate;
    }

    public Spec withTaskRunTemplate(TaskRunTemplate taskRunTemplate) {
        this.taskRunTemplate = taskRunTemplate;
        return this;
    }

    /**
     * Time after which the Pipeline times out.
     * Currently three keys are accepted in the map
     * pipeline, tasks and finally
     * with Timeouts.pipeline >= Timeouts.tasks + Timeouts.finally
     * 
     */
    @JsonProperty("timeouts")
    public Timeouts getTimeouts() {
        return timeouts;
    }

    /**
     * Time after which the Pipeline times out.
     * Currently three keys are accepted in the map
     * pipeline, tasks and finally
     * with Timeouts.pipeline >= Timeouts.tasks + Timeouts.finally
     * 
     */
    @JsonProperty("timeouts")
    public void setTimeouts(Timeouts timeouts) {
        this.timeouts = timeouts;
    }

    public Spec withTimeouts(Timeouts timeouts) {
        this.timeouts = timeouts;
        return this;
    }

    /**
     * Workspaces holds a set of workspace bindings that must match names
     * with those declared in the pipeline.
     * 
     */
    @JsonProperty("workspaces")
    public List<Workspace> getWorkspaces() {
        return workspaces;
    }

    /**
     * Workspaces holds a set of workspace bindings that must match names
     * with those declared in the pipeline.
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
        sb.append("params");
        sb.append('=');
        sb.append(((this.params == null)?"<null>":this.params));
        sb.append(',');
        sb.append("pipelineRef");
        sb.append('=');
        sb.append(((this.pipelineRef == null)?"<null>":this.pipelineRef));
        sb.append(',');
        sb.append("pipelineSpec");
        sb.append('=');
        sb.append(((this.pipelineSpec == null)?"<null>":this.pipelineSpec));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("taskRunSpecs");
        sb.append('=');
        sb.append(((this.taskRunSpecs == null)?"<null>":this.taskRunSpecs));
        sb.append(',');
        sb.append("taskRunTemplate");
        sb.append('=');
        sb.append(((this.taskRunTemplate == null)?"<null>":this.taskRunTemplate));
        sb.append(',');
        sb.append("timeouts");
        sb.append('=');
        sb.append(((this.timeouts == null)?"<null>":this.timeouts));
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
        result = ((result* 31)+((this.taskRunTemplate == null)? 0 :this.taskRunTemplate.hashCode()));
        result = ((result* 31)+((this.taskRunSpecs == null)? 0 :this.taskRunSpecs.hashCode()));
        result = ((result* 31)+((this.pipelineSpec == null)? 0 :this.pipelineSpec.hashCode()));
        result = ((result* 31)+((this.timeouts == null)? 0 :this.timeouts.hashCode()));
        result = ((result* 31)+((this.workspaces == null)? 0 :this.workspaces.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        result = ((result* 31)+((this.pipelineRef == null)? 0 :this.pipelineRef.hashCode()));
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
        return ((((((((((this.taskRunTemplate == rhs.taskRunTemplate)||((this.taskRunTemplate!= null)&&this.taskRunTemplate.equals(rhs.taskRunTemplate)))&&((this.taskRunSpecs == rhs.taskRunSpecs)||((this.taskRunSpecs!= null)&&this.taskRunSpecs.equals(rhs.taskRunSpecs))))&&((this.pipelineSpec == rhs.pipelineSpec)||((this.pipelineSpec!= null)&&this.pipelineSpec.equals(rhs.pipelineSpec))))&&((this.timeouts == rhs.timeouts)||((this.timeouts!= null)&&this.timeouts.equals(rhs.timeouts))))&&((this.workspaces == rhs.workspaces)||((this.workspaces!= null)&&this.workspaces.equals(rhs.workspaces))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params))))&&((this.pipelineRef == rhs.pipelineRef)||((this.pipelineRef!= null)&&this.pipelineRef.equals(rhs.pipelineRef))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
