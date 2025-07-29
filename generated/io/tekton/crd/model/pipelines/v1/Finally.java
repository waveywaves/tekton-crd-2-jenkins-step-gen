
package io.tekton.crd.model.pipelines.v1;

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
 * PipelineTask defines a task in a Pipeline, passing inputs from both
 * Params and from the output of previous tasks.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "displayName",
    "matrix",
    "name",
    "onError",
    "params",
    "pipelineRef",
    "pipelineSpec",
    "retries",
    "runAfter",
    "taskRef",
    "taskSpec",
    "timeout",
    "when",
    "workspaces"
})
@Generated("jsonschema2pojo")
public class Finally {

    /**
     * Description is the description of this task within the context of a Pipeline.
     * This description may be used to populate a UI.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Description is the description of this task within the context of a Pipeline.\nThis description may be used to populate a UI.")
    private String description;
    /**
     * DisplayName is the display name of this task within the context of a Pipeline.
     * This display name may be used to populate a UI.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("DisplayName is the display name of this task within the context of a Pipeline.\nThis display name may be used to populate a UI.")
    private String displayName;
    /**
     * Matrix declares parameters used to fan out this task.
     * 
     */
    @JsonProperty("matrix")
    @JsonPropertyDescription("Matrix declares parameters used to fan out this task.")
    @Valid
    private Matrix matrix;
    /**
     * Name is the name of this task within the context of a Pipeline. Name is
     * used as a coordinate with the `from` and `runAfter` fields to establish
     * the execution order of tasks relative to one another.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name is the name of this task within the context of a Pipeline. Name is\nused as a coordinate with the `from` and `runAfter` fields to establish\nthe execution order of tasks relative to one another.")
    private String name;
    /**
     * OnError defines the exiting behavior of a PipelineRun on error
     * can be set to [ continue | stopAndFail ]
     * 
     */
    @JsonProperty("onError")
    @JsonPropertyDescription("OnError defines the exiting behavior of a PipelineRun on error\ncan be set to [ continue | stopAndFail ]")
    private String onError;
    /**
     * Parameters declares parameters passed to this task.
     * 
     */
    @JsonProperty("params")
    @JsonPropertyDescription("Parameters declares parameters passed to this task.")
    @Valid
    private List<Param__2> params = new ArrayList<Param__2>();
    /**
     * PipelineRef is a reference to a pipeline definition
     * Note: PipelineRef is in preview mode and not yet supported
     * 
     */
    @JsonProperty("pipelineRef")
    @JsonPropertyDescription("PipelineRef is a reference to a pipeline definition\nNote: PipelineRef is in preview mode and not yet supported")
    @Valid
    private PipelineRef pipelineRef;
    /**
     * PipelineSpec is a specification of a pipeline
     * Note: PipelineSpec is in preview mode and not yet supported
     * Specifying PipelineSpec can be disabled by setting
     * `disable-inline-spec` feature flag.
     * See Pipeline.spec (API version: tekton.dev/v1)
     * 
     */
    @JsonProperty("pipelineSpec")
    @JsonPropertyDescription("PipelineSpec is a specification of a pipeline\nNote: PipelineSpec is in preview mode and not yet supported\nSpecifying PipelineSpec can be disabled by setting\n`disable-inline-spec` feature flag.\nSee Pipeline.spec (API version: tekton.dev/v1)")
    private Object pipelineSpec;
    /**
     * Retries represents how many times this task should be retried in case of task failure: ConditionSucceeded set to False
     * 
     */
    @JsonProperty("retries")
    @JsonPropertyDescription("Retries represents how many times this task should be retried in case of task failure: ConditionSucceeded set to False")
    private Integer retries;
    /**
     * RunAfter is the list of PipelineTask names that should be executed before
     * this Task executes. (Used to force a specific ordering in graph execution.)
     * 
     */
    @JsonProperty("runAfter")
    @JsonPropertyDescription("RunAfter is the list of PipelineTask names that should be executed before\nthis Task executes. (Used to force a specific ordering in graph execution.)")
    @Valid
    private List<String> runAfter = new ArrayList<String>();
    /**
     * TaskRef is a reference to a task definition.
     * 
     */
    @JsonProperty("taskRef")
    @JsonPropertyDescription("TaskRef is a reference to a task definition.")
    @Valid
    private TaskRef taskRef;
    /**
     * TaskSpec is a specification of a task
     * Specifying TaskSpec can be disabled by setting
     * `disable-inline-spec` feature flag.
     * See Task.spec (API version: tekton.dev/v1)
     * 
     */
    @JsonProperty("taskSpec")
    @JsonPropertyDescription("TaskSpec is a specification of a task\nSpecifying TaskSpec can be disabled by setting\n`disable-inline-spec` feature flag.\nSee Task.spec (API version: tekton.dev/v1)")
    private Object taskSpec;
    /**
     * Time after which the TaskRun times out. Defaults to 1 hour.
     * Refer Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration
     * 
     */
    @JsonProperty("timeout")
    @JsonPropertyDescription("Time after which the TaskRun times out. Defaults to 1 hour.\nRefer Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration")
    private String timeout;
    /**
     * When is a list of when expressions that need to be true for the task to run
     * 
     */
    @JsonProperty("when")
    @JsonPropertyDescription("When is a list of when expressions that need to be true for the task to run")
    @Valid
    private List<When> when = new ArrayList<When>();
    /**
     * Workspaces maps workspaces from the pipeline spec to the workspaces
     * declared in the Task.
     * 
     */
    @JsonProperty("workspaces")
    @JsonPropertyDescription("Workspaces maps workspaces from the pipeline spec to the workspaces\ndeclared in the Task.")
    @Valid
    private List<Workspace> workspaces = new ArrayList<Workspace>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Description is the description of this task within the context of a Pipeline.
     * This description may be used to populate a UI.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description is the description of this task within the context of a Pipeline.
     * This description may be used to populate a UI.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Finally withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * DisplayName is the display name of this task within the context of a Pipeline.
     * This display name may be used to populate a UI.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * DisplayName is the display name of this task within the context of a Pipeline.
     * This display name may be used to populate a UI.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Finally withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Matrix declares parameters used to fan out this task.
     * 
     */
    @JsonProperty("matrix")
    public Matrix getMatrix() {
        return matrix;
    }

