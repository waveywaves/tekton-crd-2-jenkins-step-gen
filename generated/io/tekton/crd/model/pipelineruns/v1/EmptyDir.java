
package io.tekton.crd.model.pipelineruns.v1;

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
 * EmptyDir represents a temporary directory that shares a Task's lifetime.
 * More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
 * Either this OR PersistentVolumeClaim can be used.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "medium",
    "sizeLimit"
})
@Generated("jsonschema2pojo")
public class EmptyDir {

    /**
     * medium represents what type of storage medium should back this directory.
     * The default is "" which means to use the node's default medium.
     * Must be an empty string (default) or Memory.
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     * 
     */
    @JsonProperty("medium")
    @JsonPropertyDescription("medium represents what type of storage medium should back this directory.\nThe default is \"\" which means to use the node's default medium.\nMust be an empty string (default) or Memory.\nMore info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir")
    private String medium;
    /**
     * sizeLimit is the total amount of local storage required for this EmptyDir volume.
     * The size limit is also applicable for memory medium.
     * The maximum usage on memory medium EmptyDir would be the minimum value between
     * the SizeLimit specified here and the sum of memory limits of all containers in a pod.
     * The default is nil which means that the limit is undefined.
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     * 
     */
    @JsonProperty("sizeLimit")
    @JsonPropertyDescription("sizeLimit is the total amount of local storage required for this EmptyDir volume.\nThe size limit is also applicable for memory medium.\nThe maximum usage on memory medium EmptyDir would be the minimum value between\nthe SizeLimit specified here and the sum of memory limits of all containers in a pod.\nThe default is nil which means that the limit is undefined.\nMore info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir")
    private Object sizeLimit;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * medium represents what type of storage medium should back this directory.
     * The default is "" which means to use the node's default medium.
     * Must be an empty string (default) or Memory.
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     * 
     */
    @JsonProperty("medium")
    public String getMedium() {
        return medium;
    }

    /**
     * medium represents what type of storage medium should back this directory.
     * The default is "" which means to use the node's default medium.
     * Must be an empty string (default) or Memory.
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     * 
     */
    @JsonProperty("medium")
    public void setMedium(String medium) {
        this.medium = medium;
    }

    public EmptyDir withMedium(String medium) {
        this.medium = medium;
        return this;
    }

    /**
     * sizeLimit is the total amount of local storage required for this EmptyDir volume.
     * The size limit is also applicable for memory medium.
     * The maximum usage on memory medium EmptyDir would be the minimum value between
     * the SizeLimit specified here and the sum of memory limits of all containers in a pod.
     * The default is nil which means that the limit is undefined.
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     * 
     */
    @JsonProperty("sizeLimit")
    public Object getSizeLimit() {
        return sizeLimit;
    }

    /**
     * sizeLimit is the total amount of local storage required for this EmptyDir volume.
     * The size limit is also applicable for memory medium.
     * The maximum usage on memory medium EmptyDir would be the minimum value between
     * the SizeLimit specified here and the sum of memory limits of all containers in a pod.
     * The default is nil which means that the limit is undefined.
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     * 
     */
    @JsonProperty("sizeLimit")
    public void setSizeLimit(Object sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    public EmptyDir withSizeLimit(Object sizeLimit) {
        this.sizeLimit = sizeLimit;
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

    public EmptyDir withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmptyDir.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("medium");
        sb.append('=');
        sb.append(((this.medium == null)?"<null>":this.medium));
        sb.append(',');
        sb.append("sizeLimit");
        sb.append('=');
        sb.append(((this.sizeLimit == null)?"<null>":this.sizeLimit));
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
        result = ((result* 31)+((this.sizeLimit == null)? 0 :this.sizeLimit.hashCode()));
        result = ((result* 31)+((this.medium == null)? 0 :this.medium.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmptyDir) == false) {
            return false;
        }
        EmptyDir rhs = ((EmptyDir) other);
        return ((((this.sizeLimit == rhs.sizeLimit)||((this.sizeLimit!= null)&&this.sizeLimit.equals(rhs.sizeLimit)))&&((this.medium == rhs.medium)||((this.medium!= null)&&this.medium.equals(rhs.medium))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
