
package io.tekton.crd.model.taskruns.v1beta1;

import java.util.ArrayList;
import java.util.Date;
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
 * TaskRunStatus defines the observed state of TaskRun
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "annotations",
    "cloudEvents",
    "completionTime",
    "conditions",
    "observedGeneration",
    "podName",
    "provenance",
    "resourcesResult",
    "retriesStatus",
    "sidecars",
    "spanContext",
    "startTime",
    "steps",
    "taskResults",
    "taskSpec"
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
     * CloudEvents describe the state of each cloud event requested via a
     * CloudEventResource.
     * 
     * Deprecated: Removed in v0.44.0.
     * 
     */
    @JsonProperty("cloudEvents")
    @JsonPropertyDescription("CloudEvents describe the state of each cloud event requested via a\nCloudEventResource.\n\nDeprecated: Removed in v0.44.0.")
    @Valid
    private List<CloudEvent> cloudEvents = new ArrayList<CloudEvent>();
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
    private List<Condition> conditions = new ArrayList<Condition>();
    /**
     * ObservedGeneration is the 'Generation' of the Service that
     * was last processed by the controller.
     * 
     */
    @JsonProperty("observedGeneration")
    @JsonPropertyDescription("ObservedGeneration is the 'Generation' of the Service that\nwas last processed by the controller.")
    private Integer observedGeneration;
    /**
     * PodName is the name of the pod responsible for executing this task's steps.
     * (Required)
     * 
     */
    @JsonProperty("podName")
    @JsonPropertyDescription("PodName is the name of the pod responsible for executing this task's steps.")
    @NotNull
    private String podName;
    /**
     * Provenance contains some key authenticated metadata about how a software artifact was built (what sources, what inputs/outputs, etc.).
     * 
     */
    @JsonProperty("provenance")
    @JsonPropertyDescription("Provenance contains some key authenticated metadata about how a software artifact was built (what sources, what inputs/outputs, etc.).")
    @Valid
    private Provenance provenance;
    /**
     * Results from Resources built during the TaskRun.
     * This is tomb-stoned along with the removal of pipelineResources
     * Deprecated: this field is not populated and is preserved only for backwards compatibility
     * 
     */
    @JsonProperty("resourcesResult")
    @JsonPropertyDescription("Results from Resources built during the TaskRun.\nThis is tomb-stoned along with the removal of pipelineResources\nDeprecated: this field is not populated and is preserved only for backwards compatibility")
    @Valid
    private List<ResourcesResult> resourcesResult = new ArrayList<ResourcesResult>();
    /**
     * RetriesStatus contains the history of TaskRunStatus in case of a retry in order to keep record of failures.
     * All TaskRunStatus stored in RetriesStatus will have no date within the RetriesStatus as is redundant.
     * See TaskRun.status (API version: tekton.dev/v1beta1)
     * 
     */
    @JsonProperty("retriesStatus")
    @JsonPropertyDescription("RetriesStatus contains the history of TaskRunStatus in case of a retry in order to keep record of failures.\nAll TaskRunStatus stored in RetriesStatus will have no date within the RetriesStatus as is redundant.\nSee TaskRun.status (API version: tekton.dev/v1beta1)")
    private Object retriesStatus;
    /**
     * The list has one entry per sidecar in the manifest. Each entry is
     * represents the imageid of the corresponding sidecar.
     * 
     */
    @JsonProperty("sidecars")
    @JsonPropertyDescription("The list has one entry per sidecar in the manifest. Each entry is\nrepresents the imageid of the corresponding sidecar.")
    @Valid
    private List<Sidecar> sidecars = new ArrayList<Sidecar>();
    /**
     * SpanContext contains tracing span context fields
     * 
     */
    @JsonProperty("spanContext")
    @JsonPropertyDescription("SpanContext contains tracing span context fields")
    @Valid
    private SpanContext spanContext;
    /**
     * StartTime is the time the build is actually started.
     * 
     */
    @JsonProperty("startTime")
    @JsonPropertyDescription("StartTime is the time the build is actually started.")
    private Date startTime;
    /**
     * Steps describes the state of each build step container.
     * 
     */
    @JsonProperty("steps")
    @JsonPropertyDescription("Steps describes the state of each build step container.")
    @Valid
    private List<Step> steps = new ArrayList<Step>();
    /**
     * TaskRunResults are the list of results written out by the task's containers
     * 
     */
    @JsonProperty("taskResults")
    @JsonPropertyDescription("TaskRunResults are the list of results written out by the task's containers")
    @Valid
    private List<TaskResult> taskResults = new ArrayList<TaskResult>();
    /**
     * TaskSpec contains the Spec from the dereferenced Task definition used to instantiate this TaskRun.
     * See Task.spec (API version tekton.dev/v1beta1)
     * 
     */
    @JsonProperty("taskSpec")
    @JsonPropertyDescription("TaskSpec contains the Spec from the dereferenced Task definition used to instantiate this TaskRun.\nSee Task.spec (API version tekton.dev/v1beta1)")
    private Object taskSpec;
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
     * CloudEvents describe the state of each cloud event requested via a
     * CloudEventResource.
     * 
     * Deprecated: Removed in v0.44.0.
     * 
     */
    @JsonProperty("cloudEvents")
    public List<CloudEvent> getCloudEvents() {
        return cloudEvents;
    }

    /**
     * CloudEvents describe the state of each cloud event requested via a
     * CloudEventResource.
     * 
     * Deprecated: Removed in v0.44.0.
     * 
     */
    @JsonProperty("cloudEvents")
    public void setCloudEvents(List<CloudEvent> cloudEvents) {
        this.cloudEvents = cloudEvents;
    }

    public Status withCloudEvents(List<CloudEvent> cloudEvents) {
        this.cloudEvents = cloudEvents;
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

    public Status withCompletionTime(Date completionTime) {
        this.completionTime = completionTime;
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
     * PodName is the name of the pod responsible for executing this task's steps.
     * (Required)
     * 
     */
    @JsonProperty("podName")
    public String getPodName() {
        return podName;
    }

    /**
     * PodName is the name of the pod responsible for executing this task's steps.
     * (Required)
     * 
     */
    @JsonProperty("podName")
    public void setPodName(String podName) {
        this.podName = podName;
    }

    public Status withPodName(String podName) {
        this.podName = podName;
        return this;
    }

    /**
     * Provenance contains some key authenticated metadata about how a software artifact was built (what sources, what inputs/outputs, etc.).
     * 
     */
    @JsonProperty("provenance")
    public Provenance getProvenance() {
        return provenance;
    }

    /**
     * Provenance contains some key authenticated metadata about how a software artifact was built (what sources, what inputs/outputs, etc.).
     * 
     */
    @JsonProperty("provenance")
    public void setProvenance(Provenance provenance) {
        this.provenance = provenance;
    }

    public Status withProvenance(Provenance provenance) {
        this.provenance = provenance;
        return this;
    }

    /**
     * Results from Resources built during the TaskRun.
     * This is tomb-stoned along with the removal of pipelineResources
     * Deprecated: this field is not populated and is preserved only for backwards compatibility
     * 
     */
    @JsonProperty("resourcesResult")
    public List<ResourcesResult> getResourcesResult() {
        return resourcesResult;
    }

    /**
     * Results from Resources built during the TaskRun.
     * This is tomb-stoned along with the removal of pipelineResources
     * Deprecated: this field is not populated and is preserved only for backwards compatibility
     * 
     */
    @JsonProperty("resourcesResult")
    public void setResourcesResult(List<ResourcesResult> resourcesResult) {
        this.resourcesResult = resourcesResult;
    }

    public Status withResourcesResult(List<ResourcesResult> resourcesResult) {
        this.resourcesResult = resourcesResult;
        return this;
    }

    /**
     * RetriesStatus contains the history of TaskRunStatus in case of a retry in order to keep record of failures.
     * All TaskRunStatus stored in RetriesStatus will have no date within the RetriesStatus as is redundant.
     * See TaskRun.status (API version: tekton.dev/v1beta1)
     * 
     */
    @JsonProperty("retriesStatus")
    public Object getRetriesStatus() {
        return retriesStatus;
    }

    /**
     * RetriesStatus contains the history of TaskRunStatus in case of a retry in order to keep record of failures.
     * All TaskRunStatus stored in RetriesStatus will have no date within the RetriesStatus as is redundant.
     * See TaskRun.status (API version: tekton.dev/v1beta1)
     * 
     */
    @JsonProperty("retriesStatus")
    public void setRetriesStatus(Object retriesStatus) {
        this.retriesStatus = retriesStatus;
    }

    public Status withRetriesStatus(Object retriesStatus) {
        this.retriesStatus = retriesStatus;
        return this;
    }

    /**
     * The list has one entry per sidecar in the manifest. Each entry is
     * represents the imageid of the corresponding sidecar.
     * 
     */
    @JsonProperty("sidecars")
    public List<Sidecar> getSidecars() {
        return sidecars;
    }

    /**
     * The list has one entry per sidecar in the manifest. Each entry is
     * represents the imageid of the corresponding sidecar.
     * 
     */
    @JsonProperty("sidecars")
    public void setSidecars(List<Sidecar> sidecars) {
        this.sidecars = sidecars;
    }

    public Status withSidecars(List<Sidecar> sidecars) {
        this.sidecars = sidecars;
        return this;
    }

    /**
     * SpanContext contains tracing span context fields
     * 
     */
    @JsonProperty("spanContext")
    public SpanContext getSpanContext() {
        return spanContext;
    }

    /**
     * SpanContext contains tracing span context fields
     * 
     */
    @JsonProperty("spanContext")
    public void setSpanContext(SpanContext spanContext) {
        this.spanContext = spanContext;
    }

    public Status withSpanContext(SpanContext spanContext) {
        this.spanContext = spanContext;
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

    public Status withStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Steps describes the state of each build step container.
     * 
     */
    @JsonProperty("steps")
    public List<Step> getSteps() {
        return steps;
    }

    /**
     * Steps describes the state of each build step container.
     * 
     */
    @JsonProperty("steps")
    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public Status withSteps(List<Step> steps) {
        this.steps = steps;
        return this;
    }

    /**
     * TaskRunResults are the list of results written out by the task's containers
     * 
     */
    @JsonProperty("taskResults")
    public List<TaskResult> getTaskResults() {
        return taskResults;
    }

    /**
     * TaskRunResults are the list of results written out by the task's containers
     * 
     */
    @JsonProperty("taskResults")
    public void setTaskResults(List<TaskResult> taskResults) {
        this.taskResults = taskResults;
    }

    public Status withTaskResults(List<TaskResult> taskResults) {
        this.taskResults = taskResults;
        return this;
    }

    /**
     * TaskSpec contains the Spec from the dereferenced Task definition used to instantiate this TaskRun.
     * See Task.spec (API version tekton.dev/v1beta1)
     * 
     */
    @JsonProperty("taskSpec")
    public Object getTaskSpec() {
        return taskSpec;
    }

    /**
     * TaskSpec contains the Spec from the dereferenced Task definition used to instantiate this TaskRun.
     * See Task.spec (API version tekton.dev/v1beta1)
     * 
     */
    @JsonProperty("taskSpec")
    public void setTaskSpec(Object taskSpec) {
        this.taskSpec = taskSpec;
    }

    public Status withTaskSpec(Object taskSpec) {
        this.taskSpec = taskSpec;
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
        sb.append("cloudEvents");
        sb.append('=');
        sb.append(((this.cloudEvents == null)?"<null>":this.cloudEvents));
        sb.append(',');
        sb.append("completionTime");
        sb.append('=');
        sb.append(((this.completionTime == null)?"<null>":this.completionTime));
        sb.append(',');
        sb.append("conditions");
        sb.append('=');
        sb.append(((this.conditions == null)?"<null>":this.conditions));
        sb.append(',');
        sb.append("observedGeneration");
        sb.append('=');
        sb.append(((this.observedGeneration == null)?"<null>":this.observedGeneration));
        sb.append(',');
        sb.append("podName");
        sb.append('=');
        sb.append(((this.podName == null)?"<null>":this.podName));
        sb.append(',');
        sb.append("provenance");
        sb.append('=');
        sb.append(((this.provenance == null)?"<null>":this.provenance));
        sb.append(',');
        sb.append("resourcesResult");
        sb.append('=');
        sb.append(((this.resourcesResult == null)?"<null>":this.resourcesResult));
        sb.append(',');
        sb.append("retriesStatus");
        sb.append('=');
        sb.append(((this.retriesStatus == null)?"<null>":this.retriesStatus));
        sb.append(',');
        sb.append("sidecars");
        sb.append('=');
        sb.append(((this.sidecars == null)?"<null>":this.sidecars));
        sb.append(',');
        sb.append("spanContext");
        sb.append('=');
        sb.append(((this.spanContext == null)?"<null>":this.spanContext));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
        sb.append(',');
        sb.append("steps");
        sb.append('=');
        sb.append(((this.steps == null)?"<null>":this.steps));
        sb.append(',');
        sb.append("taskResults");
        sb.append('=');
        sb.append(((this.taskResults == null)?"<null>":this.taskResults));
        sb.append(',');
        sb.append("taskSpec");
        sb.append('=');
        sb.append(((this.taskSpec == null)?"<null>":this.taskSpec));
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
        result = ((result* 31)+((this.sidecars == null)? 0 :this.sidecars.hashCode()));
        result = ((result* 31)+((this.taskResults == null)? 0 :this.taskResults.hashCode()));
        result = ((result* 31)+((this.annotations == null)? 0 :this.annotations.hashCode()));
        result = ((result* 31)+((this.steps == null)? 0 :this.steps.hashCode()));
        result = ((result* 31)+((this.taskSpec == null)? 0 :this.taskSpec.hashCode()));
        result = ((result* 31)+((this.cloudEvents == null)? 0 :this.cloudEvents.hashCode()));
        result = ((result* 31)+((this.completionTime == null)? 0 :this.completionTime.hashCode()));
        result = ((result* 31)+((this.provenance == null)? 0 :this.provenance.hashCode()));
        result = ((result* 31)+((this.retriesStatus == null)? 0 :this.retriesStatus.hashCode()));
        result = ((result* 31)+((this.podName == null)? 0 :this.podName.hashCode()));
        result = ((result* 31)+((this.spanContext == null)? 0 :this.spanContext.hashCode()));
        result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.conditions == null)? 0 :this.conditions.hashCode()));
        result = ((result* 31)+((this.resourcesResult == null)? 0 :this.resourcesResult.hashCode()));
        result = ((result* 31)+((this.observedGeneration == null)? 0 :this.observedGeneration.hashCode()));
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
        return (((((((((((((((((this.sidecars == rhs.sidecars)||((this.sidecars!= null)&&this.sidecars.equals(rhs.sidecars)))&&((this.taskResults == rhs.taskResults)||((this.taskResults!= null)&&this.taskResults.equals(rhs.taskResults))))&&((this.annotations == rhs.annotations)||((this.annotations!= null)&&this.annotations.equals(rhs.annotations))))&&((this.steps == rhs.steps)||((this.steps!= null)&&this.steps.equals(rhs.steps))))&&((this.taskSpec == rhs.taskSpec)||((this.taskSpec!= null)&&this.taskSpec.equals(rhs.taskSpec))))&&((this.cloudEvents == rhs.cloudEvents)||((this.cloudEvents!= null)&&this.cloudEvents.equals(rhs.cloudEvents))))&&((this.completionTime == rhs.completionTime)||((this.completionTime!= null)&&this.completionTime.equals(rhs.completionTime))))&&((this.provenance == rhs.provenance)||((this.provenance!= null)&&this.provenance.equals(rhs.provenance))))&&((this.retriesStatus == rhs.retriesStatus)||((this.retriesStatus!= null)&&this.retriesStatus.equals(rhs.retriesStatus))))&&((this.podName == rhs.podName)||((this.podName!= null)&&this.podName.equals(rhs.podName))))&&((this.spanContext == rhs.spanContext)||((this.spanContext!= null)&&this.spanContext.equals(rhs.spanContext))))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.conditions == rhs.conditions)||((this.conditions!= null)&&this.conditions.equals(rhs.conditions))))&&((this.resourcesResult == rhs.resourcesResult)||((this.resourcesResult!= null)&&this.resourcesResult.equals(rhs.resourcesResult))))&&((this.observedGeneration == rhs.observedGeneration)||((this.observedGeneration!= null)&&this.observedGeneration.equals(rhs.observedGeneration))));
    }

}
