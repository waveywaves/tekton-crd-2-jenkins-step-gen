
package io.tekton.crd.model.tasks.v1beta1;

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
 * volumeDevice describes a mapping of a raw block device within a container.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "devicePath",
    "name"
})
@Generated("jsonschema2pojo")
public class VolumeDevice__2 {

    /**
     * devicePath is the path inside of the container that the device will be mapped to.
     * (Required)
     * 
     */
    @JsonProperty("devicePath")
    @JsonPropertyDescription("devicePath is the path inside of the container that the device will be mapped to.")
    @NotNull
    private String devicePath;
    /**
     * name must match the name of a persistentVolumeClaim in the pod
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("name must match the name of a persistentVolumeClaim in the pod")
    @NotNull
    private String name;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * devicePath is the path inside of the container that the device will be mapped to.
     * (Required)
     * 
     */
    @JsonProperty("devicePath")
    public String getDevicePath() {
        return devicePath;
    }

    /**
     * devicePath is the path inside of the container that the device will be mapped to.
     * (Required)
     * 
     */
    @JsonProperty("devicePath")
    public void setDevicePath(String devicePath) {
        this.devicePath = devicePath;
    }

    public VolumeDevice__2 withDevicePath(String devicePath) {
        this.devicePath = devicePath;
        return this;
    }

    /**
     * name must match the name of a persistentVolumeClaim in the pod
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * name must match the name of a persistentVolumeClaim in the pod
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public VolumeDevice__2 withName(String name) {
        this.name = name;
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

    public VolumeDevice__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VolumeDevice__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("devicePath");
        sb.append('=');
        sb.append(((this.devicePath == null)?"<null>":this.devicePath));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.devicePath == null)? 0 :this.devicePath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VolumeDevice__2) == false) {
            return false;
        }
        VolumeDevice__2 rhs = ((VolumeDevice__2) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.devicePath == rhs.devicePath)||((this.devicePath!= null)&&this.devicePath.equals(rhs.devicePath))));
    }

}
