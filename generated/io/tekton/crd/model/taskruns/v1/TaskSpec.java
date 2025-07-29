
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
 * TaskSpec contains the Spec from the dereferenced Task definition used to instantiate this TaskRun.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "displayName",
    "params",
    "results",
    "sidecars",
    "stepTemplate",
    "steps",
    "volumes",
    "workspaces"
})
@Generated("jsonschema2pojo")
public class TaskSpec {

    /**
     * Description is a user-facing description of the task that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Description is a user-facing description of the task that may be\nused to populate a UI.")
    private String description;
    /**
     * DisplayName is a user-facing name of the task that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("DisplayName is a user-facing name of the task that may be\nused to populate a UI.")
    private String displayName;
    /**
     * Params is a list of input parameters required to run the task. Params
     * must be supplied as inputs in TaskRuns unless they declare a default
     * value.
     * 
     */
    @JsonProperty("params")
    @JsonPropertyDescription("Params is a list of input parameters required to run the task. Params\nmust be supplied as inputs in TaskRuns unless they declare a default\nvalue.")
    @Valid
    private List<Param__2> params = new ArrayList<Param__2>();
    /**
     * Results are values that this Task can output
     * 
     */
    @JsonProperty("results")
    @JsonPropertyDescription("Results are values that this Task can output")
    @Valid
    private List<Result__2> results = new ArrayList<Result__2>();
    /**
     * Sidecars are run alongside the Task's step containers. They begin before
     * the steps start and end after the steps complete.
     * 
     */
    @JsonProperty("sidecars")
    @JsonPropertyDescription("Sidecars are run alongside the Task's step containers. They begin before\nthe steps start and end after the steps complete.")
    @Valid
    private List<Sidecar__1> sidecars = new ArrayList<Sidecar__1>();
    /**
     * StepTemplate can be used as the basis for all step containers within the
     * Task, so that the steps inherit settings on the base container.
     * 
     */
    @JsonProperty("stepTemplate")
    @JsonPropertyDescription("StepTemplate can be used as the basis for all step containers within the\nTask, so that the steps inherit settings on the base container.")
    @Valid
    private StepTemplate stepTemplate;
    /**
     * Steps are the steps of the build; each step is run sequentially with the
     * source mounted into /workspace.
     * 
     */
    @JsonProperty("steps")
    @JsonPropertyDescription("Steps are the steps of the build; each step is run sequentially with the\nsource mounted into /workspace.")
    @Valid
    private List<Step__1> steps = new ArrayList<Step__1>();
    /**
     * Volumes is a collection of volumes that are available to mount into the
     * steps of the build.
     * See Pod.spec.volumes (API version: v1)
     * 
     */
    @JsonProperty("volumes")
    @JsonPropertyDescription("Volumes is a collection of volumes that are available to mount into the\nsteps of the build.\nSee Pod.spec.volumes (API version: v1)")
    private Object volumes;
    /**
     * Workspaces are the volumes that this Task requires.
     * 
     */
    @JsonProperty("workspaces")
    @JsonPropertyDescription("Workspaces are the volumes that this Task requires.")
    @Valid
    private List<Workspace__3> workspaces = new ArrayList<Workspace__3>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Description is a user-facing description of the task that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description is a user-facing description of the task that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public TaskSpec withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * DisplayName is a user-facing name of the task that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * DisplayName is a user-facing name of the task that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public TaskSpec withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Params is a list of input parameters required to run the task. Params
     * must be supplied as inputs in TaskRuns unless they declare a default
     * value.
     * 
     */
    @JsonProperty("params")
    public List<Param__2> getParams() {
        return params;
    }

    /**
     * Params is a list of input parameters required to run the task. Params
     * must be supplied as inputs in TaskRuns unless they declare a default
     * value.
     * 
     */
    @JsonProperty("params")
    public void setParams(List<Param__2> params) {
        this.params = params;
    }

    public TaskSpec withParams(List<Param__2> params) {
        this.params = params;
        return this;
    }

    /**
     * Results are values that this Task can output
     * 
     */
    @JsonProperty("results")
    public List<Result__2> getResults() {
        return results;
    }

    /**
     * Results are values that this Task can output
     * 
     */
    @JsonProperty("results")
    public void setResults(List<Result__2> results) {
        this.results = results;
    }

    public TaskSpec withResults(List<Result__2> results) {
        this.results = results;
        return this;
    }

    /**
     * Sidecars are run alongside the Task's step containers. They begin before
     * the steps start and end after the steps complete.
     * 
     */
    @JsonProperty("sidecars")
    public List<Sidecar__1> getSidecars() {
        return sidecars;
    }

    /**
     * Sidecars are run alongside the Task's step containers. They begin before
     * the steps start and end after the steps complete.
     * 
     */
    @JsonProperty("sidecars")
    public void setSidecars(List<Sidecar__1> sidecars) {
        this.sidecars = sidecars;
    }

