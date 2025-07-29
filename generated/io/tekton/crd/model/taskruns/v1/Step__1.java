
package io.tekton.crd.model.taskruns.v1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Step runs a subcomponent of a Task
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
    "name",
    "onError",
    "params",
    "ref",
    "results",
    "script",
    "securityContext",
    "stderrConfig",
    "stdoutConfig",
    "timeout",
    "volumeDevices",
    "volumeMounts",
    "when",
    "workingDir",
    "workspaces"
})
@Generated("jsonschema2pojo")
public class Step__1 {

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
     * ComputeResources required by this Step.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("computeResources")
    @JsonPropertyDescription("ComputeResources required by this Step.\nCannot be updated.\nMore info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")
    @Valid
    private ComputeResources__5 computeResources;
    /**
     * List of environment variables to set in the Step.
     * Cannot be updated.
     * 
     */
    @JsonProperty("env")
    @JsonPropertyDescription("List of environment variables to set in the Step.\nCannot be updated.")
    @Valid
    private List<Env__3> env = new ArrayList<Env__3>();
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
    private List<EnvFrom__2> envFrom = new ArrayList<EnvFrom__2>();
    /**
     * Docker image name.
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("Docker image name.\nMore info: https://kubernetes.io/docs/concepts/containers/images")
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
     * Name of the Step specified as a DNS_LABEL.
     * Each Step in a Task must have a unique name.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the Step specified as a DNS_LABEL.\nEach Step in a Task must have a unique name.")
    @NotNull
    private String name;
    /**
     * OnError defines the exiting behavior of a container on error
     * can be set to [ continue | stopAndFail ]
     * 
     */
    @JsonProperty("onError")
    @JsonPropertyDescription("OnError defines the exiting behavior of a container on error\ncan be set to [ continue | stopAndFail ]")
    private String onError;
    /**
     * Params declares parameters passed to this step action.
     * 
     */
    @JsonProperty("params")
    @JsonPropertyDescription("Params declares parameters passed to this step action.")
    @Valid
    private List<Param__3> params = new ArrayList<Param__3>();
    /**
     * Contains the reference to an existing StepAction.
     * 
     */
    @JsonProperty("ref")
    @JsonPropertyDescription("Contains the reference to an existing StepAction.")
    @Valid
    private Ref ref;
    /**
     * Results declares StepResults produced by the Step.
     * 
     * It can be used in an inlined Step when used to store Results to $(step.results.resultName.path).
     * It cannot be used when referencing StepActions using [v1.Step.Ref].
     * The Results declared by the StepActions will be stored here instead.
     * 
     */
    @JsonProperty("results")
    @JsonPropertyDescription("Results declares StepResults produced by the Step.\n\nIt can be used in an inlined Step when used to store Results to $(step.results.resultName.path).\nIt cannot be used when referencing StepActions using [v1.Step.Ref].\nThe Results declared by the StepActions will be stored here instead.")
    @Valid
    private List<Result__3> results = new ArrayList<Result__3>();
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
     * 
     */
    @JsonProperty("securityContext")
    @JsonPropertyDescription("SecurityContext defines the security options the Step should be run with.\nIf set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.\nMore info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/")
    @Valid
    private SecurityContext__2 securityContext;
    /**
     * Stores configuration for the stderr stream of the step.
     * 
     */
    @JsonProperty("stderrConfig")
    @JsonPropertyDescription("Stores configuration for the stderr stream of the step.")
    @Valid
    private StderrConfig stderrConfig;
    /**
     * Stores configuration for the stdout stream of the step.
     * 
     */
    @JsonProperty("stdoutConfig")
    @JsonPropertyDescription("Stores configuration for the stdout stream of the step.")
    @Valid
    private StdoutConfig stdoutConfig;
    /**
     * Timeout is the time after which the step times out. Defaults to never.
     * Refer to Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration
     * 
     */
    @JsonProperty("timeout")
    @JsonPropertyDescription("Timeout is the time after which the step times out. Defaults to never.\nRefer to Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration")
    private String timeout;
    /**
     * volumeDevices is the list of block devices to be used by the Step.
     * 
     */
    @JsonProperty("volumeDevices")
    @JsonPropertyDescription("volumeDevices is the list of block devices to be used by the Step.")
    @Valid
    private List<VolumeDevice__2> volumeDevices = new ArrayList<VolumeDevice__2>();
    /**
     * Volumes to mount into the Step's filesystem.
     * Cannot be updated.
     * 
     */
    @JsonProperty("volumeMounts")
    @JsonPropertyDescription("Volumes to mount into the Step's filesystem.\nCannot be updated.")
    @Valid
    private List<VolumeMount__2> volumeMounts = new ArrayList<VolumeMount__2>();
    /**
     * When is a list of when expressions that need to be true for the task to run
     * 
     */
    @JsonProperty("when")
    @JsonPropertyDescription("When is a list of when expressions that need to be true for the task to run")
    @Valid
    private List<When> when = new ArrayList<When>();
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
    /**
     * This is an alpha field. You must set the "enable-api-fields" feature flag to "alpha"
     * for this field to be supported.
     * 
     * Workspaces is a list of workspaces from the Task that this Step wants
     * exclusive access to. Adding a workspace to this list means that any
     * other Step or Sidecar that does not also request this Workspace will
     * not have access to it.
     * 
     */
    @JsonProperty("workspaces")
    @JsonPropertyDescription("This is an alpha field. You must set the \"enable-api-fields\" feature flag to \"alpha\"\nfor this field to be supported.\n\nWorkspaces is a list of workspaces from the Task that this Step wants\nexclusive access to. Adding a workspace to this list means that any\nother Step or Sidecar that does not also request this Workspace will\nnot have access to it.")
    @Valid
    private List<Workspace__2> workspaces = new ArrayList<Workspace__2>();
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

