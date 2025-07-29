
package io.tekton.crd.model.tasks.v1beta1;

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
 * EnvFromSource represents the source of a set of ConfigMaps
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "configMapRef",
    "prefix",
    "secretRef"
})
@Generated("jsonschema2pojo")
public class EnvFrom__1 {

    /**
     * The ConfigMap to select from
     * 
     */
    @JsonProperty("configMapRef")
    @JsonPropertyDescription("The ConfigMap to select from")
    @Valid
    private ConfigMapRef__1 configMapRef;
    /**
     * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
     */
    @JsonProperty("prefix")
    @JsonPropertyDescription("An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.")
    private String prefix;
    /**
     * The Secret to select from
     * 
     */
    @JsonProperty("secretRef")
    @JsonPropertyDescription("The Secret to select from")
    @Valid
    private SecretRef__1 secretRef;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The ConfigMap to select from
     * 
     */
    @JsonProperty("configMapRef")
    public ConfigMapRef__1 getConfigMapRef() {
        return configMapRef;
    }

    /**
     * The ConfigMap to select from
     * 
     */
    @JsonProperty("configMapRef")
    public void setConfigMapRef(ConfigMapRef__1 configMapRef) {
        this.configMapRef = configMapRef;
    }

    public EnvFrom__1 withConfigMapRef(ConfigMapRef__1 configMapRef) {
        this.configMapRef = configMapRef;
        return this;
    }

    /**
     * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
     */
    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
     */
    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public EnvFrom__1 withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * The Secret to select from
     * 
     */
    @JsonProperty("secretRef")
    public SecretRef__1 getSecretRef() {
        return secretRef;
    }

    /**
     * The Secret to select from
     * 
     */
    @JsonProperty("secretRef")
    public void setSecretRef(SecretRef__1 secretRef) {
        this.secretRef = secretRef;
    }

    public EnvFrom__1 withSecretRef(SecretRef__1 secretRef) {
        this.secretRef = secretRef;
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

    public EnvFrom__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnvFrom__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("configMapRef");
        sb.append('=');
        sb.append(((this.configMapRef == null)?"<null>":this.configMapRef));
        sb.append(',');
        sb.append("prefix");
        sb.append('=');
        sb.append(((this.prefix == null)?"<null>":this.prefix));
        sb.append(',');
        sb.append("secretRef");
        sb.append('=');
        sb.append(((this.secretRef == null)?"<null>":this.secretRef));
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
        result = ((result* 31)+((this.secretRef == null)? 0 :this.secretRef.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.configMapRef == null)? 0 :this.configMapRef.hashCode()));
        result = ((result* 31)+((this.prefix == null)? 0 :this.prefix.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnvFrom__1) == false) {
            return false;
        }
        EnvFrom__1 rhs = ((EnvFrom__1) other);
        return (((((this.secretRef == rhs.secretRef)||((this.secretRef!= null)&&this.secretRef.equals(rhs.secretRef)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.configMapRef == rhs.configMapRef)||((this.configMapRef!= null)&&this.configMapRef.equals(rhs.configMapRef))))&&((this.prefix == rhs.prefix)||((this.prefix!= null)&&this.prefix.equals(rhs.prefix))));
    }

}
