
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
 * Sidecar has nearly the same data structure as Step but does not have the ability to timeout.
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
    "lifecycle",
    "livenessProbe",
    "name",
    "ports",
    "readinessProbe",
    "restartPolicy",
    "script",
    "securityContext",
    "startupProbe",
    "stdin",
    "stdinOnce",
    "terminationMessagePath",
    "terminationMessagePolicy",
    "tty",
    "volumeDevices",
    "volumeMounts",
    "workingDir",
    "workspaces"
})
@Generated("jsonschema2pojo")
public class Sidecar__1 {

    /**
     * Arguments to the entrypoint.
     * The image's CMD is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the Sidecar's environment. If a variable
     * cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced
     * to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will
     * produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless
     * of whether the variable exists or not. Cannot be updated.
     * More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @JsonProperty("args")
    @JsonPropertyDescription("Arguments to the entrypoint.\nThe image's CMD is used if this is not provided.\nVariable references $(VAR_NAME) are expanded using the Sidecar's environment. If a variable\ncannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced\nto a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will\nproduce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless\nof whether the variable exists or not. Cannot be updated.\nMore info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
    @Valid
    private List<String> args = new ArrayList<String>();
    /**
     * Entrypoint array. Not executed within a shell.
     * The image's ENTRYPOINT is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the Sidecar's environment. If a variable
     * cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced
     * to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will
     * produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless
     * of whether the variable exists or not. Cannot be updated.
     * More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @JsonProperty("command")
    @JsonPropertyDescription("Entrypoint array. Not executed within a shell.\nThe image's ENTRYPOINT is used if this is not provided.\nVariable references $(VAR_NAME) are expanded using the Sidecar's environment. If a variable\ncannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced\nto a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will\nproduce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless\nof whether the variable exists or not. Cannot be updated.\nMore info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
    @Valid
    private List<String> command = new ArrayList<String>();
    /**
     * ComputeResources required by this Sidecar.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("computeResources")
    @JsonPropertyDescription("ComputeResources required by this Sidecar.\nCannot be updated.\nMore info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")
    @Valid
    private ComputeResources__3 computeResources;
    /**
     * List of environment variables to set in the Sidecar.
     * Cannot be updated.
     * 
     */
    @JsonProperty("env")
    @JsonPropertyDescription("List of environment variables to set in the Sidecar.\nCannot be updated.")
    @Valid
    private List<Env__1> env = new ArrayList<Env__1>();
    /**
     * List of sources to populate environment variables in the Sidecar.
     * The keys defined within a source must be a C_IDENTIFIER. All invalid keys
     * will be reported as an event when the container is starting. When a key exists in multiple
     * sources, the value associated with the last source will take precedence.
     * Values defined by an Env with a duplicate key will take precedence.
     * Cannot be updated.
     * 
     */
    @JsonProperty("envFrom")
    @JsonPropertyDescription("List of sources to populate environment variables in the Sidecar.\nThe keys defined within a source must be a C_IDENTIFIER. All invalid keys\nwill be reported as an event when the container is starting. When a key exists in multiple\nsources, the value associated with the last source will take precedence.\nValues defined by an Env with a duplicate key will take precedence.\nCannot be updated.")
    @Valid
    private List<EnvFrom> envFrom = new ArrayList<EnvFrom>();
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
     * Actions that the management system should take in response to Sidecar lifecycle events.
     * Cannot be updated.
     * 
     */
    @JsonProperty("lifecycle")
    @JsonPropertyDescription("Actions that the management system should take in response to Sidecar lifecycle events.\nCannot be updated.")
    @Valid
    private Lifecycle lifecycle;
    /**
     * Periodic probe of Sidecar liveness.
     * Container will be restarted if the probe fails.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("livenessProbe")
    @JsonPropertyDescription("Periodic probe of Sidecar liveness.\nContainer will be restarted if the probe fails.\nCannot be updated.\nMore info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
    @Valid
    private LivenessProbe livenessProbe;
    /**
     * Name of the Sidecar specified as a DNS_LABEL.
     * Each Sidecar in a Task must have a unique name (DNS_LABEL).
     * Cannot be updated.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the Sidecar specified as a DNS_LABEL.\nEach Sidecar in a Task must have a unique name (DNS_LABEL).\nCannot be updated.")
    @NotNull
    private String name;
    /**
     * List of ports to expose from the Sidecar. Exposing a port here gives
     * the system additional information about the network connections a
     * container uses, but is primarily informational. Not specifying a port here
     * DOES NOT prevent that port from being exposed. Any port which is
     * listening on the default "0.0.0.0" address inside a container will be
     * accessible from the network.
     * Cannot be updated.
     * 
     */
    @JsonProperty("ports")
    @JsonPropertyDescription("List of ports to expose from the Sidecar. Exposing a port here gives\nthe system additional information about the network connections a\ncontainer uses, but is primarily informational. Not specifying a port here\nDOES NOT prevent that port from being exposed. Any port which is\nlistening on the default \"0.0.0.0\" address inside a container will be\naccessible from the network.\nCannot be updated.")
    @Valid
    private List<Port> ports = new ArrayList<Port>();
    /**
     * Periodic probe of Sidecar service readiness.
     * Container will be removed from service endpoints if the probe fails.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("readinessProbe")
    @JsonPropertyDescription("Periodic probe of Sidecar service readiness.\nContainer will be removed from service endpoints if the probe fails.\nCannot be updated.\nMore info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
    @Valid
    private ReadinessProbe readinessProbe;
    /**
     * RestartPolicy refers to kubernetes RestartPolicy. It can only be set for an
     * initContainer and must have it's policy set to "Always". It is currently
     * left optional to help support Kubernetes versions prior to 1.29 when this feature
     * was introduced.
     * 
     */
    @JsonProperty("restartPolicy")
    @JsonPropertyDescription("RestartPolicy refers to kubernetes RestartPolicy. It can only be set for an\ninitContainer and must have it's policy set to \"Always\". It is currently\nleft optional to help support Kubernetes versions prior to 1.29 when this feature\nwas introduced.")
    private String restartPolicy;
    /**
     * Script is the contents of an executable file to execute.
     * 
     * If Script is not empty, the Step cannot have an Command or Args.
     * 
     */
    @JsonProperty("script")
    @JsonPropertyDescription("Script is the contents of an executable file to execute.\n\nIf Script is not empty, the Step cannot have an Command or Args.")
    private String script;
    /**
     * SecurityContext defines the security options the Sidecar should be run with.
     * If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
     * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    @JsonProperty("securityContext")
    @JsonPropertyDescription("SecurityContext defines the security options the Sidecar should be run with.\nIf set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.\nMore info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/")
    @Valid
    private SecurityContext securityContext;
    /**
     * StartupProbe indicates that the Pod the Sidecar is running in has successfully initialized.
     * If specified, no other probes are executed until this completes successfully.
     * If this probe fails, the Pod will be restarted, just as if the livenessProbe failed.
     * This can be used to provide different probe parameters at the beginning of a Pod's lifecycle,
     * when it might take a long time to load data or warm a cache, than during steady-state operation.
     * This cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("startupProbe")
    @JsonPropertyDescription("StartupProbe indicates that the Pod the Sidecar is running in has successfully initialized.\nIf specified, no other probes are executed until this completes successfully.\nIf this probe fails, the Pod will be restarted, just as if the livenessProbe failed.\nThis can be used to provide different probe parameters at the beginning of a Pod's lifecycle,\nwhen it might take a long time to load data or warm a cache, than during steady-state operation.\nThis cannot be updated.\nMore info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
    @Valid
    private StartupProbe startupProbe;
    /**
     * Whether this Sidecar should allocate a buffer for stdin in the container runtime. If this
     * is not set, reads from stdin in the Sidecar will always result in EOF.
     * Default is false.
     * 
     */
    @JsonProperty("stdin")
    @JsonPropertyDescription("Whether this Sidecar should allocate a buffer for stdin in the container runtime. If this\nis not set, reads from stdin in the Sidecar will always result in EOF.\nDefault is false.")
    private Boolean stdin;
    /**
     * Whether the container runtime should close the stdin channel after it has been opened by
     * a single attach. When stdin is true the stdin stream will remain open across multiple attach
     * sessions. If stdinOnce is set to true, stdin is opened on Sidecar start, is empty until the
     * first client attaches to stdin, and then remains open and accepts data until the client disconnects,
     * at which time stdin is closed and remains closed until the Sidecar is restarted. If this
     * flag is false, a container processes that reads from stdin will never receive an EOF.
     * Default is false
     * 
     */
    @JsonProperty("stdinOnce")
    @JsonPropertyDescription("Whether the container runtime should close the stdin channel after it has been opened by\na single attach. When stdin is true the stdin stream will remain open across multiple attach\nsessions. If stdinOnce is set to true, stdin is opened on Sidecar start, is empty until the\nfirst client attaches to stdin, and then remains open and accepts data until the client disconnects,\nat which time stdin is closed and remains closed until the Sidecar is restarted. If this\nflag is false, a container processes that reads from stdin will never receive an EOF.\nDefault is false")
    private Boolean stdinOnce;
    /**
     * Optional: Path at which the file to which the Sidecar's termination message
     * will be written is mounted into the Sidecar's filesystem.
     * Message written is intended to be brief final status, such as an assertion failure message.
     * Will be truncated by the node if greater than 4096 bytes. The total message length across
     * all containers will be limited to 12kb.
     * Defaults to /dev/termination-log.
     * Cannot be updated.
     * 
     */
    @JsonProperty("terminationMessagePath")
    @JsonPropertyDescription("Optional: Path at which the file to which the Sidecar's termination message\nwill be written is mounted into the Sidecar's filesystem.\nMessage written is intended to be brief final status, such as an assertion failure message.\nWill be truncated by the node if greater than 4096 bytes. The total message length across\nall containers will be limited to 12kb.\nDefaults to /dev/termination-log.\nCannot be updated.")
    private String terminationMessagePath;
    /**
     * Indicate how the termination message should be populated. File will use the contents of
     * terminationMessagePath to populate the Sidecar status message on both success and failure.
     * FallbackToLogsOnError will use the last chunk of Sidecar log output if the termination
     * message file is empty and the Sidecar exited with an error.
     * The log output is limited to 2048 bytes or 80 lines, whichever is smaller.
     * Defaults to File.
     * Cannot be updated.
     * 
     */
    @JsonProperty("terminationMessagePolicy")
    @JsonPropertyDescription("Indicate how the termination message should be populated. File will use the contents of\nterminationMessagePath to populate the Sidecar status message on both success and failure.\nFallbackToLogsOnError will use the last chunk of Sidecar log output if the termination\nmessage file is empty and the Sidecar exited with an error.\nThe log output is limited to 2048 bytes or 80 lines, whichever is smaller.\nDefaults to File.\nCannot be updated.")
    private String terminationMessagePolicy;
    /**
     * Whether this Sidecar should allocate a TTY for itself, also requires 'stdin' to be true.
     * Default is false.
     * 
     */
    @JsonProperty("tty")
    @JsonPropertyDescription("Whether this Sidecar should allocate a TTY for itself, also requires 'stdin' to be true.\nDefault is false.")
    private Boolean tty;
    /**
     * volumeDevices is the list of block devices to be used by the Sidecar.
     * 
     */
    @JsonProperty("volumeDevices")
    @JsonPropertyDescription("volumeDevices is the list of block devices to be used by the Sidecar.")
    @Valid
    private List<VolumeDevice> volumeDevices = new ArrayList<VolumeDevice>();
    /**
     * Volumes to mount into the Sidecar's filesystem.
     * Cannot be updated.
     * 
     */
    @JsonProperty("volumeMounts")
    @JsonPropertyDescription("Volumes to mount into the Sidecar's filesystem.\nCannot be updated.")
    @Valid
    private List<VolumeMount> volumeMounts = new ArrayList<VolumeMount>();
    /**
     * Sidecar's working directory.
     * If not specified, the container runtime's default will be used, which
     * might be configured in the container image.
     * Cannot be updated.
     * 
     */
    @JsonProperty("workingDir")
    @JsonPropertyDescription("Sidecar's working directory.\nIf not specified, the container runtime's default will be used, which\nmight be configured in the container image.\nCannot be updated.")
    private String workingDir;
    /**
     * This is an alpha field. You must set the "enable-api-fields" feature flag to "alpha"
     * for this field to be supported.
     * 
     * Workspaces is a list of workspaces from the Task that this Sidecar wants
     * exclusive access to. Adding a workspace to this list means that any
     * other Step or Sidecar that does not also request this Workspace will
     * not have access to it.
     * 
     */
    @JsonProperty("workspaces")
    @JsonPropertyDescription("This is an alpha field. You must set the \"enable-api-fields\" feature flag to \"alpha\"\nfor this field to be supported.\n\nWorkspaces is a list of workspaces from the Task that this Sidecar wants\nexclusive access to. Adding a workspace to this list means that any\nother Step or Sidecar that does not also request this Workspace will\nnot have access to it.")
    @Valid
    private List<Workspace__1> workspaces = new ArrayList<Workspace__1>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Arguments to the entrypoint.
     * The image's CMD is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the Sidecar's environment. If a variable
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
     * Variable references $(VAR_NAME) are expanded using the Sidecar's environment. If a variable
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

