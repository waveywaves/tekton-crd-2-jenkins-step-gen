
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
 * CloudEventDelivery is the target of a cloud event along with the state of
 * delivery.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "target"
})
@Generated("jsonschema2pojo")
public class CloudEvent {

    /**
     * CloudEventDeliveryState reports the state of a cloud event to be sent.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("CloudEventDeliveryState reports the state of a cloud event to be sent.")
    @Valid
    private Status__3 status;
    /**
     * Target points to an addressable
     * 
     */
    @JsonProperty("target")
    @JsonPropertyDescription("Target points to an addressable")
    private String target;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * CloudEventDeliveryState reports the state of a cloud event to be sent.
     * 
     */
    @JsonProperty("status")
    public Status__3 getStatus() {
        return status;
    }

    /**
     * CloudEventDeliveryState reports the state of a cloud event to be sent.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status__3 status) {
        this.status = status;
    }

    public CloudEvent withStatus(Status__3 status) {
        this.status = status;
        return this;
    }

    /**
     * Target points to an addressable
     * 
     */
    @JsonProperty("target")
    public String getTarget() {
        return target;
    }

    /**
     * Target points to an addressable
     * 
     */
    @JsonProperty("target")
    public void setTarget(String target) {
        this.target = target;
    }

    public CloudEvent withTarget(String target) {
        this.target = target;
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

    public CloudEvent withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CloudEvent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null)?"<null>":this.target));
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
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.target == null)? 0 :this.target.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CloudEvent) == false) {
            return false;
        }
        CloudEvent rhs = ((CloudEvent) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.target == rhs.target)||((this.target!= null)&&this.target.equals(rhs.target))));
    }

}
