
package io.tekton.crd.model.tasks.v1;

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
 * ParamSpec defines arbitrary parameters needed beyond typed inputs (such as
 * resources). Parameter values are provided by users as inputs on a TaskRun
 * or PipelineRun.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "default",
    "description",
    "enum",
    "name",
    "properties",
    "type"
})
@Generated("jsonschema2pojo")
public class Param {

    /**
     * Default is the value a parameter takes if no input value is supplied. If
     * default is set, a Task may be executed without a supplied value for the
     * parameter.
     * 
     */
    @JsonProperty("default")
    @JsonPropertyDescription("Default is the value a parameter takes if no input value is supplied. If\ndefault is set, a Task may be executed without a supplied value for the\nparameter.")
    private Object _default;
    /**
     * Description is a user-facing description of the parameter that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Description is a user-facing description of the parameter that may be\nused to populate a UI.")
    private String description;
    /**
     * Enum declares a set of allowed param input values for tasks/pipelines that can be validated.
     * If Enum is not set, no input validation is performed for the param.
     * 
     */
    @JsonProperty("enum")
    @JsonPropertyDescription("Enum declares a set of allowed param input values for tasks/pipelines that can be validated.\nIf Enum is not set, no input validation is performed for the param.")
    @Valid
    private List<String> _enum = new ArrayList<String>();
    /**
     * Name declares the name by which a parameter is referenced.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name declares the name by which a parameter is referenced.")
    @NotNull
    private String name;
    /**
     * Properties is the JSON Schema properties to support key-value pairs parameter.
     * 
     */
    @JsonProperty("properties")
    @JsonPropertyDescription("Properties is the JSON Schema properties to support key-value pairs parameter.")
    @Valid
    private Properties properties;
    /**
     * Type is the user-specified type of the parameter. The possible types
     * are currently "string", "array" and "object", and "string" is the default.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type is the user-specified type of the parameter. The possible types\nare currently \"string\", \"array\" and \"object\", and \"string\" is the default.")
    private String type;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Default is the value a parameter takes if no input value is supplied. If
     * default is set, a Task may be executed without a supplied value for the
     * parameter.
     * 
     */
    @JsonProperty("default")
    public Object getDefault() {
        return _default;
    }

    /**
     * Default is the value a parameter takes if no input value is supplied. If
     * default is set, a Task may be executed without a supplied value for the
     * parameter.
     * 
     */
    @JsonProperty("default")
    public void setDefault(Object _default) {
        this._default = _default;
    }

    public Param withDefault(Object _default) {
        this._default = _default;
        return this;
    }

    /**
     * Description is a user-facing description of the parameter that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description is a user-facing description of the parameter that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Param withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Enum declares a set of allowed param input values for tasks/pipelines that can be validated.
     * If Enum is not set, no input validation is performed for the param.
     * 
     */
    @JsonProperty("enum")
    public List<String> getEnum() {
        return _enum;
    }

    /**
     * Enum declares a set of allowed param input values for tasks/pipelines that can be validated.
     * If Enum is not set, no input validation is performed for the param.
     * 
     */
    @JsonProperty("enum")
    public void setEnum(List<String> _enum) {
        this._enum = _enum;
    }

    public Param withEnum(List<String> _enum) {
        this._enum = _enum;
        return this;
    }

    /**
     * Name declares the name by which a parameter is referenced.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name declares the name by which a parameter is referenced.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Param withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Properties is the JSON Schema properties to support key-value pairs parameter.
     * 
     */
    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    /**
     * Properties is the JSON Schema properties to support key-value pairs parameter.
     * 
     */
    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Param withProperties(Properties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Type is the user-specified type of the parameter. The possible types
     * are currently "string", "array" and "object", and "string" is the default.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type is the user-specified type of the parameter. The possible types
     * are currently "string", "array" and "object", and "string" is the default.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Param withType(String type) {
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

    public Param withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Param.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_default");
        sb.append('=');
        sb.append(((this._default == null)?"<null>":this._default));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("_enum");
        sb.append('=');
        sb.append(((this._enum == null)?"<null>":this._enum));
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
        result = ((result* 31)+((this._default == null)? 0 :this._default.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this._enum == null)? 0 :this._enum.hashCode()));
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
        if ((other instanceof Param) == false) {
            return false;
        }
        Param rhs = ((Param) other);
        return ((((((((this._default == rhs._default)||((this._default!= null)&&this._default.equals(rhs._default)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this._enum == rhs._enum)||((this._enum!= null)&&this._enum.equals(rhs._enum))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))));
    }

}
