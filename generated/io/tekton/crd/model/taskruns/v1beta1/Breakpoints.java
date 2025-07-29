
package io.tekton.crd.model.taskruns.v1beta1;

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
 * TaskBreakpoints defines the breakpoint config for a particular Task
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "beforeSteps",
    "onFailure"
})
@Generated("jsonschema2pojo")
public class Breakpoints {

    @JsonProperty("beforeSteps")
    @Valid
    private List<String> beforeSteps = new ArrayList<String>();
    /**
     * if enabled, pause TaskRun on failure of a step
     * failed step will not exit
     * 
     */
    @JsonProperty("onFailure")
    @JsonPropertyDescription("if enabled, pause TaskRun on failure of a step\nfailed step will not exit")
    private String onFailure;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("beforeSteps")
    public List<String> getBeforeSteps() {
        return beforeSteps;
    }

    @JsonProperty("beforeSteps")
    public void setBeforeSteps(List<String> beforeSteps) {
        this.beforeSteps = beforeSteps;
    }

    public Breakpoints withBeforeSteps(List<String> beforeSteps) {
        this.beforeSteps = beforeSteps;
        return this;
    }

    /**
     * if enabled, pause TaskRun on failure of a step
     * failed step will not exit
     * 
     */
    @JsonProperty("onFailure")
    public String getOnFailure() {
        return onFailure;
    }

    /**
     * if enabled, pause TaskRun on failure of a step
     * failed step will not exit
     * 
     */
    @JsonProperty("onFailure")
    public void setOnFailure(String onFailure) {
        this.onFailure = onFailure;
    }

    public Breakpoints withOnFailure(String onFailure) {
        this.onFailure = onFailure;
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

    public Breakpoints withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Breakpoints.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("beforeSteps");
        sb.append('=');
        sb.append(((this.beforeSteps == null)?"<null>":this.beforeSteps));
        sb.append(',');
        sb.append("onFailure");
        sb.append('=');
        sb.append(((this.onFailure == null)?"<null>":this.onFailure));
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
        result = ((result* 31)+((this.onFailure == null)? 0 :this.onFailure.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.beforeSteps == null)? 0 :this.beforeSteps.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Breakpoints) == false) {
            return false;
        }
        Breakpoints rhs = ((Breakpoints) other);
        return ((((this.onFailure == rhs.onFailure)||((this.onFailure!= null)&&this.onFailure.equals(rhs.onFailure)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.beforeSteps == rhs.beforeSteps)||((this.beforeSteps!= null)&&this.beforeSteps.equals(rhs.beforeSteps))));
    }

}
