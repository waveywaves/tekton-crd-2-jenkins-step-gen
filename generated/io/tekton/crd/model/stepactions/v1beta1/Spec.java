
package io.tekton.crd.model.stepactions.v1beta1;

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
 * Spec holds the desired state of the Step from the client
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "args",
    "command",
    "description",
    "env",
    "image",
    "params",
    "results",
    "script",
    "securityContext",
    "volumeMounts",
    "workingDir"
})
@Generated("jsonschema2pojo")
public class Spec {

    /**
     * Arguments to the entrypoint.
     * The image's CMD is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container's environment. If a variable
     * cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced
     * to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will
     * produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless
     * of whether the variable exists or not. Cannot be updated.
     * More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @JsonProperty("args")
    @JsonPropertyDescription("Arguments to the entrypoint.\nThe image's CMD is used if this is not provided.\nVariable references $(VAR_NAME) are expanded using the container's environment. If a variable\ncannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced\nto a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will\nproduce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless\nof whether the variable exists or not. Cannot be updated.\nMore info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
    @Valid
    private List<String> args = new ArrayList<String>();
    /**
     * Entrypoint array. Not executed within a shell.
     * The image's ENTRYPOINT is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container's environment. If a variable
     * cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced
     * to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will
     * produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless
     * of whether the variable exists or not. Cannot be updated.
     * More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @JsonProperty("command")
    @JsonPropertyDescription("Entrypoint array. Not executed within a shell.\nThe image's ENTRYPOINT is used if this is not provided.\nVariable references $(VAR_NAME) are expanded using the container's environment. If a variable\ncannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced\nto a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will\nproduce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless\nof whether the variable exists or not. Cannot be updated.\nMore info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
    @Valid
    private List<String> command = new ArrayList<String>();
    /**
     * Description is a user-facing description of the stepaction that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Description is a user-facing description of the stepaction that may be\nused to populate a UI.")
    private String description;
    /**
     * List of environment variables to set in the container.
     * Cannot be updated.
     * 
     */
    @JsonProperty("env")
    @JsonPropertyDescription("List of environment variables to set in the container.\nCannot be updated.")
    @Valid
    private List<Env> env = new ArrayList<Env>();
    /**
     * Image reference name to run for this StepAction.
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("Image reference name to run for this StepAction.\nMore info: https://kubernetes.io/docs/concepts/containers/images")
    private String image;
    /**
     * Params is a list of input parameters required to run the stepAction.
     * Params must be supplied as inputs in Steps unless they declare a defaultvalue.
     * 
     */
    @JsonProperty("params")
    @JsonPropertyDescription("Params is a list of input parameters required to run the stepAction.\nParams must be supplied as inputs in Steps unless they declare a defaultvalue.")
    @Valid
    private List<Param> params = new ArrayList<Param>();
    /**
     * Results are values that this StepAction can output
     * 
     */
    @JsonProperty("results")
    @JsonPropertyDescription("Results are values that this StepAction can output")
    @Valid
    private List<Result> results = new ArrayList<Result>();
    /**
     * Script is the contents of an executable file to execute.
     * 
     * If Script is not empty, the Step cannot have an Command and the Args will be passed to the Script.
     * 
     */
    @JsonProperty("script")
    @JsonPropertyDescription("Script is the contents of an executable file to execute.\n\nIf Script is not empty, the Step cannot have an Command and the Args will be passed to the Script.")
    private String script;
    /**
     * SecurityContext defines the security options the Step should be run with.
     * If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
     * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * The value set in StepAction will take precedence over the value from Task.
     * 
     */
    @JsonProperty("securityContext")
    @JsonPropertyDescription("SecurityContext defines the security options the Step should be run with.\nIf set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.\nMore info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/\nThe value set in StepAction will take precedence over the value from Task.")
    @Valid
    private SecurityContext securityContext;
    /**
     * Volumes to mount into the Step's filesystem.
     * Cannot be updated.
     * 
     */
    @JsonProperty("volumeMounts")
    @JsonPropertyDescription("Volumes to mount into the Step's filesystem.\nCannot be updated.")
    @Valid
    private List<VolumeMount> volumeMounts = new ArrayList<VolumeMount>();
    /**
     * Step's working directory.
     * If not specified, the container runtime's default will be used, which
     * might be configured in the container image.
     * Cannot be updated.
     * 
     */
    @JsonProperty("workingDir")
    @JsonPropertyDescription("Step's working directory.\nIf not specified, the container runtime's default will be used, which\nmight be configured in the container image.\nCannot be updated.")
    private String workingDir;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Arguments to the entrypoint.
     * The image's CMD is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container's environment. If a variable
     * cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced
     * to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will
     * produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless
     * of whether the variable exists or not. Cannot be updated.
     * More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @JsonProperty("args")
    public List<String> getArgs() {
        return args;
    }

