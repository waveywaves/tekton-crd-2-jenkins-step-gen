
package io.tekton.crd.model.tasks.v1;

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
 * Actions that the management system should take in response to Sidecar lifecycle events.
 * Cannot be updated.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "postStart",
    "preStop"
})
@Generated("jsonschema2pojo")
public class Lifecycle {

    /**
     * PostStart is called immediately after a container is created. If the handler fails,
     * the container is terminated and restarted according to its restart policy.
     * Other management of the container blocks until the hook completes.
     * More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     * 
     */
    @JsonProperty("postStart")
    @JsonPropertyDescription("PostStart is called immediately after a container is created. If the handler fails,\nthe container is terminated and restarted according to its restart policy.\nOther management of the container blocks until the hook completes.\nMore info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks")
    @Valid
    private PostStart postStart;
    /**
     * PreStop is called immediately before a container is terminated due to an
     * API request or management event such as liveness/startup probe failure,
     * preemption, resource contention, etc. The handler is not called if the
     * container crashes or exits. The Pod's termination grace period countdown begins before the
     * PreStop hook is executed. Regardless of the outcome of the handler, the
     * container will eventually terminate within the Pod's termination grace
     * period (unless delayed by finalizers). Other management of the container blocks until the hook completes
     * or until the termination grace period is reached.
     * More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     * 
     */
    @JsonProperty("preStop")
    @JsonPropertyDescription("PreStop is called immediately before a container is terminated due to an\nAPI request or management event such as liveness/startup probe failure,\npreemption, resource contention, etc. The handler is not called if the\ncontainer crashes or exits. The Pod's termination grace period countdown begins before the\nPreStop hook is executed. Regardless of the outcome of the handler, the\ncontainer will eventually terminate within the Pod's termination grace\nperiod (unless delayed by finalizers). Other management of the container blocks until the hook completes\nor until the termination grace period is reached.\nMore info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks")
    @Valid
    private PreStop preStop;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * PostStart is called immediately after a container is created. If the handler fails,
     * the container is terminated and restarted according to its restart policy.
     * Other management of the container blocks until the hook completes.
     * More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     * 
     */
    @JsonProperty("postStart")
    public PostStart getPostStart() {
        return postStart;
    }

    /**
     * PostStart is called immediately after a container is created. If the handler fails,
     * the container is terminated and restarted according to its restart policy.
     * Other management of the container blocks until the hook completes.
     * More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     * 
     */
    @JsonProperty("postStart")
    public void setPostStart(PostStart postStart) {
        this.postStart = postStart;
    }

    public Lifecycle withPostStart(PostStart postStart) {
        this.postStart = postStart;
        return this;
    }

    /**
     * PreStop is called immediately before a container is terminated due to an
     * API request or management event such as liveness/startup probe failure,
     * preemption, resource contention, etc. The handler is not called if the
     * container crashes or exits. The Pod's termination grace period countdown begins before the
     * PreStop hook is executed. Regardless of the outcome of the handler, the
     * container will eventually terminate within the Pod's termination grace
     * period (unless delayed by finalizers). Other management of the container blocks until the hook completes
     * or until the termination grace period is reached.
     * More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     * 
     */
    @JsonProperty("preStop")
    public PreStop getPreStop() {
        return preStop;
    }

    /**
     * PreStop is called immediately before a container is terminated due to an
     * API request or management event such as liveness/startup probe failure,
     * preemption, resource contention, etc. The handler is not called if the
     * container crashes or exits. The Pod's termination grace period countdown begins before the
     * PreStop hook is executed. Regardless of the outcome of the handler, the
     * container will eventually terminate within the Pod's termination grace
     * period (unless delayed by finalizers). Other management of the container blocks until the hook completes
     * or until the termination grace period is reached.
     * More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     * 
     */
    @JsonProperty("preStop")
    public void setPreStop(PreStop preStop) {
        this.preStop = preStop;
    }

    public Lifecycle withPreStop(PreStop preStop) {
        this.preStop = preStop;
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

    public Lifecycle withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Lifecycle.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("postStart");
        sb.append('=');
        sb.append(((this.postStart == null)?"<null>":this.postStart));
        sb.append(',');
        sb.append("preStop");
        sb.append('=');
        sb.append(((this.preStop == null)?"<null>":this.preStop));
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
        result = ((result* 31)+((this.postStart == null)? 0 :this.postStart.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.preStop == null)? 0 :this.preStop.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Lifecycle) == false) {
            return false;
        }
        Lifecycle rhs = ((Lifecycle) other);
        return ((((this.postStart == rhs.postStart)||((this.postStart!= null)&&this.postStart.equals(rhs.postStart)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.preStop == rhs.preStop)||((this.preStop!= null)&&this.preStop.equals(rhs.preStop))));
    }

}
