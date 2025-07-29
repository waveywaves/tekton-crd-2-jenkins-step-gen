
package io.tekton.crd.model.tasks.v1;

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
 * StartupProbe indicates that the Pod the Sidecar is running in has successfully initialized.
 * If specified, no other probes are executed until this completes successfully.
 * If this probe fails, the Pod will be restarted, just as if the livenessProbe failed.
 * This can be used to provide different probe parameters at the beginning of a Pod's lifecycle,
 * when it might take a long time to load data or warm a cache, than during steady-state operation.
 * This cannot be updated.
 * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "exec",
    "failureThreshold",
    "grpc",
    "httpGet",
    "initialDelaySeconds",
    "periodSeconds",
    "successThreshold",
    "tcpSocket",
    "terminationGracePeriodSeconds",
    "timeoutSeconds"
})
@Generated("jsonschema2pojo")
public class StartupProbe {

    /**
     * Exec specifies a command to execute in the container.
     * 
     */
    @JsonProperty("exec")
    @JsonPropertyDescription("Exec specifies a command to execute in the container.")
    @Valid
    private Exec__4 exec;
    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded.
     * Defaults to 3. Minimum value is 1.
     * 
     */
    @JsonProperty("failureThreshold")
    @JsonPropertyDescription("Minimum consecutive failures for the probe to be considered failed after having succeeded.\nDefaults to 3. Minimum value is 1.")
    private Integer failureThreshold;
    /**
     * GRPC specifies a GRPC HealthCheckRequest.
     * 
     */
    @JsonProperty("grpc")
    @JsonPropertyDescription("GRPC specifies a GRPC HealthCheckRequest.")
    @Valid
    private Grpc__2 grpc;
    /**
     * HTTPGet specifies an HTTP GET request to perform.
     * 
     */
    @JsonProperty("httpGet")
    @JsonPropertyDescription("HTTPGet specifies an HTTP GET request to perform.")
    @Valid
    private HttpGet__4 httpGet;
    /**
     * Number of seconds after the container has started before liveness probes are initiated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("initialDelaySeconds")
    @JsonPropertyDescription("Number of seconds after the container has started before liveness probes are initiated.\nMore info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
    private Integer initialDelaySeconds;
    /**
     * How often (in seconds) to perform the probe.
     * Default to 10 seconds. Minimum value is 1.
     * 
     */
    @JsonProperty("periodSeconds")
    @JsonPropertyDescription("How often (in seconds) to perform the probe.\nDefault to 10 seconds. Minimum value is 1.")
    private Integer periodSeconds;
    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed.
     * Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
     * 
     */
    @JsonProperty("successThreshold")
    @JsonPropertyDescription("Minimum consecutive successes for the probe to be considered successful after having failed.\nDefaults to 1. Must be 1 for liveness and startup. Minimum value is 1.")
    private Integer successThreshold;
    /**
     * TCPSocket specifies a connection to a TCP port.
     * 
     */
    @JsonProperty("tcpSocket")
    @JsonPropertyDescription("TCPSocket specifies a connection to a TCP port.")
    @Valid
    private TcpSocket__4 tcpSocket;
    /**
     * Optional duration in seconds the pod needs to terminate gracefully upon probe failure.
     * The grace period is the duration in seconds after the processes running in the pod are sent
     * a termination signal and the time when the processes are forcibly halted with a kill signal.
     * Set this value longer than the expected cleanup time for your process.
     * If this value is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this
     * value overrides the value provided by the pod spec.
     * Value must be non-negative integer. The value zero indicates stop immediately via
     * the kill signal (no opportunity to shut down).
     * This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate.
     * Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
     * 
     */
    @JsonProperty("terminationGracePeriodSeconds")
    @JsonPropertyDescription("Optional duration in seconds the pod needs to terminate gracefully upon probe failure.\nThe grace period is the duration in seconds after the processes running in the pod are sent\na termination signal and the time when the processes are forcibly halted with a kill signal.\nSet this value longer than the expected cleanup time for your process.\nIf this value is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this\nvalue overrides the value provided by the pod spec.\nValue must be non-negative integer. The value zero indicates stop immediately via\nthe kill signal (no opportunity to shut down).\nThis is a beta field and requires enabling ProbeTerminationGracePeriod feature gate.\nMinimum value is 1. spec.terminationGracePeriodSeconds is used if unset.")
    private Integer terminationGracePeriodSeconds;
    /**
     * Number of seconds after which the probe times out.
     * Defaults to 1 second. Minimum value is 1.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("timeoutSeconds")
    @JsonPropertyDescription("Number of seconds after which the probe times out.\nDefaults to 1 second. Minimum value is 1.\nMore info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
    private Integer timeoutSeconds;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Exec specifies a command to execute in the container.
     * 
     */
    @JsonProperty("exec")
    public Exec__4 getExec() {
        return exec;
    }

