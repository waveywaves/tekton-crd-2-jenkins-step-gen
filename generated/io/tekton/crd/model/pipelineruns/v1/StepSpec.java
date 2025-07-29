
package io.tekton.crd.model.pipelineruns.v1;

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
 * TaskRunStepSpec is used to override the values of a Step in the corresponding Task.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "computeResources",
    "name"
})
@Generated("jsonschema2pojo")
public class StepSpec {

    /**
     * The resource requirements to apply to the Step.
     * (Required)
     * 
     */
    @JsonProperty("computeResources")
    @JsonPropertyDescription("The resource requirements to apply to the Step.")
    @Valid
    @NotNull
    private ComputeResources__2 computeResources;
    /**
     * The name of the Step to override.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the Step to override.")
    @NotNull
    private String name;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The resource requirements to apply to the Step.
     * (Required)
     * 
     */
    @JsonProperty("computeResources")
    public ComputeResources__2 getComputeResources() {
        return computeResources;
    }

    /**
     * The resource requirements to apply to the Step.
     * (Required)
     * 
     */
    @JsonProperty("computeResources")
    public void setComputeResources(ComputeResources__2 computeResources) {
        this.computeResources = computeResources;
    }

    public StepSpec withComputeResources(ComputeResources__2 computeResources) {
        this.computeResources = computeResources;
        return this;
    }

    /**
     * The name of the Step to override.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the Step to override.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public StepSpec withName(String name) {
        this.name = name;
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

    public StepSpec withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StepSpec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("computeResources");
        sb.append('=');
        sb.append(((this.computeResources == null)?"<null>":this.computeResources));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.computeResources == null)? 0 :this.computeResources.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StepSpec) == false) {
            return false;
        }
        StepSpec rhs = ((StepSpec) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.computeResources == rhs.computeResources)||((this.computeResources!= null)&&this.computeResources.equals(rhs.computeResources))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
