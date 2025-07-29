
package io.tekton.crd.model.pipelineruns.v1beta1;

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
 * TaskRunResult used to describe the results of a task
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "type",
    "value"
})
@Generated("jsonschema2pojo")
public class TaskResult {

    /**
     * Name the given name
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name the given name")
    @NotNull
    private String name;
    /**
     * Type is the user-specified type of the result. The possible type
     * is currently "string" and will support "array" in following work.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type is the user-specified type of the result. The possible type\nis currently \"string\" and will support \"array\" in following work.")
    private String type;
    /**
     * Value the given value of the result
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Value the given value of the result")
    @NotNull
    private Object value;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Name the given name
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name the given name
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public TaskResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Type is the user-specified type of the result. The possible type
     * is currently "string" and will support "array" in following work.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type is the user-specified type of the result. The possible type
     * is currently "string" and will support "array" in following work.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public TaskResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Value the given value of the result
     * (Required)
     * 
     */
    @JsonProperty("value")
    public Object getValue() {
        return value;
    }

    /**
     * Value the given value of the result
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(Object value) {
        this.value = value;
    }

    public TaskResult withValue(Object value) {
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

    public TaskResult withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TaskResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskResult) == false) {
            return false;
        }
        TaskResult rhs = ((TaskResult) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
