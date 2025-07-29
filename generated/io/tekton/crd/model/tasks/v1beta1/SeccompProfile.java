
package io.tekton.crd.model.tasks.v1beta1;

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
 * The seccomp options to use by this container. If seccomp options are
 * provided at both the pod & container level, the container options
 * override the pod options.
 * Note that this field cannot be set when spec.os.name is windows.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "localhostProfile",
    "type"
})
@Generated("jsonschema2pojo")
public class SeccompProfile {

    /**
     * localhostProfile indicates a profile defined in a file on the node should be used.
     * The profile must be preconfigured on the node to work.
     * Must be a descending path, relative to the kubelet's configured seccomp profile location.
     * Must be set if type is "Localhost". Must NOT be set for any other type.
     * 
     */
    @JsonProperty("localhostProfile")
    @JsonPropertyDescription("localhostProfile indicates a profile defined in a file on the node should be used.\nThe profile must be preconfigured on the node to work.\nMust be a descending path, relative to the kubelet's configured seccomp profile location.\nMust be set if type is \"Localhost\". Must NOT be set for any other type.")
    private String localhostProfile;
    /**
     * type indicates which kind of seccomp profile will be applied.
     * Valid options are:
     * 
     * Localhost - a profile defined in a file on the node should be used.
     * RuntimeDefault - the container runtime default profile should be used.
     * Unconfined - no profile should be applied.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("type indicates which kind of seccomp profile will be applied.\nValid options are:\n\nLocalhost - a profile defined in a file on the node should be used.\nRuntimeDefault - the container runtime default profile should be used.\nUnconfined - no profile should be applied.")
    @NotNull
    private String type;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * localhostProfile indicates a profile defined in a file on the node should be used.
     * The profile must be preconfigured on the node to work.
     * Must be a descending path, relative to the kubelet's configured seccomp profile location.
     * Must be set if type is "Localhost". Must NOT be set for any other type.
     * 
     */
    @JsonProperty("localhostProfile")
    public String getLocalhostProfile() {
        return localhostProfile;
    }

    /**
     * localhostProfile indicates a profile defined in a file on the node should be used.
     * The profile must be preconfigured on the node to work.
     * Must be a descending path, relative to the kubelet's configured seccomp profile location.
     * Must be set if type is "Localhost". Must NOT be set for any other type.
     * 
     */
    @JsonProperty("localhostProfile")
    public void setLocalhostProfile(String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public SeccompProfile withLocalhostProfile(String localhostProfile) {
        this.localhostProfile = localhostProfile;
        return this;
    }

    /**
     * type indicates which kind of seccomp profile will be applied.
     * Valid options are:
     * 
     * Localhost - a profile defined in a file on the node should be used.
     * RuntimeDefault - the container runtime default profile should be used.
     * Unconfined - no profile should be applied.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * type indicates which kind of seccomp profile will be applied.
     * Valid options are:
     * 
     * Localhost - a profile defined in a file on the node should be used.
     * RuntimeDefault - the container runtime default profile should be used.
     * Unconfined - no profile should be applied.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public SeccompProfile withType(String type) {
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

    public SeccompProfile withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SeccompProfile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("localhostProfile");
        sb.append('=');
        sb.append(((this.localhostProfile == null)?"<null>":this.localhostProfile));
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
        result = ((result* 31)+((this.localhostProfile == null)? 0 :this.localhostProfile.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SeccompProfile) == false) {
            return false;
        }
        SeccompProfile rhs = ((SeccompProfile) other);
        return ((((this.localhostProfile == rhs.localhostProfile)||((this.localhostProfile!= null)&&this.localhostProfile.equals(rhs.localhostProfile)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
