
package io.tekton.crd.model.taskruns.v1;

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
 * ComputeResources required by this Sidecar.
 * Cannot be updated.
 * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "claims",
    "limits",
    "requests"
})
@Generated("jsonschema2pojo")
public class ComputeResources__3 {

    /**
     * Claims lists the names of resources, defined in spec.resourceClaims,
     * that are used by this container.
     * 
     * This is an alpha field and requires enabling the
     * DynamicResourceAllocation feature gate.
     * 
     * This field is immutable. It can only be set for containers.
     * 
     */
    @JsonProperty("claims")
    @JsonPropertyDescription("Claims lists the names of resources, defined in spec.resourceClaims,\nthat are used by this container.\n\nThis is an alpha field and requires enabling the\nDynamicResourceAllocation feature gate.\n\nThis field is immutable. It can only be set for containers.")
    @Valid
    private List<Claim__3> claims = new ArrayList<Claim__3>();
    /**
     * Limits describes the maximum amount of compute resources allowed.
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("limits")
    @JsonPropertyDescription("Limits describes the maximum amount of compute resources allowed.\nMore info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")
    @Valid
    private Limits__3 limits;
    /**
     * Requests describes the minimum amount of compute resources required.
     * If Requests is omitted for a container, it defaults to Limits if that is explicitly specified,
     * otherwise to an implementation-defined value. Requests cannot exceed Limits.
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("requests")
    @JsonPropertyDescription("Requests describes the minimum amount of compute resources required.\nIf Requests is omitted for a container, it defaults to Limits if that is explicitly specified,\notherwise to an implementation-defined value. Requests cannot exceed Limits.\nMore info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")
    @Valid
    private Requests__3 requests;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Claims lists the names of resources, defined in spec.resourceClaims,
     * that are used by this container.
     * 
     * This is an alpha field and requires enabling the
     * DynamicResourceAllocation feature gate.
     * 
     * This field is immutable. It can only be set for containers.
     * 
     */
    @JsonProperty("claims")
    public List<Claim__3> getClaims() {
        return claims;
    }

    /**
     * Claims lists the names of resources, defined in spec.resourceClaims,
     * that are used by this container.
     * 
     * This is an alpha field and requires enabling the
     * DynamicResourceAllocation feature gate.
     * 
     * This field is immutable. It can only be set for containers.
     * 
     */
    @JsonProperty("claims")
    public void setClaims(List<Claim__3> claims) {
        this.claims = claims;
    }

    public ComputeResources__3 withClaims(List<Claim__3> claims) {
        this.claims = claims;
        return this;
    }

    /**
     * Limits describes the maximum amount of compute resources allowed.
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("limits")
    public Limits__3 getLimits() {
        return limits;
    }

    /**
     * Limits describes the maximum amount of compute resources allowed.
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("limits")
    public void setLimits(Limits__3 limits) {
        this.limits = limits;
    }

    public ComputeResources__3 withLimits(Limits__3 limits) {
        this.limits = limits;
        return this;
    }

    /**
     * Requests describes the minimum amount of compute resources required.
     * If Requests is omitted for a container, it defaults to Limits if that is explicitly specified,
     * otherwise to an implementation-defined value. Requests cannot exceed Limits.
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("requests")
    public Requests__3 getRequests() {
        return requests;
    }

    /**
     * Requests describes the minimum amount of compute resources required.
     * If Requests is omitted for a container, it defaults to Limits if that is explicitly specified,
     * otherwise to an implementation-defined value. Requests cannot exceed Limits.
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("requests")
    public void setRequests(Requests__3 requests) {
        this.requests = requests;
    }

    public ComputeResources__3 withRequests(Requests__3 requests) {
        this.requests = requests;
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

    public ComputeResources__3 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ComputeResources__3 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("claims");
        sb.append('=');
        sb.append(((this.claims == null)?"<null>":this.claims));
        sb.append(',');
        sb.append("limits");
        sb.append('=');
        sb.append(((this.limits == null)?"<null>":this.limits));
        sb.append(',');
        sb.append("requests");
        sb.append('=');
        sb.append(((this.requests == null)?"<null>":this.requests));
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
        result = ((result* 31)+((this.claims == null)? 0 :this.claims.hashCode()));
        result = ((result* 31)+((this.requests == null)? 0 :this.requests.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.limits == null)? 0 :this.limits.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComputeResources__3) == false) {
            return false;
        }
        ComputeResources__3 rhs = ((ComputeResources__3) other);
        return (((((this.claims == rhs.claims)||((this.claims!= null)&&this.claims.equals(rhs.claims)))&&((this.requests == rhs.requests)||((this.requests!= null)&&this.requests.equals(rhs.requests))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.limits == rhs.limits)||((this.limits!= null)&&this.limits.equals(rhs.limits))));
    }

}
