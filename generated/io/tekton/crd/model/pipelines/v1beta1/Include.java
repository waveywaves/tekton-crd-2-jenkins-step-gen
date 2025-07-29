
package io.tekton.crd.model.pipelines.v1beta1;

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
 * IncludeParams allows passing in a specific combinations of Parameters into the Matrix.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "params"
})
@Generated("jsonschema2pojo")
public class Include {

    /**
     * Name the specified combination
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name the specified combination")
    private String name;
    /**
     * Params takes only `Parameters` of type `"string"`
     * The names of the `params` must match the names of the `params` in the underlying `Task`
     * 
     */
    @JsonProperty("params")
    @JsonPropertyDescription("Params takes only `Parameters` of type `\"string\"`\nThe names of the `params` must match the names of the `params` in the underlying `Task`")
    @Valid
    private List<Param> params = new ArrayList<Param>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Name the specified combination
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name the specified combination
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Include withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Params takes only `Parameters` of type `"string"`
     * The names of the `params` must match the names of the `params` in the underlying `Task`
     * 
     */
    @JsonProperty("params")
    public List<Param> getParams() {
        return params;
    }

    /**
     * Params takes only `Parameters` of type `"string"`
     * The names of the `params` must match the names of the `params` in the underlying `Task`
     * 
     */
    @JsonProperty("params")
    public void setParams(List<Param> params) {
        this.params = params;
    }

    public Include withParams(List<Param> params) {
        this.params = params;
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

    public Include withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Include.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("params");
        sb.append('=');
        sb.append(((this.params == null)?"<null>":this.params));
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
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Include) == false) {
            return false;
        }
        Include rhs = ((Include) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params))));
    }

}
