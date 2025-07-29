
package io.tekton.crd.model.tasks.v1beta1;

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
 * StepTemplate can be used as the basis for all step containers within the
 * Task, so that the steps inherit settings on the base container.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "args",
    "command",
    "env",
    "envFrom",
    "image",
    "imagePullPolicy",
    "lifecycle",
    "livenessProbe",
    "name",
    "ports",
    "readinessProbe",
    "resources",
    "securityContext",
    "startupProbe",
    "stdin",
    "stdinOnce",
    "terminationMessagePath",
    "terminationMessagePolicy",
    "tty",
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
     * The docker image's ENTRYPOINT is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the Step's environment. If a variable
     * cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced
     * to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will
     * produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless
     * of whether the variable exists or not. Cannot be updated.
     * More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @JsonProperty("command")
    @JsonPropertyDescription("Entrypoint array. Not executed within a shell.\nThe docker image's ENTRYPOINT is used if this is not provided.\nVariable references $(VAR_NAME) are expanded using the Step's environment. If a variable\ncannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced\nto a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will\nproduce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless\nof whether the variable exists or not. Cannot be updated.\nMore info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
    @Valid
    private List<String> command = new ArrayList<String>();
    /**
     * List of environment variables to set in the container.
     * Cannot be updated.
     * 
     */
    @JsonProperty("env")
    @JsonPropertyDescription("List of environment variables to set in the container.\nCannot be updated.")
    @Valid
    private List<Env__1> env = new ArrayList<Env__1>();
    /**
     * List of sources to populate environment variables in the Step.
     * The keys defined within a source must be a C_IDENTIFIER. All invalid keys
     * will be reported as an event when the container is starting. When a key exists in multiple
     * sources, the value associated with the last source will take precedence.
     * Values defined by an Env with a duplicate key will take precedence.
     * Cannot be updated.
     * 
     */
    @JsonProperty("envFrom")
    @JsonPropertyDescription("List of sources to populate environment variables in the Step.\nThe keys defined within a source must be a C_IDENTIFIER. All invalid keys\nwill be reported as an event when the container is starting. When a key exists in multiple\nsources, the value associated with the last source will take precedence.\nValues defined by an Env with a duplicate key will take precedence.\nCannot be updated.")
    @Valid
    private List<EnvFrom__1> envFrom = new ArrayList<EnvFrom__1>();
    /**
     * Default image name to use for each Step.
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * This field is optional to allow higher level config management to default or override
     * container images in workload controllers like Deployments and StatefulSets.
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("Default image name to use for each Step.\nMore info: https://kubernetes.io/docs/concepts/containers/images\nThis field is optional to allow higher level config management to default or override\ncontainer images in workload controllers like Deployments and StatefulSets.")
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
     * Actions that the management system should take in response to container lifecycle events.
     * Cannot be updated.
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("lifecycle")
    @JsonPropertyDescription("Actions that the management system should take in response to container lifecycle events.\nCannot be updated.\n\nDeprecated: This field will be removed in a future release.")
    @Valid
    private Lifecycle__1 lifecycle;
    /**
     * Periodic probe of container liveness.
     * Container will be restarted if the probe fails.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("livenessProbe")
    @JsonPropertyDescription("Periodic probe of container liveness.\nContainer will be restarted if the probe fails.\nCannot be updated.\nMore info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes\n\nDeprecated: This field will be removed in a future release.")
    @Valid
    private LivenessProbe__1 livenessProbe;
    /**
     * Default name for each Step specified as a DNS_LABEL.
     * Each Step in a Task must have a unique name.
     * Cannot be updated.
     * 
     * Deprecated: This field will be removed in a future release.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Default name for each Step specified as a DNS_LABEL.\nEach Step in a Task must have a unique name.\nCannot be updated.\n\nDeprecated: This field will be removed in a future release.")
    @NotNull
    private String name;
    /**
     * List of ports to expose from the Step's container. Exposing a port here gives
     * the system additional information about the network connections a
     * container uses, but is primarily informational. Not specifying a port here
     * DOES NOT prevent that port from being exposed. Any port which is
     * listening on the default "0.0.0.0" address inside a container will be
     * accessible from the network.
     * Cannot be updated.
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("ports")
    @JsonPropertyDescription("List of ports to expose from the Step's container. Exposing a port here gives\nthe system additional information about the network connections a\ncontainer uses, but is primarily informational. Not specifying a port here\nDOES NOT prevent that port from being exposed. Any port which is\nlistening on the default \"0.0.0.0\" address inside a container will be\naccessible from the network.\nCannot be updated.\n\nDeprecated: This field will be removed in a future release.")
    @Valid
    private List<Port__1> ports = new ArrayList<Port__1>();
    /**
     * Periodic probe of container service readiness.
     * Container will be removed from service endpoints if the probe fails.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("readinessProbe")
    @JsonPropertyDescription("Periodic probe of container service readiness.\nContainer will be removed from service endpoints if the probe fails.\nCannot be updated.\nMore info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes\n\nDeprecated: This field will be removed in a future release.")
    @Valid
    private ReadinessProbe__1 readinessProbe;
    /**
     * Compute Resources required by this Step.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("Compute Resources required by this Step.\nCannot be updated.\nMore info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")
    @Valid
    private Resources__2 resources;
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
     * DeprecatedStartupProbe indicates that the Pod has successfully initialized.
     * If specified, no other probes are executed until this completes successfully.
     * If this probe fails, the Pod will be restarted, just as if the livenessProbe failed.
     * This can be used to provide different probe parameters at the beginning of a Pod's lifecycle,
     * when it might take a long time to load data or warm a cache, than during steady-state operation.
     * This cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("startupProbe")
    @JsonPropertyDescription("DeprecatedStartupProbe indicates that the Pod has successfully initialized.\nIf specified, no other probes are executed until this completes successfully.\nIf this probe fails, the Pod will be restarted, just as if the livenessProbe failed.\nThis can be used to provide different probe parameters at the beginning of a Pod's lifecycle,\nwhen it might take a long time to load data or warm a cache, than during steady-state operation.\nThis cannot be updated.\nMore info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes\n\nDeprecated: This field will be removed in a future release.")
    @Valid
    private StartupProbe__1 startupProbe;
    /**
     * Whether this Step should allocate a buffer for stdin in the container runtime. If this
     * is not set, reads from stdin in the Step will always result in EOF.
     * Default is false.
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("stdin")
    @JsonPropertyDescription("Whether this Step should allocate a buffer for stdin in the container runtime. If this\nis not set, reads from stdin in the Step will always result in EOF.\nDefault is false.\n\nDeprecated: This field will be removed in a future release.")
    private Boolean stdin;
    /**
     * Whether the container runtime should close the stdin channel after it has been opened by
     * a single attach. When stdin is true the stdin stream will remain open across multiple attach
     * sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the
     * first client attaches to stdin, and then remains open and accepts data until the client disconnects,
     * at which time stdin is closed and remains closed until the container is restarted. If this
     * flag is false, a container processes that reads from stdin will never receive an EOF.
     * Default is false
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("stdinOnce")
    @JsonPropertyDescription("Whether the container runtime should close the stdin channel after it has been opened by\na single attach. When stdin is true the stdin stream will remain open across multiple attach\nsessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the\nfirst client attaches to stdin, and then remains open and accepts data until the client disconnects,\nat which time stdin is closed and remains closed until the container is restarted. If this\nflag is false, a container processes that reads from stdin will never receive an EOF.\nDefault is false\n\nDeprecated: This field will be removed in a future release.")
    private Boolean stdinOnce;
    /**
     * Deprecated: This field will be removed in a future release and cannot be meaningfully used.
     * 
     */
    @JsonProperty("terminationMessagePath")
    @JsonPropertyDescription("Deprecated: This field will be removed in a future release and cannot be meaningfully used.")
    private String terminationMessagePath;
    /**
     * Deprecated: This field will be removed in a future release and cannot be meaningfully used.
     * 
     */
    @JsonProperty("terminationMessagePolicy")
    @JsonPropertyDescription("Deprecated: This field will be removed in a future release and cannot be meaningfully used.")
    private String terminationMessagePolicy;
    /**
     * Whether this Step should allocate a DeprecatedTTY for itself, also requires 'stdin' to be true.
     * Default is false.
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("tty")
    @JsonPropertyDescription("Whether this Step should allocate a DeprecatedTTY for itself, also requires 'stdin' to be true.\nDefault is false.\n\nDeprecated: This field will be removed in a future release.")
    private Boolean tty;
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
     * The docker image's ENTRYPOINT is used if this is not provided.
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
     * The docker image's ENTRYPOINT is used if this is not provided.
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
     * List of environment variables to set in the container.
     * Cannot be updated.
     * 
     */
    @JsonProperty("env")
    public List<Env__1> getEnv() {
        return env;
    }

    /**
     * List of environment variables to set in the container.
     * Cannot be updated.
     * 
     */
    @JsonProperty("env")
    public void setEnv(List<Env__1> env) {
        this.env = env;
    }

    public StepTemplate withEnv(List<Env__1> env) {
        this.env = env;
        return this;
    }

    /**
     * List of sources to populate environment variables in the Step.
     * The keys defined within a source must be a C_IDENTIFIER. All invalid keys
     * will be reported as an event when the container is starting. When a key exists in multiple
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
     * will be reported as an event when the container is starting. When a key exists in multiple
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
     * Default image name to use for each Step.
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * This field is optional to allow higher level config management to default or override
     * container images in workload controllers like Deployments and StatefulSets.
     * 
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * Default image name to use for each Step.
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * This field is optional to allow higher level config management to default or override
     * container images in workload controllers like Deployments and StatefulSets.
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
     * Actions that the management system should take in response to container lifecycle events.
     * Cannot be updated.
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("lifecycle")
    public Lifecycle__1 getLifecycle() {
        return lifecycle;
    }

    /**
     * Actions that the management system should take in response to container lifecycle events.
     * Cannot be updated.
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("lifecycle")
    public void setLifecycle(Lifecycle__1 lifecycle) {
        this.lifecycle = lifecycle;
    }

    public StepTemplate withLifecycle(Lifecycle__1 lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * Periodic probe of container liveness.
     * Container will be restarted if the probe fails.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("livenessProbe")
    public LivenessProbe__1 getLivenessProbe() {
        return livenessProbe;
    }

    /**
     * Periodic probe of container liveness.
     * Container will be restarted if the probe fails.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("livenessProbe")
    public void setLivenessProbe(LivenessProbe__1 livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public StepTemplate withLivenessProbe(LivenessProbe__1 livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    /**
     * Default name for each Step specified as a DNS_LABEL.
     * Each Step in a Task must have a unique name.
     * Cannot be updated.
     * 
     * Deprecated: This field will be removed in a future release.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Default name for each Step specified as a DNS_LABEL.
     * Each Step in a Task must have a unique name.
     * Cannot be updated.
     * 
     * Deprecated: This field will be removed in a future release.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public StepTemplate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * List of ports to expose from the Step's container. Exposing a port here gives
     * the system additional information about the network connections a
     * container uses, but is primarily informational. Not specifying a port here
     * DOES NOT prevent that port from being exposed. Any port which is
     * listening on the default "0.0.0.0" address inside a container will be
     * accessible from the network.
     * Cannot be updated.
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("ports")
    public List<Port__1> getPorts() {
        return ports;
    }

    /**
     * List of ports to expose from the Step's container. Exposing a port here gives
     * the system additional information about the network connections a
     * container uses, but is primarily informational. Not specifying a port here
     * DOES NOT prevent that port from being exposed. Any port which is
     * listening on the default "0.0.0.0" address inside a container will be
     * accessible from the network.
     * Cannot be updated.
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("ports")
    public void setPorts(List<Port__1> ports) {
        this.ports = ports;
    }

    public StepTemplate withPorts(List<Port__1> ports) {
        this.ports = ports;
        return this;
    }

    /**
     * Periodic probe of container service readiness.
     * Container will be removed from service endpoints if the probe fails.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("readinessProbe")
    public ReadinessProbe__1 getReadinessProbe() {
        return readinessProbe;
    }

    /**
     * Periodic probe of container service readiness.
     * Container will be removed from service endpoints if the probe fails.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("readinessProbe")
    public void setReadinessProbe(ReadinessProbe__1 readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public StepTemplate withReadinessProbe(ReadinessProbe__1 readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    /**
     * Compute Resources required by this Step.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("resources")
    public Resources__2 getResources() {
        return resources;
    }

    /**
     * Compute Resources required by this Step.
     * Cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    @JsonProperty("resources")
    public void setResources(Resources__2 resources) {
        this.resources = resources;
    }

    public StepTemplate withResources(Resources__2 resources) {
        this.resources = resources;
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
     * DeprecatedStartupProbe indicates that the Pod has successfully initialized.
     * If specified, no other probes are executed until this completes successfully.
     * If this probe fails, the Pod will be restarted, just as if the livenessProbe failed.
     * This can be used to provide different probe parameters at the beginning of a Pod's lifecycle,
     * when it might take a long time to load data or warm a cache, than during steady-state operation.
     * This cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("startupProbe")
    public StartupProbe__1 getStartupProbe() {
        return startupProbe;
    }

    /**
     * DeprecatedStartupProbe indicates that the Pod has successfully initialized.
     * If specified, no other probes are executed until this completes successfully.
     * If this probe fails, the Pod will be restarted, just as if the livenessProbe failed.
     * This can be used to provide different probe parameters at the beginning of a Pod's lifecycle,
     * when it might take a long time to load data or warm a cache, than during steady-state operation.
     * This cannot be updated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("startupProbe")
    public void setStartupProbe(StartupProbe__1 startupProbe) {
        this.startupProbe = startupProbe;
    }

    public StepTemplate withStartupProbe(StartupProbe__1 startupProbe) {
        this.startupProbe = startupProbe;
        return this;
    }

    /**
     * Whether this Step should allocate a buffer for stdin in the container runtime. If this
     * is not set, reads from stdin in the Step will always result in EOF.
     * Default is false.
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("stdin")
    public Boolean getStdin() {
        return stdin;
    }

    /**
     * Whether this Step should allocate a buffer for stdin in the container runtime. If this
     * is not set, reads from stdin in the Step will always result in EOF.
     * Default is false.
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("stdin")
    public void setStdin(Boolean stdin) {
        this.stdin = stdin;
    }

    public StepTemplate withStdin(Boolean stdin) {
        this.stdin = stdin;
        return this;
    }

    /**
     * Whether the container runtime should close the stdin channel after it has been opened by
     * a single attach. When stdin is true the stdin stream will remain open across multiple attach
     * sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the
     * first client attaches to stdin, and then remains open and accepts data until the client disconnects,
     * at which time stdin is closed and remains closed until the container is restarted. If this
     * flag is false, a container processes that reads from stdin will never receive an EOF.
     * Default is false
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("stdinOnce")
    public Boolean getStdinOnce() {
        return stdinOnce;
    }

    /**
     * Whether the container runtime should close the stdin channel after it has been opened by
     * a single attach. When stdin is true the stdin stream will remain open across multiple attach
     * sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the
     * first client attaches to stdin, and then remains open and accepts data until the client disconnects,
     * at which time stdin is closed and remains closed until the container is restarted. If this
     * flag is false, a container processes that reads from stdin will never receive an EOF.
     * Default is false
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("stdinOnce")
    public void setStdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
    }

    public StepTemplate withStdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
        return this;
    }

    /**
     * Deprecated: This field will be removed in a future release and cannot be meaningfully used.
     * 
     */
    @JsonProperty("terminationMessagePath")
    public String getTerminationMessagePath() {
        return terminationMessagePath;
    }

    /**
     * Deprecated: This field will be removed in a future release and cannot be meaningfully used.
     * 
     */
    @JsonProperty("terminationMessagePath")
    public void setTerminationMessagePath(String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
    }

    public StepTemplate withTerminationMessagePath(String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
        return this;
    }

    /**
     * Deprecated: This field will be removed in a future release and cannot be meaningfully used.
     * 
     */
    @JsonProperty("terminationMessagePolicy")
    public String getTerminationMessagePolicy() {
        return terminationMessagePolicy;
    }

    /**
     * Deprecated: This field will be removed in a future release and cannot be meaningfully used.
     * 
     */
    @JsonProperty("terminationMessagePolicy")
    public void setTerminationMessagePolicy(String terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
    }

    public StepTemplate withTerminationMessagePolicy(String terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
        return this;
    }

    /**
     * Whether this Step should allocate a DeprecatedTTY for itself, also requires 'stdin' to be true.
     * Default is false.
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("tty")
    public Boolean getTty() {
        return tty;
    }

    /**
     * Whether this Step should allocate a DeprecatedTTY for itself, also requires 'stdin' to be true.
     * Default is false.
     * 
     * Deprecated: This field will be removed in a future release.
     * 
     */
    @JsonProperty("tty")
    public void setTty(Boolean tty) {
        this.tty = tty;
    }

    public StepTemplate withTty(Boolean tty) {
        this.tty = tty;
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
        sb.append("resources");
        sb.append('=');
        sb.append(((this.resources == null)?"<null>":this.resources));
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
        result = ((result* 31)+((this.livenessProbe == null)? 0 :this.livenessProbe.hashCode()));
        result = ((result* 31)+((this.stdin == null)? 0 :this.stdin.hashCode()));
        result = ((result* 31)+((this.terminationMessagePolicy == null)? 0 :this.terminationMessagePolicy.hashCode()));
        result = ((result* 31)+((this.terminationMessagePath == null)? 0 :this.terminationMessagePath.hashCode()));
        result = ((result* 31)+((this.workingDir == null)? 0 :this.workingDir.hashCode()));
        result = ((result* 31)+((this.resources == null)? 0 :this.resources.hashCode()));
        result = ((result* 31)+((this.securityContext == null)? 0 :this.securityContext.hashCode()));
        result = ((result* 31)+((this.startupProbe == null)? 0 :this.startupProbe.hashCode()));
        result = ((result* 31)+((this.env == null)? 0 :this.env.hashCode()));
        result = ((result* 31)+((this.ports == null)? 0 :this.ports.hashCode()));
        result = ((result* 31)+((this.command == null)? 0 :this.command.hashCode()));
        result = ((result* 31)+((this.volumeMounts == null)? 0 :this.volumeMounts.hashCode()));
        result = ((result* 31)+((this.args == null)? 0 :this.args.hashCode()));
        result = ((result* 31)+((this.lifecycle == null)? 0 :this.lifecycle.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.tty == null)? 0 :this.tty.hashCode()));
        result = ((result* 31)+((this.readinessProbe == null)? 0 :this.readinessProbe.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stdinOnce == null)? 0 :this.stdinOnce.hashCode()));
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
        return ((((((((((((((((((((((((this.volumeDevices == rhs.volumeDevices)||((this.volumeDevices!= null)&&this.volumeDevices.equals(rhs.volumeDevices)))&&((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image))))&&((this.imagePullPolicy == rhs.imagePullPolicy)||((this.imagePullPolicy!= null)&&this.imagePullPolicy.equals(rhs.imagePullPolicy))))&&((this.livenessProbe == rhs.livenessProbe)||((this.livenessProbe!= null)&&this.livenessProbe.equals(rhs.livenessProbe))))&&((this.stdin == rhs.stdin)||((this.stdin!= null)&&this.stdin.equals(rhs.stdin))))&&((this.terminationMessagePolicy == rhs.terminationMessagePolicy)||((this.terminationMessagePolicy!= null)&&this.terminationMessagePolicy.equals(rhs.terminationMessagePolicy))))&&((this.terminationMessagePath == rhs.terminationMessagePath)||((this.terminationMessagePath!= null)&&this.terminationMessagePath.equals(rhs.terminationMessagePath))))&&((this.workingDir == rhs.workingDir)||((this.workingDir!= null)&&this.workingDir.equals(rhs.workingDir))))&&((this.resources == rhs.resources)||((this.resources!= null)&&this.resources.equals(rhs.resources))))&&((this.securityContext == rhs.securityContext)||((this.securityContext!= null)&&this.securityContext.equals(rhs.securityContext))))&&((this.startupProbe == rhs.startupProbe)||((this.startupProbe!= null)&&this.startupProbe.equals(rhs.startupProbe))))&&((this.env == rhs.env)||((this.env!= null)&&this.env.equals(rhs.env))))&&((this.ports == rhs.ports)||((this.ports!= null)&&this.ports.equals(rhs.ports))))&&((this.command == rhs.command)||((this.command!= null)&&this.command.equals(rhs.command))))&&((this.volumeMounts == rhs.volumeMounts)||((this.volumeMounts!= null)&&this.volumeMounts.equals(rhs.volumeMounts))))&&((this.args == rhs.args)||((this.args!= null)&&this.args.equals(rhs.args))))&&((this.lifecycle == rhs.lifecycle)||((this.lifecycle!= null)&&this.lifecycle.equals(rhs.lifecycle))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.tty == rhs.tty)||((this.tty!= null)&&this.tty.equals(rhs.tty))))&&((this.readinessProbe == rhs.readinessProbe)||((this.readinessProbe!= null)&&this.readinessProbe.equals(rhs.readinessProbe))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stdinOnce == rhs.stdinOnce)||((this.stdinOnce!= null)&&this.stdinOnce.equals(rhs.stdinOnce))))&&((this.envFrom == rhs.envFrom)||((this.envFrom!= null)&&this.envFrom.equals(rhs.envFrom))));
    }

}
