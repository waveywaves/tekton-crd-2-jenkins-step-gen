
package io.tekton.crd.model.taskruns.v1beta1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
 * ResourceSpec is specification of a resource that should be created and
 * consumed by the task
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "params",
    "secrets",
    "type"
})
@Generated("jsonschema2pojo")
public class ResourceSpec {

    /**
     * Description is a user-facing description of the resource that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Description is a user-facing description of the resource that may be\nused to populate a UI.")
    private String description;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("params")
    @Valid
    @NotNull
    private List<Param__1> params = new ArrayList<Param__1>();
    /**
     * Secrets to fetch to populate some of resource fields
     * 
     */
    @JsonProperty("secrets")
    @JsonPropertyDescription("Secrets to fetch to populate some of resource fields")
    @Valid
    private List<Secret> secrets = new ArrayList<Secret>();
    /**
     * PipelineResourceType represents the type of endpoint the pipelineResource is, so that the
     * controller will know this pipelineResource shouldx be fetched and optionally what
     * additional metatdata should be provided for it.
     * 
     * Deprecated: Unused, preserved only for backwards compatibility
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("PipelineResourceType represents the type of endpoint the pipelineResource is, so that the\ncontroller will know this pipelineResource shouldx be fetched and optionally what\nadditional metatdata should be provided for it.\n\nDeprecated: Unused, preserved only for backwards compatibility")
    @NotNull
    private String type;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Description is a user-facing description of the resource that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description is a user-facing description of the resource that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ResourceSpec withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("params")
    public List<Param__1> getParams() {
        return params;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("params")
    public void setParams(List<Param__1> params) {
        this.params = params;
    }

    public ResourceSpec withParams(List<Param__1> params) {
        this.params = params;
        return this;
    }

    /**
     * Secrets to fetch to populate some of resource fields
     * 
     */
    @JsonProperty("secrets")
    public List<Secret> getSecrets() {
        return secrets;
    }

    /**
     * Secrets to fetch to populate some of resource fields
     * 
     */
    @JsonProperty("secrets")
    public void setSecrets(List<Secret> secrets) {
        this.secrets = secrets;
    }

    public ResourceSpec withSecrets(List<Secret> secrets) {
        this.secrets = secrets;
        return this;
    }

    /**
     * PipelineResourceType represents the type of endpoint the pipelineResource is, so that the
     * controller will know this pipelineResource shouldx be fetched and optionally what
     * additional metatdata should be provided for it.
     * 
     * Deprecated: Unused, preserved only for backwards compatibility
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * PipelineResourceType represents the type of endpoint the pipelineResource is, so that the
     * controller will know this pipelineResource shouldx be fetched and optionally what
     * additional metatdata should be provided for it.
     * 
     * Deprecated: Unused, preserved only for backwards compatibility
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public ResourceSpec withType(String type) {
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

    public ResourceSpec withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResourceSpec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("params");
        sb.append('=');
        sb.append(((this.params == null)?"<null>":this.params));
        sb.append(',');
        sb.append("secrets");
        sb.append('=');
        sb.append(((this.secrets == null)?"<null>":this.secrets));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.secrets == null)? 0 :this.secrets.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceSpec) == false) {
            return false;
        }
        ResourceSpec rhs = ((ResourceSpec) other);
        return ((((((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.secrets == rhs.secrets)||((this.secrets!= null)&&this.secrets.equals(rhs.secrets))));
    }

}
