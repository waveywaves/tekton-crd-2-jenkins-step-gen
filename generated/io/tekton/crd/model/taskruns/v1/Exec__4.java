
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
 * Exec specifies a command to execute in the container.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "command"
})
@Generated("jsonschema2pojo")
public class Exec__4 {

    /**
     * Command is the command line to execute inside the container, the working directory for the
     * command  is root ('/') in the container's filesystem. The command is simply exec'd, it is
     * not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use
     * a shell, you need to explicitly call out to that shell.
     * Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
     * 
     */
    @JsonProperty("command")
    @JsonPropertyDescription("Command is the command line to execute inside the container, the working directory for the\ncommand  is root ('/') in the container's filesystem. The command is simply exec'd, it is\nnot run inside a shell, so traditional shell instructions ('|', etc) won't work. To use\na shell, you need to explicitly call out to that shell.\nExit status of 0 is treated as live/healthy and non-zero is unhealthy.")
    @Valid
    private List<String> command = new ArrayList<String>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Command is the command line to execute inside the container, the working directory for the
     * command  is root ('/') in the container's filesystem. The command is simply exec'd, it is
     * not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use
     * a shell, you need to explicitly call out to that shell.
     * Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
     * 
     */
    @JsonProperty("command")
    public List<String> getCommand() {
        return command;
    }

    /**
     * Command is the command line to execute inside the container, the working directory for the
     * command  is root ('/') in the container's filesystem. The command is simply exec'd, it is
     * not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use
     * a shell, you need to explicitly call out to that shell.
     * Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
     * 
     */
    @JsonProperty("command")
    public void setCommand(List<String> command) {
        this.command = command;
    }

    public Exec__4 withCommand(List<String> command) {
        this.command = command;
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

    public Exec__4 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Exec__4 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("command");
        sb.append('=');
        sb.append(((this.command == null)?"<null>":this.command));
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
        result = ((result* 31)+((this.command == null)? 0 :this.command.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Exec__4) == false) {
            return false;
        }
        Exec__4 rhs = ((Exec__4) other);
        return (((this.command == rhs.command)||((this.command!= null)&&this.command.equals(rhs.command)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
