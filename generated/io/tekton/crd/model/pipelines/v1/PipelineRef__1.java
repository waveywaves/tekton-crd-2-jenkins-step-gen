
package io.tekton.crd.model.pipelines.v1;

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
 * PipelineRef is a reference to a pipeline definition
 * Note: PipelineRef is in preview mode and not yet supported
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "name",
    "params",
    "resolver"
})
@Generated("jsonschema2pojo")
public class PipelineRef__1 {

    /**
     * API version of the referent
     * 
     */
    @JsonProperty("apiVersion")
    @JsonPropertyDescription("API version of the referent")
    private String apiVersion;
    /**
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names")
    private String name;
    /**
     * Params contains the parameters used to identify the
     * referenced Tekton resource. Example entries might include
     * "repo" or "path" but the set of params ultimately depends on
     * the chosen resolver.
     * 
     */
    @JsonProperty("params")
    @JsonPropertyDescription("Params contains the parameters used to identify the\nreferenced Tekton resource. Example entries might include\n\"repo\" or \"path\" but the set of params ultimately depends on\nthe chosen resolver.")
    @Valid
    private List<Param__9> params = new ArrayList<Param__9>();
    /**
     * Resolver is the name of the resolver that should perform
     * resolution of the referenced Tekton resource, such as "git".
     * 
     */
    @JsonProperty("resolver")
    @JsonPropertyDescription("Resolver is the name of the resolver that should perform\nresolution of the referenced Tekton resource, such as \"git\".")
    private String resolver;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * API version of the referent
     * 
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * API version of the referent
     * 
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public PipelineRef__1 withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public PipelineRef__1 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Params contains the parameters used to identify the
     * referenced Tekton resource. Example entries might include
     * "repo" or "path" but the set of params ultimately depends on
     * the chosen resolver.
     * 
     */
    @JsonProperty("params")
    public List<Param__9> getParams() {
        return params;
    }

    /**
     * Params contains the parameters used to identify the
     * referenced Tekton resource. Example entries might include
     * "repo" or "path" but the set of params ultimately depends on
     * the chosen resolver.
     * 
     */
    @JsonProperty("params")
    public void setParams(List<Param__9> params) {
        this.params = params;
    }

    public PipelineRef__1 withParams(List<Param__9> params) {
        this.params = params;
        return this;
    }

    /**
     * Resolver is the name of the resolver that should perform
     * resolution of the referenced Tekton resource, such as "git".
     * 
     */
    @JsonProperty("resolver")
    public String getResolver() {
        return resolver;
    }

    /**
     * Resolver is the name of the resolver that should perform
     * resolution of the referenced Tekton resource, such as "git".
     * 
     */
    @JsonProperty("resolver")
    public void setResolver(String resolver) {
        this.resolver = resolver;
    }

    public PipelineRef__1 withResolver(String resolver) {
        this.resolver = resolver;
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

    public PipelineRef__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PipelineRef__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("apiVersion");
        sb.append('=');
        sb.append(((this.apiVersion == null)?"<null>":this.apiVersion));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("params");
        sb.append('=');
        sb.append(((this.params == null)?"<null>":this.params));
        sb.append(',');
        sb.append("resolver");
        sb.append('=');
        sb.append(((this.resolver == null)?"<null>":this.resolver));
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
        result = ((result* 31)+((this.resolver == null)? 0 :this.resolver.hashCode()));
        result = ((result* 31)+((this.apiVersion == null)? 0 :this.apiVersion.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PipelineRef__1) == false) {
            return false;
        }
        PipelineRef__1 rhs = ((PipelineRef__1) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.resolver == rhs.resolver)||((this.resolver!= null)&&this.resolver.equals(rhs.resolver))))&&((this.apiVersion == rhs.apiVersion)||((this.apiVersion!= null)&&this.apiVersion.equals(rhs.apiVersion))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params))));
    }

}
