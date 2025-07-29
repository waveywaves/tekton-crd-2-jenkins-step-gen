
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
 * WhenExpression allows a PipelineTask to declare expressions to be evaluated before the Task is run
 * to determine whether the Task should be executed or skipped
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cel",
    "input",
    "operator",
    "values"
})
@Generated("jsonschema2pojo")
public class When__1 {

    /**
     * CEL is a string of Common Language Expression, which can be used to conditionally execute
     * the task based on the result of the expression evaluation
     * More info about CEL syntax: https://github.com/google/cel-spec/blob/master/doc/langdef.md
     * 
     */
    @JsonProperty("cel")
    @JsonPropertyDescription("CEL is a string of Common Language Expression, which can be used to conditionally execute\nthe task based on the result of the expression evaluation\nMore info about CEL syntax: https://github.com/google/cel-spec/blob/master/doc/langdef.md")
    private String cel;
    /**
     * Input is the string for guard checking which can be a static input or an output from a parent Task
     * 
     */
    @JsonProperty("input")
    @JsonPropertyDescription("Input is the string for guard checking which can be a static input or an output from a parent Task")
    private String input;
    /**
     * Operator that represents an Input's relationship to the values
     * 
     */
    @JsonProperty("operator")
    @JsonPropertyDescription("Operator that represents an Input's relationship to the values")
    private String operator;
    /**
     * Values is an array of strings, which is compared against the input, for guard checking
     * It must be non-empty
     * 
     */
    @JsonProperty("values")
    @JsonPropertyDescription("Values is an array of strings, which is compared against the input, for guard checking\nIt must be non-empty")
    @Valid
    private List<String> values = new ArrayList<String>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * CEL is a string of Common Language Expression, which can be used to conditionally execute
     * the task based on the result of the expression evaluation
     * More info about CEL syntax: https://github.com/google/cel-spec/blob/master/doc/langdef.md
     * 
     */
    @JsonProperty("cel")
    public String getCel() {
        return cel;
    }

    /**
     * CEL is a string of Common Language Expression, which can be used to conditionally execute
     * the task based on the result of the expression evaluation
     * More info about CEL syntax: https://github.com/google/cel-spec/blob/master/doc/langdef.md
     * 
     */
    @JsonProperty("cel")
    public void setCel(String cel) {
        this.cel = cel;
    }

    public When__1 withCel(String cel) {
        this.cel = cel;
        return this;
    }

    /**
     * Input is the string for guard checking which can be a static input or an output from a parent Task
     * 
     */
    @JsonProperty("input")
    public String getInput() {
        return input;
    }

    /**
     * Input is the string for guard checking which can be a static input or an output from a parent Task
     * 
     */
    @JsonProperty("input")
    public void setInput(String input) {
        this.input = input;
    }

    public When__1 withInput(String input) {
        this.input = input;
        return this;
    }

    /**
     * Operator that represents an Input's relationship to the values
     * 
     */
    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    /**
     * Operator that represents an Input's relationship to the values
     * 
     */
    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    public When__1 withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Values is an array of strings, which is compared against the input, for guard checking
     * It must be non-empty
     * 
     */
    @JsonProperty("values")
    public List<String> getValues() {
        return values;
    }

    /**
     * Values is an array of strings, which is compared against the input, for guard checking
     * It must be non-empty
     * 
     */
    @JsonProperty("values")
    public void setValues(List<String> values) {
        this.values = values;
    }

    public When__1 withValues(List<String> values) {
        this.values = values;
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

    public When__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(When__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cel");
        sb.append('=');
        sb.append(((this.cel == null)?"<null>":this.cel));
        sb.append(',');
        sb.append("input");
        sb.append('=');
        sb.append(((this.input == null)?"<null>":this.input));
        sb.append(',');
        sb.append("operator");
        sb.append('=');
        sb.append(((this.operator == null)?"<null>":this.operator));
        sb.append(',');
        sb.append("values");
        sb.append('=');
        sb.append(((this.values == null)?"<null>":this.values));
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
        result = ((result* 31)+((this.input == null)? 0 :this.input.hashCode()));
        result = ((result* 31)+((this.cel == null)? 0 :this.cel.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.operator == null)? 0 :this.operator.hashCode()));
        result = ((result* 31)+((this.values == null)? 0 :this.values.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof When__1) == false) {
            return false;
        }
        When__1 rhs = ((When__1) other);
        return ((((((this.input == rhs.input)||((this.input!= null)&&this.input.equals(rhs.input)))&&((this.cel == rhs.cel)||((this.cel!= null)&&this.cel.equals(rhs.cel))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.operator == rhs.operator)||((this.operator!= null)&&this.operator.equals(rhs.operator))))&&((this.values == rhs.values)||((this.values!= null)&&this.values.equals(rhs.values))));
    }

}
