
package io.tekton.crd.model.tasks.v1beta1;

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
 * PostStart is called immediately after a container is created. If the handler fails,
 * the container is terminated and restarted according to its restart policy.
 * Other management of the container blocks until the hook completes.
 * More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "exec",
    "httpGet",
    "sleep",
    "tcpSocket"
})
@Generated("jsonschema2pojo")
public class PostStart__1 {

    /**
     * Exec specifies a command to execute in the container.
     * 
     */
    @JsonProperty("exec")
    @JsonPropertyDescription("Exec specifies a command to execute in the container.")
    @Valid
    private Exec__5 exec;
    /**
     * HTTPGet specifies an HTTP GET request to perform.
     * 
     */
    @JsonProperty("httpGet")
    @JsonPropertyDescription("HTTPGet specifies an HTTP GET request to perform.")
    @Valid
    private HttpGet__5 httpGet;
    /**
     * Sleep represents a duration that the container should sleep.
     * 
     */
    @JsonProperty("sleep")
    @JsonPropertyDescription("Sleep represents a duration that the container should sleep.")
    @Valid
    private Sleep__2 sleep;
    /**
     * Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept
     * for backward compatibility. There is no validation of this field and
     * lifecycle hooks will fail at runtime when it is specified.
     * 
     */
    @JsonProperty("tcpSocket")
    @JsonPropertyDescription("Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept\nfor backward compatibility. There is no validation of this field and\nlifecycle hooks will fail at runtime when it is specified.")
    @Valid
    private TcpSocket__5 tcpSocket;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Exec specifies a command to execute in the container.
     * 
     */
    @JsonProperty("exec")
    public Exec__5 getExec() {
        return exec;
    }

    /**
     * Exec specifies a command to execute in the container.
     * 
     */
    @JsonProperty("exec")
    public void setExec(Exec__5 exec) {
        this.exec = exec;
    }

    public PostStart__1 withExec(Exec__5 exec) {
        this.exec = exec;
        return this;
    }

    /**
     * HTTPGet specifies an HTTP GET request to perform.
     * 
     */
    @JsonProperty("httpGet")
    public HttpGet__5 getHttpGet() {
        return httpGet;
    }

    /**
     * HTTPGet specifies an HTTP GET request to perform.
     * 
     */
    @JsonProperty("httpGet")
    public void setHttpGet(HttpGet__5 httpGet) {
        this.httpGet = httpGet;
    }

    public PostStart__1 withHttpGet(HttpGet__5 httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    /**
     * Sleep represents a duration that the container should sleep.
     * 
     */
    @JsonProperty("sleep")
    public Sleep__2 getSleep() {
        return sleep;
    }

    /**
     * Sleep represents a duration that the container should sleep.
     * 
     */
    @JsonProperty("sleep")
    public void setSleep(Sleep__2 sleep) {
        this.sleep = sleep;
    }

    public PostStart__1 withSleep(Sleep__2 sleep) {
        this.sleep = sleep;
        return this;
    }

    /**
     * Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept
     * for backward compatibility. There is no validation of this field and
     * lifecycle hooks will fail at runtime when it is specified.
     * 
     */
    @JsonProperty("tcpSocket")
    public TcpSocket__5 getTcpSocket() {
        return tcpSocket;
    }

    /**
     * Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept
     * for backward compatibility. There is no validation of this field and
     * lifecycle hooks will fail at runtime when it is specified.
     * 
     */
    @JsonProperty("tcpSocket")
    public void setTcpSocket(TcpSocket__5 tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    public PostStart__1 withTcpSocket(TcpSocket__5 tcpSocket) {
        this.tcpSocket = tcpSocket;
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

    public PostStart__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PostStart__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("exec");
        sb.append('=');
        sb.append(((this.exec == null)?"<null>":this.exec));
        sb.append(',');
        sb.append("httpGet");
        sb.append('=');
        sb.append(((this.httpGet == null)?"<null>":this.httpGet));
        sb.append(',');
        sb.append("sleep");
        sb.append('=');
        sb.append(((this.sleep == null)?"<null>":this.sleep));
        sb.append(',');
        sb.append("tcpSocket");
        sb.append('=');
        sb.append(((this.tcpSocket == null)?"<null>":this.tcpSocket));
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
        result = ((result* 31)+((this.sleep == null)? 0 :this.sleep.hashCode()));
        result = ((result* 31)+((this.tcpSocket == null)? 0 :this.tcpSocket.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.exec == null)? 0 :this.exec.hashCode()));
        result = ((result* 31)+((this.httpGet == null)? 0 :this.httpGet.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PostStart__1) == false) {
            return false;
        }
        PostStart__1 rhs = ((PostStart__1) other);
        return ((((((this.sleep == rhs.sleep)||((this.sleep!= null)&&this.sleep.equals(rhs.sleep)))&&((this.tcpSocket == rhs.tcpSocket)||((this.tcpSocket!= null)&&this.tcpSocket.equals(rhs.tcpSocket))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.exec == rhs.exec)||((this.exec!= null)&&this.exec.equals(rhs.exec))))&&((this.httpGet == rhs.httpGet)||((this.httpGet!= null)&&this.httpGet.equals(rhs.httpGet))));
    }

}
