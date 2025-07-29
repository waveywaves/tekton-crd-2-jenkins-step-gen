
package io.tekton.crd.model.resolutionrequests.v1alpha1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
 * Status communicates the state of the request and, ultimately,
 * the content of the resolved resource.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "annotations",
    "conditions",
    "data",
    "observedGeneration",
    "refSource"
})
@Generated("jsonschema2pojo")
public class Status {

    /**
     * Annotations is additional Status fields for the Resource to save some
     * additional State as well as convey more information to the user. This is
     * roughly akin to Annotations on any k8s resource, just the reconciler conveying
     * richer information outwards.
     * 
     */
    @JsonProperty("annotations")
    @JsonPropertyDescription("Annotations is additional Status fields for the Resource to save some\nadditional State as well as convey more information to the user. This is\nroughly akin to Annotations on any k8s resource, just the reconciler conveying\nricher information outwards.")
    @Valid
    private Annotations annotations;
    /**
     * Conditions the latest available observations of a resource's current state.
     * 
     */
    @JsonProperty("conditions")
    @JsonPropertyDescription("Conditions the latest available observations of a resource's current state.")
    @Valid
    private List<Condition> conditions = new ArrayList<Condition>();
    /**
     * Data is a string representation of the resolved content
     * of the requested resource in-lined into the ResolutionRequest
     * object.
     * (Required)
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("Data is a string representation of the resolved content\nof the requested resource in-lined into the ResolutionRequest\nobject.")
    @NotNull
    private String data;
    /**
     * ObservedGeneration is the 'Generation' of the Service that
     * was last processed by the controller.
     * 
     */
    @JsonProperty("observedGeneration")
    @JsonPropertyDescription("ObservedGeneration is the 'Generation' of the Service that\nwas last processed by the controller.")
    private Integer observedGeneration;
    /**
     * RefSource is the source reference of the remote data that records where the remote
     * file came from including the url, digest and the entrypoint.
     * (Required)
     * 
     */
    @JsonProperty("refSource")
    @JsonPropertyDescription("RefSource is the source reference of the remote data that records where the remote\nfile came from including the url, digest and the entrypoint.")
    @NotNull
    private Object refSource;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Annotations is additional Status fields for the Resource to save some
     * additional State as well as convey more information to the user. This is
     * roughly akin to Annotations on any k8s resource, just the reconciler conveying
     * richer information outwards.
     * 
     */
    @JsonProperty("annotations")
    public Annotations getAnnotations() {
        return annotations;
    }

    /**
     * Annotations is additional Status fields for the Resource to save some
     * additional State as well as convey more information to the user. This is
     * roughly akin to Annotations on any k8s resource, just the reconciler conveying
     * richer information outwards.
     * 
     */
    @JsonProperty("annotations")
    public void setAnnotations(Annotations annotations) {
        this.annotations = annotations;
    }

    public Status withAnnotations(Annotations annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * Conditions the latest available observations of a resource's current state.
     * 
     */
    @JsonProperty("conditions")
    public List<Condition> getConditions() {
        return conditions;
    }

    /**
     * Conditions the latest available observations of a resource's current state.
     * 
     */
    @JsonProperty("conditions")
    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public Status withConditions(List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Data is a string representation of the resolved content
     * of the requested resource in-lined into the ResolutionRequest
     * object.
     * (Required)
     * 
     */
    @JsonProperty("data")
    public String getData() {
        return data;
    }

    /**
     * Data is a string representation of the resolved content
     * of the requested resource in-lined into the ResolutionRequest
     * object.
     * (Required)
     * 
     */
    @JsonProperty("data")
    public void setData(String data) {
        this.data = data;
    }

    public Status withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * ObservedGeneration is the 'Generation' of the Service that
     * was last processed by the controller.
     * 
     */
    @JsonProperty("observedGeneration")
    public Integer getObservedGeneration() {
        return observedGeneration;
    }

    /**
     * ObservedGeneration is the 'Generation' of the Service that
     * was last processed by the controller.
     * 
     */
    @JsonProperty("observedGeneration")
    public void setObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    public Status withObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    /**
     * RefSource is the source reference of the remote data that records where the remote
     * file came from including the url, digest and the entrypoint.
     * (Required)
     * 
     */
    @JsonProperty("refSource")
    public Object getRefSource() {
        return refSource;
    }

    /**
     * RefSource is the source reference of the remote data that records where the remote
     * file came from including the url, digest and the entrypoint.
     * (Required)
     * 
     */
    @JsonProperty("refSource")
    public void setRefSource(Object refSource) {
        this.refSource = refSource;
    }

    public Status withRefSource(Object refSource) {
        this.refSource = refSource;
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

    public Status withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Status.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("annotations");
        sb.append('=');
        sb.append(((this.annotations == null)?"<null>":this.annotations));
        sb.append(',');
        sb.append("conditions");
        sb.append('=');
        sb.append(((this.conditions == null)?"<null>":this.conditions));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("observedGeneration");
        sb.append('=');
        sb.append(((this.observedGeneration == null)?"<null>":this.observedGeneration));
        sb.append(',');
        sb.append("refSource");
        sb.append('=');
        sb.append(((this.refSource == null)?"<null>":this.refSource));
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
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.annotations == null)? 0 :this.annotations.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.conditions == null)? 0 :this.conditions.hashCode()));
        result = ((result* 31)+((this.observedGeneration == null)? 0 :this.observedGeneration.hashCode()));
        result = ((result* 31)+((this.refSource == null)? 0 :this.refSource.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Status) == false) {
            return false;
        }
        Status rhs = ((Status) other);
        return (((((((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data)))&&((this.annotations == rhs.annotations)||((this.annotations!= null)&&this.annotations.equals(rhs.annotations))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.conditions == rhs.conditions)||((this.conditions!= null)&&this.conditions.equals(rhs.conditions))))&&((this.observedGeneration == rhs.observedGeneration)||((this.observedGeneration!= null)&&this.observedGeneration.equals(rhs.observedGeneration))))&&((this.refSource == rhs.refSource)||((this.refSource!= null)&&this.refSource.equals(rhs.refSource))));
    }

}