    public TaskSpec withSidecars(List<Sidecar__1> sidecars) {
        this.sidecars = sidecars;
        return this;
    }

    /**
     * StepTemplate can be used as the basis for all step containers within the
     * Task, so that the steps inherit settings on the base container.
     * 
     */
    @JsonProperty("stepTemplate")
    public StepTemplate getStepTemplate() {
        return stepTemplate;
    }

    /**
     * StepTemplate can be used as the basis for all step containers within the
     * Task, so that the steps inherit settings on the base container.
     * 
     */
    @JsonProperty("stepTemplate")
    public void setStepTemplate(StepTemplate stepTemplate) {
        this.stepTemplate = stepTemplate;
    }

    public TaskSpec withStepTemplate(StepTemplate stepTemplate) {
        this.stepTemplate = stepTemplate;
        return this;
    }

    /**
     * Steps are the steps of the build; each step is run sequentially with the
     * source mounted into /workspace.
     * 
     */
    @JsonProperty("steps")
    public List<Step__1> getSteps() {
        return steps;
    }

    /**
     * Steps are the steps of the build; each step is run sequentially with the
     * source mounted into /workspace.
     * 
     */
    @JsonProperty("steps")
    public void setSteps(List<Step__1> steps) {
        this.steps = steps;
    }

    public TaskSpec withSteps(List<Step__1> steps) {
        this.steps = steps;
        return this;
    }

    /**
     * Volumes is a collection of volumes that are available to mount into the
     * steps of the build.
     * See Pod.spec.volumes (API version: v1)
     * 
     */
    @JsonProperty("volumes")
    public Object getVolumes() {
        return volumes;
    }

    /**
     * Volumes is a collection of volumes that are available to mount into the
     * steps of the build.
     * See Pod.spec.volumes (API version: v1)
     * 
     */
    @JsonProperty("volumes")
    public void setVolumes(Object volumes) {
        this.volumes = volumes;
    }

    public TaskSpec withVolumes(Object volumes) {
        this.volumes = volumes;
        return this;
    }

    /**
     * Workspaces are the volumes that this Task requires.
     * 
     */
    @JsonProperty("workspaces")
    public List<Workspace__3> getWorkspaces() {
        return workspaces;
    }

    /**
     * Workspaces are the volumes that this Task requires.
     * 
     */
    @JsonProperty("workspaces")
    public void setWorkspaces(List<Workspace__3> workspaces) {
        this.workspaces = workspaces;
    }

    public TaskSpec withWorkspaces(List<Workspace__3> workspaces) {
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

    public TaskSpec withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TaskSpec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("params");
        sb.append('=');
        sb.append(((this.params == null)?"<null>":this.params));
        sb.append(',');
        sb.append("results");
        sb.append('=');
        sb.append(((this.results == null)?"<null>":this.results));
        sb.append(',');
        sb.append("sidecars");
        sb.append('=');
        sb.append(((this.sidecars == null)?"<null>":this.sidecars));
        sb.append(',');
        sb.append("stepTemplate");
        sb.append('=');
        sb.append(((this.stepTemplate == null)?"<null>":this.stepTemplate));
        sb.append(',');
        sb.append("steps");
        sb.append('=');
        sb.append(((this.steps == null)?"<null>":this.steps));
        sb.append(',');
        sb.append("volumes");
        sb.append('=');
        sb.append(((this.volumes == null)?"<null>":this.volumes));
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
        result = ((result* 31)+((this.sidecars == null)? 0 :this.sidecars.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.volumes == null)? 0 :this.volumes.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.stepTemplate == null)? 0 :this.stepTemplate.hashCode()));
        result = ((result* 31)+((this.workspaces == null)? 0 :this.workspaces.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        result = ((result* 31)+((this.results == null)? 0 :this.results.hashCode()));
        result = ((result* 31)+((this.steps == null)? 0 :this.steps.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskSpec) == false) {
            return false;
        }
        TaskSpec rhs = ((TaskSpec) other);
        return (((((((((((this.sidecars == rhs.sidecars)||((this.sidecars!= null)&&this.sidecars.equals(rhs.sidecars)))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.volumes == rhs.volumes)||((this.volumes!= null)&&this.volumes.equals(rhs.volumes))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.stepTemplate == rhs.stepTemplate)||((this.stepTemplate!= null)&&this.stepTemplate.equals(rhs.stepTemplate))))&&((this.workspaces == rhs.workspaces)||((this.workspaces!= null)&&this.workspaces.equals(rhs.workspaces))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params))))&&((this.results == rhs.results)||((this.results!= null)&&this.results.equals(rhs.results))))&&((this.steps == rhs.steps)||((this.steps!= null)&&this.steps.equals(rhs.steps))));
    }

}
