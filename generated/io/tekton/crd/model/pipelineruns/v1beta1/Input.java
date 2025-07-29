
package io.tekton.crd.model.pipelineruns.v1beta1;

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
 * Artifact represents an artifact within a system, potentially containing multiple values
 * associated with it.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "buildOutput",
    "name",
    "values"
})
@Generated("jsonschema2pojo")
public class Input {

    /**
     * Indicate if the artifact is a build output or a by-product
     * 
     */
    @JsonProperty("buildOutput")
    @JsonPropertyDescription("Indicate if the artifact is a build output or a by-product")
    private Boolean buildOutput;
    /**
     * The artifact's identifying category name
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The artifact's identifying category name")
    private String name;
    /**
     * A collection of values related to the artifact
     * 
     */
    @JsonProperty("values")
    @JsonPropertyDescription("A collection of values related to the artifact")
    @Valid
    private List<Value> values = new ArrayList<Value>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Indicate if the artifact is a build output or a by-product
     * 
     */
    @JsonProperty("buildOutput")
    public Boolean getBuildOutput() {
        return buildOutput;
    }

    /**
     * Indicate if the artifact is a build output or a by-product
     * 
     */
    @JsonProperty("buildOutput")
    public void setBuildOutput(Boolean buildOutput) {
        this.buildOutput = buildOutput;
    }

    public Input withBuildOutput(Boolean buildOutput) {
        this.buildOutput = buildOutput;
        return this;
    }

    /**
     * The artifact's identifying category name
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The artifact's identifying category name
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
     * A collection of values related to the artifact
     * 
     */
    @JsonProperty("values")
    public List<Value> getValues() {
        return values;
    }

    /**
     * A collection of values related to the artifact
     * 
     */
    @JsonProperty("values")
    public void setValues(List<Value> values) {
        this.values = values;
    }

    public Input withValues(List<Value> values) {
        this.values = values;
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
        sb.append("buildOutput");
        sb.append('=');
        sb.append(((this.buildOutput == null)?"<null>":this.buildOutput));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("values");
        sb.append('=');
        sb.append(((this.values == null)?"<null>":this.values));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.buildOutput == null)? 0 :this.buildOutput.hashCode()));
        result = ((result* 31)+((this.values == null)? 0 :this.values.hashCode()));
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
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.buildOutput == rhs.buildOutput)||((this.buildOutput!= null)&&this.buildOutput.equals(rhs.buildOutput))))&&((this.values == rhs.values)||((this.values!= null)&&this.values.equals(rhs.values))));
    }

}
