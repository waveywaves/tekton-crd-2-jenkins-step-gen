
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
 * RunResult is used to write key/value pairs to TaskRun pod termination messages.
 * The key/value pairs may come from the entrypoint binary, or represent a TaskRunResult.
 * If they represent a TaskRunResult, the key is the name of the result and the value is the
 * JSON-serialized value of the result.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "key",
    "resourceName",
    "type",
    "value"
})
@Generated("jsonschema2pojo")
public class ResourcesResult {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("key")
    @NotNull
    private String key;
    /**
     * ResourceName may be used in tests, but it is not populated in termination messages.
     * It is preserved here for backwards compatibility and will not be ported to v1.
     * 
     */
    @JsonProperty("resourceName")
    @JsonPropertyDescription("ResourceName may be used in tests, but it is not populated in termination messages.\nIt is preserved here for backwards compatibility and will not be ported to v1.")
    private String resourceName;
    /**
     * ResultType used to find out whether a RunResult is from a task result or not
     * Note that ResultsType is another type which is used to define the data type
     * (e.g. string, array, etc) we used for Results
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("ResultType used to find out whether a RunResult is from a task result or not\nNote that ResultsType is another type which is used to define the data type\n(e.g. string, array, etc) we used for Results")
    private Integer type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    @NotNull
    private String value;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    public ResourcesResult withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * ResourceName may be used in tests, but it is not populated in termination messages.
     * It is preserved here for backwards compatibility and will not be ported to v1.
     * 
     */
    @JsonProperty("resourceName")
    public String getResourceName() {
        return resourceName;
    }

    /**
     * ResourceName may be used in tests, but it is not populated in termination messages.
     * It is preserved here for backwards compatibility and will not be ported to v1.
     * 
     */
    @JsonProperty("resourceName")
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ResourcesResult withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * ResultType used to find out whether a RunResult is from a task result or not
     * Note that ResultsType is another type which is used to define the data type
     * (e.g. string, array, etc) we used for Results
     * 
     */
    @JsonProperty("type")
    public Integer getType() {
        return type;
    }

    /**
     * ResultType used to find out whether a RunResult is from a task result or not
     * Note that ResultsType is another type which is used to define the data type
     * (e.g. string, array, etc) we used for Results
     * 
     */
    @JsonProperty("type")
    public void setType(Integer type) {
        this.type = type;
    }

    public ResourcesResult withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public ResourcesResult withValue(String value) {
        this.value = value;
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

    public ResourcesResult withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResourcesResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("resourceName");
        sb.append('=');
        sb.append(((this.resourceName == null)?"<null>":this.resourceName));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.resourceName == null)? 0 :this.resourceName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourcesResult) == false) {
            return false;
        }
        ResourcesResult rhs = ((ResourcesResult) other);
        return ((((((this.resourceName == rhs.resourceName)||((this.resourceName!= null)&&this.resourceName.equals(rhs.resourceName)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))));
    }

}
