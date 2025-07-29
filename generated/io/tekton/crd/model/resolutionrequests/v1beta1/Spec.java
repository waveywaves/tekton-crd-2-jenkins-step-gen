
package io.tekton.crd.model.resolutionrequests.v1beta1;

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
 * Spec holds the information for the request part of the resource request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "params",
    "url"
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
    private List<Param> params = new ArrayList<Param>();
    /**
     * URL is the runtime url passed to the resolver
     * to help it figure out how to resolver the resource being
     * requested.
     * This is currently at an ALPHA stability level and subject to
     * alpha API compatibility policies.
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("URL is the runtime url passed to the resolver\nto help it figure out how to resolver the resource being\nrequested.\nThis is currently at an ALPHA stability level and subject to\nalpha API compatibility policies.")
    private String url;
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
    public List<Param> getParams() {
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
    public void setParams(List<Param> params) {
        this.params = params;
    }

    public Spec withParams(List<Param> params) {
        this.params = params;
        return this;
    }

    /**
     * URL is the runtime url passed to the resolver
     * to help it figure out how to resolver the resource being
     * requested.
     * This is currently at an ALPHA stability level and subject to
     * alpha API compatibility policies.
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * URL is the runtime url passed to the resolver
     * to help it figure out how to resolver the resource being
     * requested.
     * This is currently at an ALPHA stability level and subject to
     * alpha API compatibility policies.
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Spec withUrl(String url) {
        this.url = url;
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
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
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
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))));
    }

}