    public Sidecar__1 withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    /**
     * Entrypoint array. Not executed within a shell.
     * The image's ENTRYPOINT is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the Sidecar's environment. If a variable
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
     * Variable references $(VAR_NAME) are expanded using the Sidecar's environment. If a variable
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

    public Sidecar__1 withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    /**
     * ComputeResources required by this Sidecar.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("computeResources")
    public ComputeResources__3 getComputeResources() {
        return computeResources;
    }

    /**
     * ComputeResources required by this Sidecar.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("computeResources")
    public void setComputeResources(ComputeResources__3 computeResources) {
        this.computeResources = computeResources;
    }

    public Sidecar__1 withComputeResources(ComputeResources__3 computeResources) {
        this.computeResources = computeResources;
        return this;
    }

    /**
     * List of environment variables to set in the Sidecar.
     * Cannot be updated.
     * 
     */
    @JsonProperty("env")
    public List<Env__1> getEnv() {
        return env;
    }

    /**
     * List of environment variables to set in the Sidecar.
     * Cannot be updated.
     * 
     */
    @JsonProperty("env")
    public void setEnv(List<Env__1> env) {
        this.env = env;
    }

    public Sidecar__1 withEnv(List<Env__1> env) {
        this.env = env;
        return this;
    }

    /**
     * List of sources to populate environment variables in the Sidecar.
     * The keys defined within a source must be a C_IDENTIFIER. All invalid keys
     * will be reported as an event when the container is starting. When a key exists in multiple
     * sources, the value associated with the last source will take precedence.
     * Values defined by an Env with a duplicate key will take precedence.
     * Cannot be updated.
     * 
     */
    @JsonProperty("envFrom")
    public List<EnvFrom> getEnvFrom() {
        return envFrom;
    }

