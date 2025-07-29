
package io.tekton.crd.model.taskruns.v1;

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
 * TaskRunDebug defines the breakpoint config for a particular TaskRun
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "breakpoints"
})
@Generated("jsonschema2pojo")
public class Debug {

    /**
     * TaskBreakpoints defines the breakpoint config for a particular Task
     * 
     */
    @JsonProperty("breakpoints")
    @JsonPropertyDescription("TaskBreakpoints defines the breakpoint config for a particular Task")
    @Valid
    private Breakpoints breakpoints;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * TaskBreakpoints defines the breakpoint config for a particular Task
     * 
     */
    @JsonProperty("breakpoints")
    public Breakpoints getBreakpoints() {
        return breakpoints;
    }

    /**
     * TaskBreakpoints defines the breakpoint config for a particular Task
     * 
     */
    @JsonProperty("breakpoints")
    public void setBreakpoints(Breakpoints breakpoints) {
        this.breakpoints = breakpoints;
    }

    public Debug withBreakpoints(Breakpoints breakpoints) {
        this.breakpoints = breakpoints;
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

    public Debug withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Debug.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("breakpoints");
        sb.append('=');
        sb.append(((this.breakpoints == null)?"<null>":this.breakpoints));
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
        result = ((result* 31)+((this.breakpoints == null)? 0 :this.breakpoints.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Debug) == false) {
            return false;
        }
        Debug rhs = ((Debug) other);
        return (((this.breakpoints == rhs.breakpoints)||((this.breakpoints!= null)&&this.breakpoints.equals(rhs.breakpoints)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
