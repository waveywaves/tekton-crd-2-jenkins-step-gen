
package io.tekton.crd.model.stepactions.v1beta1;

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
 * Source for the environment variable's value. Cannot be used if value is not empty.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "configMapKeyRef",
    "fieldRef",
    "resourceFieldRef",
    "secretKeyRef"
})
@Generated("jsonschema2pojo")
public class ValueFrom {

    /**
     * Selects a key of a ConfigMap.
     * 
     */
    @JsonProperty("configMapKeyRef")
    @JsonPropertyDescription("Selects a key of a ConfigMap.")
    @Valid
    private ConfigMapKeyRef configMapKeyRef;
    /**
     * Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`, `metadata.annotations['<KEY>']`,
     * spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
     * 
     */
    @JsonProperty("fieldRef")
    @JsonPropertyDescription("Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`, `metadata.annotations['<KEY>']`,\nspec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.")
    @Valid
    private FieldRef fieldRef;
    /**
     * Selects a resource of the container: only resources limits and requests
     * (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
     * 
     */
    @JsonProperty("resourceFieldRef")
    @JsonPropertyDescription("Selects a resource of the container: only resources limits and requests\n(limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.")
    @Valid
    private ResourceFieldRef resourceFieldRef;
    /**
     * Selects a key of a secret in the pod's namespace
     * 
     */
    @JsonProperty("secretKeyRef")
    @JsonPropertyDescription("Selects a key of a secret in the pod's namespace")
    @Valid
    private SecretKeyRef secretKeyRef;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Selects a key of a ConfigMap.
     * 
     */
    @JsonProperty("configMapKeyRef")
    public ConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    /**
     * Selects a key of a ConfigMap.
     * 
     */
    @JsonProperty("configMapKeyRef")
    public void setConfigMapKeyRef(ConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public ValueFrom withConfigMapKeyRef(ConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
        return this;
    }

    /**
     * Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`, `metadata.annotations['<KEY>']`,
     * spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
     * 
     */
    @JsonProperty("fieldRef")
    public FieldRef getFieldRef() {
        return fieldRef;
    }

    /**
     * Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`, `metadata.annotations['<KEY>']`,
     * spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
     * 
     */
    @JsonProperty("fieldRef")
    public void setFieldRef(FieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public ValueFrom withFieldRef(FieldRef fieldRef) {
        this.fieldRef = fieldRef;
        return this;
    }

    /**
     * Selects a resource of the container: only resources limits and requests
     * (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
     * 
     */
    @JsonProperty("resourceFieldRef")
    public ResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    /**
     * Selects a resource of the container: only resources limits and requests
     * (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
     * 
     */
    @JsonProperty("resourceFieldRef")
    public void setResourceFieldRef(ResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public ValueFrom withResourceFieldRef(ResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
        return this;
    }

    /**
     * Selects a key of a secret in the pod's namespace
     * 
     */
    @JsonProperty("secretKeyRef")
    public SecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    /**
     * Selects a key of a secret in the pod's namespace
     * 
     */
    @JsonProperty("secretKeyRef")
    public void setSecretKeyRef(SecretKeyRef secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
    }

    public ValueFrom withSecretKeyRef(SecretKeyRef secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
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

    public ValueFrom withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ValueFrom.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("configMapKeyRef");
        sb.append('=');
        sb.append(((this.configMapKeyRef == null)?"<null>":this.configMapKeyRef));
        sb.append(',');
        sb.append("fieldRef");
        sb.append('=');
        sb.append(((this.fieldRef == null)?"<null>":this.fieldRef));
        sb.append(',');
        sb.append("resourceFieldRef");
        sb.append('=');
        sb.append(((this.resourceFieldRef == null)?"<null>":this.resourceFieldRef));
        sb.append(',');
        sb.append("secretKeyRef");
        sb.append('=');
        sb.append(((this.secretKeyRef == null)?"<null>":this.secretKeyRef));
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
        result = ((result* 31)+((this.secretKeyRef == null)? 0 :this.secretKeyRef.hashCode()));
        result = ((result* 31)+((this.configMapKeyRef == null)? 0 :this.configMapKeyRef.hashCode()));
        result = ((result* 31)+((this.fieldRef == null)? 0 :this.fieldRef.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.resourceFieldRef == null)? 0 :this.resourceFieldRef.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValueFrom) == false) {
            return false;
        }
        ValueFrom rhs = ((ValueFrom) other);
        return ((((((this.secretKeyRef == rhs.secretKeyRef)||((this.secretKeyRef!= null)&&this.secretKeyRef.equals(rhs.secretKeyRef)))&&((this.configMapKeyRef == rhs.configMapKeyRef)||((this.configMapKeyRef!= null)&&this.configMapKeyRef.equals(rhs.configMapKeyRef))))&&((this.fieldRef == rhs.fieldRef)||((this.fieldRef!= null)&&this.fieldRef.equals(rhs.fieldRef))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.resourceFieldRef == rhs.resourceFieldRef)||((this.resourceFieldRef!= null)&&this.resourceFieldRef.equals(rhs.resourceFieldRef))));
    }

}
