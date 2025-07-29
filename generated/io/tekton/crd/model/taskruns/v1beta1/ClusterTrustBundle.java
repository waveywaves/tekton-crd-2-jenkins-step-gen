
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
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ClusterTrustBundle allows a pod to access the `.spec.trustBundle` field
 * of ClusterTrustBundle objects in an auto-updating file.
 * 
 * Alpha, gated by the ClusterTrustBundleProjection feature gate.
 * 
 * ClusterTrustBundle objects can either be selected by name, or by the
 * combination of signer name and a label selector.
 * 
 * Kubelet performs aggressive normalization of the PEM contents written
 * into the pod filesystem.  Esoteric PEM features such as inter-block
 * comments and block headers are stripped.  Certificates are deduplicated.
 * The ordering of certificates within the file is arbitrary, and Kubelet
 * may change the order over time.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "labelSelector",
    "name",
    "optional",
    "path",
    "signerName"
})
@Generated("jsonschema2pojo")
public class ClusterTrustBundle {

    /**
     * Select all ClusterTrustBundles that match this label selector.  Only has
     * effect if signerName is set.  Mutually-exclusive with name.  If unset,
     * interpreted as "match nothing".  If set but empty, interpreted as "match
     * everything".
     * 
     */
    @JsonProperty("labelSelector")
    @JsonPropertyDescription("Select all ClusterTrustBundles that match this label selector.  Only has\neffect if signerName is set.  Mutually-exclusive with name.  If unset,\ninterpreted as \"match nothing\".  If set but empty, interpreted as \"match\neverything\".")
    @Valid
    private LabelSelector__1 labelSelector;
    /**
     * Select a single ClusterTrustBundle by object name.  Mutually-exclusive
     * with signerName and labelSelector.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Select a single ClusterTrustBundle by object name.  Mutually-exclusive\nwith signerName and labelSelector.")
    private String name;
    /**
     * If true, don't block pod startup if the referenced ClusterTrustBundle(s)
     * aren't available.  If using name, then the named ClusterTrustBundle is
     * allowed not to exist.  If using signerName, then the combination of
     * signerName and labelSelector is allowed to match zero
     * ClusterTrustBundles.
     * 
     */
    @JsonProperty("optional")
    @JsonPropertyDescription("If true, don't block pod startup if the referenced ClusterTrustBundle(s)\naren't available.  If using name, then the named ClusterTrustBundle is\nallowed not to exist.  If using signerName, then the combination of\nsignerName and labelSelector is allowed to match zero\nClusterTrustBundles.")
    private Boolean optional;
    /**
     * Relative path from the volume root to write the bundle.
     * (Required)
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("Relative path from the volume root to write the bundle.")
    @NotNull
    private String path;
    /**
     * Select all ClusterTrustBundles that match this signer name.
     * Mutually-exclusive with name.  The contents of all selected
     * ClusterTrustBundles will be unified and deduplicated.
     * 
     */
    @JsonProperty("signerName")
    @JsonPropertyDescription("Select all ClusterTrustBundles that match this signer name.\nMutually-exclusive with name.  The contents of all selected\nClusterTrustBundles will be unified and deduplicated.")
    private String signerName;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Select all ClusterTrustBundles that match this label selector.  Only has
     * effect if signerName is set.  Mutually-exclusive with name.  If unset,
     * interpreted as "match nothing".  If set but empty, interpreted as "match
     * everything".
     * 
     */
    @JsonProperty("labelSelector")
    public LabelSelector__1 getLabelSelector() {
        return labelSelector;
    }

    /**
     * Select all ClusterTrustBundles that match this label selector.  Only has
     * effect if signerName is set.  Mutually-exclusive with name.  If unset,
     * interpreted as "match nothing".  If set but empty, interpreted as "match
     * everything".
     * 
     */
    @JsonProperty("labelSelector")
    public void setLabelSelector(LabelSelector__1 labelSelector) {
        this.labelSelector = labelSelector;
    }

    public ClusterTrustBundle withLabelSelector(LabelSelector__1 labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }

    /**
     * Select a single ClusterTrustBundle by object name.  Mutually-exclusive
     * with signerName and labelSelector.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Select a single ClusterTrustBundle by object name.  Mutually-exclusive
     * with signerName and labelSelector.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public ClusterTrustBundle withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * If true, don't block pod startup if the referenced ClusterTrustBundle(s)
     * aren't available.  If using name, then the named ClusterTrustBundle is
     * allowed not to exist.  If using signerName, then the combination of
     * signerName and labelSelector is allowed to match zero
     * ClusterTrustBundles.
     * 
     */
    @JsonProperty("optional")
    public Boolean getOptional() {
        return optional;
    }

    /**
     * If true, don't block pod startup if the referenced ClusterTrustBundle(s)
     * aren't available.  If using name, then the named ClusterTrustBundle is
     * allowed not to exist.  If using signerName, then the combination of
     * signerName and labelSelector is allowed to match zero
     * ClusterTrustBundles.
     * 
     */
    @JsonProperty("optional")
    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public ClusterTrustBundle withOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }

    /**
     * Relative path from the volume root to write the bundle.
     * (Required)
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * Relative path from the volume root to write the bundle.
     * (Required)
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    public ClusterTrustBundle withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Select all ClusterTrustBundles that match this signer name.
     * Mutually-exclusive with name.  The contents of all selected
     * ClusterTrustBundles will be unified and deduplicated.
     * 
     */
    @JsonProperty("signerName")
    public String getSignerName() {
        return signerName;
    }

    /**
     * Select all ClusterTrustBundles that match this signer name.
     * Mutually-exclusive with name.  The contents of all selected
     * ClusterTrustBundles will be unified and deduplicated.
     * 
     */
    @JsonProperty("signerName")
    public void setSignerName(String signerName) {
        this.signerName = signerName;
    }

    public ClusterTrustBundle withSignerName(String signerName) {
        this.signerName = signerName;
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

    public ClusterTrustBundle withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClusterTrustBundle.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("labelSelector");
        sb.append('=');
        sb.append(((this.labelSelector == null)?"<null>":this.labelSelector));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("optional");
        sb.append('=');
        sb.append(((this.optional == null)?"<null>":this.optional));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("signerName");
        sb.append('=');
        sb.append(((this.signerName == null)?"<null>":this.signerName));
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
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.labelSelector == null)? 0 :this.labelSelector.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.optional == null)? 0 :this.optional.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.signerName == null)? 0 :this.signerName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterTrustBundle) == false) {
            return false;
        }
        ClusterTrustBundle rhs = ((ClusterTrustBundle) other);
        return (((((((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path)))&&((this.labelSelector == rhs.labelSelector)||((this.labelSelector!= null)&&this.labelSelector.equals(rhs.labelSelector))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.optional == rhs.optional)||((this.optional!= null)&&this.optional.equals(rhs.optional))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.signerName == rhs.signerName)||((this.signerName!= null)&&this.signerName.equals(rhs.signerName))));
    }

}
