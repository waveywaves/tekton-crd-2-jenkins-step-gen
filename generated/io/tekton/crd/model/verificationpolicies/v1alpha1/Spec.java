
package io.tekton.crd.model.verificationpolicies.v1alpha1;

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
 * Spec holds the desired state of the VerificationPolicy.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "authorities",
    "mode",
    "resources"
})
@Generated("jsonschema2pojo")
public class Spec {

    /**
     * Authorities defines the rules for validating signatures.
     * (Required)
     * 
     */
    @JsonProperty("authorities")
    @JsonPropertyDescription("Authorities defines the rules for validating signatures.")
    @Valid
    @NotNull
    private List<Authority> authorities = new ArrayList<Authority>();
    /**
     * Mode controls whether a failing policy will fail the taskrun/pipelinerun, or only log the warnings
     * enforce - fail the taskrun/pipelinerun if verification fails (default)
     * warn - don't fail the taskrun/pipelinerun if verification fails but log warnings
     * 
     */
    @JsonProperty("mode")
    @JsonPropertyDescription("Mode controls whether a failing policy will fail the taskrun/pipelinerun, or only log the warnings\nenforce - fail the taskrun/pipelinerun if verification fails (default)\nwarn - don't fail the taskrun/pipelinerun if verification fails but log warnings")
    private String mode;
    /**
     * Resources defines the patterns of resources sources that should be subject to this policy.
     * For example, we may want to apply this Policy from a certain GitHub repo.
     * Then the ResourcesPattern should be valid regex. E.g. If using gitresolver, and we want to config keys from a certain git repo.
     * `ResourcesPattern` can be `https://github.com/tektoncd/catalog.git`, we will use regex to filter out those resources.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("Resources defines the patterns of resources sources that should be subject to this policy.\nFor example, we may want to apply this Policy from a certain GitHub repo.\nThen the ResourcesPattern should be valid regex. E.g. If using gitresolver, and we want to config keys from a certain git repo.\n`ResourcesPattern` can be `https://github.com/tektoncd/catalog.git`, we will use regex to filter out those resources.")
    @Valid
    @NotNull
    private List<Resource> resources = new ArrayList<Resource>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Authorities defines the rules for validating signatures.
     * (Required)
     * 
     */
    @JsonProperty("authorities")
    public List<Authority> getAuthorities() {
        return authorities;
    }

    /**
     * Authorities defines the rules for validating signatures.
     * (Required)
     * 
     */
    @JsonProperty("authorities")
    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }

    public Spec withAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
        return this;
    }

    /**
     * Mode controls whether a failing policy will fail the taskrun/pipelinerun, or only log the warnings
     * enforce - fail the taskrun/pipelinerun if verification fails (default)
     * warn - don't fail the taskrun/pipelinerun if verification fails but log warnings
     * 
     */
    @JsonProperty("mode")
    public String getMode() {
        return mode;
    }

    /**
     * Mode controls whether a failing policy will fail the taskrun/pipelinerun, or only log the warnings
     * enforce - fail the taskrun/pipelinerun if verification fails (default)
     * warn - don't fail the taskrun/pipelinerun if verification fails but log warnings
     * 
     */
    @JsonProperty("mode")
    public void setMode(String mode) {
        this.mode = mode;
    }

    public Spec withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Resources defines the patterns of resources sources that should be subject to this policy.
     * For example, we may want to apply this Policy from a certain GitHub repo.
     * Then the ResourcesPattern should be valid regex. E.g. If using gitresolver, and we want to config keys from a certain git repo.
     * `ResourcesPattern` can be `https://github.com/tektoncd/catalog.git`, we will use regex to filter out those resources.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    public List<Resource> getResources() {
        return resources;
    }

    /**
     * Resources defines the patterns of resources sources that should be subject to this policy.
     * For example, we may want to apply this Policy from a certain GitHub repo.
     * Then the ResourcesPattern should be valid regex. E.g. If using gitresolver, and we want to config keys from a certain git repo.
     * `ResourcesPattern` can be `https://github.com/tektoncd/catalog.git`, we will use regex to filter out those resources.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public Spec withResources(List<Resource> resources) {
        this.resources = resources;
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
        sb.append("authorities");
        sb.append('=');
        sb.append(((this.authorities == null)?"<null>":this.authorities));
        sb.append(',');
        sb.append("mode");
        sb.append('=');
        sb.append(((this.mode == null)?"<null>":this.mode));
        sb.append(',');
        sb.append("resources");
        sb.append('=');
        sb.append(((this.resources == null)?"<null>":this.resources));
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
        result = ((result* 31)+((this.mode == null)? 0 :this.mode.hashCode()));
        result = ((result* 31)+((this.resources == null)? 0 :this.resources.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.authorities == null)? 0 :this.authorities.hashCode()));
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
        return (((((this.mode == rhs.mode)||((this.mode!= null)&&this.mode.equals(rhs.mode)))&&((this.resources == rhs.resources)||((this.resources!= null)&&this.resources.equals(rhs.resources))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.authorities == rhs.authorities)||((this.authorities!= null)&&this.authorities.equals(rhs.authorities))));
    }

}
