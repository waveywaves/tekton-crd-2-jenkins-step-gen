
package io.tekton.crd.model.taskruns.v1;

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
 * StepResult used to describe the Results of a Step.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "name",
    "properties",
    "type"
})
@Generated("jsonschema2pojo")
public class Result__3 {

    /**
     * Description is a human-readable description of the result
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Description is a human-readable description of the result")
    private String description;
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
     * Properties is the JSON Schema properties to support key-value pairs results.
     * 
     */
    @JsonProperty("properties")
    @JsonPropertyDescription("Properties is the JSON Schema properties to support key-value pairs results.")
    @Valid
    private Properties__2 properties;
    /**
     * The possible types are 'string', 'array', and 'object', with 'string' as the default.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The possible types are 'string', 'array', and 'object', with 'string' as the default.")
    private String type;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Description is a human-readable description of the result
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description is a human-readable description of the result
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Result__3 withDescription(String description) {
        this.description = description;
        return this;
    }

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

    public Result__3 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Properties is the JSON Schema properties to support key-value pairs results.
     * 
     */
    @JsonProperty("properties")
    public Properties__2 getProperties() {
        return properties;
    }

    /**
     * Properties is the JSON Schema properties to support key-value pairs results.
     * 
     */
    @JsonProperty("properties")
    public void setProperties(Properties__2 properties) {
        this.properties = properties;
    }

    public Result__3 withProperties(Properties__2 properties) {
        this.properties = properties;
        return this;
    }

    /**
     * The possible types are 'string', 'array', and 'object', with 'string' as the default.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The possible types are 'string', 'array', and 'object', with 'string' as the default.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Result__3 withType(String type) {
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

    public Result__3 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Result__3 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("properties");
        sb.append('=');
        sb.append(((this.properties == null)?"<null>":this.properties));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Result__3) == false) {
            return false;
        }
        Result__3 rhs = ((Result__3) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))));
    }

}
