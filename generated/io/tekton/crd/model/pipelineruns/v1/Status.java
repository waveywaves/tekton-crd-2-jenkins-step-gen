
package io.tekton.crd.model.pipelineruns.v1;

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
 * PipelineRunStatus defines the observed state of PipelineRun
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "annotations",
    "childReferences",
    "completionTime",
    "conditions",
    "finallyStartTime",
    "observedGeneration",
    "pipelineSpec",
    "provenance",
    "results",
    "skippedTasks",
    "spanContext",
    "startTime"
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
    private Annotations__1 annotations;
    /**
     * list of TaskRun and Run names, PipelineTask names, and API versions/kinds for children of this PipelineRun.
     * 
     */
    @JsonProperty("childReferences")
    @JsonPropertyDescription("list of TaskRun and Run names, PipelineTask names, and API versions/kinds for children of this PipelineRun.")
    @Valid
    private List<ChildReference> childReferences = new ArrayList<ChildReference>();
    /**
     * CompletionTime is the time the PipelineRun completed.
     * 
     */
    @JsonProperty("completionTime")
    @JsonPropertyDescription("CompletionTime is the time the PipelineRun completed.")
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
     * FinallyStartTime is when all non-finally tasks have been completed and only finally tasks are being executed.
     * 
     */
    @JsonProperty("finallyStartTime")
    @JsonPropertyDescription("FinallyStartTime is when all non-finally tasks have been completed and only finally tasks are being executed.")
    private Date finallyStartTime;
    /**
     * ObservedGeneration is the 'Generation' of the Service that
     * was last processed by the controller.
     * 
     */
    @JsonProperty("observedGeneration")
    @JsonPropertyDescription("ObservedGeneration is the 'Generation' of the Service that\nwas last processed by the controller.")
    private Integer observedGeneration;
    /**
     * PipelineSpec contains the exact spec used to instantiate the run.
     * See Pipeline.spec (API version: tekton.dev/v1)
     * 
     */
    @JsonProperty("pipelineSpec")
    @JsonPropertyDescription("PipelineSpec contains the exact spec used to instantiate the run.\nSee Pipeline.spec (API version: tekton.dev/v1)")
    private Object pipelineSpec;
    /**
     * Provenance contains some key authenticated metadata about how a software artifact was built (what sources, what inputs/outputs, etc.).
     * 
     */
    @JsonProperty("provenance")
    @JsonPropertyDescription("Provenance contains some key authenticated metadata about how a software artifact was built (what sources, what inputs/outputs, etc.).")
    @Valid
    private Provenance provenance;
    /**
     * Results are the list of results written out by the pipeline task's containers
     * 
     */
    @JsonProperty("results")
    @JsonPropertyDescription("Results are the list of results written out by the pipeline task's containers")
    @Valid
    private List<Result> results = new ArrayList<Result>();
    /**
     * list of tasks that were skipped due to when expressions evaluating to false
     * 
     */
    @JsonProperty("skippedTasks")
    @JsonPropertyDescription("list of tasks that were skipped due to when expressions evaluating to false")
    @Valid
    private List<SkippedTask> skippedTasks = new ArrayList<SkippedTask>();
    /**
     * SpanContext contains tracing span context fields
     * 
     */
    @JsonProperty("spanContext")
    @JsonPropertyDescription("SpanContext contains tracing span context fields")
    @Valid
    private SpanContext spanContext;
    /**
     * StartTime is the time the PipelineRun is actually started.
     * 
     */
    @JsonProperty("startTime")
    @JsonPropertyDescription("StartTime is the time the PipelineRun is actually started.")
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
    public Annotations__1 getAnnotations() {
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
    public void setAnnotations(Annotations__1 annotations) {
        this.annotations = annotations;
    }

    public Status withAnnotations(Annotations__1 annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * list of TaskRun and Run names, PipelineTask names, and API versions/kinds for children of this PipelineRun.
     * 
     */
    @JsonProperty("childReferences")
    public List<ChildReference> getChildReferences() {
        return childReferences;
    }

    /**
     * list of TaskRun and Run names, PipelineTask names, and API versions/kinds for children of this PipelineRun.
     * 
     */
    @JsonProperty("childReferences")
    public void setChildReferences(List<ChildReference> childReferences) {
        this.childReferences = childReferences;
    }

    public Status withChildReferences(List<ChildReference> childReferences) {
        this.childReferences = childReferences;
        return this;
    }

    /**
     * CompletionTime is the time the PipelineRun completed.
     * 
     */
    @JsonProperty("completionTime")
    public Date getCompletionTime() {
        return completionTime;
    }

    /**
     * CompletionTime is the time the PipelineRun completed.
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
     * FinallyStartTime is when all non-finally tasks have been completed and only finally tasks are being executed.
     * 
     */
    @JsonProperty("finallyStartTime")
    public Date getFinallyStartTime() {
        return finallyStartTime;
    }

    /**
     * FinallyStartTime is when all non-finally tasks have been completed and only finally tasks are being executed.
     * 
     */
    @JsonProperty("finallyStartTime")
    public void setFinallyStartTime(Date finallyStartTime) {
        this.finallyStartTime = finallyStartTime;
    }

    public Status withFinallyStartTime(Date finallyStartTime) {
        this.finallyStartTime = finallyStartTime;
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
     * PipelineSpec contains the exact spec used to instantiate the run.
     * See Pipeline.spec (API version: tekton.dev/v1)
     * 
     */
    @JsonProperty("pipelineSpec")
    public Object getPipelineSpec() {
        return pipelineSpec;
    }

    /**
     * PipelineSpec contains the exact spec used to instantiate the run.
     * See Pipeline.spec (API version: tekton.dev/v1)
     * 
     */
    @JsonProperty("pipelineSpec")
    public void setPipelineSpec(Object pipelineSpec) {
        this.pipelineSpec = pipelineSpec;
    }

    public Status withPipelineSpec(Object pipelineSpec) {
        this.pipelineSpec = pipelineSpec;
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
     * Results are the list of results written out by the pipeline task's containers
     * 
     */
    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    /**
     * Results are the list of results written out by the pipeline task's containers
     * 
     */
    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Status withResults(List<Result> results) {
        this.results = results;
        return this;
    }

    /**
     * list of tasks that were skipped due to when expressions evaluating to false
     * 
     */
    @JsonProperty("skippedTasks")
    public List<SkippedTask> getSkippedTasks() {
        return skippedTasks;
    }

    /**
     * list of tasks that were skipped due to when expressions evaluating to false
     * 
     */
    @JsonProperty("skippedTasks")
    public void setSkippedTasks(List<SkippedTask> skippedTasks) {
        this.skippedTasks = skippedTasks;
    }

    public Status withSkippedTasks(List<SkippedTask> skippedTasks) {
        this.skippedTasks = skippedTasks;
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
     * StartTime is the time the PipelineRun is actually started.
     * 
     */
    @JsonProperty("startTime")
    public Date getStartTime() {
        return startTime;
    }

    /**
     * StartTime is the time the PipelineRun is actually started.
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
        sb.append("childReferences");
        sb.append('=');
        sb.append(((this.childReferences == null)?"<null>":this.childReferences));
        sb.append(',');
        sb.append("completionTime");
        sb.append('=');
        sb.append(((this.completionTime == null)?"<null>":this.completionTime));
        sb.append(',');
        sb.append("conditions");
        sb.append('=');
        sb.append(((this.conditions == null)?"<null>":this.conditions));
        sb.append(',');
        sb.append("finallyStartTime");
        sb.append('=');
        sb.append(((this.finallyStartTime == null)?"<null>":this.finallyStartTime));
        sb.append(',');
        sb.append("observedGeneration");
        sb.append('=');
        sb.append(((this.observedGeneration == null)?"<null>":this.observedGeneration));
        sb.append(',');
        sb.append("pipelineSpec");
        sb.append('=');
        sb.append(((this.pipelineSpec == null)?"<null>":this.pipelineSpec));
        sb.append(',');
        sb.append("provenance");
        sb.append('=');
        sb.append(((this.provenance == null)?"<null>":this.provenance));
        sb.append(',');
        sb.append("results");
        sb.append('=');
        sb.append(((this.results == null)?"<null>":this.results));
        sb.append(',');
        sb.append("skippedTasks");
        sb.append('=');
        sb.append(((this.skippedTasks == null)?"<null>":this.skippedTasks));
        sb.append(',');
        sb.append("spanContext");
        sb.append('=');
        sb.append(((this.spanContext == null)?"<null>":this.spanContext));
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
        result = ((result* 31)+((this.skippedTasks == null)? 0 :this.skippedTasks.hashCode()));
        result = ((result* 31)+((this.pipelineSpec == null)? 0 :this.pipelineSpec.hashCode()));
        result = ((result* 31)+((this.annotations == null)? 0 :this.annotations.hashCode()));
        result = ((result* 31)+((this.completionTime == null)? 0 :this.completionTime.hashCode()));
        result = ((result* 31)+((this.childReferences == null)? 0 :this.childReferences.hashCode()));
        result = ((result* 31)+((this.provenance == null)? 0 :this.provenance.hashCode()));
        result = ((result* 31)+((this.finallyStartTime == null)? 0 :this.finallyStartTime.hashCode()));
        result = ((result* 31)+((this.spanContext == null)? 0 :this.spanContext.hashCode()));
        result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.conditions == null)? 0 :this.conditions.hashCode()));
        result = ((result* 31)+((this.results == null)? 0 :this.results.hashCode()));
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
        return ((((((((((((((this.skippedTasks == rhs.skippedTasks)||((this.skippedTasks!= null)&&this.skippedTasks.equals(rhs.skippedTasks)))&&((this.pipelineSpec == rhs.pipelineSpec)||((this.pipelineSpec!= null)&&this.pipelineSpec.equals(rhs.pipelineSpec))))&&((this.annotations == rhs.annotations)||((this.annotations!= null)&&this.annotations.equals(rhs.annotations))))&&((this.completionTime == rhs.completionTime)||((this.completionTime!= null)&&this.completionTime.equals(rhs.completionTime))))&&((this.childReferences == rhs.childReferences)||((this.childReferences!= null)&&this.childReferences.equals(rhs.childReferences))))&&((this.provenance == rhs.provenance)||((this.provenance!= null)&&this.provenance.equals(rhs.provenance))))&&((this.finallyStartTime == rhs.finallyStartTime)||((this.finallyStartTime!= null)&&this.finallyStartTime.equals(rhs.finallyStartTime))))&&((this.spanContext == rhs.spanContext)||((this.spanContext!= null)&&this.spanContext.equals(rhs.spanContext))))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.conditions == rhs.conditions)||((this.conditions!= null)&&this.conditions.equals(rhs.conditions))))&&((this.results == rhs.results)||((this.results!= null)&&this.results.equals(rhs.results))))&&((this.observedGeneration == rhs.observedGeneration)||((this.observedGeneration!= null)&&this.observedGeneration.equals(rhs.observedGeneration))));
    }

}