    /**
     * Matrix declares parameters used to fan out this task.
     * 
     */
    @JsonProperty("matrix")
    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    public Finally withMatrix(Matrix matrix) {
        this.matrix = matrix;
        return this;
    }

    /**
     * Name is the name of this task within the context of a Pipeline. Name is
     * used as a coordinate with the `from` and `runAfter` fields to establish
     * the execution order of tasks relative to one another.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name is the name of this task within the context of a Pipeline. Name is
     * used as a coordinate with the `from` and `runAfter` fields to establish
     * the execution order of tasks relative to one another.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Finally withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * OnError defines the exiting behavior of a PipelineRun on error
     * can be set to [ continue | stopAndFail ]
     * 
     */
    @JsonProperty("onError")
    public String getOnError() {
        return onError;
    }

    /**
     * OnError defines the exiting behavior of a PipelineRun on error
     * can be set to [ continue | stopAndFail ]
     * 
     */
    @JsonProperty("onError")
    public void setOnError(String onError) {
        this.onError = onError;
    }

    public Finally withOnError(String onError) {
        this.onError = onError;
        return this;
    }

    /**
     * Parameters declares parameters passed to this task.
     * 
     */
    @JsonProperty("params")
    public List<Param__2> getParams() {
        return params;
    }

    /**
     * Parameters declares parameters passed to this task.
     * 
     */
    @JsonProperty("params")
    public void setParams(List<Param__2> params) {
        this.params = params;
    }

    public Finally withParams(List<Param__2> params) {
        this.params = params;
        return this;
    }

