
package io.tekton.crd.model.tasks.v1beta1;

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
 * TaskResource defines an input or output Resource declared as a requirement
 * by a Task. The Name field will be used to refer to these Resources within
 * the Task definition, and when provided as an Input, the Name will be the
 * path to the volume mounted containing this Resource as an input (e.g.
 * an input Resource named `workspace` will be mounted at `/workspace`).
 * 
 * Deprecated: Unused, preserved only for backwards compatibility
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "name",
    "optional",
    "targetPath",
    "type"
})
@Generated("jsonschema2pojo")
public class Input {

    /**
     * Description is a user-facing description of the declared resource that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Description is a user-facing description of the declared resource that may be\nused to populate a UI.")
    private String description;
    /**
     * Name declares the name by which a resource is referenced in the
     * definition. Resources may be referenced by name in the definition of a
     * Task's steps.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name declares the name by which a resource is referenced in the\ndefinition. Resources may be referenced by name in the definition of a\nTask's steps.")
    @NotNull
    private String name;
    /**
     * Optional declares the resource as optional.
     * By default optional is set to false which makes a resource required.
     * optional: true - the resource is considered optional
     * optional: false - the resource is considered required (equivalent of not specifying it)
     * 
     */
    @JsonProperty("optional")
    @JsonPropertyDescription("Optional declares the resource as optional.\nBy default optional is set to false which makes a resource required.\noptional: true - the resource is considered optional\noptional: false - the resource is considered required (equivalent of not specifying it)")
    private Boolean optional;
    /**
     * TargetPath is the path in workspace directory where the resource
     * will be copied.
     * 
     */
    @JsonProperty("targetPath")
    @JsonPropertyDescription("TargetPath is the path in workspace directory where the resource\nwill be copied.")
    private String targetPath;
    /**
     * Type is the type of this resource;
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type is the type of this resource;")
    @NotNull
    private String type;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Description is a user-facing description of the declared resource that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description is a user-facing description of the declared resource that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Input withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Name declares the name by which a resource is referenced in the
     * definition. Resources may be referenced by name in the definition of a
     * Task's steps.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name declares the name by which a resource is referenced in the
     * definition. Resources may be referenced by name in the definition of a
     * Task's steps.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Input withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Optional declares the resource as optional.
     * By default optional is set to false which makes a resource required.
     * optional: true - the resource is considered optional
     * optional: false - the resource is considered required (equivalent of not specifying it)
     * 
     */
    @JsonProperty("optional")
    public Boolean getOptional() {
        return optional;
    }

    /**
     * Optional declares the resource as optional.
     * By default optional is set to false which makes a resource required.
     * optional: true - the resource is considered optional
     * optional: false - the resource is considered required (equivalent of not specifying it)
     * 
     */
    @JsonProperty("optional")
    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public Input withOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }

    /**
     * TargetPath is the path in workspace directory where the resource
     * will be copied.
     * 
     */
    @JsonProperty("targetPath")
    public String getTargetPath() {
        return targetPath;
    }

    /**
     * TargetPath is the path in workspace directory where the resource
     * will be copied.
     * 
     */
    @JsonProperty("targetPath")
    public void setTargetPath(String targetPath) {
        this.targetPath = targetPath;
    }

    public Input withTargetPath(String targetPath) {
        this.targetPath = targetPath;
        return this;
    }

    /**
     * Type is the type of this resource;
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type is the type of this resource;
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Input withType(String type) {
        this.type = type;
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

    public Input withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Input.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("optional");
        sb.append('=');
        sb.append(((this.optional == null)?"<null>":this.optional));
        sb.append(',');
        sb.append("targetPath");
        sb.append('=');
        sb.append(((this.targetPath == null)?"<null>":this.targetPath));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.targetPath == null)? 0 :this.targetPath.hashCode()));
        result = ((result* 31)+((this.optional == null)? 0 :this.optional.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Input) == false) {
            return false;
        }
        Input rhs = ((Input) other);
        return (((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.targetPath == rhs.targetPath)||((this.targetPath!= null)&&this.targetPath.equals(rhs.targetPath))))&&((this.optional == rhs.optional)||((this.optional!= null)&&this.optional.equals(rhs.optional))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