    /**
     * List of sources to populate environment variables in the Sidecar.
     * The keys defined within a source must be a C_IDENTIFIER. All invalid keys
     * will be reported as an event when the container is starting. When a key exists in multiple
     * sources, the value associated with the last source will take precedence.
     * Values defined by an Env with a duplicate key will take precedence.
     * Cannot be updated.
     * 
     */
    @JsonProperty("envFrom")
    public void setEnvFrom(List<EnvFrom> envFrom) {
        this.envFrom = envFrom;
    }

    public Sidecar__1 withEnvFrom(List<EnvFrom> envFrom) {
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

    public Sidecar__1 withImage(String image) {
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

    public Sidecar__1 withImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
        return this;
    }

    /**
     * Actions that the management system should take in response to Sidecar lifecycle events.
     * Cannot be updated.
     * 
     */
    @JsonProperty("lifecycle")
    public Lifecycle getLifecycle() {
        return lifecycle;
    }

    /**
     * Actions that the management system should take in response to Sidecar lifecycle events.
     * Cannot be updated.
     * 
     */
    @JsonProperty("lifecycle")
    public void setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public Sidecar__1 withLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * Periodic probe of Sidecar liveness.
     * Container will be restarted if the probe fails.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("livenessProbe")
    public LivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    /**
     * Periodic probe of Sidecar liveness.
     * Container will be restarted if the probe fails.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("livenessProbe")
    public void setLivenessProbe(LivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public Sidecar__1 withLivenessProbe(LivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    /**
     * Name of the Sidecar specified as a DNS_LABEL.
     * Each Sidecar in a Task must have a unique name (DNS_LABEL).
     * Cannot be updated.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the Sidecar specified as a DNS_LABEL.
     * Each Sidecar in a Task must have a unique name (DNS_LABEL).
     * Cannot be updated.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Sidecar__1 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * List of ports to expose from the Sidecar. Exposing a port here gives
     * the system additional information about the network connections a
     * container uses, but is primarily informational. Not specifying a port here
     * DOES NOT prevent that port from being exposed. Any port which is
     * listening on the default "0.0.0.0" address inside a container will be
     * accessible from the network.
     * Cannot be updated.
     * 
     */
    @JsonProperty("ports")
    public List<Port> getPorts() {
        return ports;
    }

    /**
     * List of ports to expose from the Sidecar. Exposing a port here gives
     * the system additional information about the network connections a
     * container uses, but is primarily informational. Not specifying a port here
     * DOES NOT prevent that port from being exposed. Any port which is
     * listening on the default "0.0.0.0" address inside a container will be
     * accessible from the network.
     * Cannot be updated.
     * 
     */
    @JsonProperty("ports")
    public void setPorts(List<Port> ports) {
        this.ports = ports;
    }

    public Sidecar__1 withPorts(List<Port> ports) {
        this.ports = ports;
        return this;
    }

    /**
     * Periodic probe of Sidecar service readiness.
     * Container will be removed from service endpoints if the probe fails.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("readinessProbe")
    public ReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    /**
     * Periodic probe of Sidecar service readiness.
     * Container will be removed from service endpoints if the probe fails.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("readinessProbe")
    public void setReadinessProbe(ReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public Sidecar__1 withReadinessProbe(ReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    /**
     * RestartPolicy refers to kubernetes RestartPolicy. It can only be set for an
     * initContainer and must have it's policy set to "Always". It is currently
     * left optional to help support Kubernetes versions prior to 1.29 when this feature
     * was introduced.
     * 
     */
    @JsonProperty("restartPolicy")
    public String getRestartPolicy() {
        return restartPolicy;
    }

    /**
     * RestartPolicy refers to kubernetes RestartPolicy. It can only be set for an
     * initContainer and must have it's policy set to "Always". It is currently
     * left optional to help support Kubernetes versions prior to 1.29 when this feature
     * was introduced.
     * 
     */
    @JsonProperty("restartPolicy")
    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public Sidecar__1 withRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    /**
     * Script is the contents of an executable file to execute.
     * 
     * If Script is not empty, the Step cannot have an Command or Args.
     * 
     */
    @JsonProperty("script")
    public String getScript() {
        return script;
    }

    /**
     * Script is the contents of an executable file to execute.
     * 
     * If Script is not empty, the Step cannot have an Command or Args.
     * 
     */
    @JsonProperty("script")
    public void setScript(String script) {
        this.script = script;
    }

    public Sidecar__1 withScript(String script) {
        this.script = script;
        return this;
    }

    /**
     * SecurityContext defines the security options the Sidecar should be run with.
     * If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
     * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    @JsonProperty("securityContext")
    public SecurityContext getSecurityContext() {
        return securityContext;
    }

    /**
     * SecurityContext defines the security options the Sidecar should be run with.
     * If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
     * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     * 
     */
    @JsonProperty("securityContext")
    public void setSecurityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public Sidecar__1 withSecurityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    /**
     * StartupProbe indicates that the Pod the Sidecar is running in has successfully initialized.
     * If specified, no other probes are executed until this completes successfully.
     * If this probe fails, the Pod will be restarted, just as if the livenessProbe failed.
     * This can be used to provide different probe parameters at the beginning of a Pod's lifecycle,
     * when it might take a long time to load data or warm a cache, than during steady-state operation.
     * This cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("startupProbe")
    public StartupProbe getStartupProbe() {
        return startupProbe;
    }

    /**
     * StartupProbe indicates that the Pod the Sidecar is running in has successfully initialized.
     * If specified, no other probes are executed until this completes successfully.
     * If this probe fails, the Pod will be restarted, just as if the livenessProbe failed.
     * This can be used to provide different probe parameters at the beginning of a Pod's lifecycle,
     * when it might take a long time to load data or warm a cache, than during steady-state operation.
     * This cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("startupProbe")
    public void setStartupProbe(StartupProbe startupProbe) {
        this.startupProbe = startupProbe;
    }

    public Sidecar__1 withStartupProbe(StartupProbe startupProbe) {
        this.startupProbe = startupProbe;
        return this;
    }

    /**
     * Whether this Sidecar should allocate a buffer for stdin in the container runtime. If this
     * is not set, reads from stdin in the Sidecar will always result in EOF.
     * Default is false.
     * 
     */
    @JsonProperty("stdin")
    public Boolean getStdin() {
        return stdin;
    }

    /**
     * Whether this Sidecar should allocate a buffer for stdin in the container runtime. If this
     * is not set, reads from stdin in the Sidecar will always result in EOF.
     * Default is false.
     * 
     */
    @JsonProperty("stdin")
    public void setStdin(Boolean stdin) {
        this.stdin = stdin;
    }

    public Sidecar__1 withStdin(Boolean stdin) {
        this.stdin = stdin;
        return this;
    }

    /**
     * Whether the container runtime should close the stdin channel after it has been opened by
     * a single attach. When stdin is true the stdin stream will remain open across multiple attach
     * sessions. If stdinOnce is set to true, stdin is opened on Sidecar start, is empty until the
     * first client attaches to stdin, and then remains open and accepts data until the client disconnects,
     * at which time stdin is closed and remains closed until the Sidecar is restarted. If this
     * flag is false, a container processes that reads from stdin will never receive an EOF.
     * Default is false
     * 
     */
    @JsonProperty("stdinOnce")
    public Boolean getStdinOnce() {
        return stdinOnce;
    }

    /**
     * Whether the container runtime should close the stdin channel after it has been opened by
     * a single attach. When stdin is true the stdin stream will remain open across multiple attach
     * sessions. If stdinOnce is set to true, stdin is opened on Sidecar start, is empty until the
     * first client attaches to stdin, and then remains open and accepts data until the client disconnects,
     * at which time stdin is closed and remains closed until the Sidecar is restarted. If this
     * flag is false, a container processes that reads from stdin will never receive an EOF.
     * Default is false
     * 
     */
    @JsonProperty("stdinOnce")
    public void setStdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
    }

