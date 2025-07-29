
package io.tekton.crd.model.taskruns.v1beta1;

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
 * The pod this Toleration is attached to tolerates any taint that matches
 * the triple <key,value,effect> using the matching operator <operator>.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "effect",
    "key",
    "operator",
    "tolerationSeconds",
    "value"
})
@Generated("jsonschema2pojo")
public class Toleration {

    /**
     * Effect indicates the taint effect to match. Empty means match all taint effects.
     * When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
     * 
     */
    @JsonProperty("effect")
    @JsonPropertyDescription("Effect indicates the taint effect to match. Empty means match all taint effects.\nWhen specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.")
    private String effect;
    /**
     * Key is the taint key that the toleration applies to. Empty means match all taint keys.
     * If the key is empty, operator must be Exists; this combination means to match all values and all keys.
     * 
     */
    @JsonProperty("key")
    @JsonPropertyDescription("Key is the taint key that the toleration applies to. Empty means match all taint keys.\nIf the key is empty, operator must be Exists; this combination means to match all values and all keys.")
    private String key;
    /**
     * Operator represents a key's relationship to the value.
     * Valid operators are Exists and Equal. Defaults to Equal.
     * Exists is equivalent to wildcard for value, so that a pod can
     * tolerate all taints of a particular category.
     * 
     */
    @JsonProperty("operator")
    @JsonPropertyDescription("Operator represents a key's relationship to the value.\nValid operators are Exists and Equal. Defaults to Equal.\nExists is equivalent to wildcard for value, so that a pod can\ntolerate all taints of a particular category.")
    private String operator;
    /**
     * TolerationSeconds represents the period of time the toleration (which must be
     * of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default,
     * it is not set, which means tolerate the taint forever (do not evict). Zero and
     * negative values will be treated as 0 (evict immediately) by the system.
     * 
     */
    @JsonProperty("tolerationSeconds")
    @JsonPropertyDescription("TolerationSeconds represents the period of time the toleration (which must be\nof effect NoExecute, otherwise this field is ignored) tolerates the taint. By default,\nit is not set, which means tolerate the taint forever (do not evict). Zero and\nnegative values will be treated as 0 (evict immediately) by the system.")
    private Integer tolerationSeconds;
    /**
     * Value is the taint value the toleration matches to.
     * If the operator is Exists, the value should be empty, otherwise just a regular string.
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Value is the taint value the toleration matches to.\nIf the operator is Exists, the value should be empty, otherwise just a regular string.")
    private String value;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Effect indicates the taint effect to match. Empty means match all taint effects.
     * When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
     * 
     */
    @JsonProperty("effect")
    public String getEffect() {
        return effect;
    }

    /**
     * Effect indicates the taint effect to match. Empty means match all taint effects.
     * When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
     * 
     */
    @JsonProperty("effect")
    public void setEffect(String effect) {
        this.effect = effect;
    }

    public Toleration withEffect(String effect) {
        this.effect = effect;
        return this;
    }

    /**
     * Key is the taint key that the toleration applies to. Empty means match all taint keys.
     * If the key is empty, operator must be Exists; this combination means to match all values and all keys.
     * 
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * Key is the taint key that the toleration applies to. Empty means match all taint keys.
     * If the key is empty, operator must be Exists; this combination means to match all values and all keys.
     * 
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    public Toleration withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Operator represents a key's relationship to the value.
     * Valid operators are Exists and Equal. Defaults to Equal.
     * Exists is equivalent to wildcard for value, so that a pod can
     * tolerate all taints of a particular category.
     * 
     */
    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    /**
     * Operator represents a key's relationship to the value.
     * Valid operators are Exists and Equal. Defaults to Equal.
     * Exists is equivalent to wildcard for value, so that a pod can
     * tolerate all taints of a particular category.
     * 
     */
    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Toleration withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * TolerationSeconds represents the period of time the toleration (which must be
     * of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default,
     * it is not set, which means tolerate the taint forever (do not evict). Zero and
     * negative values will be treated as 0 (evict immediately) by the system.
     * 
     */
    @JsonProperty("tolerationSeconds")
    public Integer getTolerationSeconds() {
        return tolerationSeconds;
    }

    /**
     * TolerationSeconds represents the period of time the toleration (which must be
     * of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default,
     * it is not set, which means tolerate the taint forever (do not evict). Zero and
     * negative values will be treated as 0 (evict immediately) by the system.
     * 
     */
    @JsonProperty("tolerationSeconds")
    public void setTolerationSeconds(Integer tolerationSeconds) {
        this.tolerationSeconds = tolerationSeconds;
    }

    public Toleration withTolerationSeconds(Integer tolerationSeconds) {
        this.tolerationSeconds = tolerationSeconds;
        return this;
    }

    /**
     * Value is the taint value the toleration matches to.
     * If the operator is Exists, the value should be empty, otherwise just a regular string.
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Value is the taint value the toleration matches to.
     * If the operator is Exists, the value should be empty, otherwise just a regular string.
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public Toleration withValue(String value) {
        this.value = value;
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

    public Toleration withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Toleration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("effect");
        sb.append('=');
        sb.append(((this.effect == null)?"<null>":this.effect));
        sb.append(',');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("operator");
        sb.append('=');
        sb.append(((this.operator == null)?"<null>":this.operator));
        sb.append(',');
        sb.append("tolerationSeconds");
        sb.append('=');
        sb.append(((this.tolerationSeconds == null)?"<null>":this.tolerationSeconds));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.effect == null)? 0 :this.effect.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tolerationSeconds == null)? 0 :this.tolerationSeconds.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        result = ((result* 31)+((this.operator == null)? 0 :this.operator.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Toleration) == false) {
            return false;
        }
        Toleration rhs = ((Toleration) other);
        return (((((((this.effect == rhs.effect)||((this.effect!= null)&&this.effect.equals(rhs.effect)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tolerationSeconds == rhs.tolerationSeconds)||((this.tolerationSeconds!= null)&&this.tolerationSeconds.equals(rhs.tolerationSeconds))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))))&&((this.operator == rhs.operator)||((this.operator!= null)&&this.operator.equals(rhs.operator))));
    }

}
