
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
 * SidecarState reports the results of running a sidecar in a Task.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "container",
    "imageID",
    "name",
    "running",
    "terminated",
    "waiting"
})
@Generated("jsonschema2pojo")
public class Sidecar {

    @JsonProperty("container")
    private String container;
    @JsonProperty("imageID")
    private String imageID;
    @JsonProperty("name")
    private String name;
    /**
     * Details about a running container
     * 
     */
    @JsonProperty("running")
    @JsonPropertyDescription("Details about a running container")
    @Valid
    private Running running;
    /**
     * Details about a terminated container
     * 
     */
    @JsonProperty("terminated")
    @JsonPropertyDescription("Details about a terminated container")
    @Valid
    private Terminated terminated;
    /**
     * Details about a waiting container
     * 
     */
    @JsonProperty("waiting")
    @JsonPropertyDescription("Details about a waiting container")
    @Valid
    private Waiting waiting;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("container")
    public String getContainer() {
        return container;
    }

    @JsonProperty("container")
    public void setContainer(String container) {
        this.container = container;
    }

    public Sidecar withContainer(String container) {
        this.container = container;
        return this;
    }

    @JsonProperty("imageID")
    public String getImageID() {
        return imageID;
    }

    @JsonProperty("imageID")
    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public Sidecar withImageID(String imageID) {
        this.imageID = imageID;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Sidecar withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Details about a running container
     * 
     */
    @JsonProperty("running")
    public Running getRunning() {
        return running;
    }

    /**
     * Details about a running container
     * 
     */
    @JsonProperty("running")
    public void setRunning(Running running) {
        this.running = running;
    }

    public Sidecar withRunning(Running running) {
        this.running = running;
        return this;
    }

    /**
     * Details about a terminated container
     * 
     */
    @JsonProperty("terminated")
    public Terminated getTerminated() {
        return terminated;
    }

    /**
     * Details about a terminated container
     * 
     */
    @JsonProperty("terminated")
    public void setTerminated(Terminated terminated) {
        this.terminated = terminated;
    }

    public Sidecar withTerminated(Terminated terminated) {
        this.terminated = terminated;
        return this;
    }

    /**
     * Details about a waiting container
     * 
     */
    @JsonProperty("waiting")
    public Waiting getWaiting() {
        return waiting;
    }

    /**
     * Details about a waiting container
     * 
     */
    @JsonProperty("waiting")
    public void setWaiting(Waiting waiting) {
        this.waiting = waiting;
    }

    public Sidecar withWaiting(Waiting waiting) {
        this.waiting = waiting;
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

    public Sidecar withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sidecar.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("container");
        sb.append('=');
        sb.append(((this.container == null)?"<null>":this.container));
        sb.append(',');
        sb.append("imageID");
        sb.append('=');
        sb.append(((this.imageID == null)?"<null>":this.imageID));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("running");
        sb.append('=');
        sb.append(((this.running == null)?"<null>":this.running));
        sb.append(',');
        sb.append("terminated");
        sb.append('=');
        sb.append(((this.terminated == null)?"<null>":this.terminated));
        sb.append(',');
        sb.append("waiting");
        sb.append('=');
        sb.append(((this.waiting == null)?"<null>":this.waiting));
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
        result = ((result* 31)+((this.container == null)? 0 :this.container.hashCode()));
        result = ((result* 31)+((this.running == null)? 0 :this.running.hashCode()));
        result = ((result* 31)+((this.imageID == null)? 0 :this.imageID.hashCode()));
        result = ((result* 31)+((this.waiting == null)? 0 :this.waiting.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.terminated == null)? 0 :this.terminated.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sidecar) == false) {
            return false;
        }
        Sidecar rhs = ((Sidecar) other);
        return ((((((((this.container == rhs.container)||((this.container!= null)&&this.container.equals(rhs.container)))&&((this.running == rhs.running)||((this.running!= null)&&this.running.equals(rhs.running))))&&((this.imageID == rhs.imageID)||((this.imageID!= null)&&this.imageID.equals(rhs.imageID))))&&((this.waiting == rhs.waiting)||((this.waiting!= null)&&this.waiting.equals(rhs.waiting))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.terminated == rhs.terminated)||((this.terminated!= null)&&this.terminated.equals(rhs.terminated))));
    }

}
