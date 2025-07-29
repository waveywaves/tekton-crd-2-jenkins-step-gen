
package io.tekton.crd.model.taskruns.v1;

import java.util.ArrayList;
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
 * StepState reports the results of running a step in a Task.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "container",
    "imageID",
    "inputs",
    "name",
    "outputs",
    "provenance",
    "results",
    "running",
    "terminated",
    "terminationReason",
    "waiting"
})
@Generated("jsonschema2pojo")
public class Step {

    @JsonProperty("container")
    private String container;
    @JsonProperty("imageID")
    private String imageID;
    @JsonProperty("inputs")
    @Valid
    private List<Input__1> inputs = new ArrayList<Input__1>();
    @JsonProperty("name")
    private String name;
    @JsonProperty("outputs")
    @Valid
    private List<Output__1> outputs = new ArrayList<Output__1>();
    /**
     * Provenance contains metadata about resources used in the TaskRun/PipelineRun
     * such as the source from where a remote build definition was fetched.
     * This field aims to carry minimum amoumt of metadata in *Run status so that
     * Tekton Chains can capture them in the provenance.
     * 
     */
    @JsonProperty("provenance")
    @JsonPropertyDescription("Provenance contains metadata about resources used in the TaskRun/PipelineRun\nsuch as the source from where a remote build definition was fetched.\nThis field aims to carry minimum amoumt of metadata in *Run status so that\nTekton Chains can capture them in the provenance.")
    @Valid
    private Provenance__1 provenance;
    @JsonProperty("results")
    @Valid
    private List<Result__1> results = new ArrayList<Result__1>();
    /**
     * Details about a running container
     * 
     */
    @JsonProperty("running")
    @JsonPropertyDescription("Details about a running container")
    @Valid
    private Running__1 running;
    /**
     * Details about a terminated container
     * 
     */
    @JsonProperty("terminated")
    @JsonPropertyDescription("Details about a terminated container")
    @Valid
    private Terminated__1 terminated;
    @JsonProperty("terminationReason")
    private String terminationReason;
    /**
     * Details about a waiting container
     * 
     */
    @JsonProperty("waiting")
    @JsonPropertyDescription("Details about a waiting container")
    @Valid
    private Waiting__1 waiting;
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

