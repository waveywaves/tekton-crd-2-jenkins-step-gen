
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
 * StepTemplate can be used as the basis for all step containers within the
 * Task, so that the steps inherit settings on the base container.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "args",
    "command",
    "computeResources",
    "env",
    "envFrom",
    "image",
    "imagePullPolicy",
    "securityContext",
    "volumeDevices",
    "volumeMounts",
    "workingDir"
})
@Generated("jsonschema2pojo")
public class StepTemplate {

    /**
     * Arguments to the entrypoint.
     * The image's CMD is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the Step's environment. If a variable
     * cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced
     * to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will
     * produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless
     * of whether the variable exists or not. Cannot be updated.
     * More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @JsonProperty("args")
    @JsonPropertyDescription("Arguments to the entrypoint.\nThe image's CMD is used if this is not provided.\nVariable references $(VAR_NAME) are expanded using the Step's environment. If a variable\ncannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced\nto a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will\nproduce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless\nof whether the variable exists or not. Cannot be updated.\nMore info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
    @Valid
    private List<String> args = new ArrayList<String>();
    /**
     * Entrypoint array. Not executed within a shell.
     * The image's ENTRYPOINT is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the Step's environment. If a variable
     * cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced
     * to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will
     * produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless
     * of whether the variable exists or not. Cannot be updated.
     * More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @JsonProperty("command")
    @JsonPropertyDescription("Entrypoint array. Not executed within a shell.\nThe image's ENTRYPOINT is used if this is not provided.\nVariable references $(VAR_NAME) are expanded using the Step's environment. If a variable\ncannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced\nto a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will\nproduce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless\nof whether the variable exists or not. Cannot be updated.\nMore info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
    @Valid
    private List<String> command = new ArrayList<String>();
    /**
     * ComputeResources required by this Step.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("computeResources")
    @JsonPropertyDescription("ComputeResources required by this Step.\nCannot be updated.\nMore info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")
    @Valid
    private ComputeResources__4 computeResources;
    /**
     * List of environment variables to set in the Step.
     * Cannot be updated.
     * 
     */
    @JsonProperty("env")
    @JsonPropertyDescription("List of environment variables to set in the Step.\nCannot be updated.")
    @Valid
    private List<Env__2> env = new ArrayList<Env__2>();
    /**
     * List of sources to populate environment variables in the Step.
     * The keys defined within a source must be a C_IDENTIFIER. All invalid keys
     * will be reported as an event when the Step is starting. When a key exists in multiple
     * sources, the value associated with the last source will take precedence.
     * Values defined by an Env with a duplicate key will take precedence.
     * Cannot be updated.
     * 
     */
    @JsonProperty("envFrom")
    @JsonPropertyDescription("List of sources to populate environment variables in the Step.\nThe keys defined within a source must be a C_IDENTIFIER. All invalid keys\nwill be reported as an event when the Step is starting. When a key exists in multiple\nsources, the value associated with the last source will take precedence.\nValues defined by an Env with a duplicate key will take precedence.\nCannot be updated.")
    @Valid
    private List<EnvFrom__1> envFrom = new ArrayList<EnvFrom__1>();
    /**
     * Image reference name.
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("Image reference name.\nMore info: https://kubernetes.io/docs/concepts/containers/images")
    private String image;
    /**
     * Image pull policy.
     * One of Always, Never, IfNotPresent.
     * Defaults to Always if :latest tag is specified, or IfNotPresent otherwise.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     */
    @JsonProperty("imagePullPolicy")
    @JsonPropertyDescription("Image pull policy.\nOne of Always, Never, IfNotPresent.\nDefaults to Always if :latest tag is specified, or IfNotPresent otherwise.\nCannot be updated.\nMore info: https://kubernetes.io/docs/concepts/containers/images#updating-images")
    private String imagePullPolicy;
    /**
     * SecurityContext defines the security options the Step should be run with.
     * If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
     * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    @JsonProperty("securityContext")
    @JsonPropertyDescription("SecurityContext defines the security options the Step should be run with.\nIf set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.\nMore info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/")
    @Valid
    private SecurityContext__1 securityContext;
    /**
     * volumeDevices is the list of block devices to be used by the Step.
     * 
     */
    @JsonProperty("volumeDevices")
    @JsonPropertyDescription("volumeDevices is the list of block devices to be used by the Step.")
    @Valid
    private List<VolumeDevice__1> volumeDevices = new ArrayList<VolumeDevice__1>();
    /**
     * Volumes to mount into the Step's filesystem.
     * Cannot be updated.
     * 
     */
    @JsonProperty("volumeMounts")
    @JsonPropertyDescription("Volumes to mount into the Step's filesystem.\nCannot be updated.")
    @Valid
    private List<VolumeMount__1> volumeMounts = new ArrayList<VolumeMount__1>();
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
     * Variable references $(VAR_NAME) are expanded using the Step's environment. If a variable
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
     * Variable references $(VAR_NAME) are expanded using the Step's environment. If a variable
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

