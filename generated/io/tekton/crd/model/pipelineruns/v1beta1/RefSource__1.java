
package io.tekton.crd.model.pipelineruns.v1beta1;

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
 * RefSource identifies the source where a remote task/pipeline came from.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "digest",
    "entryPoint",
    "uri"
})
@Generated("jsonschema2pojo")
public class RefSource__1 {

    /**
     * Digest is a collection of cryptographic digests for the contents of the artifact specified by URI.
     * Example: {"sha1": "f99d13e554ffcb696dee719fa85b695cb5b0f428"}
     * 
     */
    @JsonProperty("digest")
    @JsonPropertyDescription("Digest is a collection of cryptographic digests for the contents of the artifact specified by URI.\nExample: {\"sha1\": \"f99d13e554ffcb696dee719fa85b695cb5b0f428\"}")
    @Valid
    private Digest__3 digest;
    /**
     * EntryPoint identifies the entry point into the build. This is often a path to a
     * build definition file and/or a target label within that file.
     * Example: "task/git-clone/0.8/git-clone.yaml"
     * 
     */
    @JsonProperty("entryPoint")
    @JsonPropertyDescription("EntryPoint identifies the entry point into the build. This is often a path to a\nbuild definition file and/or a target label within that file.\nExample: \"task/git-clone/0.8/git-clone.yaml\"")
    private String entryPoint;
    /**
     * URI indicates the identity of the source of the build definition.
     * Example: "https://github.com/tektoncd/catalog"
     * 
     */
    @JsonProperty("uri")
    @JsonPropertyDescription("URI indicates the identity of the source of the build definition.\nExample: \"https://github.com/tektoncd/catalog\"")
    private String uri;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Digest is a collection of cryptographic digests for the contents of the artifact specified by URI.
     * Example: {"sha1": "f99d13e554ffcb696dee719fa85b695cb5b0f428"}
     * 
     */
    @JsonProperty("digest")
    public Digest__3 getDigest() {
        return digest;
    }

    /**
     * Digest is a collection of cryptographic digests for the contents of the artifact specified by URI.
     * Example: {"sha1": "f99d13e554ffcb696dee719fa85b695cb5b0f428"}
     * 
     */
    @JsonProperty("digest")
    public void setDigest(Digest__3 digest) {
        this.digest = digest;
    }

    public RefSource__1 withDigest(Digest__3 digest) {
        this.digest = digest;
        return this;
    }

    /**
     * EntryPoint identifies the entry point into the build. This is often a path to a
     * build definition file and/or a target label within that file.
     * Example: "task/git-clone/0.8/git-clone.yaml"
     * 
     */
    @JsonProperty("entryPoint")
    public String getEntryPoint() {
        return entryPoint;
    }

    /**
     * EntryPoint identifies the entry point into the build. This is often a path to a
     * build definition file and/or a target label within that file.
     * Example: "task/git-clone/0.8/git-clone.yaml"
     * 
     */
    @JsonProperty("entryPoint")
    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    public RefSource__1 withEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
        return this;
    }

    /**
     * URI indicates the identity of the source of the build definition.
     * Example: "https://github.com/tektoncd/catalog"
     * 
     */
    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    /**
     * URI indicates the identity of the source of the build definition.
     * Example: "https://github.com/tektoncd/catalog"
     * 
     */
    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    public RefSource__1 withUri(String uri) {
        this.uri = uri;
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

    public RefSource__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RefSource__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("digest");
        sb.append('=');
        sb.append(((this.digest == null)?"<null>":this.digest));
        sb.append(',');
        sb.append("entryPoint");
        sb.append('=');
        sb.append(((this.entryPoint == null)?"<null>":this.entryPoint));
        sb.append(',');
        sb.append("uri");
        sb.append('=');
        sb.append(((this.uri == null)?"<null>":this.uri));
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
        result = ((result* 31)+((this.digest == null)? 0 :this.digest.hashCode()));
        result = ((result* 31)+((this.entryPoint == null)? 0 :this.entryPoint.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.uri == null)? 0 :this.uri.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefSource__1) == false) {
            return false;
        }
        RefSource__1 rhs = ((RefSource__1) other);
        return (((((this.digest == rhs.digest)||((this.digest!= null)&&this.digest.equals(rhs.digest)))&&((this.entryPoint == rhs.entryPoint)||((this.entryPoint!= null)&&this.entryPoint.equals(rhs.entryPoint))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.uri == rhs.uri)||((this.uri!= null)&&this.uri.equals(rhs.uri))));
    }

}