    /**
     * Arguments to the entrypoint.
     * The image's CMD is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container's environment. If a variable
     * cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced
     * to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will
     * produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless
     * of whether the variable exists or not. Cannot be updated.
     * More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @JsonProperty("args")
    public void setArgs(List<String> args) {
        this.args = args;
    }

    public Spec withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    /**
     * Entrypoint array. Not executed within a shell.
     * The image's ENTRYPOINT is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container's environment. If a variable
     * cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced
     * to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will
     * produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless
     * of whether the variable exists or not. Cannot be updated.
     * More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @JsonProperty("command")
    public List<String> getCommand() {
        return command;
    }

    /**
     * Entrypoint array. Not executed within a shell.
     * The image's ENTRYPOINT is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container's environment. If a variable
     * cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced
     * to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will
     * produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless
     * of whether the variable exists or not. Cannot be updated.
     * More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @JsonProperty("command")
    public void setCommand(List<String> command) {
        this.command = command;
    }

    public Spec withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    /**
     * Description is a user-facing description of the stepaction that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description is a user-facing description of the stepaction that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Spec withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * List of environment variables to set in the container.
     * Cannot be updated.
     * 
     */
    @JsonProperty("env")
    public List<Env> getEnv() {
        return env;
    }

    /**
     * List of environment variables to set in the container.
     * Cannot be updated.
     * 
     */
    @JsonProperty("env")
    public void setEnv(List<Env> env) {
        this.env = env;
    }

    public Spec withEnv(List<Env> env) {
        this.env = env;
        return this;
    }

    /**
     * Image reference name to run for this StepAction.
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * Image reference name to run for this StepAction.
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    public Spec withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * Params is a list of input parameters required to run the stepAction.
     * Params must be supplied as inputs in Steps unless they declare a defaultvalue.
     * 
     */
    @JsonProperty("params")
    public List<Param> getParams() {
        return params;
    }

    /**
     * Params is a list of input parameters required to run the stepAction.
     * Params must be supplied as inputs in Steps unless they declare a defaultvalue.
     * 
     */
    @JsonProperty("params")
    public void setParams(List<Param> params) {
        this.params = params;
    }

    public Spec withParams(List<Param> params) {
        this.params = params;
        return this;
    }

    /**
     * Results are values that this StepAction can output
     * 
     */
    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    /**
     * Results are values that this StepAction can output
     * 
     */
    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Spec withResults(List<Result> results) {
        this.results = results;
        return this;
    }

    /**
     * Script is the contents of an executable file to execute.
     * 
     * If Script is not empty, the Step cannot have an Command and the Args will be passed to the Script.
     * 
     */
    @JsonProperty("script")
    public String getScript() {
        return script;
    }

    /**
     * Script is the contents of an executable file to execute.
     * 
     * If Script is not empty, the Step cannot have an Command and the Args will be passed to the Script.
     * 
     */
    @JsonProperty("script")
    public void setScript(String script) {
        this.script = script;
    }

    public Spec withScript(String script) {
        this.script = script;
        return this;
    }

    /**
     * SecurityContext defines the security options the Step should be run with.
     * If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
     * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * The value set in StepAction will take precedence over the value from Task.
     * 
     */
    @JsonProperty("securityContext")
    public SecurityContext getSecurityContext() {
        return securityContext;
    }