    public StepTemplate withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    /**
     * Entrypoint array. Not executed within a shell.
     * The image's ENTRYPOINT is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the Step's environment. If a variable
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
     * Variable references $(VAR_NAME) are expanded using the Step's environment. If a variable
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

    public StepTemplate withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    /**
     * ComputeResources required by this Step.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("computeResources")
    public ComputeResources__4 getComputeResources() {
        return computeResources;
    }

    /**
     * ComputeResources required by this Step.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("computeResources")
    public void setComputeResources(ComputeResources__4 computeResources) {
        this.computeResources = computeResources;
    }

    public StepTemplate withComputeResources(ComputeResources__4 computeResources) {
        this.computeResources = computeResources;
        return this;
    }

    /**
     * List of environment variables to set in the Step.
     * Cannot be updated.
     * 
     */
    @JsonProperty("env")
    public List<Env__2> getEnv() {
        return env;
    }

    /**
     * List of environment variables to set in the Step.
     * Cannot be updated.
     * 
     */
    @JsonProperty("env")
    public void setEnv(List<Env__2> env) {
        this.env = env;
    }

    public StepTemplate withEnv(List<Env__2> env) {
        this.env = env;
        return this;
    }

    /**
     * List of sources to populate environment variables in the Step.
     * The keys defined within a source must be a C_IDENTIFIER. All invalid keys
     * will be reported as an event when the Step is starting. When a key exists in multiple
     * sources, the value associated with the last source will take precedence.
     * Values defined by an Env with a duplicate key will take precedence.
     * Cannot be updated.
     * 
     */
    @JsonProperty("envFrom")
    public List<EnvFrom__1> getEnvFrom() {
        return envFrom;
    }

    /**
     * List of sources to populate environment variables in the Step.
     * The keys defined within a source must be a C_IDENTIFIER. All invalid keys
     * will be reported as an event when the Step is starting. When a key exists in multiple
     * sources, the value associated with the last source will take precedence.
     * Values defined by an Env with a duplicate key will take precedence.
     * Cannot be updated.
     * 
     */
    @JsonProperty("envFrom")
    public void setEnvFrom(List<EnvFrom__1> envFrom) {
        this.envFrom = envFrom;
    }

    public StepTemplate withEnvFrom(List<EnvFrom__1> envFrom) {
        this.envFrom = envFrom;
        return this;
    }

    /**
     * Image reference name.
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * Image reference name.
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    public StepTemplate withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * Image pull policy.
     * One of Always, Never, IfNotPresent.
     * Defaults to Always if :latest tag is specified, or IfNotPresent otherwise.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     */
    @JsonProperty("imagePullPolicy")
    public String getImagePullPolicy() {
        return imagePullPolicy;
    }

