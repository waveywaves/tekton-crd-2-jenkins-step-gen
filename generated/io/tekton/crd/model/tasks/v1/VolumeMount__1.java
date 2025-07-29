
package io.tekton.crd.model.tasks.v1;

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
 * VolumeMount describes a mounting of a Volume within a container.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mountPath",
    "mountPropagation",
    "name",
    "readOnly",
    "recursiveReadOnly",
    "subPath",
    "subPathExpr"
})
@Generated("jsonschema2pojo")
public class VolumeMount__1 {

    /**
     * Path within the container at which the volume should be mounted.  Must
     * not contain ':'.
     * (Required)
     * 
     */
    @JsonProperty("mountPath")
    @JsonPropertyDescription("Path within the container at which the volume should be mounted.  Must\nnot contain ':'.")
    @NotNull
    private String mountPath;
    /**
     * mountPropagation determines how mounts are propagated from the host
     * to container and the other way around.
     * When not set, MountPropagationNone is used.
     * This field is beta in 1.10.
     * When RecursiveReadOnly is set to IfPossible or to Enabled, MountPropagation must be None or unspecified
     * (which defaults to None).
     * 
     */
    @JsonProperty("mountPropagation")
    @JsonPropertyDescription("mountPropagation determines how mounts are propagated from the host\nto container and the other way around.\nWhen not set, MountPropagationNone is used.\nThis field is beta in 1.10.\nWhen RecursiveReadOnly is set to IfPossible or to Enabled, MountPropagation must be None or unspecified\n(which defaults to None).")
    private String mountPropagation;
    /**
     * This must match the Name of a Volume.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("This must match the Name of a Volume.")
    @NotNull
    private String name;
    /**
     * Mounted read-only if true, read-write otherwise (false or unspecified).
     * Defaults to false.
     * 
     */
    @JsonProperty("readOnly")
    @JsonPropertyDescription("Mounted read-only if true, read-write otherwise (false or unspecified).\nDefaults to false.")
    private Boolean readOnly;
    /**
     * RecursiveReadOnly specifies whether read-only mounts should be handled
     * recursively.
     * 
     * If ReadOnly is false, this field has no meaning and must be unspecified.
     * 
     * If ReadOnly is true, and this field is set to Disabled, the mount is not made
     * recursively read-only.  If this field is set to IfPossible, the mount is made
     * recursively read-only, if it is supported by the container runtime.  If this
     * field is set to Enabled, the mount is made recursively read-only if it is
     * supported by the container runtime, otherwise the pod will not be started and
     * an error will be generated to indicate the reason.
     * 
     * If this field is set to IfPossible or Enabled, MountPropagation must be set to
     * None (or be unspecified, which defaults to None).
     * 
     * If this field is not specified, it is treated as an equivalent of Disabled.
     * 
     */
    @JsonProperty("recursiveReadOnly")
    @JsonPropertyDescription("RecursiveReadOnly specifies whether read-only mounts should be handled\nrecursively.\n\nIf ReadOnly is false, this field has no meaning and must be unspecified.\n\nIf ReadOnly is true, and this field is set to Disabled, the mount is not made\nrecursively read-only.  If this field is set to IfPossible, the mount is made\nrecursively read-only, if it is supported by the container runtime.  If this\nfield is set to Enabled, the mount is made recursively read-only if it is\nsupported by the container runtime, otherwise the pod will not be started and\nan error will be generated to indicate the reason.\n\nIf this field is set to IfPossible or Enabled, MountPropagation must be set to\nNone (or be unspecified, which defaults to None).\n\nIf this field is not specified, it is treated as an equivalent of Disabled.")
    private String recursiveReadOnly;
    /**
     * Path within the volume from which the container's volume should be mounted.
     * Defaults to "" (volume's root).
     * 
     */
    @JsonProperty("subPath")
    @JsonPropertyDescription("Path within the volume from which the container's volume should be mounted.\nDefaults to \"\" (volume's root).")
    private String subPath;
    /**
     * Expanded path within the volume from which the container's volume should be mounted.
     * Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment.
     * Defaults to "" (volume's root).
     * SubPathExpr and SubPath are mutually exclusive.
     * 
     */
    @JsonProperty("subPathExpr")
    @JsonPropertyDescription("Expanded path within the volume from which the container's volume should be mounted.\nBehaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment.\nDefaults to \"\" (volume's root).\nSubPathExpr and SubPath are mutually exclusive.")
    private String subPathExpr;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Path within the container at which the volume should be mounted.  Must
     * not contain ':'.
     * (Required)
     * 
     */
    @JsonProperty("mountPath")
    public String getMountPath() {
        return mountPath;
    }

