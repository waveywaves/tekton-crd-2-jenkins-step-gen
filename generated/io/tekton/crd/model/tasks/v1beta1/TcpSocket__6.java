
package io.tekton.crd.model.tasks.v1beta1;

import java.util.LinkedHashMap;
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
 * Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept
 * for backward compatibility. There is no validation of this field and
 * lifecycle hooks will fail at runtime when it is specified.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "host",
    "port"
})
@Generated("jsonschema2pojo")
public class TcpSocket__6 {

    /**
     * Optional: Host name to connect to, defaults to the pod IP.
     * 
     */
    @JsonProperty("host")
    @JsonPropertyDescription("Optional: Host name to connect to, defaults to the pod IP.")
    private String host;
    /**
     * Number or name of the port to access on the container.
     * Number must be in the range 1 to 65535.
     * Name must be an IANA_SVC_NAME.
     * (Required)
     * 
     */
    @JsonProperty("port")
    @JsonPropertyDescription("Number or name of the port to access on the container.\nNumber must be in the range 1 to 65535.\nName must be an IANA_SVC_NAME.")
    @NotNull
    private Object port;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Optional: Host name to connect to, defaults to the pod IP.
     * 
     */
    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    /**
     * Optional: Host name to connect to, defaults to the pod IP.
     * 
     */
    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
    }

    public TcpSocket__6 withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * Number or name of the port to access on the container.
     * Number must be in the range 1 to 65535.
     * Name must be an IANA_SVC_NAME.
     * (Required)
     * 
     */
    @JsonProperty("port")
    public Object getPort() {
        return port;
    }

    /**
     * Number or name of the port to access on the container.
     * Number must be in the range 1 to 65535.
     * Name must be an IANA_SVC_NAME.
     * (Required)
     * 
     */
    @JsonProperty("port")
    public void setPort(Object port) {
        this.port = port;
    }

    public TcpSocket__6 withPort(Object port) {
        this.port = port;
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

    public TcpSocket__6 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TcpSocket__6 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("host");
        sb.append('=');
        sb.append(((this.host == null)?"<null>":this.host));
        sb.append(',');
        sb.append("port");
        sb.append('=');
        sb.append(((this.port == null)?"<null>":this.port));
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
        result = ((result* 31)+((this.host == null)? 0 :this.host.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.port == null)? 0 :this.port.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TcpSocket__6) == false) {
            return false;
        }
        TcpSocket__6 rhs = ((TcpSocket__6) other);
        return ((((this.host == rhs.host)||((this.host!= null)&&this.host.equals(rhs.host)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.port == rhs.port)||((this.port!= null)&&this.port.equals(rhs.port))));
    }

}
