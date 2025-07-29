
package io.tekton.crd.model.customruns.v1beta1;

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
 * CSI (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "driver",
    "fsType",
    "nodePublishSecretRef",
    "readOnly",
    "volumeAttributes"
})
@Generated("jsonschema2pojo")
public class Csi {

    /**
     * driver is the name of the CSI driver that handles this volume.
     * Consult with your admin for the correct name as registered in the cluster.
     * (Required)
     * 
     */
    @JsonProperty("driver")
    @JsonPropertyDescription("driver is the name of the CSI driver that handles this volume.\nConsult with your admin for the correct name as registered in the cluster.")
    @NotNull
    private String driver;
    /**
     * fsType to mount. Ex. "ext4", "xfs", "ntfs".
     * If not provided, the empty value is passed to the associated CSI driver
     * which will determine the default filesystem to apply.
     * 
     */
    @JsonProperty("fsType")
    @JsonPropertyDescription("fsType to mount. Ex. \"ext4\", \"xfs\", \"ntfs\".\nIf not provided, the empty value is passed to the associated CSI driver\nwhich will determine the default filesystem to apply.")
    private String fsType;
    /**
     * nodePublishSecretRef is a reference to the secret object containing
     * sensitive information to pass to the CSI driver to complete the CSI
     * NodePublishVolume and NodeUnpublishVolume calls.
     * This field is optional, and  may be empty if no secret is required. If the
     * secret object contains more than one secret, all secret references are passed.
     * 
     */
    @JsonProperty("nodePublishSecretRef")
    @JsonPropertyDescription("nodePublishSecretRef is a reference to the secret object containing\nsensitive information to pass to the CSI driver to complete the CSI\nNodePublishVolume and NodeUnpublishVolume calls.\nThis field is optional, and  may be empty if no secret is required. If the\nsecret object contains more than one secret, all secret references are passed.")
    @Valid
    private NodePublishSecretRef nodePublishSecretRef;
    /**
     * readOnly specifies a read-only configuration for the volume.
     * Defaults to false (read/write).
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("readOnly specifies a read-only configuration for the volume.\nDefaults to false (read/write).")
    private Boolean readOnly;
    /**
     * volumeAttributes stores driver-specific properties that are passed to the CSI
     * driver. Consult your driver's documentation for supported values.
     * 
     */
    @JsonProperty("volumeAttributes")
    @JsonPropertyDescription("volumeAttributes stores driver-specific properties that are passed to the CSI\ndriver. Consult your driver's documentation for supported values.")
    @Valid
    private VolumeAttributes volumeAttributes;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * driver is the name of the CSI driver that handles this volume.
     * Consult with your admin for the correct name as registered in the cluster.
     * (Required)
     * 
     */
    @JsonProperty("driver")
    public String getDriver() {
        return driver;
    }

    /**
     * driver is the name of the CSI driver that handles this volume.
     * Consult with your admin for the correct name as registered in the cluster.
     * (Required)
     * 
     */
    @JsonProperty("driver")
    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Csi withDriver(String driver) {
        this.driver = driver;
        return this;
    }

    /**
     * fsType to mount. Ex. "ext4", "xfs", "ntfs".
     * If not provided, the empty value is passed to the associated CSI driver
     * which will determine the default filesystem to apply.
     * 
     */
    @JsonProperty("fsType")
    public String getFsType() {
        return fsType;
    }

    /**
     * fsType to mount. Ex. "ext4", "xfs", "ntfs".
     * If not provided, the empty value is passed to the associated CSI driver
     * which will determine the default filesystem to apply.
     * 
     */
    @JsonProperty("fsType")
    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    public Csi withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    /**
     * nodePublishSecretRef is a reference to the secret object containing
     * sensitive information to pass to the CSI driver to complete the CSI
     * NodePublishVolume and NodeUnpublishVolume calls.
     * This field is optional, and  may be empty if no secret is required. If the
     * secret object contains more than one secret, all secret references are passed.
     * 
     */
    @JsonProperty("nodePublishSecretRef")
    public NodePublishSecretRef getNodePublishSecretRef() {
        return nodePublishSecretRef;
    }

