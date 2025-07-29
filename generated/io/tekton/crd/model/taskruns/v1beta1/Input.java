
package io.tekton.crd.model.taskruns.v1beta1;

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
 * TaskResourceBinding points to the PipelineResource that
 * will be used for the Task input or output called Name.
 * 
 * Deprecated: Unused, preserved only for backwards compatibility
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "paths",
    "resourceRef",
    "resourceSpec"
})
@Generated("jsonschema2pojo")
public class Input {

    /**
     * Name is the name of the PipelineResource in the Pipeline's declaration
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name is the name of the PipelineResource in the Pipeline's declaration")
    private String name;
    /**
     * Paths will probably be removed in #1284, and then PipelineResourceBinding can be used instead.
     * The optional Path field corresponds to a path on disk at which the Resource can be found
     * (used when providing the resource via mounted volume, overriding the default logic to fetch the Resource).
     * 
     */
    @JsonProperty("paths")
    @JsonPropertyDescription("Paths will probably be removed in #1284, and then PipelineResourceBinding can be used instead.\nThe optional Path field corresponds to a path on disk at which the Resource can be found\n(used when providing the resource via mounted volume, overriding the default logic to fetch the Resource).")
    @Valid
    private List<String> paths = new ArrayList<String>();
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

    public Input withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Paths will probably be removed in #1284, and then PipelineResourceBinding can be used instead.
     * The optional Path field corresponds to a path on disk at which the Resource can be found
     * (used when providing the resource via mounted volume, overriding the default logic to fetch the Resource).
     * 
     */
    @JsonProperty("paths")
    public List<String> getPaths() {
        return paths;
    }

    /**
     * Paths will probably be removed in #1284, and then PipelineResourceBinding can be used instead.
     * The optional Path field corresponds to a path on disk at which the Resource can be found
     * (used when providing the resource via mounted volume, overriding the default logic to fetch the Resource).
     * 
     */
    @JsonProperty("paths")
    public void setPaths(List<String> paths) {
        this.paths = paths;
    }

    public Input withPaths(List<String> paths) {
        this.paths = paths;
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

    public Input withResourceRef(ResourceRef resourceRef) {
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

    public Input withResourceSpec(ResourceSpec resourceSpec) {
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

    public Input withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Input.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("paths");
        sb.append('=');
        sb.append(((this.paths == null)?"<null>":this.paths));
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
        result = ((result* 31)+((this.paths == null)? 0 :this.paths.hashCode()));
        result = ((result* 31)+((this.resourceSpec == null)? 0 :this.resourceSpec.hashCode()));
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
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.resourceRef == rhs.resourceRef)||((this.resourceRef!= null)&&this.resourceRef.equals(rhs.resourceRef))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.paths == rhs.paths)||((this.paths!= null)&&this.paths.equals(rhs.paths))))&&((this.resourceSpec == rhs.resourceSpec)||((this.resourceSpec!= null)&&this.resourceSpec.equals(rhs.resourceSpec))));
    }

}
