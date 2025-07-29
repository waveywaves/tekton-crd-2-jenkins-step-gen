
package io.tekton.crd.model.taskruns.v1beta1;

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
 * Selects a resource of the container: only resources limits and requests
 * (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "containerName",
    "divisor",
    "resource"
})
@Generated("jsonschema2pojo")
public class ResourceFieldRef {

    /**
     * Container name: required for volumes, optional for env vars
     * 
     */
    @JsonProperty("containerName")
    @JsonPropertyDescription("Container name: required for volumes, optional for env vars")
    private String containerName;
    /**
     * Specifies the output format of the exposed resources, defaults to "1"
     * 
     */
    @JsonProperty("divisor")
    @JsonPropertyDescription("Specifies the output format of the exposed resources, defaults to \"1\"")
    private Object divisor;
    /**
     * Required: resource to select
     * (Required)
     * 
     */
    @JsonProperty("resource")
    @JsonPropertyDescription("Required: resource to select")
    @NotNull
    private String resource;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Container name: required for volumes, optional for env vars
     * 
     */
    @JsonProperty("containerName")
    public String getContainerName() {
        return containerName;
    }

    /**
     * Container name: required for volumes, optional for env vars
     * 
     */
    @JsonProperty("containerName")
    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public ResourceFieldRef withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Specifies the output format of the exposed resources, defaults to "1"
     * 
     */
    @JsonProperty("divisor")
    public Object getDivisor() {
        return divisor;
    }

    /**
     * Specifies the output format of the exposed resources, defaults to "1"
     * 
     */
    @JsonProperty("divisor")
    public void setDivisor(Object divisor) {
        this.divisor = divisor;
    }

    public ResourceFieldRef withDivisor(Object divisor) {
        this.divisor = divisor;
        return this;
    }

    /**
     * Required: resource to select
     * (Required)
     * 
     */
    @JsonProperty("resource")
    public String getResource() {
        return resource;
    }

    /**
     * Required: resource to select
     * (Required)
     * 
     */
    @JsonProperty("resource")
    public void setResource(String resource) {
        this.resource = resource;
    }

    public ResourceFieldRef withResource(String resource) {
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

    public ResourceFieldRef withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResourceFieldRef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("containerName");
        sb.append('=');
        sb.append(((this.containerName == null)?"<null>":this.containerName));
        sb.append(',');
        sb.append("divisor");
        sb.append('=');
        sb.append(((this.divisor == null)?"<null>":this.divisor));
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
        result = ((result* 31)+((this.divisor == null)? 0 :this.divisor.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.resource == null)? 0 :this.resource.hashCode()));
        result = ((result* 31)+((this.containerName == null)? 0 :this.containerName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceFieldRef) == false) {
            return false;
        }
        ResourceFieldRef rhs = ((ResourceFieldRef) other);
        return (((((this.divisor == rhs.divisor)||((this.divisor!= null)&&this.divisor.equals(rhs.divisor)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resource == rhs.resource)||((this.resource!= null)&&this.resource.equals(rhs.resource))))&&((this.containerName == rhs.containerName)||((this.containerName!= null)&&this.containerName.equals(rhs.containerName))));
    }

}
