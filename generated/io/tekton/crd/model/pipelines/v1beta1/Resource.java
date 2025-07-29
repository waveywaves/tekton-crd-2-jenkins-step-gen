
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
 * PipelineDeclaredResource is used by a Pipeline to declare the types of the
 * PipelineResources that it will required to run and names which can be used to
 * refer to these PipelineResources in PipelineTaskResourceBindings.
 * 
 * Deprecated: Unused, preserved only for backwards compatibility
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "optional",
    "type"
})
@Generated("jsonschema2pojo")
public class Resource {

    /**
     * Name is the name that will be used by the Pipeline to refer to this resource.
     * It does not directly correspond to the name of any PipelineResources Task
     * inputs or outputs, and it does not correspond to the actual names of the
     * PipelineResources that will be bound in the PipelineRun.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name is the name that will be used by the Pipeline to refer to this resource.\nIt does not directly correspond to the name of any PipelineResources Task\ninputs or outputs, and it does not correspond to the actual names of the\nPipelineResources that will be bound in the PipelineRun.")
    @NotNull
    private String name;
    /**
     * Optional declares the resource as optional.
     * optional: true - the resource is considered optional
     * optional: false - the resource is considered required (default/equivalent of not specifying it)
     * 
     */
    @JsonProperty("optional")
    @JsonPropertyDescription("Optional declares the resource as optional.\noptional: true - the resource is considered optional\noptional: false - the resource is considered required (default/equivalent of not specifying it)")
    private Boolean optional;
    /**
     * Type is the type of the PipelineResource.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type is the type of the PipelineResource.")
    @NotNull
    private String type;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Name is the name that will be used by the Pipeline to refer to this resource.
     * It does not directly correspond to the name of any PipelineResources Task
     * inputs or outputs, and it does not correspond to the actual names of the
     * PipelineResources that will be bound in the PipelineRun.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name is the name that will be used by the Pipeline to refer to this resource.
     * It does not directly correspond to the name of any PipelineResources Task
     * inputs or outputs, and it does not correspond to the actual names of the
     * PipelineResources that will be bound in the PipelineRun.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Resource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Optional declares the resource as optional.
     * optional: true - the resource is considered optional
     * optional: false - the resource is considered required (default/equivalent of not specifying it)
     * 
     */
    @JsonProperty("optional")
    public Boolean getOptional() {
        return optional;
    }

    /**
     * Optional declares the resource as optional.
     * optional: true - the resource is considered optional
     * optional: false - the resource is considered required (default/equivalent of not specifying it)
     * 
     */
    @JsonProperty("optional")
    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public Resource withOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }

    /**
     * Type is the type of the PipelineResource.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type is the type of the PipelineResource.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Resource withType(String type) {
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

    public Resource withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Resource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("optional");
        sb.append('=');
        sb.append(((this.optional == null)?"<null>":this.optional));
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
        if ((other instanceof Resource) == false) {
            return false;
        }
        Resource rhs = ((Resource) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.optional == rhs.optional)||((this.optional!= null)&&this.optional.equals(rhs.optional))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
