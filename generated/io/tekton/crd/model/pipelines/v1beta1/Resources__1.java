
package io.tekton.crd.model.pipelines.v1beta1;

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
 * Deprecated: Unused, preserved only for backwards compatibility
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "inputs",
    "outputs"
})
@Generated("jsonschema2pojo")
public class Resources__1 {

    /**
     * Inputs holds the mapping from the PipelineResources declared in
     * DeclaredPipelineResources to the input PipelineResources required by the Task.
     * 
     */
    @JsonProperty("inputs")
    @JsonPropertyDescription("Inputs holds the mapping from the PipelineResources declared in\nDeclaredPipelineResources to the input PipelineResources required by the Task.")
    @Valid
    private List<Input__1> inputs = new ArrayList<Input__1>();
    /**
     * Outputs holds the mapping from the PipelineResources declared in
     * DeclaredPipelineResources to the input PipelineResources required by the Task.
     * 
     */
    @JsonProperty("outputs")
    @JsonPropertyDescription("Outputs holds the mapping from the PipelineResources declared in\nDeclaredPipelineResources to the input PipelineResources required by the Task.")
    @Valid
    private List<Output__1> outputs = new ArrayList<Output__1>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Inputs holds the mapping from the PipelineResources declared in
     * DeclaredPipelineResources to the input PipelineResources required by the Task.
     * 
     */
    @JsonProperty("inputs")
    public List<Input__1> getInputs() {
        return inputs;
    }

    /**
     * Inputs holds the mapping from the PipelineResources declared in
     * DeclaredPipelineResources to the input PipelineResources required by the Task.
     * 
     */
    @JsonProperty("inputs")
    public void setInputs(List<Input__1> inputs) {
        this.inputs = inputs;
    }

    public Resources__1 withInputs(List<Input__1> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * Outputs holds the mapping from the PipelineResources declared in
     * DeclaredPipelineResources to the input PipelineResources required by the Task.
     * 
     */
    @JsonProperty("outputs")
    public List<Output__1> getOutputs() {
        return outputs;
    }

    /**
     * Outputs holds the mapping from the PipelineResources declared in
     * DeclaredPipelineResources to the input PipelineResources required by the Task.
     * 
     */
    @JsonProperty("outputs")
    public void setOutputs(List<Output__1> outputs) {
        this.outputs = outputs;
    }

    public Resources__1 withOutputs(List<Output__1> outputs) {
        this.outputs = outputs;
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

    public Resources__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Resources__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("inputs");
        sb.append('=');
        sb.append(((this.inputs == null)?"<null>":this.inputs));
        sb.append(',');
        sb.append("outputs");
        sb.append('=');
        sb.append(((this.outputs == null)?"<null>":this.outputs));
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
        result = ((result* 31)+((this.outputs == null)? 0 :this.outputs.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.inputs == null)? 0 :this.inputs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resources__1) == false) {
            return false;
        }
        Resources__1 rhs = ((Resources__1) other);
        return ((((this.outputs == rhs.outputs)||((this.outputs!= null)&&this.outputs.equals(rhs.outputs)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.inputs == rhs.inputs)||((this.inputs!= null)&&this.inputs.equals(rhs.inputs))));
    }

}
