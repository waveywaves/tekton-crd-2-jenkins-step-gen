
package io.tekton.crd.model.pipelines.v1beta1;

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
 * Spec holds the desired state of the Pipeline from the client
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "displayName",
    "finally",
    "params",
    "resources",
    "results",
    "tasks",
    "workspaces"
})
@Generated("jsonschema2pojo")
public class Spec {

    /**
     * Description is a user-facing description of the pipeline that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Description is a user-facing description of the pipeline that may be\nused to populate a UI.")
    private String description;
    /**
     * DisplayName is a user-facing name of the pipeline that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("DisplayName is a user-facing name of the pipeline that may be\nused to populate a UI.")
    private String displayName;
    /**
     * Finally declares the list of Tasks that execute just before leaving the Pipeline
     * i.e. either after all Tasks are finished executing successfully
     * or after a failure which would result in ending the Pipeline
     * 
     */
    @JsonProperty("finally")
    @JsonPropertyDescription("Finally declares the list of Tasks that execute just before leaving the Pipeline\ni.e. either after all Tasks are finished executing successfully\nor after a failure which would result in ending the Pipeline")
    @Valid
    private List<Finally> _finally = new ArrayList<Finally>();
    /**
     * Params declares a list of input parameters that must be supplied when
     * this Pipeline is run.
     * 
     */
    @JsonProperty("params")
    @JsonPropertyDescription("Params declares a list of input parameters that must be supplied when\nthis Pipeline is run.")
    @Valid
    private List<Param__5> params = new ArrayList<Param__5>();
    /**
     * Deprecated: Unused, preserved only for backwards compatibility
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("Deprecated: Unused, preserved only for backwards compatibility")
    @Valid
    private List<Resource> resources = new ArrayList<Resource>();
    /**
     * Results are values that this pipeline can output once run
     * 
     */
    @JsonProperty("results")
    @JsonPropertyDescription("Results are values that this pipeline can output once run")
    @Valid
    private List<Result> results = new ArrayList<Result>();
    /**
     * Tasks declares the graph of Tasks that execute when this Pipeline is run.
     * 
     */
    @JsonProperty("tasks")
    @JsonPropertyDescription("Tasks declares the graph of Tasks that execute when this Pipeline is run.")
    @Valid
    private List<Task> tasks = new ArrayList<Task>();
    /**
     * Workspaces declares a set of named workspaces that are expected to be
     * provided by a PipelineRun.
     * 
     */
    @JsonProperty("workspaces")
    @JsonPropertyDescription("Workspaces declares a set of named workspaces that are expected to be\nprovided by a PipelineRun.")
    @Valid
    private List<Workspace__2> workspaces = new ArrayList<Workspace__2>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Description is a user-facing description of the pipeline that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description is a user-facing description of the pipeline that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Spec withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * DisplayName is a user-facing name of the pipeline that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * DisplayName is a user-facing name of the pipeline that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Spec withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Finally declares the list of Tasks that execute just before leaving the Pipeline
     * i.e. either after all Tasks are finished executing successfully
     * or after a failure which would result in ending the Pipeline
     * 
     */
    @JsonProperty("finally")
    public List<Finally> getFinally() {
        return _finally;
    }

    /**
     * Finally declares the list of Tasks that execute just before leaving the Pipeline
     * i.e. either after all Tasks are finished executing successfully
     * or after a failure which would result in ending the Pipeline
     * 
     */
    @JsonProperty("finally")
    public void setFinally(List<Finally> _finally) {
        this._finally = _finally;
    }

    public Spec withFinally(List<Finally> _finally) {
        this._finally = _finally;
        return this;
    }

    /**
     * Params declares a list of input parameters that must be supplied when
     * this Pipeline is run.
     * 
     */
    @JsonProperty("params")
    public List<Param__5> getParams() {
        return params;
    }

    /**
     * Params declares a list of input parameters that must be supplied when
     * this Pipeline is run.
     * 
     */
    @JsonProperty("params")
    public void setParams(List<Param__5> params) {
        this.params = params;
    }

    public Spec withParams(List<Param__5> params) {
        this.params = params;
        return this;
    }

    /**
     * Deprecated: Unused, preserved only for backwards compatibility
     * 
     */
    @JsonProperty("resources")
    public List<Resource> getResources() {
        return resources;
    }

    /**
     * Deprecated: Unused, preserved only for backwards compatibility
     * 
     */
    @JsonProperty("resources")
    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public Spec withResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Results are values that this pipeline can output once run
     * 
     */
    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    /**
     * Results are values that this pipeline can output once run
     * 
     */
    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Spec withResults(List<Result> results) {
        this.results = results;
        return this;
    }

    /**
     * Tasks declares the graph of Tasks that execute when this Pipeline is run.
     * 
     */
    @JsonProperty("tasks")
    public List<Task> getTasks() {
        return tasks;
    }

    /**
     * Tasks declares the graph of Tasks that execute when this Pipeline is run.
     * 
     */
    @JsonProperty("tasks")
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Spec withTasks(List<Task> tasks) {
        this.tasks = tasks;
        return this;
    }

    /**
     * Workspaces declares a set of named workspaces that are expected to be
     * provided by a PipelineRun.
     * 
     */
    @JsonProperty("workspaces")
    public List<Workspace__2> getWorkspaces() {
        return workspaces;
    }

    /**
     * Workspaces declares a set of named workspaces that are expected to be
     * provided by a PipelineRun.
     * 
     */
    @JsonProperty("workspaces")
    public void setWorkspaces(List<Workspace__2> workspaces) {
        this.workspaces = workspaces;
    }

    public Spec withWorkspaces(List<Workspace__2> workspaces) {
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
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("_finally");
        sb.append('=');
        sb.append(((this._finally == null)?"<null>":this._finally));
        sb.append(',');
        sb.append("params");
        sb.append('=');
        sb.append(((this.params == null)?"<null>":this.params));
        sb.append(',');
        sb.append("resources");
        sb.append('=');
        sb.append(((this.resources == null)?"<null>":this.resources));
        sb.append(',');
        sb.append("results");
        sb.append('=');
        sb.append(((this.results == null)?"<null>":this.results));
        sb.append(',');
        sb.append("tasks");
        sb.append('=');
        sb.append(((this.tasks == null)?"<null>":this.tasks));
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
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this._finally == null)? 0 :this._finally.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.resources == null)? 0 :this.resources.hashCode()));
        result = ((result* 31)+((this.workspaces == null)? 0 :this.workspaces.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        result = ((result* 31)+((this.results == null)? 0 :this.results.hashCode()));
        result = ((result* 31)+((this.tasks == null)? 0 :this.tasks.hashCode()));
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
        return ((((((((((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName)))&&((this._finally == rhs._finally)||((this._finally!= null)&&this._finally.equals(rhs._finally))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.resources == rhs.resources)||((this.resources!= null)&&this.resources.equals(rhs.resources))))&&((this.workspaces == rhs.workspaces)||((this.workspaces!= null)&&this.workspaces.equals(rhs.workspaces))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params))))&&((this.results == rhs.results)||((this.results!= null)&&this.results.equals(rhs.results))))&&((this.tasks == rhs.tasks)||((this.tasks!= null)&&this.tasks.equals(rhs.tasks))));
    }

}