    /**
     * SecurityContext defines the security options the Step should be run with.
     * If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
     * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * The value set in StepAction will take precedence over the value from Task.
     * 
     */
    @JsonProperty("securityContext")
    public void setSecurityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public Spec withSecurityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    /**
     * Volumes to mount into the Step's filesystem.
     * Cannot be updated.
     * 
     */
    @JsonProperty("volumeMounts")
    public List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    /**
     * Volumes to mount into the Step's filesystem.
     * Cannot be updated.
     * 
     */
    @JsonProperty("volumeMounts")
    public void setVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    public Spec withVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }

    /**
     * Step's working directory.
     * If not specified, the container runtime's default will be used, which
     * might be configured in the container image.
     * Cannot be updated.
     * 
     */
    @JsonProperty("workingDir")
    public String getWorkingDir() {
        return workingDir;
    }

    /**
     * Step's working directory.
     * If not specified, the container runtime's default will be used, which
     * might be configured in the container image.
     * Cannot be updated.
     * 
     */
    @JsonProperty("workingDir")
    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    public Spec withWorkingDir(String workingDir) {
        this.workingDir = workingDir;
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

    public Spec withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Spec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("args");
        sb.append('=');
        sb.append(((this.args == null)?"<null>":this.args));
        sb.append(',');
        sb.append("command");
        sb.append('=');
        sb.append(((this.command == null)?"<null>":this.command));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("env");
        sb.append('=');
        sb.append(((this.env == null)?"<null>":this.env));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("params");
        sb.append('=');
        sb.append(((this.params == null)?"<null>":this.params));
        sb.append(',');
        sb.append("results");
        sb.append('=');
        sb.append(((this.results == null)?"<null>":this.results));
        sb.append(',');
        sb.append("script");
        sb.append('=');
        sb.append(((this.script == null)?"<null>":this.script));
        sb.append(',');
        sb.append("securityContext");
        sb.append('=');
        sb.append(((this.securityContext == null)?"<null>":this.securityContext));
        sb.append(',');
        sb.append("volumeMounts");
        sb.append('=');
        sb.append(((this.volumeMounts == null)?"<null>":this.volumeMounts));
        sb.append(',');
        sb.append("workingDir");
        sb.append('=');
        sb.append(((this.workingDir == null)?"<null>":this.workingDir));
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
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.workingDir == null)? 0 :this.workingDir.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.securityContext == null)? 0 :this.securityContext.hashCode()));
        result = ((result* 31)+((this.env == null)? 0 :this.env.hashCode()));
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        result = ((result* 31)+((this.command == null)? 0 :this.command.hashCode()));
        result = ((result* 31)+((this.script == null)? 0 :this.script.hashCode()));
        result = ((result* 31)+((this.volumeMounts == null)? 0 :this.volumeMounts.hashCode()));
        result = ((result* 31)+((this.args == null)? 0 :this.args.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.results == null)? 0 :this.results.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Spec) == false) {
            return false;
        }
        Spec rhs = ((Spec) other);
        return (((((((((((((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image)))&&((this.workingDir == rhs.workingDir)||((this.workingDir!= null)&&this.workingDir.equals(rhs.workingDir))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.securityContext == rhs.securityContext)||((this.securityContext!= null)&&this.securityContext.equals(rhs.securityContext))))&&((this.env == rhs.env)||((this.env!= null)&&this.env.equals(rhs.env))))&&((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params))))&&((this.command == rhs.command)||((this.command!= null)&&this.command.equals(rhs.command))))&&((this.script == rhs.script)||((this.script!= null)&&this.script.equals(rhs.script))))&&((this.volumeMounts == rhs.volumeMounts)||((this.volumeMounts!= null)&&this.volumeMounts.equals(rhs.volumeMounts))))&&((this.args == rhs.args)||((this.args!= null)&&this.args.equals(rhs.args))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.results == rhs.results)||((this.results!= null)&&this.results.equals(rhs.results))));
    }

}
