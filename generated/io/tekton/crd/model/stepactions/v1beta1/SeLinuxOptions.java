
package io.tekton.crd.model.stepactions.v1beta1;

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
 * The SELinux context to be applied to the container.
 * If unspecified, the container runtime will allocate a random SELinux context for each
 * container.  May also be set in PodSecurityContext.  If set in both SecurityContext and
 * PodSecurityContext, the value specified in SecurityContext takes precedence.
 * Note that this field cannot be set when spec.os.name is windows.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "level",
    "role",
    "type",
    "user"
})
@Generated("jsonschema2pojo")
public class SeLinuxOptions {

    /**
     * Level is SELinux level label that applies to the container.
     * 
     */
    @JsonProperty("level")
    @JsonPropertyDescription("Level is SELinux level label that applies to the container.")
    private String level;
    /**
     * Role is a SELinux role label that applies to the container.
     * 
     */
    @JsonProperty("role")
    @JsonPropertyDescription("Role is a SELinux role label that applies to the container.")
    private String role;
    /**
     * Type is a SELinux type label that applies to the container.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type is a SELinux type label that applies to the container.")
    private String type;
    /**
     * User is a SELinux user label that applies to the container.
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("User is a SELinux user label that applies to the container.")
    private String user;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Level is SELinux level label that applies to the container.
     * 
     */
    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    /**
     * Level is SELinux level label that applies to the container.
     * 
     */
    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
    }

    public SeLinuxOptions withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Role is a SELinux role label that applies to the container.
     * 
     */
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    /**
     * Role is a SELinux role label that applies to the container.
     * 
     */
    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    public SeLinuxOptions withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Type is a SELinux type label that applies to the container.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type is a SELinux type label that applies to the container.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public SeLinuxOptions withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * User is a SELinux user label that applies to the container.
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * User is a SELinux user label that applies to the container.
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public SeLinuxOptions withUser(String user) {
        this.user = user;
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

    public SeLinuxOptions withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SeLinuxOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
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
        result = ((result* 31)+((this.role == null)? 0 :this.role.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.level == null)? 0 :this.level.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SeLinuxOptions) == false) {
            return false;
        }
        SeLinuxOptions rhs = ((SeLinuxOptions) other);
        return ((((((this.role == rhs.role)||((this.role!= null)&&this.role.equals(rhs.role)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.level == rhs.level)||((this.level!= null)&&this.level.equals(rhs.level))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))));
    }

}
