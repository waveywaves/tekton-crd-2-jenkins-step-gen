
package io.tekton.crd.model.pipelines.v1beta1;

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
 * PipelineWorkspaceDeclaration creates a named slot in a Pipeline that a PipelineRun
 * is expected to populate with a workspace binding.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "name",
    "optional"
})
@Generated("jsonschema2pojo")
public class Workspace__2 {

    /**
     * Description is a human readable string describing how the workspace will be
     * used in the Pipeline. It can be useful to include a bit of detail about which
     * tasks are intended to have access to the data on the workspace.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Description is a human readable string describing how the workspace will be\nused in the Pipeline. It can be useful to include a bit of detail about which\ntasks are intended to have access to the data on the workspace.")
    private String description;
    /**
     * Name is the name of a workspace to be provided by a PipelineRun.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name is the name of a workspace to be provided by a PipelineRun.")
    @NotNull
    private String name;
    /**
     * Optional marks a Workspace as not being required in PipelineRuns. By default
     * this field is false and so declared workspaces are required.
     * 
     */
    @JsonProperty("optional")
    @JsonPropertyDescription("Optional marks a Workspace as not being required in PipelineRuns. By default\nthis field is false and so declared workspaces are required.")
    private Boolean optional;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Description is a human readable string describing how the workspace will be
     * used in the Pipeline. It can be useful to include a bit of detail about which
     * tasks are intended to have access to the data on the workspace.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description is a human readable string describing how the workspace will be
     * used in the Pipeline. It can be useful to include a bit of detail about which
     * tasks are intended to have access to the data on the workspace.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Workspace__2 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Name is the name of a workspace to be provided by a PipelineRun.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name is the name of a workspace to be provided by a PipelineRun.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Workspace__2 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Optional marks a Workspace as not being required in PipelineRuns. By default
     * this field is false and so declared workspaces are required.
     * 
     */
    @JsonProperty("optional")
    public Boolean getOptional() {
        return optional;
    }

    /**
     * Optional marks a Workspace as not being required in PipelineRuns. By default
     * this field is false and so declared workspaces are required.
     * 
     */
    @JsonProperty("optional")
    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public Workspace__2 withOptional(Boolean optional) {
        this.optional = optional;
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

    public Workspace__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Workspace__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("optional");
        sb.append('=');
        sb.append(((this.optional == null)?"<null>":this.optional));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.optional == null)? 0 :this.optional.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Workspace__2) == false) {
            return false;
        }
        Workspace__2 rhs = ((Workspace__2) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.optional == rhs.optional)||((this.optional!= null)&&this.optional.equals(rhs.optional))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
