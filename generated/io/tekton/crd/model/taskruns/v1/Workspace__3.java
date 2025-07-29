
package io.tekton.crd.model.taskruns.v1;

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
 * WorkspaceDeclaration is a declaration of a volume that a Task requires.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "mountPath",
    "name",
    "optional",
    "readOnly"
})
@Generated("jsonschema2pojo")
public class Workspace__3 {

    /**
     * Description is an optional human readable description of this volume.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Description is an optional human readable description of this volume.")
    private String description;
    /**
     * MountPath overrides the directory that the volume will be made available at.
     * 
     */
    @JsonProperty("mountPath")
    @JsonPropertyDescription("MountPath overrides the directory that the volume will be made available at.")
    private String mountPath;
    /**
     * Name is the name by which you can bind the volume at runtime.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name is the name by which you can bind the volume at runtime.")
    @NotNull
    private String name;
    /**
     * Optional marks a Workspace as not being required in TaskRuns. By default
     * this field is false and so declared workspaces are required.
     * 
     */
    @JsonProperty("optional")
    @JsonPropertyDescription("Optional marks a Workspace as not being required in TaskRuns. By default\nthis field is false and so declared workspaces are required.")
    private Boolean optional;
    /**
     * ReadOnly dictates whether a mounted volume is writable. By default this
     * field is false and so mounted volumes are writable.
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("ReadOnly dictates whether a mounted volume is writable. By default this\nfield is false and so mounted volumes are writable.")
    private Boolean readOnly;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Description is an optional human readable description of this volume.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description is an optional human readable description of this volume.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Workspace__3 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * MountPath overrides the directory that the volume will be made available at.
     * 
     */
    @JsonProperty("mountPath")
    public String getMountPath() {
        return mountPath;
    }

    /**
     * MountPath overrides the directory that the volume will be made available at.
     * 
     */
    @JsonProperty("mountPath")
    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    public Workspace__3 withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * Name is the name by which you can bind the volume at runtime.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name is the name by which you can bind the volume at runtime.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Workspace__3 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Optional marks a Workspace as not being required in TaskRuns. By default
     * this field is false and so declared workspaces are required.
     * 
     */
    @JsonProperty("optional")
    public Boolean getOptional() {
        return optional;
    }

    /**
     * Optional marks a Workspace as not being required in TaskRuns. By default
     * this field is false and so declared workspaces are required.
     * 
     */
    @JsonProperty("optional")
    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public Workspace__3 withOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }

    /**
     * ReadOnly dictates whether a mounted volume is writable. By default this
     * field is false and so mounted volumes are writable.
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * ReadOnly dictates whether a mounted volume is writable. By default this
     * field is false and so mounted volumes are writable.
     * 
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public Workspace__3 withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
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

    public Workspace__3 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Workspace__3 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("mountPath");
        sb.append('=');
        sb.append(((this.mountPath == null)?"<null>":this.mountPath));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("optional");
        sb.append('=');
        sb.append(((this.optional == null)?"<null>":this.optional));
        sb.append(',');
        sb.append("readOnly");
        sb.append('=');
        sb.append(((this.readOnly == null)?"<null>":this.readOnly));
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
        result = ((result* 31)+((this.mountPath == null)? 0 :this.mountPath.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.optional == null)? 0 :this.optional.hashCode()));
        result = ((result* 31)+((this.readOnly == null)? 0 :this.readOnly.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Workspace__3) == false) {
            return false;
        }
        Workspace__3 rhs = ((Workspace__3) other);
        return (((((((this.mountPath == rhs.mountPath)||((this.mountPath!= null)&&this.mountPath.equals(rhs.mountPath)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.optional == rhs.optional)||((this.optional!= null)&&this.optional.equals(rhs.optional))))&&((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