    /**
     * Exec specifies a command to execute in the container.
     * 
     */
    @JsonProperty("exec")
    public void setExec(Exec__4 exec) {
        this.exec = exec;
    }

    public StartupProbe withExec(Exec__4 exec) {
        this.exec = exec;
        return this;
    }

    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded.
     * Defaults to 3. Minimum value is 1.
     * 
     */
    @JsonProperty("failureThreshold")
    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded.
     * Defaults to 3. Minimum value is 1.
     * 
     */
    @JsonProperty("failureThreshold")
    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public StartupProbe withFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    /**
     * GRPC specifies a GRPC HealthCheckRequest.
     * 
     */
    @JsonProperty("grpc")
    public Grpc__2 getGrpc() {
        return grpc;
    }

    /**
     * GRPC specifies a GRPC HealthCheckRequest.
     * 
     */
    @JsonProperty("grpc")
    public void setGrpc(Grpc__2 grpc) {
        this.grpc = grpc;
    }

    public StartupProbe withGrpc(Grpc__2 grpc) {
        this.grpc = grpc;
        return this;
    }

    /**
     * HTTPGet specifies an HTTP GET request to perform.
     * 
     */
    @JsonProperty("httpGet")
    public HttpGet__4 getHttpGet() {
        return httpGet;
    }

    /**
     * HTTPGet specifies an HTTP GET request to perform.
     * 
     */
    @JsonProperty("httpGet")
    public void setHttpGet(HttpGet__4 httpGet) {
        this.httpGet = httpGet;
    }

    public StartupProbe withHttpGet(HttpGet__4 httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    /**
     * Number of seconds after the container has started before liveness probes are initiated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("initialDelaySeconds")
    public Integer getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    /**
     * Number of seconds after the container has started before liveness probes are initiated.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("initialDelaySeconds")
    public void setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    public StartupProbe withInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }

    /**
     * How often (in seconds) to perform the probe.
     * Default to 10 seconds. Minimum value is 1.
     * 
     */
    @JsonProperty("periodSeconds")
    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    /**
     * How often (in seconds) to perform the probe.
     * Default to 10 seconds. Minimum value is 1.
     * 
     */
    @JsonProperty("periodSeconds")
    public void setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    public StartupProbe withPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed.
     * Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
     * 
     */
    @JsonProperty("successThreshold")
    public Integer getSuccessThreshold() {
        return successThreshold;
    }

    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed.
     * Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
     * 
     */
    @JsonProperty("successThreshold")
    public void setSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
    }

