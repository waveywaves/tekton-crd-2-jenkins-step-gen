
package io.tekton.crd.model.pipelines.v1beta1;

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
 * PipelineTaskInputResource maps the name of a declared PipelineResource input
 * dependency in a Task to the resource in the Pipeline's DeclaredPipelineResources
 * that should be used. This input may come from a previous task.
 * 
 * Deprecated: Unused, preserved only for backwards compatibility
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "from",
    "name",
    "resource"
})
@Generated("jsonschema2pojo")
public class Input {

    /**
     * From is the list of PipelineTask names that the resource has to come from.
     * (Implies an ordering in the execution graph.)
     * 
     */
    @JsonProperty("from")
    @JsonPropertyDescription("From is the list of PipelineTask names that the resource has to come from.\n(Implies an ordering in the execution graph.)")
    @Valid
    private List<String> from = new ArrayList<String>();
    /**
     * Name is the name of the PipelineResource as declared by the Task.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name is the name of the PipelineResource as declared by the Task.")
    @NotNull
    private String name;
    /**
     * Resource is the name of the DeclaredPipelineResource to use.
     * (Required)
     * 
     */
    @JsonProperty("resource")
    @JsonPropertyDescription("Resource is the name of the DeclaredPipelineResource to use.")
    @NotNull
    private String resource;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * From is the list of PipelineTask names that the resource has to come from.
     * (Implies an ordering in the execution graph.)
     * 
     */
    @JsonProperty("from")
    public List<String> getFrom() {
        return from;
    }

    /**
     * From is the list of PipelineTask names that the resource has to come from.
     * (Implies an ordering in the execution graph.)
     * 
     */
    @JsonProperty("from")
    public void setFrom(List<String> from) {
        this.from = from;
    }

    public Input withFrom(List<String> from) {
        this.from = from;
        return this;
    }

    /**
     * Name is the name of the PipelineResource as declared by the Task.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name is the name of the PipelineResource as declared by the Task.
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
     * Resource is the name of the DeclaredPipelineResource to use.
     * (Required)
     * 
     */
    @JsonProperty("resource")
    public String getResource() {
        return resource;
    }

    /**
     * Resource is the name of the DeclaredPipelineResource to use.
     * (Required)
     * 
     */
    @JsonProperty("resource")
    public void setResource(String resource) {
        this.resource = resource;
    }

    public Input withResource(String resource) {
        this.resource = resource;
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
        sb.append("from");
        sb.append('=');
        sb.append(((this.from == null)?"<null>":this.from));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("resource");
        sb.append('=');
        sb.append(((this.resource == null)?"<null>":this.resource));
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
        result = ((result* 31)+((this.from == null)? 0 :this.from.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.resource == null)? 0 :this.resource.hashCode()));
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
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.from == rhs.from)||((this.from!= null)&&this.from.equals(rhs.from))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resource == rhs.resource)||((this.resource!= null)&&this.resource.equals(rhs.resource))));
    }

}
