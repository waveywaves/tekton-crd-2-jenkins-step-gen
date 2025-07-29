
package io.tekton.crd.model.tasks.v1;

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
 * Contains the reference to an existing StepAction.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "params",
    "resolver"
})
@Generated("jsonschema2pojo")
public class Ref {

    /**
     * Name of the referenced step
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the referenced step")
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
    private List<Param__2> params = new ArrayList<Param__2>();
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
     * Name of the referenced step
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the referenced step
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Ref withName(String name) {
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
    public List<Param__2> getParams() {
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
    public void setParams(List<Param__2> params) {
        this.params = params;
    }

    public Ref withParams(List<Param__2> params) {
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

    public Ref withResolver(String resolver) {
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

    public Ref withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ref.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ref) == false) {
            return false;
        }
        Ref rhs = ((Ref) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.resolver == rhs.resolver)||((this.resolver!= null)&&this.resolver.equals(rhs.resolver))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params))));
    }

}
