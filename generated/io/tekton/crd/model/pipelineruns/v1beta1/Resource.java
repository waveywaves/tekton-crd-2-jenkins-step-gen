
package io.tekton.crd.model.pipelineruns.v1beta1;

import java.util.LinkedHashMap;
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
 * PipelineResourceBinding connects a reference to an instance of a PipelineResource
 * with a PipelineResource dependency that the Pipeline has declared
 * 
 * Deprecated: Unused, preserved only for backwards compatibility
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "resourceRef",
    "resourceSpec"
})
@Generated("jsonschema2pojo")
public class Resource {

    /**
     * Name is the name of the PipelineResource in the Pipeline's declaration
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name is the name of the PipelineResource in the Pipeline's declaration")
    private String name;
    /**
     * ResourceRef is a reference to the instance of the actual PipelineResource
     * that should be used
     * 
     */
    @JsonProperty("resourceRef")
    @JsonPropertyDescription("ResourceRef is a reference to the instance of the actual PipelineResource\nthat should be used")
    @Valid
    private ResourceRef resourceRef;
    /**
     * ResourceSpec is specification of a resource that should be created and
     * consumed by the task
     * 
     */
    @JsonProperty("resourceSpec")
    @JsonPropertyDescription("ResourceSpec is specification of a resource that should be created and\nconsumed by the task")
    @Valid
    private ResourceSpec resourceSpec;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Name is the name of the PipelineResource in the Pipeline's declaration
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name is the name of the PipelineResource in the Pipeline's declaration
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
     * ResourceRef is a reference to the instance of the actual PipelineResource
     * that should be used
     * 
     */
    @JsonProperty("resourceRef")
    public ResourceRef getResourceRef() {
        return resourceRef;
    }

    /**
     * ResourceRef is a reference to the instance of the actual PipelineResource
     * that should be used
     * 
     */
    @JsonProperty("resourceRef")
    public void setResourceRef(ResourceRef resourceRef) {
        this.resourceRef = resourceRef;
    }

    public Resource withResourceRef(ResourceRef resourceRef) {
        this.resourceRef = resourceRef;
        return this;
    }

    /**
     * ResourceSpec is specification of a resource that should be created and
     * consumed by the task
     * 
     */
    @JsonProperty("resourceSpec")
    public ResourceSpec getResourceSpec() {
        return resourceSpec;
    }

    /**
     * ResourceSpec is specification of a resource that should be created and
     * consumed by the task
     * 
     */
    @JsonProperty("resourceSpec")
    public void setResourceSpec(ResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
    }

    public Resource withResourceSpec(ResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
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
        sb.append("resourceRef");
        sb.append('=');
        sb.append(((this.resourceRef == null)?"<null>":this.resourceRef));
        sb.append(',');
        sb.append("resourceSpec");
        sb.append('=');
        sb.append(((this.resourceSpec == null)?"<null>":this.resourceSpec));
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
        result = ((result* 31)+((this.resourceRef == null)? 0 :this.resourceRef.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.resourceSpec == null)? 0 :this.resourceSpec.hashCode()));
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
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.resourceRef == rhs.resourceRef)||((this.resourceRef!= null)&&this.resourceRef.equals(rhs.resourceRef))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceSpec == rhs.resourceSpec)||((this.resourceSpec!= null)&&this.resourceSpec.equals(rhs.resourceSpec))));
    }

}
