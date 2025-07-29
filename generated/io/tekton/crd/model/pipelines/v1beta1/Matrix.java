
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
 * Matrix declares parameters used to fan out this task.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "include",
    "params"
})
@Generated("jsonschema2pojo")
public class Matrix {

    /**
     * Include is a list of IncludeParams which allows passing in specific combinations of Parameters into the Matrix.
     * 
     */
    @JsonProperty("include")
    @JsonPropertyDescription("Include is a list of IncludeParams which allows passing in specific combinations of Parameters into the Matrix.")
    @Valid
    private List<io.tekton.crd.model.pipelines.v1beta1.Include> include = new ArrayList<io.tekton.crd.model.pipelines.v1beta1.Include>();
    /**
     * Params is a list of parameters used to fan out the pipelineTask
     * Params takes only `Parameters` of type `"array"`
     * Each array element is supplied to the `PipelineTask` by substituting `params` of type `"string"` in the underlying `Task`.
     * The names of the `params` in the `Matrix` must match the names of the `params` in the underlying `Task` that they will be substituting.
     * 
     */
    @JsonProperty("params")
    @JsonPropertyDescription("Params is a list of parameters used to fan out the pipelineTask\nParams takes only `Parameters` of type `\"array\"`\nEach array element is supplied to the `PipelineTask` by substituting `params` of type `\"string\"` in the underlying `Task`.\nThe names of the `params` in the `Matrix` must match the names of the `params` in the underlying `Task` that they will be substituting.")
    @Valid
    private List<Param__1> params = new ArrayList<Param__1>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Include is a list of IncludeParams which allows passing in specific combinations of Parameters into the Matrix.
     * 
     */
    @JsonProperty("include")
    public List<io.tekton.crd.model.pipelines.v1beta1.Include> getInclude() {
        return include;
    }

    /**
     * Include is a list of IncludeParams which allows passing in specific combinations of Parameters into the Matrix.
     * 
     */
    @JsonProperty("include")
    public void setInclude(List<io.tekton.crd.model.pipelines.v1beta1.Include> include) {
        this.include = include;
    }

    public Matrix withInclude(List<io.tekton.crd.model.pipelines.v1beta1.Include> include) {
        this.include = include;
        return this;
    }

    /**
     * Params is a list of parameters used to fan out the pipelineTask
     * Params takes only `Parameters` of type `"array"`
     * Each array element is supplied to the `PipelineTask` by substituting `params` of type `"string"` in the underlying `Task`.
     * The names of the `params` in the `Matrix` must match the names of the `params` in the underlying `Task` that they will be substituting.
     * 
     */
    @JsonProperty("params")
    public List<Param__1> getParams() {
        return params;
    }

    /**
     * Params is a list of parameters used to fan out the pipelineTask
     * Params takes only `Parameters` of type `"array"`
     * Each array element is supplied to the `PipelineTask` by substituting `params` of type `"string"` in the underlying `Task`.
     * The names of the `params` in the `Matrix` must match the names of the `params` in the underlying `Task` that they will be substituting.
     * 
     */
    @JsonProperty("params")
    public void setParams(List<Param__1> params) {
        this.params = params;
    }

    public Matrix withParams(List<Param__1> params) {
        this.params = params;
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

    public Matrix withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Matrix.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("include");
        sb.append('=');
        sb.append(((this.include == null)?"<null>":this.include));
        sb.append(',');
        sb.append("params");
        sb.append('=');
        sb.append(((this.params == null)?"<null>":this.params));
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
        result = ((result* 31)+((this.include == null)? 0 :this.include.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Matrix) == false) {
            return false;
        }
        Matrix rhs = ((Matrix) other);
        return ((((this.include == rhs.include)||((this.include!= null)&&this.include.equals(rhs.include)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params))));
    }

}
