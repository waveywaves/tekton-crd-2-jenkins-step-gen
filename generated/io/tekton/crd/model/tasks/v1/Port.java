
package io.tekton.crd.model.tasks.v1;

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
 * ContainerPort represents a network port in a single container.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "containerPort",
    "hostIP",
    "hostPort",
    "name",
    "protocol"
})
@Generated("jsonschema2pojo")
public class Port {

    /**
     * Number of port to expose on the pod's IP address.
     * This must be a valid port number, 0 < x < 65536.
     * (Required)
     * 
     */
    @JsonProperty("containerPort")
    @JsonPropertyDescription("Number of port to expose on the pod's IP address.\nThis must be a valid port number, 0 < x < 65536.")
    @NotNull
    private Integer containerPort;
    /**
     * What host IP to bind the external port to.
     * 
     */
    @JsonProperty("hostIP")
    @JsonPropertyDescription("What host IP to bind the external port to.")
    private String hostIP;
    /**
     * Number of port to expose on the host.
     * If specified, this must be a valid port number, 0 < x < 65536.
     * If HostNetwork is specified, this must match ContainerPort.
     * Most containers do not need this.
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Number of port to expose on the host.\nIf specified, this must be a valid port number, 0 < x < 65536.\nIf HostNetwork is specified, this must match ContainerPort.\nMost containers do not need this.")
    private Integer hostPort;
    /**
     * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each
     * named port in a pod must have a unique name. Name for the port that can be
     * referred to by services.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("If specified, this must be an IANA_SVC_NAME and unique within the pod. Each\nnamed port in a pod must have a unique name. Name for the port that can be\nreferred to by services.")
    private String name;
    /**
     * Protocol for port. Must be UDP, TCP, or SCTP.
     * Defaults to "TCP".
     * 
     */
    @JsonProperty("protocol")
    @JsonPropertyDescription("Protocol for port. Must be UDP, TCP, or SCTP.\nDefaults to \"TCP\".")
    private String protocol = "TCP";
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Number of port to expose on the pod's IP address.
     * This must be a valid port number, 0 < x < 65536.
     * (Required)
     * 
     */
    @JsonProperty("containerPort")
    public Integer getContainerPort() {
        return containerPort;
    }

    /**
     * Number of port to expose on the pod's IP address.
     * This must be a valid port number, 0 < x < 65536.
     * (Required)
     * 
     */
    @JsonProperty("containerPort")
    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    public Port withContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    /**
     * What host IP to bind the external port to.
     * 
     */
    @JsonProperty("hostIP")
    public String getHostIP() {
        return hostIP;
    }

    /**
     * What host IP to bind the external port to.
     * 
     */
    @JsonProperty("hostIP")
    public void setHostIP(String hostIP) {
        this.hostIP = hostIP;
    }

    public Port withHostIP(String hostIP) {
        this.hostIP = hostIP;
        return this;
    }

    /**
     * Number of port to expose on the host.
     * If specified, this must be a valid port number, 0 < x < 65536.
     * If HostNetwork is specified, this must match ContainerPort.
     * Most containers do not need this.
     * 
     */
    @JsonProperty("hostPort")
    public Integer getHostPort() {
        return hostPort;
    }

    /**
     * Number of port to expose on the host.
     * If specified, this must be a valid port number, 0 < x < 65536.
     * If HostNetwork is specified, this must match ContainerPort.
     * Most containers do not need this.
     * 
     */
    @JsonProperty("hostPort")
    public void setHostPort(Integer hostPort) {
        this.hostPort = hostPort;
    }

    public Port withHostPort(Integer hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each
     * named port in a pod must have a unique name. Name for the port that can be
     * referred to by services.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each
     * named port in a pod must have a unique name. Name for the port that can be
     * referred to by services.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Port withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Protocol for port. Must be UDP, TCP, or SCTP.
     * Defaults to "TCP".
     * 
     */
    @JsonProperty("protocol")
    public String getProtocol() {
        return protocol;
    }

    /**
     * Protocol for port. Must be UDP, TCP, or SCTP.
     * Defaults to "TCP".
     * 
     */
    @JsonProperty("protocol")
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Port withProtocol(String protocol) {
        this.protocol = protocol;
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

    public Port withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Port.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("containerPort");
        sb.append('=');
        sb.append(((this.containerPort == null)?"<null>":this.containerPort));
        sb.append(',');
        sb.append("hostIP");
        sb.append('=');
        sb.append(((this.hostIP == null)?"<null>":this.hostIP));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("protocol");
        sb.append('=');
        sb.append(((this.protocol == null)?"<null>":this.protocol));
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
        result = ((result* 31)+((this.protocol == null)? 0 :this.protocol.hashCode()));
        result = ((result* 31)+((this.hostIP == null)? 0 :this.hostIP.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.containerPort == null)? 0 :this.containerPort.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Port) == false) {
            return false;
        }
        Port rhs = ((Port) other);
        return (((((((this.protocol == rhs.protocol)||((this.protocol!= null)&&this.protocol.equals(rhs.protocol)))&&((this.hostIP == rhs.hostIP)||((this.hostIP!= null)&&this.hostIP.equals(rhs.hostIP))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.containerPort == rhs.containerPort)||((this.containerPort!= null)&&this.containerPort.equals(rhs.containerPort))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
