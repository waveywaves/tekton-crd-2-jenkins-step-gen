
package io.tekton.crd.model.taskruns.v1beta1;

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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SecretParam indicates which secret can be used to populate a field of the resource
 * 
 * Deprecated: Unused, preserved only for backwards compatibility
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fieldName",
    "secretKey",
    "secretName"
})
@Generated("jsonschema2pojo")
public class Secret__1 {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fieldName")
    @NotNull
    private String fieldName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secretKey")
    @NotNull
    private String secretKey;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secretName")
    @NotNull
    private String secretName;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fieldName")
    public String getFieldName() {
        return fieldName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fieldName")
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Secret__1 withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secretKey")
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secretKey")
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public Secret__1 withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secretName")
    public String getSecretName() {
        return secretName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secretName")
    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public Secret__1 withSecretName(String secretName) {
        this.secretName = secretName;
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

    public Secret__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Secret__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fieldName");
        sb.append('=');
        sb.append(((this.fieldName == null)?"<null>":this.fieldName));
        sb.append(',');
        sb.append("secretKey");
        sb.append('=');
        sb.append(((this.secretKey == null)?"<null>":this.secretKey));
        sb.append(',');
        sb.append("secretName");
        sb.append('=');
        sb.append(((this.secretName == null)?"<null>":this.secretName));
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
        result = ((result* 31)+((this.secretName == null)? 0 :this.secretName.hashCode()));
        result = ((result* 31)+((this.fieldName == null)? 0 :this.fieldName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.secretKey == null)? 0 :this.secretKey.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Secret__1) == false) {
            return false;
        }
        Secret__1 rhs = ((Secret__1) other);
        return (((((this.secretName == rhs.secretName)||((this.secretName!= null)&&this.secretName.equals(rhs.secretName)))&&((this.fieldName == rhs.fieldName)||((this.fieldName!= null)&&this.fieldName.equals(rhs.fieldName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.secretKey == rhs.secretKey)||((this.secretKey!= null)&&this.secretKey.equals(rhs.secretKey))));
    }

}
