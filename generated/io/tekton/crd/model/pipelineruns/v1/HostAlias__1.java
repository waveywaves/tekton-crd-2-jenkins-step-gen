
package io.tekton.crd.model.pipelineruns.v1;

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
 * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the
 * pod's hosts file.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hostnames",
    "ip"
})
@Generated("jsonschema2pojo")
public class HostAlias__1 {

    /**
     * Hostnames for the above IP address.
     * 
     */
    @JsonProperty("hostnames")
    @JsonPropertyDescription("Hostnames for the above IP address.")
    @Valid
    private List<String> hostnames = new ArrayList<String>();
    /**
     * IP address of the host file entry.
     * (Required)
     * 
     */
    @JsonProperty("ip")
    @JsonPropertyDescription("IP address of the host file entry.")
    @NotNull
    private String ip;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Hostnames for the above IP address.
     * 
     */
    @JsonProperty("hostnames")
    public List<String> getHostnames() {
        return hostnames;
    }

    /**
     * Hostnames for the above IP address.
     * 
     */
    @JsonProperty("hostnames")
    public void setHostnames(List<String> hostnames) {
        this.hostnames = hostnames;
    }

    public HostAlias__1 withHostnames(List<String> hostnames) {
        this.hostnames = hostnames;
        return this;
    }

    /**
     * IP address of the host file entry.
     * (Required)
     * 
     */
    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    /**
     * IP address of the host file entry.
     * (Required)
     * 
     */
    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    public HostAlias__1 withIp(String ip) {
        this.ip = ip;
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

    public HostAlias__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HostAlias__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hostnames");
        sb.append('=');
        sb.append(((this.hostnames == null)?"<null>":this.hostnames));
        sb.append(',');
        sb.append("ip");
        sb.append('=');
        sb.append(((this.ip == null)?"<null>":this.ip));
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
        result = ((result* 31)+((this.hostnames == null)? 0 :this.hostnames.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ip == null)? 0 :this.ip.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HostAlias__1) == false) {
            return false;
        }
        HostAlias__1 rhs = ((HostAlias__1) other);
        return ((((this.hostnames == rhs.hostnames)||((this.hostnames!= null)&&this.hostnames.equals(rhs.hostnames)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ip == rhs.ip)||((this.ip!= null)&&this.ip.equals(rhs.ip))));
    }

}