    public Sidecar__1 withStdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
        return this;
    }

    /**
     * Optional: Path at which the file to which the Sidecar's termination message
     * will be written is mounted into the Sidecar's filesystem.
     * Message written is intended to be brief final status, such as an assertion failure message.
     * Will be truncated by the node if greater than 4096 bytes. The total message length across
     * all containers will be limited to 12kb.
     * Defaults to /dev/termination-log.
     * Cannot be updated.
     * 
     */
    @JsonProperty("terminationMessagePath")
    public String getTerminationMessagePath() {
        return terminationMessagePath;
    }

    /**
     * Optional: Path at which the file to which the Sidecar's termination message
     * will be written is mounted into the Sidecar's filesystem.
     * Message written is intended to be brief final status, such as an assertion failure message.
     * Will be truncated by the node if greater than 4096 bytes. The total message length across
     * all containers will be limited to 12kb.
     * Defaults to /dev/termination-log.
     * Cannot be updated.
     * 
     */
    @JsonProperty("terminationMessagePath")
    public void setTerminationMessagePath(String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
    }

    public Sidecar__1 withTerminationMessagePath(String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
        return this;
    }

    /**
     * Indicate how the termination message should be populated. File will use the contents of
     * terminationMessagePath to populate the Sidecar status message on both success and failure.
     * FallbackToLogsOnError will use the last chunk of Sidecar log output if the termination
     * message file is empty and the Sidecar exited with an error.
     * The log output is limited to 2048 bytes or 80 lines, whichever is smaller.
     * Defaults to File.
     * Cannot be updated.
     * 
     */
    @JsonProperty("terminationMessagePolicy")
    public String getTerminationMessagePolicy() {
        return terminationMessagePolicy;
    }

    /**
     * Indicate how the termination message should be populated. File will use the contents of
     * terminationMessagePath to populate the Sidecar status message on both success and failure.
     * FallbackToLogsOnError will use the last chunk of Sidecar log output if the termination
     * message file is empty and the Sidecar exited with an error.
     * The log output is limited to 2048 bytes or 80 lines, whichever is smaller.
     * Defaults to File.
     * Cannot be updated.
     * 
     */
    @JsonProperty("terminationMessagePolicy")
    public void setTerminationMessagePolicy(String terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
    }

    public Sidecar__1 withTerminationMessagePolicy(String terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
        return this;
    }

    /**
     * Whether this Sidecar should allocate a TTY for itself, also requires 'stdin' to be true.
     * Default is false.
     * 
     */
    @JsonProperty("tty")
    public Boolean getTty() {
        return tty;
    }

    /**
     * Whether this Sidecar should allocate a TTY for itself, also requires 'stdin' to be true.
     * Default is false.
     * 
     */
    @JsonProperty("tty")
    public void setTty(Boolean tty) {
        this.tty = tty;
    }

    public Sidecar__1 withTty(Boolean tty) {
        this.tty = tty;
        return this;
    }

    /**
     * volumeDevices is the list of block devices to be used by the Sidecar.
     * 
     */
    @JsonProperty("volumeDevices")
    public List<VolumeDevice> getVolumeDevices() {
        return volumeDevices;
    }

    /**
     * volumeDevices is the list of block devices to be used by the Sidecar.
     * 
     */
    @JsonProperty("volumeDevices")
    public void setVolumeDevices(List<VolumeDevice> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public Sidecar__1 withVolumeDevices(List<VolumeDevice> volumeDevices) {
        this.volumeDevices = volumeDevices;
        return this;
    }

    /**
     * Volumes to mount into the Sidecar's filesystem.
     * Cannot be updated.
     * 
     */
    @JsonProperty("volumeMounts")
    public List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    /**
     * Volumes to mount into the Sidecar's filesystem.
     * Cannot be updated.
     * 
     */
    @JsonProperty("volumeMounts")
    public void setVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    public Sidecar__1 withVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }

    /**
     * Sidecar's working directory.
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
     * Sidecar's working directory.
     * If not specified, the container runtime's default will be used, which
     * might be configured in the container image.
     * Cannot be updated.
     * 
     */
    @JsonProperty("workingDir")
    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    public Sidecar__1 withWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    /**
     * This is an alpha field. You must set the "enable-api-fields" feature flag to "alpha"
     * for this field to be supported.
     * 
     * Workspaces is a list of workspaces from the Task that this Sidecar wants
     * exclusive access to. Adding a workspace to this list means that any
     * other Step or Sidecar that does not also request this Workspace will
     * not have access to it.
     * 
     */
    @JsonProperty("workspaces")
    public List<Workspace__1> getWorkspaces() {
        return workspaces;
    }

    /**
     * This is an alpha field. You must set the "enable-api-fields" feature flag to "alpha"
     * for this field to be supported.
     * 
     * Workspaces is a list of workspaces from the Task that this Sidecar wants
     * exclusive access to. Adding a workspace to this list means that any
     * other Step or Sidecar that does not also request this Workspace will
     * not have access to it.
     * 
     */
    @JsonProperty("workspaces")
    public void setWorkspaces(List<Workspace__1> workspaces) {
        this.workspaces = workspaces;
    }

    public Sidecar__1 withWorkspaces(List<Workspace__1> workspaces) {
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

    public Sidecar__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sidecar__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("lifecycle");
        sb.append('=');
        sb.append(((this.lifecycle == null)?"<null>":this.lifecycle));
        sb.append(',');
        sb.append("livenessProbe");
        sb.append('=');
        sb.append(((this.livenessProbe == null)?"<null>":this.livenessProbe));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("ports");
        sb.append('=');
        sb.append(((this.ports == null)?"<null>":this.ports));
        sb.append(',');
        sb.append("readinessProbe");
        sb.append('=');
        sb.append(((this.readinessProbe == null)?"<null>":this.readinessProbe));
        sb.append(',');
        sb.append("restartPolicy");
        sb.append('=');
        sb.append(((this.restartPolicy == null)?"<null>":this.restartPolicy));
        sb.append(',');
        sb.append("script");
        sb.append('=');
        sb.append(((this.script == null)?"<null>":this.script));
        sb.append(',');
        sb.append("securityContext");
        sb.append('=');
        sb.append(((this.securityContext == null)?"<null>":this.securityContext));
        sb.append(',');
        sb.append("startupProbe");
        sb.append('=');
        sb.append(((this.startupProbe == null)?"<null>":this.startupProbe));
        sb.append(',');
        sb.append("stdin");
        sb.append('=');
        sb.append(((this.stdin == null)?"<null>":this.stdin));
        sb.append(',');
        sb.append("stdinOnce");
        sb.append('=');
        sb.append(((this.stdinOnce == null)?"<null>":this.stdinOnce));
        sb.append(',');
        sb.append("terminationMessagePath");
        sb.append('=');
        sb.append(((this.terminationMessagePath == null)?"<null>":this.terminationMessagePath));
        sb.append(',');
        sb.append("terminationMessagePolicy");
        sb.append('=');
        sb.append(((this.terminationMessagePolicy == null)?"<null>":this.terminationMessagePolicy));
        sb.append(',');
        sb.append("tty");
        sb.append('=');
        sb.append(((this.tty == null)?"<null>":this.tty));
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
        result = ((result* 31)+((this.stdin == null)? 0 :this.stdin.hashCode()));
        result = ((result* 31)+((this.terminationMessagePolicy == null)? 0 :this.terminationMessagePolicy.hashCode()));
        result = ((result* 31)+((this.securityContext == null)? 0 :this.securityContext.hashCode()));
        result = ((result* 31)+((this.startupProbe == null)? 0 :this.startupProbe.hashCode()));
        result = ((result* 31)+((this.ports == null)? 0 :this.ports.hashCode()));
        result = ((result* 31)+((this.volumeMounts == null)? 0 :this.volumeMounts.hashCode()));
        result = ((result* 31)+((this.lifecycle == null)? 0 :this.lifecycle.hashCode()));
        result = ((result* 31)+((this.readinessProbe == null)? 0 :this.readinessProbe.hashCode()));
        result = ((result* 31)+((this.workspaces == null)? 0 :this.workspaces.hashCode()));
        result = ((result* 31)+((this.envFrom == null)? 0 :this.envFrom.hashCode()));
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.imagePullPolicy == null)? 0 :this.imagePullPolicy.hashCode()));
        result = ((result* 31)+((this.livenessProbe == null)? 0 :this.livenessProbe.hashCode()));
        result = ((result* 31)+((this.terminationMessagePath == null)? 0 :this.terminationMessagePath.hashCode()));
        result = ((result* 31)+((this.workingDir == null)? 0 :this.workingDir.hashCode()));
        result = ((result* 31)+((this.env == null)? 0 :this.env.hashCode()));
        result = ((result* 31)+((this.restartPolicy == null)? 0 :this.restartPolicy.hashCode()));
        result = ((result* 31)+((this.command == null)? 0 :this.command.hashCode()));
        result = ((result* 31)+((this.script == null)? 0 :this.script.hashCode()));
        result = ((result* 31)+((this.args == null)? 0 :this.args.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.tty == null)? 0 :this.tty.hashCode()));
        result = ((result* 31)+((this.computeResources == null)? 0 :this.computeResources.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stdinOnce == null)? 0 :this.stdinOnce.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sidecar__1) == false) {
            return false;
        }
        Sidecar__1 rhs = ((Sidecar__1) other);
        return (((((((((((((((((((((((((((this.volumeDevices == rhs.volumeDevices)||((this.volumeDevices!= null)&&this.volumeDevices.equals(rhs.volumeDevices)))&&((this.stdin == rhs.stdin)||((this.stdin!= null)&&this.stdin.equals(rhs.stdin))))&&((this.terminationMessagePolicy == rhs.terminationMessagePolicy)||((this.terminationMessagePolicy!= null)&&this.terminationMessagePolicy.equals(rhs.terminationMessagePolicy))))&&((this.securityContext == rhs.securityContext)||((this.securityContext!= null)&&this.securityContext.equals(rhs.securityContext))))&&((this.startupProbe == rhs.startupProbe)||((this.startupProbe!= null)&&this.startupProbe.equals(rhs.startupProbe))))&&((this.ports == rhs.ports)||((this.ports!= null)&&this.ports.equals(rhs.ports))))&&((this.volumeMounts == rhs.volumeMounts)||((this.volumeMounts!= null)&&this.volumeMounts.equals(rhs.volumeMounts))))&&((this.lifecycle == rhs.lifecycle)||((this.lifecycle!= null)&&this.lifecycle.equals(rhs.lifecycle))))&&((this.readinessProbe == rhs.readinessProbe)||((this.readinessProbe!= null)&&this.readinessProbe.equals(rhs.readinessProbe))))&&((this.workspaces == rhs.workspaces)||((this.workspaces!= null)&&this.workspaces.equals(rhs.workspaces))))&&((this.envFrom == rhs.envFrom)||((this.envFrom!= null)&&this.envFrom.equals(rhs.envFrom))))&&((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image))))&&((this.imagePullPolicy == rhs.imagePullPolicy)||((this.imagePullPolicy!= null)&&this.imagePullPolicy.equals(rhs.imagePullPolicy))))&&((this.livenessProbe == rhs.livenessProbe)||((this.livenessProbe!= null)&&this.livenessProbe.equals(rhs.livenessProbe))))&&((this.terminationMessagePath == rhs.terminationMessagePath)||((this.terminationMessagePath!= null)&&this.terminationMessagePath.equals(rhs.terminationMessagePath))))&&((this.workingDir == rhs.workingDir)||((this.workingDir!= null)&&this.workingDir.equals(rhs.workingDir))))&&((this.env == rhs.env)||((this.env!= null)&&this.env.equals(rhs.env))))&&((this.restartPolicy == rhs.restartPolicy)||((this.restartPolicy!= null)&&this.restartPolicy.equals(rhs.restartPolicy))))&&((this.command == rhs.command)||((this.command!= null)&&this.command.equals(rhs.command))))&&((this.script == rhs.script)||((this.script!= null)&&this.script.equals(rhs.script))))&&((this.args == rhs.args)||((this.args!= null)&&this.args.equals(rhs.args))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.tty == rhs.tty)||((this.tty!= null)&&this.tty.equals(rhs.tty))))&&((this.computeResources == rhs.computeResources)||((this.computeResources!= null)&&this.computeResources.equals(rhs.computeResources))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stdinOnce == rhs.stdinOnce)||((this.stdinOnce!= null)&&this.stdinOnce.equals(rhs.stdinOnce))));
    }

}
