
package io.tekton.crd.model.pipelineruns.v1beta1;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
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
 * Status is the CustomRunStatus for the corresponding CustomRun or Run
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "annotations",
    "completionTime",
    "conditions",
    "extraFields",
    "observedGeneration",
    "results",
    "retriesStatus",
    "startTime"
})
@Generated("jsonschema2pojo")
public class Status__1 {

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
    private Annotations__2 annotations;
    /**
     * CompletionTime is the time the build completed.
     * 
     */
    @JsonProperty("completionTime")
    @JsonPropertyDescription("CompletionTime is the time the build completed.")
    private Date completionTime;
    /**
     * Conditions the latest available observations of a resource's current state.
     * 
     */
    @JsonProperty("conditions")
    @JsonPropertyDescription("Conditions the latest available observations of a resource's current state.")
    @Valid
    private List<Condition__1> conditions = new ArrayList<Condition__1>();
    /**
     * ExtraFields holds arbitrary fields provided by the custom task
     * controller.
     * 
     */
    @JsonProperty("extraFields")
    @JsonPropertyDescription("ExtraFields holds arbitrary fields provided by the custom task\ncontroller.")
    private Object extraFields;
    /**
     * ObservedGeneration is the 'Generation' of the Service that
     * was last processed by the controller.
     * 
     */
    @JsonProperty("observedGeneration")
    @JsonPropertyDescription("ObservedGeneration is the 'Generation' of the Service that\nwas last processed by the controller.")
    private Integer observedGeneration;
    /**
     * Results reports any output result values to be consumed by later
     * tasks in a pipeline.
     * 
     */
    @JsonProperty("results")
    @JsonPropertyDescription("Results reports any output result values to be consumed by later\ntasks in a pipeline.")
    @Valid
    private List<Result> results = new ArrayList<Result>();
    /**
     * RetriesStatus contains the history of CustomRunStatus, in case of a retry.
     * See CustomRun.status (API version: tekton.dev/v1beta1)
     * 
     */
    @JsonProperty("retriesStatus")
    @JsonPropertyDescription("RetriesStatus contains the history of CustomRunStatus, in case of a retry.\nSee CustomRun.status (API version: tekton.dev/v1beta1)")
    private Object retriesStatus;
    /**
     * StartTime is the time the build is actually started.
     * 
     */
    @JsonProperty("startTime")
    @JsonPropertyDescription("StartTime is the time the build is actually started.")
    private Date startTime;
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
    public Annotations__2 getAnnotations() {
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
    public void setAnnotations(Annotations__2 annotations) {
        this.annotations = annotations;
    }

    public Status__1 withAnnotations(Annotations__2 annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * CompletionTime is the time the build completed.
     * 
     */
    @JsonProperty("completionTime")
    public Date getCompletionTime() {
        return completionTime;
    }

    /**
     * CompletionTime is the time the build completed.
     * 
     */
    @JsonProperty("completionTime")
    public void setCompletionTime(Date completionTime) {
        this.completionTime = completionTime;
    }

    public Status__1 withCompletionTime(Date completionTime) {
        this.completionTime = completionTime;
        return this;
    }

    /**
     * Conditions the latest available observations of a resource's current state.
     * 
     */
    @JsonProperty("conditions")
    public List<Condition__1> getConditions() {
        return conditions;
    }

    /**
     * Conditions the latest available observations of a resource's current state.
     * 
     */
    @JsonProperty("conditions")
    public void setConditions(List<Condition__1> conditions) {
        this.conditions = conditions;
    }

    public Status__1 withConditions(List<Condition__1> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * ExtraFields holds arbitrary fields provided by the custom task
     * controller.
     * 
     */
    @JsonProperty("extraFields")
    public Object getExtraFields() {
        return extraFields;
    }

    /**
     * ExtraFields holds arbitrary fields provided by the custom task
     * controller.
     * 
     */
    @JsonProperty("extraFields")
    public void setExtraFields(Object extraFields) {
        this.extraFields = extraFields;
    }

    public Status__1 withExtraFields(Object extraFields) {
        this.extraFields = extraFields;
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

    public Status__1 withObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    /**
     * Results reports any output result values to be consumed by later
     * tasks in a pipeline.
     * 
     */
    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    /**
     * Results reports any output result values to be consumed by later
     * tasks in a pipeline.
     * 
     */
    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Status__1 withResults(List<Result> results) {
        this.results = results;
        return this;
    }

    /**
     * RetriesStatus contains the history of CustomRunStatus, in case of a retry.
     * See CustomRun.status (API version: tekton.dev/v1beta1)
     * 
     */
    @JsonProperty("retriesStatus")
    public Object getRetriesStatus() {
        return retriesStatus;
    }

    /**
     * RetriesStatus contains the history of CustomRunStatus, in case of a retry.
     * See CustomRun.status (API version: tekton.dev/v1beta1)
     * 
     */
    @JsonProperty("retriesStatus")
    public void setRetriesStatus(Object retriesStatus) {
        this.retriesStatus = retriesStatus;
    }

    public Status__1 withRetriesStatus(Object retriesStatus) {
        this.retriesStatus = retriesStatus;
        return this;
    }

    /**
     * StartTime is the time the build is actually started.
     * 
     */
    @JsonProperty("startTime")
    public Date getStartTime() {
        return startTime;
    }

    /**
     * StartTime is the time the build is actually started.
     * 
     */
    @JsonProperty("startTime")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Status__1 withStartTime(Date startTime) {
        this.startTime = startTime;
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

    public Status__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Status__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("annotations");
        sb.append('=');
        sb.append(((this.annotations == null)?"<null>":this.annotations));
        sb.append(',');
        sb.append("completionTime");
        sb.append('=');
        sb.append(((this.completionTime == null)?"<null>":this.completionTime));
        sb.append(',');
        sb.append("conditions");
        sb.append('=');
        sb.append(((this.conditions == null)?"<null>":this.conditions));
        sb.append(',');
        sb.append("extraFields");
        sb.append('=');
        sb.append(((this.extraFields == null)?"<null>":this.extraFields));
        sb.append(',');
        sb.append("observedGeneration");
        sb.append('=');
        sb.append(((this.observedGeneration == null)?"<null>":this.observedGeneration));
        sb.append(',');
        sb.append("results");
        sb.append('=');
        sb.append(((this.results == null)?"<null>":this.results));
        sb.append(',');
        sb.append("retriesStatus");
        sb.append('=');
        sb.append(((this.retriesStatus == null)?"<null>":this.retriesStatus));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
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
        result = ((result* 31)+((this.completionTime == null)? 0 :this.completionTime.hashCode()));
        result = ((result* 31)+((this.retriesStatus == null)? 0 :this.retriesStatus.hashCode()));
        result = ((result* 31)+((this.annotations == null)? 0 :this.annotations.hashCode()));
        result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.conditions == null)? 0 :this.conditions.hashCode()));
        result = ((result* 31)+((this.results == null)? 0 :this.results.hashCode()));
        result = ((result* 31)+((this.observedGeneration == null)? 0 :this.observedGeneration.hashCode()));
        result = ((result* 31)+((this.extraFields == null)? 0 :this.extraFields.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Status__1) == false) {
            return false;
        }
        Status__1 rhs = ((Status__1) other);
        return ((((((((((this.completionTime == rhs.completionTime)||((this.completionTime!= null)&&this.completionTime.equals(rhs.completionTime)))&&((this.retriesStatus == rhs.retriesStatus)||((this.retriesStatus!= null)&&this.retriesStatus.equals(rhs.retriesStatus))))&&((this.annotations == rhs.annotations)||((this.annotations!= null)&&this.annotations.equals(rhs.annotations))))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.conditions == rhs.conditions)||((this.conditions!= null)&&this.conditions.equals(rhs.conditions))))&&((this.results == rhs.results)||((this.results!= null)&&this.results.equals(rhs.results))))&&((this.observedGeneration == rhs.observedGeneration)||((this.observedGeneration!= null)&&this.observedGeneration.equals(rhs.observedGeneration))))&&((this.extraFields == rhs.extraFields)||((this.extraFields!= null)&&this.extraFields.equals(rhs.extraFields))));
    }

}
