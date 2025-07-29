
package io.tekton.crd.model.customruns.v1beta1;

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
 * TaskRef can be used to refer to a specific instance of a task.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "bundle",
    "kind",
    "name",
    "params",
    "resolver"
})
@Generated("jsonschema2pojo")
public class CustomRef {

    /**
     * API version of the referent
     * Note: A Task with non-empty APIVersion and Kind is considered a Custom Task
     * 
     */
    @JsonProperty("apiVersion")
    @JsonPropertyDescription("API version of the referent\nNote: A Task with non-empty APIVersion and Kind is considered a Custom Task")
    private String apiVersion;
    /**
     * Bundle url reference to a Tekton Bundle.
     * 
     * Deprecated: Please use ResolverRef with the bundles resolver instead.
     * The field is staying there for go client backward compatibility, but is not used/allowed anymore.
     * 
     */
    @JsonProperty("bundle")
    @JsonPropertyDescription("Bundle url reference to a Tekton Bundle.\n\nDeprecated: Please use ResolverRef with the bundles resolver instead.\nThe field is staying there for go client backward compatibility, but is not used/allowed anymore.")
    private String bundle;
    /**
     * TaskKind indicates the Kind of the Task:
     *  1. Namespaced Task when Kind is set to "Task". If Kind is "", it defaults to "Task".
     *  2. Custom Task when Kind is non-empty and APIVersion is non-empty
     * 
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("TaskKind indicates the Kind of the Task:\n1. Namespaced Task when Kind is set to \"Task\". If Kind is \"\", it defaults to \"Task\".\n2. Custom Task when Kind is non-empty and APIVersion is non-empty")
    private String kind;
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
    private List<Param> params = new ArrayList<Param>();
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
     * Note: A Task with non-empty APIVersion and Kind is considered a Custom Task
     * 
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * API version of the referent
     * Note: A Task with non-empty APIVersion and Kind is considered a Custom Task
     * 
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public CustomRef withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Bundle url reference to a Tekton Bundle.
     * 
     * Deprecated: Please use ResolverRef with the bundles resolver instead.
     * The field is staying there for go client backward compatibility, but is not used/allowed anymore.
     * 
     */
    @JsonProperty("bundle")
    public String getBundle() {
        return bundle;
    }

    /**
     * Bundle url reference to a Tekton Bundle.
     * 
     * Deprecated: Please use ResolverRef with the bundles resolver instead.
     * The field is staying there for go client backward compatibility, but is not used/allowed anymore.
     * 
     */
    @JsonProperty("bundle")
    public void setBundle(String bundle) {
        this.bundle = bundle;
    }

    public CustomRef withBundle(String bundle) {
        this.bundle = bundle;
        return this;
    }

    /**
     * TaskKind indicates the Kind of the Task:
     *  1. Namespaced Task when Kind is set to "Task". If Kind is "", it defaults to "Task".
     *  2. Custom Task when Kind is non-empty and APIVersion is non-empty
     * 
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * TaskKind indicates the Kind of the Task:
     *  1. Namespaced Task when Kind is set to "Task". If Kind is "", it defaults to "Task".
     *  2. Custom Task when Kind is non-empty and APIVersion is non-empty
     * 
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    public CustomRef withKind(String kind) {
        this.kind = kind;
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

    public CustomRef withName(String name) {
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
    public List<Param> getParams() {
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
    public void setParams(List<Param> params) {
        this.params = params;
    }

    public CustomRef withParams(List<Param> params) {
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

    public CustomRef withResolver(String resolver) {
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

    public CustomRef withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomRef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("apiVersion");
        sb.append('=');
        sb.append(((this.apiVersion == null)?"<null>":this.apiVersion));
        sb.append(',');
        sb.append("bundle");
        sb.append('=');
        sb.append(((this.bundle == null)?"<null>":this.bundle));
        sb.append(',');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
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
        result = ((result* 31)+((this.resolver == null)? 0 :this.resolver.hashCode()));
        result = ((result* 31)+((this.apiVersion == null)? 0 :this.apiVersion.hashCode()));
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        result = ((result* 31)+((this.bundle == null)? 0 :this.bundle.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomRef) == false) {
            return false;
        }
        CustomRef rhs = ((CustomRef) other);
        return ((((((((this.resolver == rhs.resolver)||((this.resolver!= null)&&this.resolver.equals(rhs.resolver)))&&((this.apiVersion == rhs.apiVersion)||((this.apiVersion!= null)&&this.apiVersion.equals(rhs.apiVersion))))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params))))&&((this.bundle == rhs.bundle)||((this.bundle!= null)&&this.bundle.equals(rhs.bundle))));
    }

}