    public Step__1 withArgs(List<String> args) {
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

    public Step__1 withCommand(List<String> command) {
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
    public ComputeResources__5 getComputeResources() {
        return computeResources;
    }

    /**
     * ComputeResources required by this Step.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("computeResources")
    public void setComputeResources(ComputeResources__5 computeResources) {
        this.computeResources = computeResources;
    }

    public Step__1 withComputeResources(ComputeResources__5 computeResources) {
        this.computeResources = computeResources;
        return this;
    }

    /**
     * List of environment variables to set in the Step.
     * Cannot be updated.
     * 
     */
    @JsonProperty("env")
    public List<Env__3> getEnv() {
        return env;
    }

    /**
     * List of environment variables to set in the Step.
     * Cannot be updated.
     * 
     */
    @JsonProperty("env")
    public void setEnv(List<Env__3> env) {
        this.env = env;
    }

    public Step__1 withEnv(List<Env__3> env) {
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
    public List<EnvFrom__2> getEnvFrom() {
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
    public void setEnvFrom(List<EnvFrom__2> envFrom) {
        this.envFrom = envFrom;
    }

    public Step__1 withEnvFrom(List<EnvFrom__2> envFrom) {
        this.envFrom = envFrom;
        return this;
    }

    /**
     * Docker image name.
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * Docker image name.
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    public Step__1 withImage(String image) {
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

    public Step__1 withImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
        return this;
    }

    /**
     * Name of the Step specified as a DNS_LABEL.
     * Each Step in a Task must have a unique name.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the Step specified as a DNS_LABEL.
     * Each Step in a Task must have a unique name.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Step__1 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * OnError defines the exiting behavior of a container on error
     * can be set to [ continue | stopAndFail ]
     * 
     */
    @JsonProperty("onError")
    public String getOnError() {
        return onError;
    }

    /**
     * OnError defines the exiting behavior of a container on error
     * can be set to [ continue | stopAndFail ]
     * 
     */
    @JsonProperty("onError")
    public void setOnError(String onError) {
        this.onError = onError;
    }

    public Step__1 withOnError(String onError) {
        this.onError = onError;
        return this;
    }

    /**
     * Params declares parameters passed to this step action.
     * 
     */
    @JsonProperty("params")
    public List<Param__3> getParams() {
        return params;
    }

    /**
     * Params declares parameters passed to this step action.
     * 
     */
    @JsonProperty("params")
    public void setParams(List<Param__3> params) {
        this.params = params;
    }

    public Step__1 withParams(List<Param__3> params) {
        this.params = params;
        return this;
    }

    /**
     * Contains the reference to an existing StepAction.
     * 
     */
    @JsonProperty("ref")
    public Ref getRef() {
        return ref;
    }

    /**
     * Contains the reference to an existing StepAction.
     * 
     */
    @JsonProperty("ref")
    public void setRef(Ref ref) {
        this.ref = ref;
    }

    public Step__1 withRef(Ref ref) {
        this.ref = ref;
        return this;
    }

    /**
     * Results declares StepResults produced by the Step.
     * 
     * It can be used in an inlined Step when used to store Results to $(step.results.resultName.path).
     * It cannot be used when referencing StepActions using [v1.Step.Ref].
     * The Results declared by the StepActions will be stored here instead.
     * 
     */
    @JsonProperty("results")
    public List<Result__3> getResults() {
        return results;
    }

    /**
     * Results declares StepResults produced by the Step.
     * 
     * It can be used in an inlined Step when used to store Results to $(step.results.resultName.path).
     * It cannot be used when referencing StepActions using [v1.Step.Ref].
     * The Results declared by the StepActions will be stored here instead.
     * 
     */
    @JsonProperty("results")
    public void setResults(List<Result__3> results) {
        this.results = results;
    }

    public Step__1 withResults(List<Result__3> results) {
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

    public Step__1 withScript(String script) {
        this.script = script;
        return this;
    }

    /**
     * SecurityContext defines the security options the Step should be run with.
     * If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
     * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    @JsonProperty("securityContext")
    public SecurityContext__2 getSecurityContext() {
        return securityContext;
    }

    /**
     * SecurityContext defines the security options the Step should be run with.
     * If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
     * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    @JsonProperty("securityContext")
    public void setSecurityContext(SecurityContext__2 securityContext) {
        this.securityContext = securityContext;
    }

    public Step__1 withSecurityContext(SecurityContext__2 securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    /**
     * Stores configuration for the stderr stream of the step.
     * 
     */
    @JsonProperty("stderrConfig")
    public StderrConfig getStderrConfig() {
        return stderrConfig;
    }

    /**
     * Stores configuration for the stderr stream of the step.
     * 
     */
    @JsonProperty("stderrConfig")
    public void setStderrConfig(StderrConfig stderrConfig) {
        this.stderrConfig = stderrConfig;
    }

    public Step__1 withStderrConfig(StderrConfig stderrConfig) {
        this.stderrConfig = stderrConfig;
        return this;
    }

    /**
     * Stores configuration for the stdout stream of the step.
     * 
     */
    @JsonProperty("stdoutConfig")
    public StdoutConfig getStdoutConfig() {
        return stdoutConfig;
    }

    /**
     * Stores configuration for the stdout stream of the step.
     * 
     */
    @JsonProperty("stdoutConfig")
    public void setStdoutConfig(StdoutConfig stdoutConfig) {
        this.stdoutConfig = stdoutConfig;
    }

    public Step__1 withStdoutConfig(StdoutConfig stdoutConfig) {
        this.stdoutConfig = stdoutConfig;
        return this;
    }

    /**
     * Timeout is the time after which the step times out. Defaults to never.
     * Refer to Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration
     * 
     */
    @JsonProperty("timeout")
    public String getTimeout() {
        return timeout;
    }

    /**
     * Timeout is the time after which the step times out. Defaults to never.
     * Refer to Go's ParseDuration documentation for expected format: https://golang.org/pkg/time/#ParseDuration
     * 
     */
    @JsonProperty("timeout")
    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public Step__1 withTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * volumeDevices is the list of block devices to be used by the Step.
     * 
     */
    @JsonProperty("volumeDevices")
    public List<VolumeDevice__2> getVolumeDevices() {
        return volumeDevices;
    }

    /**
     * volumeDevices is the list of block devices to be used by the Step.
     * 
     */
    @JsonProperty("volumeDevices")
    public void setVolumeDevices(List<VolumeDevice__2> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public Step__1 withVolumeDevices(List<VolumeDevice__2> volumeDevices) {
        this.volumeDevices = volumeDevices;
        return this;
    }

    /**
     * Volumes to mount into the Step's filesystem.
     * Cannot be updated.
     * 
     */
    @JsonProperty("volumeMounts")
    public List<VolumeMount__2> getVolumeMounts() {
        return volumeMounts;
    }

    /**
     * Volumes to mount into the Step's filesystem.
     * Cannot be updated.
     * 
     */
    @JsonProperty("volumeMounts")
    public void setVolumeMounts(List<VolumeMount__2> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    public Step__1 withVolumeMounts(List<VolumeMount__2> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }

    /**
     * When is a list of when expressions that need to be true for the task to run
     * 
     */
    @JsonProperty("when")
    public List<When> getWhen() {
        return when;
    }

    /**
     * When is a list of when expressions that need to be true for the task to run
     * 
     */
    @JsonProperty("when")
    public void setWhen(List<When> when) {
        this.when = when;
    }

    public Step__1 withWhen(List<When> when) {
        this.when = when;
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

    public Step__1 withWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    /**
     * This is an alpha field. You must set the "enable-api-fields" feature flag to "alpha"
     * for this field to be supported.
     * 
     * Workspaces is a list of workspaces from the Task that this Step wants
     * exclusive access to. Adding a workspace to this list means that any
     * other Step or Sidecar that does not also request this Workspace will
     * not have access to it.
     * 
     */
    @JsonProperty("workspaces")
    public List<Workspace__2> getWorkspaces() {
        return workspaces;
    }

    /**
     * This is an alpha field. You must set the "enable-api-fields" feature flag to "alpha"
     * for this field to be supported.
     * 
     * Workspaces is a list of workspaces from the Task that this Step wants
     * exclusive access to. Adding a workspace to this list means that any
     * other Step or Sidecar that does not also request this Workspace will
     * not have access to it.
     * 
     */
    @JsonProperty("workspaces")
    public void setWorkspaces(List<Workspace__2> workspaces) {
        this.workspaces = workspaces;
    }

    public Step__1 withWorkspaces(List<Workspace__2> workspaces) {
        this.workspaces = workspaces;
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

    public Step__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Step__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("onError");
        sb.append('=');
        sb.append(((this.onError == null)?"<null>":this.onError));
        sb.append(',');
        sb.append("params");
        sb.append('=');
        sb.append(((this.params == null)?"<null>":this.params));
        sb.append(',');
        sb.append("ref");
        sb.append('=');
        sb.append(((this.ref == null)?"<null>":this.ref));
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
        sb.append("stderrConfig");
        sb.append('=');
        sb.append(((this.stderrConfig == null)?"<null>":this.stderrConfig));
        sb.append(',');
        sb.append("stdoutConfig");
        sb.append('=');
        sb.append(((this.stdoutConfig == null)?"<null>":this.stdoutConfig));
        sb.append(',');
        sb.append("timeout");
        sb.append('=');
        sb.append(((this.timeout == null)?"<null>":this.timeout));
        sb.append(',');
        sb.append("volumeDevices");
        sb.append('=');
        sb.append(((this.volumeDevices == null)?"<null>":this.volumeDevices));
        sb.append(',');
        sb.append("volumeMounts");
        sb.append('=');
        sb.append(((this.volumeMounts == null)?"<null>":this.volumeMounts));
        sb.append(',');
        sb.append("when");
        sb.append('=');
        sb.append(((this.when == null)?"<null>":this.when));
        sb.append(',');
        sb.append("workingDir");
        sb.append('=');
        sb.append(((this.workingDir == null)?"<null>":this.workingDir));
        sb.append(',');
        sb.append("workspaces");
        sb.append('=');
        sb.append(((this.workspaces == null)?"<null>":this.workspaces));
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
        result = ((result* 31)+((this.onError == null)? 0 :this.onError.hashCode()));
        result = ((result* 31)+((this.stdoutConfig == null)? 0 :this.stdoutConfig.hashCode()));
        result = ((result* 31)+((this.workingDir == null)? 0 :this.workingDir.hashCode()));
        result = ((result* 31)+((this.securityContext == null)? 0 :this.securityContext.hashCode()));
        result = ((result* 31)+((this.stderrConfig == null)? 0 :this.stderrConfig.hashCode()));
        result = ((result* 31)+((this.env == null)? 0 :this.env.hashCode()));
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        result = ((result* 31)+((this.when == null)? 0 :this.when.hashCode()));
        result = ((result* 31)+((this.command == null)? 0 :this.command.hashCode()));
        result = ((result* 31)+((this.script == null)? 0 :this.script.hashCode()));
        result = ((result* 31)+((this.timeout == null)? 0 :this.timeout.hashCode()));
        result = ((result* 31)+((this.volumeMounts == null)? 0 :this.volumeMounts.hashCode()));
        result = ((result* 31)+((this.args == null)? 0 :this.args.hashCode()));
        result = ((result* 31)+((this.ref == null)? 0 :this.ref.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.computeResources == null)? 0 :this.computeResources.hashCode()));
        result = ((result* 31)+((this.workspaces == null)? 0 :this.workspaces.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.envFrom == null)? 0 :this.envFrom.hashCode()));
        result = ((result* 31)+((this.results == null)? 0 :this.results.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Step__1) == false) {
            return false;
        }
        Step__1 rhs = ((Step__1) other);
        return ((((((((((((((((((((((((this.volumeDevices == rhs.volumeDevices)||((this.volumeDevices!= null)&&this.volumeDevices.equals(rhs.volumeDevices)))&&((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image))))&&((this.imagePullPolicy == rhs.imagePullPolicy)||((this.imagePullPolicy!= null)&&this.imagePullPolicy.equals(rhs.imagePullPolicy))))&&((this.onError == rhs.onError)||((this.onError!= null)&&this.onError.equals(rhs.onError))))&&((this.stdoutConfig == rhs.stdoutConfig)||((this.stdoutConfig!= null)&&this.stdoutConfig.equals(rhs.stdoutConfig))))&&((this.workingDir == rhs.workingDir)||((this.workingDir!= null)&&this.workingDir.equals(rhs.workingDir))))&&((this.securityContext == rhs.securityContext)||((this.securityContext!= null)&&this.securityContext.equals(rhs.securityContext))))&&((this.stderrConfig == rhs.stderrConfig)||((this.stderrConfig!= null)&&this.stderrConfig.equals(rhs.stderrConfig))))&&((this.env == rhs.env)||((this.env!= null)&&this.env.equals(rhs.env))))&&((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params))))&&((this.when == rhs.when)||((this.when!= null)&&this.when.equals(rhs.when))))&&((this.command == rhs.command)||((this.command!= null)&&this.command.equals(rhs.command))))&&((this.script == rhs.script)||((this.script!= null)&&this.script.equals(rhs.script))))&&((this.timeout == rhs.timeout)||((this.timeout!= null)&&this.timeout.equals(rhs.timeout))))&&((this.volumeMounts == rhs.volumeMounts)||((this.volumeMounts!= null)&&this.volumeMounts.equals(rhs.volumeMounts))))&&((this.args == rhs.args)||((this.args!= null)&&this.args.equals(rhs.args))))&&((this.ref == rhs.ref)||((this.ref!= null)&&this.ref.equals(rhs.ref))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.computeResources == rhs.computeResources)||((this.computeResources!= null)&&this.computeResources.equals(rhs.computeResources))))&&((this.workspaces == rhs.workspaces)||((this.workspaces!= null)&&this.workspaces.equals(rhs.workspaces))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.envFrom == rhs.envFrom)||((this.envFrom!= null)&&this.envFrom.equals(rhs.envFrom))))&&((this.results == rhs.results)||((this.results!= null)&&this.results.equals(rhs.results))));
    }

}
