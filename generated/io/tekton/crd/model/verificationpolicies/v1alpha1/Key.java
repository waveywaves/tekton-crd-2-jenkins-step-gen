
package io.tekton.crd.model.verificationpolicies.v1alpha1;

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
 * Key contains the public key to validate the resource.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data",
    "hashAlgorithm",
    "kms",
    "secretRef"
})
@Generated("jsonschema2pojo")
public class Key {

    /**
     * Data contains the inline public key.
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("Data contains the inline public key.")
    private String data;
    /**
     * HashAlgorithm always defaults to sha256 if the algorithm hasn't been explicitly set
     * 
     */
    @JsonProperty("hashAlgorithm")
    @JsonPropertyDescription("HashAlgorithm always defaults to sha256 if the algorithm hasn't been explicitly set")
    private String hashAlgorithm;
    /**
     * KMS contains the KMS url of the public key
     * Supported formats differ based on the KMS system used.
     * One example of a KMS url could be:
     * gcpkms://projects/[PROJECT]/locations/[LOCATION]>/keyRings/[KEYRING]/cryptoKeys/[KEY]/cryptoKeyVersions/[KEY_VERSION]
     * For more examples please refer https://docs.sigstore.dev/cosign/kms_support.
     * Note that the KMS is not supported yet.
     * 
     */
    @JsonProperty("kms")
    @JsonPropertyDescription("KMS contains the KMS url of the public key\nSupported formats differ based on the KMS system used.\nOne example of a KMS url could be:\ngcpkms://projects/[PROJECT]/locations/[LOCATION]>/keyRings/[KEYRING]/cryptoKeys/[KEY]/cryptoKeyVersions/[KEY_VERSION]\nFor more examples please refer https://docs.sigstore.dev/cosign/kms_support.\nNote that the KMS is not supported yet.")
    private String kms;
    /**
     * SecretRef sets a reference to a secret with the key.
     * 
     */
    @JsonProperty("secretRef")
    @JsonPropertyDescription("SecretRef sets a reference to a secret with the key.")
    @Valid
    private SecretRef secretRef;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Data contains the inline public key.
     * 
     */
    @JsonProperty("data")
    public String getData() {
        return data;
    }

    /**
     * Data contains the inline public key.
     * 
     */
    @JsonProperty("data")
    public void setData(String data) {
        this.data = data;
    }

    public Key withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * HashAlgorithm always defaults to sha256 if the algorithm hasn't been explicitly set
     * 
     */
    @JsonProperty("hashAlgorithm")
    public String getHashAlgorithm() {
        return hashAlgorithm;
    }

    /**
     * HashAlgorithm always defaults to sha256 if the algorithm hasn't been explicitly set
     * 
     */
    @JsonProperty("hashAlgorithm")
    public void setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
    }

    public Key withHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }

    /**
     * KMS contains the KMS url of the public key
     * Supported formats differ based on the KMS system used.
     * One example of a KMS url could be:
     * gcpkms://projects/[PROJECT]/locations/[LOCATION]>/keyRings/[KEYRING]/cryptoKeys/[KEY]/cryptoKeyVersions/[KEY_VERSION]
     * For more examples please refer https://docs.sigstore.dev/cosign/kms_support.
     * Note that the KMS is not supported yet.
     * 
     */
    @JsonProperty("kms")
    public String getKms() {
        return kms;
    }

    /**
     * KMS contains the KMS url of the public key
     * Supported formats differ based on the KMS system used.
     * One example of a KMS url could be:
     * gcpkms://projects/[PROJECT]/locations/[LOCATION]>/keyRings/[KEYRING]/cryptoKeys/[KEY]/cryptoKeyVersions/[KEY_VERSION]
     * For more examples please refer https://docs.sigstore.dev/cosign/kms_support.
     * Note that the KMS is not supported yet.
     * 
     */
    @JsonProperty("kms")
    public void setKms(String kms) {
        this.kms = kms;
    }

    public Key withKms(String kms) {
        this.kms = kms;
        return this;
    }

    /**
     * SecretRef sets a reference to a secret with the key.
     * 
     */
    @JsonProperty("secretRef")
    public SecretRef getSecretRef() {
        return secretRef;
    }

    /**
     * SecretRef sets a reference to a secret with the key.
     * 
     */
    @JsonProperty("secretRef")
    public void setSecretRef(SecretRef secretRef) {
        this.secretRef = secretRef;
    }

    public Key withSecretRef(SecretRef secretRef) {
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

    public Key withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Key.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("hashAlgorithm");
        sb.append('=');
        sb.append(((this.hashAlgorithm == null)?"<null>":this.hashAlgorithm));
        sb.append(',');
        sb.append("kms");
        sb.append('=');
        sb.append(((this.kms == null)?"<null>":this.kms));
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
        result = ((result* 31)+((this.kms == null)? 0 :this.kms.hashCode()));
        result = ((result* 31)+((this.secretRef == null)? 0 :this.secretRef.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.hashAlgorithm == null)? 0 :this.hashAlgorithm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Key) == false) {
            return false;
        }
        Key rhs = ((Key) other);
        return ((((((this.kms == rhs.kms)||((this.kms!= null)&&this.kms.equals(rhs.kms)))&&((this.secretRef == rhs.secretRef)||((this.secretRef!= null)&&this.secretRef.equals(rhs.secretRef))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.hashAlgorithm == rhs.hashAlgorithm)||((this.hashAlgorithm!= null)&&this.hashAlgorithm.equals(rhs.hashAlgorithm))));
    }

}