    /**
     * Path within the container at which the volume should be mounted.  Must
     * not contain ':'.
     * (Required)
     * 
     */
    @JsonProperty("mountPath")
    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    public VolumeMount__1 withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * mountPropagation determines how mounts are propagated from the host
     * to container and the other way around.
     * When not set, MountPropagationNone is used.
     * This field is beta in 1.10.
     * When RecursiveReadOnly is set to IfPossible or to Enabled, MountPropagation must be None or unspecified
     * (which defaults to None).
     * 
     */
    @JsonProperty("mountPropagation")
    public String getMountPropagation() {
        return mountPropagation;
    }

    /**
     * mountPropagation determines how mounts are propagated from the host
     * to container and the other way around.
     * When not set, MountPropagationNone is used.
     * This field is beta in 1.10.
     * When RecursiveReadOnly is set to IfPossible or to Enabled, MountPropagation must be None or unspecified
     * (which defaults to None).
     * 
     */
    @JsonProperty("mountPropagation")
    public void setMountPropagation(String mountPropagation) {
        this.mountPropagation = mountPropagation;
    }

    public VolumeMount__1 withMountPropagation(String mountPropagation) {
        this.mountPropagation = mountPropagation;
        return this;
    }

    /**
     * This must match the Name of a Volume.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * This must match the Name of a Volume.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public VolumeMount__1 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Mounted read-only if true, read-write otherwise (false or unspecified).
     * Defaults to false.
     * 
     */
    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * Mounted read-only if true, read-write otherwise (false or unspecified).
     * Defaults to false.
     * 
     */
    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public VolumeMount__1 withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * RecursiveReadOnly specifies whether read-only mounts should be handled
     * recursively.
     * 
     * If ReadOnly is false, this field has no meaning and must be unspecified.
     * 
     * If ReadOnly is true, and this field is set to Disabled, the mount is not made
     * recursively read-only.  If this field is set to IfPossible, the mount is made
     * recursively read-only, if it is supported by the container runtime.  If this
     * field is set to Enabled, the mount is made recursively read-only if it is
     * supported by the container runtime, otherwise the pod will not be started and
     * an error will be generated to indicate the reason.
     * 
     * If this field is set to IfPossible or Enabled, MountPropagation must be set to
     * None (or be unspecified, which defaults to None).
     * 
     * If this field is not specified, it is treated as an equivalent of Disabled.
     * 
     */
    @JsonProperty("recursiveReadOnly")
    public String getRecursiveReadOnly() {
        return recursiveReadOnly;
    }

    /**
     * RecursiveReadOnly specifies whether read-only mounts should be handled
     * recursively.
     * 
     * If ReadOnly is false, this field has no meaning and must be unspecified.
     * 
     * If ReadOnly is true, and this field is set to Disabled, the mount is not made
     * recursively read-only.  If this field is set to IfPossible, the mount is made
     * recursively read-only, if it is supported by the container runtime.  If this
     * field is set to Enabled, the mount is made recursively read-only if it is
     * supported by the container runtime, otherwise the pod will not be started and
     * an error will be generated to indicate the reason.
     * 
     * If this field is set to IfPossible or Enabled, MountPropagation must be set to
     * None (or be unspecified, which defaults to None).
     * 
     * If this field is not specified, it is treated as an equivalent of Disabled.
     * 
     */
    @JsonProperty("recursiveReadOnly")
    public void setRecursiveReadOnly(String recursiveReadOnly) {
        this.recursiveReadOnly = recursiveReadOnly;
    }

