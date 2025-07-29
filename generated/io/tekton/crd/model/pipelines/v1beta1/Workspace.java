
package io.tekton.crd.model.pipelines.v1beta1;

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
 * WorkspacePipelineTaskBinding describes how a workspace passed into the pipeline should be
 * mapped to a task's declared workspace.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "subPath",
    "workspace"
})
@Generated("jsonschema2pojo")
public class Workspace {

    /**
     * Name is the name of the workspace as declared by the task
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name is the name of the workspace as declared by the task")
    @NotNull
    private String name;
    /**
     * SubPath is optionally a directory on the volume which should be used
     * for this binding (i.e. the volume will be mounted at this sub directory).
     * 
     */
    @JsonProperty("subPath")
    @JsonPropertyDescription("SubPath is optionally a directory on the volume which should be used\nfor this binding (i.e. the volume will be mounted at this sub directory).")
    private String subPath;
    /**
     * Workspace is the name of the workspace declared by the pipeline
     * 
     */
    @JsonProperty("workspace")
    @JsonPropertyDescription("Workspace is the name of the workspace declared by the pipeline")
    private String workspace;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Name is the name of the workspace as declared by the task
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name is the name of the workspace as declared by the task
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Workspace withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * SubPath is optionally a directory on the volume which should be used
     * for this binding (i.e. the volume will be mounted at this sub directory).
     * 
     */
    @JsonProperty("subPath")
    public String getSubPath() {
        return subPath;
    }

    /**
     * SubPath is optionally a directory on the volume which should be used
     * for this binding (i.e. the volume will be mounted at this sub directory).
     * 
     */
    @JsonProperty("subPath")
    public void setSubPath(String subPath) {
        this.subPath = subPath;
    }

    public Workspace withSubPath(String subPath) {
        this.subPath = subPath;
        return this;
    }

    /**
     * Workspace is the name of the workspace declared by the pipeline
     * 
     */
    @JsonProperty("workspace")
    public String getWorkspace() {
        return workspace;
    }

    /**
     * Workspace is the name of the workspace declared by the pipeline
     * 
     */
    @JsonProperty("workspace")
    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public Workspace withWorkspace(String workspace) {
        this.workspace = workspace;
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

    public Workspace withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Workspace.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("subPath");
        sb.append('=');
        sb.append(((this.subPath == null)?"<null>":this.subPath));
        sb.append(',');
        sb.append("workspace");
        sb.append('=');
        sb.append(((this.workspace == null)?"<null>":this.workspace));
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
        result = ((result* 31)+((this.workspace == null)? 0 :this.workspace.hashCode()));
        result = ((result* 31)+((this.subPath == null)? 0 :this.subPath.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Workspace) == false) {
            return false;
        }
        Workspace rhs = ((Workspace) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.workspace == rhs.workspace)||((this.workspace!= null)&&this.workspace.equals(rhs.workspace))))&&((this.subPath == rhs.subPath)||((this.subPath!= null)&&this.subPath.equals(rhs.subPath))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
