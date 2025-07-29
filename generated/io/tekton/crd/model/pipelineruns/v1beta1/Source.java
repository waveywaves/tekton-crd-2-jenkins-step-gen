
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
 * Projection that may be projected along with other supported volume types.
 * Exactly one of these fields must be set.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clusterTrustBundle",
    "configMap",
    "downwardAPI",
    "secret",
    "serviceAccountToken"
})
@Generated("jsonschema2pojo")
public class Source {

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
    @JsonProperty("clusterTrustBundle")
    @JsonPropertyDescription("ClusterTrustBundle allows a pod to access the `.spec.trustBundle` field\nof ClusterTrustBundle objects in an auto-updating file.\n\nAlpha, gated by the ClusterTrustBundleProjection feature gate.\n\nClusterTrustBundle objects can either be selected by name, or by the\ncombination of signer name and a label selector.\n\nKubelet performs aggressive normalization of the PEM contents written\ninto the pod filesystem.  Esoteric PEM features such as inter-block\ncomments and block headers are stripped.  Certificates are deduplicated.\nThe ordering of certificates within the file is arbitrary, and Kubelet\nmay change the order over time.")
    @Valid
    private ClusterTrustBundle clusterTrustBundle;
    /**
     * configMap information about the configMap data to project
     * 
     */
    @JsonProperty("configMap")
    @JsonPropertyDescription("configMap information about the configMap data to project")
    @Valid
    private ConfigMap__1 configMap;
    /**
     * downwardAPI information about the downwardAPI data to project
     * 
     */
    @JsonProperty("downwardAPI")
    @JsonPropertyDescription("downwardAPI information about the downwardAPI data to project")
    @Valid
    private DownwardAPI downwardAPI;
    /**
     * secret information about the secret data to project
     * 
     */
    @JsonProperty("secret")
    @JsonPropertyDescription("secret information about the secret data to project")
    @Valid
    private Secret__1 secret;
    /**
     * serviceAccountToken is information about the serviceAccountToken data to project
     * 
     */
    @JsonProperty("serviceAccountToken")
    @JsonPropertyDescription("serviceAccountToken is information about the serviceAccountToken data to project")
    @Valid
    private ServiceAccountToken serviceAccountToken;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

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
    @JsonProperty("clusterTrustBundle")
    public ClusterTrustBundle getClusterTrustBundle() {
        return clusterTrustBundle;
    }

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
    @JsonProperty("clusterTrustBundle")
    public void setClusterTrustBundle(ClusterTrustBundle clusterTrustBundle) {
        this.clusterTrustBundle = clusterTrustBundle;
    }

    public Source withClusterTrustBundle(ClusterTrustBundle clusterTrustBundle) {
        this.clusterTrustBundle = clusterTrustBundle;
        return this;
    }

    /**
     * configMap information about the configMap data to project
     * 
     */
    @JsonProperty("configMap")
    public ConfigMap__1 getConfigMap() {
        return configMap;
    }

    /**
     * configMap information about the configMap data to project
     * 
     */
    @JsonProperty("configMap")
    public void setConfigMap(ConfigMap__1 configMap) {
        this.configMap = configMap;
    }

    public Source withConfigMap(ConfigMap__1 configMap) {
        this.configMap = configMap;
        return this;
    }

    /**
     * downwardAPI information about the downwardAPI data to project
     * 
     */
    @JsonProperty("downwardAPI")
    public DownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    /**
     * downwardAPI information about the downwardAPI data to project
     * 
     */
    @JsonProperty("downwardAPI")
    public void setDownwardAPI(DownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public Source withDownwardAPI(DownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
        return this;
    }

    /**
     * secret information about the secret data to project
     * 
     */
    @JsonProperty("secret")
    public Secret__1 getSecret() {
        return secret;
    }

    /**
     * secret information about the secret data to project
     * 
     */
    @JsonProperty("secret")
    public void setSecret(Secret__1 secret) {
        this.secret = secret;
    }

    public Source withSecret(Secret__1 secret) {
        this.secret = secret;
        return this;
    }

    /**
     * serviceAccountToken is information about the serviceAccountToken data to project
     * 
     */
    @JsonProperty("serviceAccountToken")
    public ServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    /**
     * serviceAccountToken is information about the serviceAccountToken data to project
     * 
     */
    @JsonProperty("serviceAccountToken")
    public void setServiceAccountToken(ServiceAccountToken serviceAccountToken) {
        this.serviceAccountToken = serviceAccountToken;
    }

    public Source withServiceAccountToken(ServiceAccountToken serviceAccountToken) {
        this.serviceAccountToken = serviceAccountToken;
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

    public Source withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Source.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clusterTrustBundle");
        sb.append('=');
        sb.append(((this.clusterTrustBundle == null)?"<null>":this.clusterTrustBundle));
        sb.append(',');
        sb.append("configMap");
        sb.append('=');
        sb.append(((this.configMap == null)?"<null>":this.configMap));
        sb.append(',');
        sb.append("downwardAPI");
        sb.append('=');
        sb.append(((this.downwardAPI == null)?"<null>":this.downwardAPI));
        sb.append(',');
        sb.append("secret");
        sb.append('=');
        sb.append(((this.secret == null)?"<null>":this.secret));
        sb.append(',');
        sb.append("serviceAccountToken");
        sb.append('=');
        sb.append(((this.serviceAccountToken == null)?"<null>":this.serviceAccountToken));
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
        result = ((result* 31)+((this.downwardAPI == null)? 0 :this.downwardAPI.hashCode()));
        result = ((result* 31)+((this.configMap == null)? 0 :this.configMap.hashCode()));
        result = ((result* 31)+((this.secret == null)? 0 :this.secret.hashCode()));
        result = ((result* 31)+((this.serviceAccountToken == null)? 0 :this.serviceAccountToken.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.clusterTrustBundle == null)? 0 :this.clusterTrustBundle.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Source) == false) {
            return false;
        }
        Source rhs = ((Source) other);
        return (((((((this.downwardAPI == rhs.downwardAPI)||((this.downwardAPI!= null)&&this.downwardAPI.equals(rhs.downwardAPI)))&&((this.configMap == rhs.configMap)||((this.configMap!= null)&&this.configMap.equals(rhs.configMap))))&&((this.secret == rhs.secret)||((this.secret!= null)&&this.secret.equals(rhs.secret))))&&((this.serviceAccountToken == rhs.serviceAccountToken)||((this.serviceAccountToken!= null)&&this.serviceAccountToken.equals(rhs.serviceAccountToken))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.clusterTrustBundle == rhs.clusterTrustBundle)||((this.clusterTrustBundle!= null)&&this.clusterTrustBundle.equals(rhs.clusterTrustBundle))));
    }

}