    /**
     * Image pull policy.
     * One of Always, Never, IfNotPresent.
     * Defaults to Always if :latest tag is specified, or IfNotPresent otherwise.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     */
    @JsonProperty("imagePullPolicy")
    public void setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    public StepTemplate withImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
        return this;
    }

    /**
     * SecurityContext defines the security options the Step should be run with.
     * If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
     * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    @JsonProperty("securityContext")
    public SecurityContext__1 getSecurityContext() {
        return securityContext;
    }

    /**
     * SecurityContext defines the security options the Step should be run with.
     * If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
     * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    @JsonProperty("securityContext")
    public void setSecurityContext(SecurityContext__1 securityContext) {
        this.securityContext = securityContext;
    }

    public StepTemplate withSecurityContext(SecurityContext__1 securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    /**
     * volumeDevices is the list of block devices to be used by the Step.
     * 
     */
    @JsonProperty("volumeDevices")
    public List<VolumeDevice__1> getVolumeDevices() {
        return volumeDevices;
    }

    /**
     * volumeDevices is the list of block devices to be used by the Step.
     * 
     */
    @JsonProperty("volumeDevices")
    public void setVolumeDevices(List<VolumeDevice__1> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public StepTemplate withVolumeDevices(List<VolumeDevice__1> volumeDevices) {
        this.volumeDevices = volumeDevices;
        return this;
    }

    /**
     * Volumes to mount into the Step's filesystem.
     * Cannot be updated.
     * 
     */
    @JsonProperty("volumeMounts")
    public List<VolumeMount__1> getVolumeMounts() {
        return volumeMounts;
    }

    /**
     * Volumes to mount into the Step's filesystem.
     * Cannot be updated.
     * 
     */
    @JsonProperty("volumeMounts")
    public void setVolumeMounts(List<VolumeMount__1> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    public StepTemplate withVolumeMounts(List<VolumeMount__1> volumeMounts) {
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

    public StepTemplate withWorkingDir(String workingDir) {
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

    public StepTemplate withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StepTemplate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("args");
        sb.append('=');
        sb.append(((this.args == null)?"<null>":this.args));
        sb.append(',');
        sb.append("command");
        sb.append('=');
        sb.append(((this.command == null)?"<null>":this.command));
        sb.append(',');
        sb.append("computeResources");
        sb.append('=');
        sb.append(((this.computeResources == null)?"<null>":this.computeResources));
        sb.append(',');
        sb.append("env");
        sb.append('=');
        sb.append(((this.env == null)?"<null>":this.env));
        sb.append(',');
        sb.append("envFrom");
        sb.append('=');
        sb.append(((this.envFrom == null)?"<null>":this.envFrom));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("imagePullPolicy");
        sb.append('=');
        sb.append(((this.imagePullPolicy == null)?"<null>":this.imagePullPolicy));
        sb.append(',');
        sb.append("securityContext");
        sb.append('=');
        sb.append(((this.securityContext == null)?"<null>":this.securityContext));
        sb.append(',');
        sb.append("volumeDevices");
        sb.append('=');
        sb.append(((this.volumeDevices == null)?"<null>":this.volumeDevices));
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
        result = ((result* 31)+((this.volumeDevices == null)? 0 :this.volumeDevices.hashCode()));
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.imagePullPolicy == null)? 0 :this.imagePullPolicy.hashCode()));
        result = ((result* 31)+((this.workingDir == null)? 0 :this.workingDir.hashCode()));
        result = ((result* 31)+((this.securityContext == null)? 0 :this.securityContext.hashCode()));
        result = ((result* 31)+((this.env == null)? 0 :this.env.hashCode()));
        result = ((result* 31)+((this.command == null)? 0 :this.command.hashCode()));
        result = ((result* 31)+((this.volumeMounts == null)? 0 :this.volumeMounts.hashCode()));
        result = ((result* 31)+((this.args == null)? 0 :this.args.hashCode()));
        result = ((result* 31)+((this.computeResources == null)? 0 :this.computeResources.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.envFrom == null)? 0 :this.envFrom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StepTemplate) == false) {
            return false;
        }
        StepTemplate rhs = ((StepTemplate) other);
        return (((((((((((((this.volumeDevices == rhs.volumeDevices)||((this.volumeDevices!= null)&&this.volumeDevices.equals(rhs.volumeDevices)))&&((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image))))&&((this.imagePullPolicy == rhs.imagePullPolicy)||((this.imagePullPolicy!= null)&&this.imagePullPolicy.equals(rhs.imagePullPolicy))))&&((this.workingDir == rhs.workingDir)||((this.workingDir!= null)&&this.workingDir.equals(rhs.workingDir))))&&((this.securityContext == rhs.securityContext)||((this.securityContext!= null)&&this.securityContext.equals(rhs.securityContext))))&&((this.env == rhs.env)||((this.env!= null)&&this.env.equals(rhs.env))))&&((this.command == rhs.command)||((this.command!= null)&&this.command.equals(rhs.command))))&&((this.volumeMounts == rhs.volumeMounts)||((this.volumeMounts!= null)&&this.volumeMounts.equals(rhs.volumeMounts))))&&((this.args == rhs.args)||((this.args!= null)&&this.args.equals(rhs.args))))&&((this.computeResources == rhs.computeResources)||((this.computeResources!= null)&&this.computeResources.equals(rhs.computeResources))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.envFrom == rhs.envFrom)||((this.envFrom!= null)&&this.envFrom.equals(rhs.envFrom))));
    }

}
