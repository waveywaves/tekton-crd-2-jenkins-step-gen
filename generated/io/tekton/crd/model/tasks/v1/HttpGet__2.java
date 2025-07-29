
package io.tekton.crd.model.tasks.v1;

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
 * HTTPGet specifies an HTTP GET request to perform.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "host",
    "httpHeaders",
    "path",
    "port",
    "scheme"
})
@Generated("jsonschema2pojo")
public class HttpGet__2 {

    /**
     * Host name to connect to, defaults to the pod IP. You probably want to set
     * "Host" in httpHeaders instead.
     * 
     */
    @JsonProperty("host")
    @JsonPropertyDescription("Host name to connect to, defaults to the pod IP. You probably want to set\n\"Host\" in httpHeaders instead.")
    private String host;
    /**
     * Custom headers to set in the request. HTTP allows repeated headers.
     * 
     */
    @JsonProperty("httpHeaders")
    @JsonPropertyDescription("Custom headers to set in the request. HTTP allows repeated headers.")
    @Valid
    private List<HttpHeader__2> httpHeaders = new ArrayList<HttpHeader__2>();
    /**
     * Path to access on the HTTP server.
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("Path to access on the HTTP server.")
    private String path;
    /**
     * Name or number of the port to access on the container.
     * Number must be in the range 1 to 65535.
     * Name must be an IANA_SVC_NAME.
     * (Required)
     * 
     */
    @JsonProperty("port")
    @JsonPropertyDescription("Name or number of the port to access on the container.\nNumber must be in the range 1 to 65535.\nName must be an IANA_SVC_NAME.")
    @NotNull
    private Object port;
    /**
     * Scheme to use for connecting to the host.
     * Defaults to HTTP.
     * 
     */
    @JsonProperty("scheme")
    @JsonPropertyDescription("Scheme to use for connecting to the host.\nDefaults to HTTP.")
    private String scheme;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Host name to connect to, defaults to the pod IP. You probably want to set
     * "Host" in httpHeaders instead.
     * 
     */
    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    /**
     * Host name to connect to, defaults to the pod IP. You probably want to set
     * "Host" in httpHeaders instead.
     * 
     */
    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
    }

    public HttpGet__2 withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * Custom headers to set in the request. HTTP allows repeated headers.
     * 
     */
    @JsonProperty("httpHeaders")
    public List<HttpHeader__2> getHttpHeaders() {
        return httpHeaders;
    }

    /**
     * Custom headers to set in the request. HTTP allows repeated headers.
     * 
     */
    @JsonProperty("httpHeaders")
    public void setHttpHeaders(List<HttpHeader__2> httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public HttpGet__2 withHttpHeaders(List<HttpHeader__2> httpHeaders) {
        this.httpHeaders = httpHeaders;
        return this;
    }

    /**
     * Path to access on the HTTP server.
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * Path to access on the HTTP server.
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    public HttpGet__2 withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Name or number of the port to access on the container.
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
     * Name or number of the port to access on the container.
     * Number must be in the range 1 to 65535.
     * Name must be an IANA_SVC_NAME.
     * (Required)
     * 
     */
    @JsonProperty("port")
    public void setPort(Object port) {
        this.port = port;
    }

    public HttpGet__2 withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Scheme to use for connecting to the host.
     * Defaults to HTTP.
     * 
     */
    @JsonProperty("scheme")
    public String getScheme() {
        return scheme;
    }

    /**
     * Scheme to use for connecting to the host.
     * Defaults to HTTP.
     * 
     */
    @JsonProperty("scheme")
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public HttpGet__2 withScheme(String scheme) {
        this.scheme = scheme;
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

    public HttpGet__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HttpGet__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("host");
        sb.append('=');
        sb.append(((this.host == null)?"<null>":this.host));
        sb.append(',');
        sb.append("httpHeaders");
        sb.append('=');
        sb.append(((this.httpHeaders == null)?"<null>":this.httpHeaders));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("port");
        sb.append('=');
        sb.append(((this.port == null)?"<null>":this.port));
        sb.append(',');
        sb.append("scheme");
        sb.append('=');
        sb.append(((this.scheme == null)?"<null>":this.scheme));
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
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.scheme == null)? 0 :this.scheme.hashCode()));
        result = ((result* 31)+((this.port == null)? 0 :this.port.hashCode()));
        result = ((result* 31)+((this.host == null)? 0 :this.host.hashCode()));
        result = ((result* 31)+((this.httpHeaders == null)? 0 :this.httpHeaders.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HttpGet__2) == false) {
            return false;
        }
        HttpGet__2 rhs = ((HttpGet__2) other);
        return (((((((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path)))&&((this.scheme == rhs.scheme)||((this.scheme!= null)&&this.scheme.equals(rhs.scheme))))&&((this.port == rhs.port)||((this.port!= null)&&this.port.equals(rhs.port))))&&((this.host == rhs.host)||((this.host!= null)&&this.host.equals(rhs.host))))&&((this.httpHeaders == rhs.httpHeaders)||((this.httpHeaders!= null)&&this.httpHeaders.equals(rhs.httpHeaders))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
