
package io.tekton.crd.model.resolutionrequests.v1alpha1;

import java.util.LinkedHashMap;
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
 * Spec holds the information for the request part of the resource request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "params"
})
@Generated("jsonschema2pojo")
public class Spec {

    /**
     * Parameters are the runtime attributes passed to
     * the resolver to help it figure out how to resolve the
     * resource being requested. For example: repo URL, commit SHA,
     * path to file, the kind of authentication to leverage, etc.
     * 
     */
    @JsonProperty("params")
    @JsonPropertyDescription("Parameters are the runtime attributes passed to\nthe resolver to help it figure out how to resolve the\nresource being requested. For example: repo URL, commit SHA,\npath to file, the kind of authentication to leverage, etc.")
    @Valid
    private Params params;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Parameters are the runtime attributes passed to
     * the resolver to help it figure out how to resolve the
     * resource being requested. For example: repo URL, commit SHA,
     * path to file, the kind of authentication to leverage, etc.
     * 
     */
    @JsonProperty("params")
    public Params getParams() {
        return params;
    }

    /**
     * Parameters are the runtime attributes passed to
     * the resolver to help it figure out how to resolve the
     * resource being requested. For example: repo URL, commit SHA,
     * path to file, the kind of authentication to leverage, etc.
     * 
     */
    @JsonProperty("params")
    public void setParams(Params params) {
        this.params = params;
    }

    public Spec withParams(Params params) {
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

    public Spec withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Spec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Spec) == false) {
            return false;
        }
        Spec rhs = ((Spec) other);
        return (((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