    /**
     * PipelineRef is a reference to a pipeline definition
     * Note: PipelineRef is in preview mode and not yet supported
     * 
     */
    @JsonProperty("pipelineRef")
    public PipelineRef getPipelineRef() {
        return pipelineRef;
    }

    /**
     * PipelineRef is a reference to a pipeline definition
     * Note: PipelineRef is in preview mode and not yet supported
     * 
     */
    @JsonProperty("pipelineRef")
    public void setPipelineRef(PipelineRef pipelineRef) {
        this.pipelineRef = pipelineRef;
    }

    public Finally withPipelineRef(PipelineRef pipelineRef) {
        this.pipelineRef = pipelineRef;
        return this;
    }

    /**
     * PipelineSpec is a specification of a pipeline
     * Note: PipelineSpec is in preview mode and not yet supported
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
     * PipelineSpec is a specification of a pipeline
     * Note: PipelineSpec is in preview mode and not yet supported
     * Specifying PipelineSpec can be disabled by setting
     * `disable-inline-spec` feature flag.
     * See Pipeline.spec (API version: tekton.dev/v1)
     * 
     */
    @JsonProperty("pipelineSpec")
    public void setPipelineSpec(Object pipelineSpec) {
        this.pipelineSpec = pipelineSpec;
    }

    public Finally withPipelineSpec(Object pipelineSpec) {
        this.pipelineSpec = pipelineSpec;
        return this;
    }

    /**
     * Retries represents how many times this task should be retried in case of task failure: ConditionSucceeded set to False
     * 
     */
    @JsonProperty("retries")
    public Integer getRetries() {
        return retries;
    }

    /**
     * Retries represents how many times this task should be retried in case of task failure: ConditionSucceeded set to False
     * 
     */
    @JsonProperty("retries")
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public Finally withRetries(Integer retries) {
        this.retries = retries;
        return this;
    }

    /**
     * RunAfter is the list of PipelineTask names that should be executed before
     * this Task executes. (Used to force a specific ordering in graph execution.)
     * 
     */
    @JsonProperty("runAfter")
    public List<String> getRunAfter() {
        return runAfter;
    }

    /**
     * RunAfter is the list of PipelineTask names that should be executed before
     * this Task executes. (Used to force a specific ordering in graph execution.)
     * 
     */
    @JsonProperty("runAfter")
    public void setRunAfter(List<String> runAfter) {
        this.runAfter = runAfter;
    }

    public Finally withRunAfter(List<String> runAfter) {
        this.runAfter = runAfter;
        return this;
    }

    /**
     * TaskRef is a reference to a task definition.
     * 
     */
    @JsonProperty("taskRef")
    public TaskRef getTaskRef() {
        return taskRef;
    }

    /**
     * TaskRef is a reference to a task definition.
     * 
     */
    @JsonProperty("taskRef")
    public void setTaskRef(TaskRef taskRef) {
        this.taskRef = taskRef;
    }

    public Finally withTaskRef(TaskRef taskRef) {
        this.taskRef = taskRef;
        return this;
    }

    /**
     * TaskSpec is a specification of a task
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
     * TaskSpec is a specification of a task
     * Specifying TaskSpec can be disabled by setting
     * `disable-inline-spec` feature flag.
     * See Task.spec (API version: tekton.dev/v1)
     * 
     */
    @JsonProperty("taskSpec")
    public void setTaskSpec(Object taskSpec) {
        this.taskSpec = taskSpec;
    }

    public Finally withTaskSpec(Object taskSpec) {
        this.taskSpec = taskSpec;
        return this;
    }

    /**
     * Time after which the TaskRun times out. Defaults to 1 hour.
     * Refer Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration
     * 
     */
    @JsonProperty("timeout")
    public String getTimeout() {
        return timeout;
    }

    /**
     * Time after which the TaskRun times out. Defaults to 1 hour.
     * Refer Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration
     * 
     */
    @JsonProperty("timeout")
    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public Finally withTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * When is a list of when expressions that need to be true for the task to run
     * 
     */
    @JsonProperty("when")
    public List<When> getWhen() {
        return when;
    }