    public VolumeMount__1 withRecursiveReadOnly(String recursiveReadOnly) {
        this.recursiveReadOnly = recursiveReadOnly;
        return this;
    }

    /**
     * Path within the volume from which the container's volume should be mounted.
     * Defaults to "" (volume's root).
     * 
     */
    @JsonProperty("subPath")
    public String getSubPath() {
        return subPath;
    }

    /**
     * Path within the volume from which the container's volume should be mounted.
     * Defaults to "" (volume's root).
     * 
     */
    @JsonProperty("subPath")
    public void setSubPath(String subPath) {
        this.subPath = subPath;
    }

    public VolumeMount__1 withSubPath(String subPath) {
        this.subPath = subPath;
        return this;
    }

    /**
     * Expanded path within the volume from which the container's volume should be mounted.
     * Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment.
     * Defaults to "" (volume's root).
     * SubPathExpr and SubPath are mutually exclusive.
     * 
     */
    @JsonProperty("subPathExpr")
    public String getSubPathExpr() {
        return subPathExpr;
    }

    /**
     * Expanded path within the volume from which the container's volume should be mounted.
     * Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment.
     * Defaults to "" (volume's root).
     * SubPathExpr and SubPath are mutually exclusive.
     * 
     */
    @JsonProperty("subPathExpr")
    public void setSubPathExpr(String subPathExpr) {
        this.subPathExpr = subPathExpr;
    }

    public VolumeMount__1 withSubPathExpr(String subPathExpr) {
        this.subPathExpr = subPathExpr;
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

    public VolumeMount__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VolumeMount__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("mountPath");
        sb.append('=');
        sb.append(((this.mountPath == null)?"<null>":this.mountPath));
        sb.append(',');
        sb.append("mountPropagation");
        sb.append('=');
        sb.append(((this.mountPropagation == null)?"<null>":this.mountPropagation));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("readOnly");
        sb.append('=');
        sb.append(((this.readOnly == null)?"<null>":this.readOnly));
        sb.append(',');
        sb.append("recursiveReadOnly");
        sb.append('=');
        sb.append(((this.recursiveReadOnly == null)?"<null>":this.recursiveReadOnly));
        sb.append(',');
        sb.append("subPath");
        sb.append('=');
        sb.append(((this.subPath == null)?"<null>":this.subPath));
        sb.append(',');
        sb.append("subPathExpr");
        sb.append('=');
        sb.append(((this.subPathExpr == null)?"<null>":this.subPathExpr));
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
        result = ((result* 31)+((this.mountPath == null)? 0 :this.mountPath.hashCode()));
        result = ((result* 31)+((this.mountPropagation == null)? 0 :this.mountPropagation.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.readOnly == null)? 0 :this.readOnly.hashCode()));
        result = ((result* 31)+((this.subPath == null)? 0 :this.subPath.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.recursiveReadOnly == null)? 0 :this.recursiveReadOnly.hashCode()));
        result = ((result* 31)+((this.subPathExpr == null)? 0 :this.subPathExpr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VolumeMount__1) == false) {
            return false;
        }
        VolumeMount__1 rhs = ((VolumeMount__1) other);
        return (((((((((this.mountPath == rhs.mountPath)||((this.mountPath!= null)&&this.mountPath.equals(rhs.mountPath)))&&((this.mountPropagation == rhs.mountPropagation)||((this.mountPropagation!= null)&&this.mountPropagation.equals(rhs.mountPropagation))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.readOnly == rhs.readOnly)||((this.readOnly!= null)&&this.readOnly.equals(rhs.readOnly))))&&((this.subPath == rhs.subPath)||((this.subPath!= null)&&this.subPath.equals(rhs.subPath))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.recursiveReadOnly == rhs.recursiveReadOnly)||((this.recursiveReadOnly!= null)&&this.recursiveReadOnly.equals(rhs.recursiveReadOnly))))&&((this.subPathExpr == rhs.subPathExpr)||((this.subPathExpr!= null)&&this.subPathExpr.equals(rhs.subPathExpr))));
    }

}
