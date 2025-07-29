
package io.tekton.crd.model.pipelineruns.v1beta1;

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
 * Provenance contains some key authenticated metadata about how a software artifact was built (what sources, what inputs/outputs, etc.).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "configSource",
    "featureFlags",
    "refSource"
})
@Generated("jsonschema2pojo")
public class Provenance {

    /**
     * Deprecated: Use RefSource instead
     * 
     */
    @JsonProperty("configSource")
    @JsonPropertyDescription("Deprecated: Use RefSource instead")
    @Valid
    private ConfigSource configSource;
    /**
     * FeatureFlags identifies the feature flags that were used during the task/pipeline run
     * 
     */
    @JsonProperty("featureFlags")
    @JsonPropertyDescription("FeatureFlags identifies the feature flags that were used during the task/pipeline run")
    @Valid
    private FeatureFlags featureFlags;
    /**
     * RefSource identifies the source where a remote task/pipeline came from.
     * 
     */
    @JsonProperty("refSource")
    @JsonPropertyDescription("RefSource identifies the source where a remote task/pipeline came from.")
    @Valid
    private RefSource refSource;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Deprecated: Use RefSource instead
     * 
     */
    @JsonProperty("configSource")
    public ConfigSource getConfigSource() {
        return configSource;
    }

    /**
     * Deprecated: Use RefSource instead
     * 
     */
    @JsonProperty("configSource")
    public void setConfigSource(ConfigSource configSource) {
        this.configSource = configSource;
    }

    public Provenance withConfigSource(ConfigSource configSource) {
        this.configSource = configSource;
        return this;
    }

    /**
     * FeatureFlags identifies the feature flags that were used during the task/pipeline run
     * 
     */
    @JsonProperty("featureFlags")
    public FeatureFlags getFeatureFlags() {
        return featureFlags;
    }

    /**
     * FeatureFlags identifies the feature flags that were used during the task/pipeline run
     * 
     */
    @JsonProperty("featureFlags")
    public void setFeatureFlags(FeatureFlags featureFlags) {
        this.featureFlags = featureFlags;
    }

    public Provenance withFeatureFlags(FeatureFlags featureFlags) {
        this.featureFlags = featureFlags;
        return this;
    }

    /**
     * RefSource identifies the source where a remote task/pipeline came from.
     * 
     */
    @JsonProperty("refSource")
    public RefSource getRefSource() {
        return refSource;
    }

    /**
     * RefSource identifies the source where a remote task/pipeline came from.
     * 
     */
    @JsonProperty("refSource")
    public void setRefSource(RefSource refSource) {
        this.refSource = refSource;
    }

    public Provenance withRefSource(RefSource refSource) {
        this.refSource = refSource;
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

    public Provenance withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Provenance.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("configSource");
        sb.append('=');
        sb.append(((this.configSource == null)?"<null>":this.configSource));
        sb.append(',');
        sb.append("featureFlags");
        sb.append('=');
        sb.append(((this.featureFlags == null)?"<null>":this.featureFlags));
        sb.append(',');
        sb.append("refSource");
        sb.append('=');
        sb.append(((this.refSource == null)?"<null>":this.refSource));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.configSource == null)? 0 :this.configSource.hashCode()));
        result = ((result* 31)+((this.featureFlags == null)? 0 :this.featureFlags.hashCode()));
        result = ((result* 31)+((this.refSource == null)? 0 :this.refSource.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Provenance) == false) {
            return false;
        }
        Provenance rhs = ((Provenance) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.configSource == rhs.configSource)||((this.configSource!= null)&&this.configSource.equals(rhs.configSource))))&&((this.featureFlags == rhs.featureFlags)||((this.featureFlags!= null)&&this.featureFlags.equals(rhs.featureFlags))))&&((this.refSource == rhs.refSource)||((this.refSource!= null)&&this.refSource.equals(rhs.refSource))));
    }

}