    /**
     * When is a list of when expressions that need to be true for the task to run
     * 
     */
    @JsonProperty("when")
    public void setWhen(List<When> when) {
        this.when = when;
    }

    public Finally withWhen(List<When> when) {
        this.when = when;
        return this;
    }

    /**
     * Workspaces maps workspaces from the pipeline spec to the workspaces
     * declared in the Task.
     * 
     */
    @JsonProperty("workspaces")
    public List<Workspace> getWorkspaces() {
        return workspaces;
    }

    /**
     * Workspaces maps workspaces from the pipeline spec to the workspaces
     * declared in the Task.
     * 
     */
    @JsonProperty("workspaces")
    public void setWorkspaces(List<Workspace> workspaces) {
        this.workspaces = workspaces;
    }

    public Finally withWorkspaces(List<Workspace> workspaces) {
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

    public Finally withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Finally.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("matrix");
        sb.append('=');
        sb.append(((this.matrix == null)?"<null>":this.matrix));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("onError");
        sb.append('=');
        sb.append(((this.onError == null)?"<null>":this.onError));
        sb.append(',');
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
        sb.append("retries");
        sb.append('=');
        sb.append(((this.retries == null)?"<null>":this.retries));
        sb.append(',');
        sb.append("runAfter");
        sb.append('=');
        sb.append(((this.runAfter == null)?"<null>":this.runAfter));
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
        sb.append("when");
        sb.append('=');
        sb.append(((this.when == null)?"<null>":this.when));
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
        result = ((result* 31)+((this.pipelineSpec == null)? 0 :this.pipelineSpec.hashCode()));
        result = ((result* 31)+((this.onError == null)? 0 :this.onError.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.runAfter == null)? 0 :this.runAfter.hashCode()));
        result = ((result* 31)+((this.matrix == null)? 0 :this.matrix.hashCode()));
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        result = ((result* 31)+((this.taskSpec == null)? 0 :this.taskSpec.hashCode()));
        result = ((result* 31)+((this.when == null)? 0 :this.when.hashCode()));
        result = ((result* 31)+((this.pipelineRef == null)? 0 :this.pipelineRef.hashCode()));
        result = ((result* 31)+((this.timeout == null)? 0 :this.timeout.hashCode()));
        result = ((result* 31)+((this.retries == null)? 0 :this.retries.hashCode()));
        result = ((result* 31)+((this.taskRef == null)? 0 :this.taskRef.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.workspaces == null)? 0 :this.workspaces.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Finally) == false) {
            return false;
        }
        Finally rhs = ((Finally) other);
        return (((((((((((((((((this.pipelineSpec == rhs.pipelineSpec)||((this.pipelineSpec!= null)&&this.pipelineSpec.equals(rhs.pipelineSpec)))&&((this.onError == rhs.onError)||((this.onError!= null)&&this.onError.equals(rhs.onError))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.runAfter == rhs.runAfter)||((this.runAfter!= null)&&this.runAfter.equals(rhs.runAfter))))&&((this.matrix == rhs.matrix)||((this.matrix!= null)&&this.matrix.equals(rhs.matrix))))&&((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params))))&&((this.taskSpec == rhs.taskSpec)||((this.taskSpec!= null)&&this.taskSpec.equals(rhs.taskSpec))))&&((this.when == rhs.when)||((this.when!= null)&&this.when.equals(rhs.when))))&&((this.pipelineRef == rhs.pipelineRef)||((this.pipelineRef!= null)&&this.pipelineRef.equals(rhs.pipelineRef))))&&((this.timeout == rhs.timeout)||((this.timeout!= null)&&this.timeout.equals(rhs.timeout))))&&((this.retries == rhs.retries)||((this.retries!= null)&&this.retries.equals(rhs.retries))))&&((this.taskRef == rhs.taskRef)||((this.taskRef!= null)&&this.taskRef.equals(rhs.taskRef))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.workspaces == rhs.workspaces)||((this.workspaces!= null)&&this.workspaces.equals(rhs.workspaces))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