    public Step withContainer(String container) {
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

    public Step withImageID(String imageID) {
        this.imageID = imageID;
        return this;
    }

    @JsonProperty("inputs")
    public List<Input__1> getInputs() {
        return inputs;
    }

    @JsonProperty("inputs")
    public void setInputs(List<Input__1> inputs) {
        this.inputs = inputs;
    }

    public Step withInputs(List<Input__1> inputs) {
        this.inputs = inputs;
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

    public Step withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("outputs")
    public List<Output__1> getOutputs() {
        return outputs;
    }

    @JsonProperty("outputs")
    public void setOutputs(List<Output__1> outputs) {
        this.outputs = outputs;
    }

    public Step withOutputs(List<Output__1> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * Provenance contains metadata about resources used in the TaskRun/PipelineRun
     * such as the source from where a remote build definition was fetched.
     * This field aims to carry minimum amoumt of metadata in *Run status so that
     * Tekton Chains can capture them in the provenance.
     * 
     */
    @JsonProperty("provenance")
    public Provenance__1 getProvenance() {
        return provenance;
    }

    /**
     * Provenance contains metadata about resources used in the TaskRun/PipelineRun
     * such as the source from where a remote build definition was fetched.
     * This field aims to carry minimum amoumt of metadata in *Run status so that
     * Tekton Chains can capture them in the provenance.
     * 
     */
    @JsonProperty("provenance")
    public void setProvenance(Provenance__1 provenance) {
        this.provenance = provenance;
    }

    public Step withProvenance(Provenance__1 provenance) {
        this.provenance = provenance;
        return this;
    }

    @JsonProperty("results")
    public List<Result__1> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result__1> results) {
        this.results = results;
    }

    public Step withResults(List<Result__1> results) {
        this.results = results;
        return this;
    }

    /**
     * Details about a running container
     * 
     */
    @JsonProperty("running")
    public Running__1 getRunning() {
        return running;
    }

    /**
     * Details about a running container
     * 
     */
    @JsonProperty("running")
    public void setRunning(Running__1 running) {
        this.running = running;
    }

    public Step withRunning(Running__1 running) {
        this.running = running;
        return this;
    }

    /**
     * Details about a terminated container
     * 
     */
    @JsonProperty("terminated")
    public Terminated__1 getTerminated() {
        return terminated;
    }

    /**
     * Details about a terminated container
     * 
     */
    @JsonProperty("terminated")
    public void setTerminated(Terminated__1 terminated) {
        this.terminated = terminated;
    }

    public Step withTerminated(Terminated__1 terminated) {
        this.terminated = terminated;
        return this;
    }

    @JsonProperty("terminationReason")
    public String getTerminationReason() {
        return terminationReason;
    }

    @JsonProperty("terminationReason")
    public void setTerminationReason(String terminationReason) {
        this.terminationReason = terminationReason;
    }

    public Step withTerminationReason(String terminationReason) {
        this.terminationReason = terminationReason;
        return this;
    }

    /**
     * Details about a waiting container
     * 
     */
    @JsonProperty("waiting")
    public Waiting__1 getWaiting() {
        return waiting;
    }

    /**
     * Details about a waiting container
     * 
     */
    @JsonProperty("waiting")
    public void setWaiting(Waiting__1 waiting) {
        this.waiting = waiting;
    }

    public Step withWaiting(Waiting__1 waiting) {
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

    public Step withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Step.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("container");
        sb.append('=');
        sb.append(((this.container == null)?"<null>":this.container));
        sb.append(',');
        sb.append("imageID");
        sb.append('=');
        sb.append(((this.imageID == null)?"<null>":this.imageID));
        sb.append(',');
        sb.append("inputs");
        sb.append('=');
        sb.append(((this.inputs == null)?"<null>":this.inputs));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("outputs");
        sb.append('=');
        sb.append(((this.outputs == null)?"<null>":this.outputs));
        sb.append(',');
        sb.append("provenance");
        sb.append('=');
        sb.append(((this.provenance == null)?"<null>":this.provenance));
        sb.append(',');
        sb.append("results");
        sb.append('=');
        sb.append(((this.results == null)?"<null>":this.results));
        sb.append(',');
        sb.append("running");
        sb.append('=');
        sb.append(((this.running == null)?"<null>":this.running));
        sb.append(',');
        sb.append("terminated");
        sb.append('=');
        sb.append(((this.terminated == null)?"<null>":this.terminated));
        sb.append(',');
        sb.append("terminationReason");
        sb.append('=');
        sb.append(((this.terminationReason == null)?"<null>":this.terminationReason));
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
        result = ((result* 31)+((this.outputs == null)? 0 :this.outputs.hashCode()));
        result = ((result* 31)+((this.imageID == null)? 0 :this.imageID.hashCode()));
        result = ((result* 31)+((this.waiting == null)? 0 :this.waiting.hashCode()));
        result = ((result* 31)+((this.inputs == null)? 0 :this.inputs.hashCode()));
        result = ((result* 31)+((this.running == null)? 0 :this.running.hashCode()));
        result = ((result* 31)+((this.provenance == null)? 0 :this.provenance.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.results == null)? 0 :this.results.hashCode()));
        result = ((result* 31)+((this.terminated == null)? 0 :this.terminated.hashCode()));
        result = ((result* 31)+((this.terminationReason == null)? 0 :this.terminationReason.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Step) == false) {
            return false;
        }
        Step rhs = ((Step) other);
        return (((((((((((((this.container == rhs.container)||((this.container!= null)&&this.container.equals(rhs.container)))&&((this.outputs == rhs.outputs)||((this.outputs!= null)&&this.outputs.equals(rhs.outputs))))&&((this.imageID == rhs.imageID)||((this.imageID!= null)&&this.imageID.equals(rhs.imageID))))&&((this.waiting == rhs.waiting)||((this.waiting!= null)&&this.waiting.equals(rhs.waiting))))&&((this.inputs == rhs.inputs)||((this.inputs!= null)&&this.inputs.equals(rhs.inputs))))&&((this.running == rhs.running)||((this.running!= null)&&this.running.equals(rhs.running))))&&((this.provenance == rhs.provenance)||((this.provenance!= null)&&this.provenance.equals(rhs.provenance))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.results == rhs.results)||((this.results!= null)&&this.results.equals(rhs.results))))&&((this.terminated == rhs.terminated)||((this.terminated!= null)&&this.terminated.equals(rhs.terminated))))&&((this.terminationReason == rhs.terminationReason)||((this.terminationReason!= null)&&this.terminationReason.equals(rhs.terminationReason))));
    }

}