    public StartupProbe withSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }

    /**
     * TCPSocket specifies a connection to a TCP port.
     * 
     */
    @JsonProperty("tcpSocket")
    public TcpSocket__4 getTcpSocket() {
        return tcpSocket;
    }

    /**
     * TCPSocket specifies a connection to a TCP port.
     * 
     */
    @JsonProperty("tcpSocket")
    public void setTcpSocket(TcpSocket__4 tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    public StartupProbe withTcpSocket(TcpSocket__4 tcpSocket) {
        this.tcpSocket = tcpSocket;
        return this;
    }

    /**
     * Optional duration in seconds the pod needs to terminate gracefully upon probe failure.
     * The grace period is the duration in seconds after the processes running in the pod are sent
     * a termination signal and the time when the processes are forcibly halted with a kill signal.
     * Set this value longer than the expected cleanup time for your process.
     * If this value is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this
     * value overrides the value provided by the pod spec.
     * Value must be non-negative integer. The value zero indicates stop immediately via
     * the kill signal (no opportunity to shut down).
     * This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate.
     * Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
     * 
     */
    @JsonProperty("terminationGracePeriodSeconds")
    public Integer getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    /**
     * Optional duration in seconds the pod needs to terminate gracefully upon probe failure.
     * The grace period is the duration in seconds after the processes running in the pod are sent
     * a termination signal and the time when the processes are forcibly halted with a kill signal.
     * Set this value longer than the expected cleanup time for your process.
     * If this value is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this
     * value overrides the value provided by the pod spec.
     * Value must be non-negative integer. The value zero indicates stop immediately via
     * the kill signal (no opportunity to shut down).
     * This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate.
     * Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
     * 
     */
    @JsonProperty("terminationGracePeriodSeconds")
    public void setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }

    public StartupProbe withTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }

    /**
     * Number of seconds after which the probe times out.
     * Defaults to 1 second. Minimum value is 1.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("timeoutSeconds")
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * Number of seconds after which the probe times out.
     * Defaults to 1 second. Minimum value is 1.
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @JsonProperty("timeoutSeconds")
    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    public StartupProbe withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
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

    public StartupProbe withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StartupProbe.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("exec");
        sb.append('=');
        sb.append(((this.exec == null)?"<null>":this.exec));
        sb.append(',');
        sb.append("failureThreshold");
        sb.append('=');
        sb.append(((this.failureThreshold == null)?"<null>":this.failureThreshold));
        sb.append(',');
        sb.append("grpc");
        sb.append('=');
        sb.append(((this.grpc == null)?"<null>":this.grpc));
        sb.append(',');
        sb.append("httpGet");
        sb.append('=');
        sb.append(((this.httpGet == null)?"<null>":this.httpGet));
        sb.append(',');
        sb.append("initialDelaySeconds");
        sb.append('=');
        sb.append(((this.initialDelaySeconds == null)?"<null>":this.initialDelaySeconds));
        sb.append(',');
        sb.append("periodSeconds");
        sb.append('=');
        sb.append(((this.periodSeconds == null)?"<null>":this.periodSeconds));
        sb.append(',');
        sb.append("successThreshold");
        sb.append('=');
        sb.append(((this.successThreshold == null)?"<null>":this.successThreshold));
        sb.append(',');
        sb.append("tcpSocket");
        sb.append('=');
        sb.append(((this.tcpSocket == null)?"<null>":this.tcpSocket));
        sb.append(',');
        sb.append("terminationGracePeriodSeconds");
        sb.append('=');
        sb.append(((this.terminationGracePeriodSeconds == null)?"<null>":this.terminationGracePeriodSeconds));
        sb.append(',');
        sb.append("timeoutSeconds");
        sb.append('=');
        sb.append(((this.timeoutSeconds == null)?"<null>":this.timeoutSeconds));
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
        result = ((result* 31)+((this.terminationGracePeriodSeconds == null)? 0 :this.terminationGracePeriodSeconds.hashCode()));
        result = ((result* 31)+((this.failureThreshold == null)? 0 :this.failureThreshold.hashCode()));
        result = ((result* 31)+((this.periodSeconds == null)? 0 :this.periodSeconds.hashCode()));
        result = ((result* 31)+((this.tcpSocket == null)? 0 :this.tcpSocket.hashCode()));
        result = ((result* 31)+((this.timeoutSeconds == null)? 0 :this.timeoutSeconds.hashCode()));
        result = ((result* 31)+((this.successThreshold == null)? 0 :this.successThreshold.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.initialDelaySeconds == null)? 0 :this.initialDelaySeconds.hashCode()));
        result = ((result* 31)+((this.exec == null)? 0 :this.exec.hashCode()));
        result = ((result* 31)+((this.grpc == null)? 0 :this.grpc.hashCode()));
        result = ((result* 31)+((this.httpGet == null)? 0 :this.httpGet.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StartupProbe) == false) {
            return false;
        }
        StartupProbe rhs = ((StartupProbe) other);
        return ((((((((((((this.terminationGracePeriodSeconds == rhs.terminationGracePeriodSeconds)||((this.terminationGracePeriodSeconds!= null)&&this.terminationGracePeriodSeconds.equals(rhs.terminationGracePeriodSeconds)))&&((this.failureThreshold == rhs.failureThreshold)||((this.failureThreshold!= null)&&this.failureThreshold.equals(rhs.failureThreshold))))&&((this.periodSeconds == rhs.periodSeconds)||((this.periodSeconds!= null)&&this.periodSeconds.equals(rhs.periodSeconds))))&&((this.tcpSocket == rhs.tcpSocket)||((this.tcpSocket!= null)&&this.tcpSocket.equals(rhs.tcpSocket))))&&((this.timeoutSeconds == rhs.timeoutSeconds)||((this.timeoutSeconds!= null)&&this.timeoutSeconds.equals(rhs.timeoutSeconds))))&&((this.successThreshold == rhs.successThreshold)||((this.successThreshold!= null)&&this.successThreshold.equals(rhs.successThreshold))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.initialDelaySeconds == rhs.initialDelaySeconds)||((this.initialDelaySeconds!= null)&&this.initialDelaySeconds.equals(rhs.initialDelaySeconds))))&&((this.exec == rhs.exec)||((this.exec!= null)&&this.exec.equals(rhs.exec))))&&((this.grpc == rhs.grpc)||((this.grpc!= null)&&this.grpc.equals(rhs.grpc))))&&((this.httpGet == rhs.httpGet)||((this.httpGet!= null)&&this.httpGet.equals(rhs.httpGet))));
    }

}