    /**
     * nodePublishSecretRef is a reference to the secret object containing
     * sensitive information to pass to the CSI driver to complete the CSI
     * NodePublishVolume and NodeUnpublishVolume calls.
     * This field is optional, and  may be empty if no secret is required. If the
     * secret object contains more than one secret, all secret references are passed.
     * 
     */
    @JsonProperty("nodePublishSecretRef")
    public void setNodePublishSecretRef(NodePublishSecretRef nodePublishSecretRef) {
        this.nodePublishSecretRef = nodePublishSecretRef;
    }

    public Csi withNodePublishSecretRef(NodePublishSecretRef nodePublishSecretRef) {
        this.nodePublishSecretRef = nodePublishSecretRef;
        return this;
    }

    /**
     * readOnly specifies a read-only configuration for the volume.
     * Defaults to false (read/write).
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * readOnly specifies a read-only configuration for the volume.
     * Defaults to false (read/write).
     * 
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public Csi withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * volumeAttributes stores driver-specific properties that are passed to the CSI
     * driver. Consult your driver's documentation for supported values.
     * 
     */
    @JsonProperty("volumeAttributes")
    public VolumeAttributes getVolumeAttributes() {
        return volumeAttributes;
    }

    /**
     * volumeAttributes stores driver-specific properties that are passed to the CSI
     * driver. Consult your driver's documentation for supported values.
     * 
     */
    @JsonProperty("volumeAttributes")
    public void setVolumeAttributes(VolumeAttributes volumeAttributes) {
        this.volumeAttributes = volumeAttributes;
    }

    public Csi withVolumeAttributes(VolumeAttributes volumeAttributes) {
        this.volumeAttributes = volumeAttributes;
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

    public Csi withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Csi.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("driver");
        sb.append('=');
        sb.append(((this.driver == null)?"<null>":this.driver));
        sb.append(',');
        sb.append("fsType");
        sb.append('=');
        sb.append(((this.fsType == null)?"<null>":this.fsType));
        sb.append(',');
        sb.append("nodePublishSecretRef");
        sb.append('=');
        sb.append(((this.nodePublishSecretRef == null)?"<null>":this.nodePublishSecretRef));
        sb.append(',');
        sb.append("readOnly");
        sb.append('=');
        sb.append(((this.readOnly == null)?"<null>":this.readOnly));
        sb.append(',');
        sb.append("volumeAttributes");
        sb.append('=');
        sb.append(((this.volumeAttributes == null)?"<null>":this.volumeAttributes));
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
        result = ((result* 31)+((this.driver == null)? 0 :this.driver.hashCode()));
        result = ((result* 31)+((this.nodePublishSecretRef == null)? 0 :this.nodePublishSecretRef.hashCode()));
        result = ((result* 31)+((this.readOnly == null)? 0 :this.readOnly.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fsType == null)? 0 :this.fsType.hashCode()));
        result = ((result* 31)+((this.volumeAttributes == null)? 0 :this.volumeAttributes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Csi) == false) {
            return false;
        }
        Csi rhs = ((Csi) other);
        return (((((((this.driver == rhs.driver)||((this.driver!= null)&&this.driver.equals(rhs.driver)))&&((this.nodePublishSecretRef == rhs.nodePublishSecretRef)||((this.nodePublishSecretRef!= null)&&this.nodePublishSecretRef.equals(rhs.nodePublishSecretRef))))&&((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fsType == rhs.fsType)||((this.fsType!= null)&&this.fsType.equals(rhs.fsType))))&&((this.volumeAttributes == rhs.volumeAttributes)||((this.volumeAttributes!= null)&&this.volumeAttributes.equals(rhs.volumeAttributes))));
    }

}
