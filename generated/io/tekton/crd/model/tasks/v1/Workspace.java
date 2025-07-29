
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
 * WorkspaceUsage is used by a Step or Sidecar to declare that it wants isolated access
 * to a Workspace defined in a Task.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mountPath",
    "name"
})
@Generated("jsonschema2pojo")
public class Workspace {

    /**
     * MountPath is the path that the workspace should be mounted to inside the Step or Sidecar,
     * overriding any MountPath specified in the Task's WorkspaceDeclaration.
     * (Required)
     * 
     */
    @JsonProperty("mountPath")
    @JsonPropertyDescription("MountPath is the path that the workspace should be mounted to inside the Step or Sidecar,\noverriding any MountPath specified in the Task's WorkspaceDeclaration.")
    @NotNull
    private String mountPath;
    /**
     * Name is the name of the workspace this Step or Sidecar wants access to.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name is the name of the workspace this Step or Sidecar wants access to.")
    @NotNull
    private String name;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * MountPath is the path that the workspace should be mounted to inside the Step or Sidecar,
     * overriding any MountPath specified in the Task's WorkspaceDeclaration.
     * (Required)
     * 
     */
    @JsonProperty("mountPath")
    public String getMountPath() {
        return mountPath;
    }

    /**
     * MountPath is the path that the workspace should be mounted to inside the Step or Sidecar,
     * overriding any MountPath specified in the Task's WorkspaceDeclaration.
     * (Required)
     * 
     */
    @JsonProperty("mountPath")
    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    public Workspace withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * Name is the name of the workspace this Step or Sidecar wants access to.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name is the name of the workspace this Step or Sidecar wants access to.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Workspace withName(String name) {
        this.name = name;
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

    public Workspace withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Workspace.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("mountPath");
        sb.append('=');
        sb.append(((this.mountPath == null)?"<null>":this.mountPath));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.mountPath == null)? 0 :this.mountPath.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Workspace) == false) {
            return false;
        }
        Workspace rhs = ((Workspace) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.mountPath == rhs.mountPath)||((this.mountPath!= null)&&this.mountPath.equals(rhs.mountPath))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
