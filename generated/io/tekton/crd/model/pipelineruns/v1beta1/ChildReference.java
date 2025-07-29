
package io.tekton.crd.model.pipelineruns.v1beta1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
 * ChildStatusReference is used to point to the statuses of individual TaskRuns and Runs within this PipelineRun.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "displayName",
    "kind",
    "name",
    "pipelineTaskName",
    "whenExpressions"
})
@Generated("jsonschema2pojo")
public class ChildReference {

    @JsonProperty("apiVersion")
    private String apiVersion;
    /**
     * DisplayName is a user-facing name of the pipelineTask that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("DisplayName is a user-facing name of the pipelineTask that may be\nused to populate a UI.")
    private String displayName;
    @JsonProperty("kind")
    private String kind;
    /**
     * Name is the name of the TaskRun or Run this is referencing.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name is the name of the TaskRun or Run this is referencing.")
    private String name;
    /**
     * PipelineTaskName is the name of the PipelineTask this is referencing.
     * 
     */
    @JsonProperty("pipelineTaskName")
    @JsonPropertyDescription("PipelineTaskName is the name of the PipelineTask this is referencing.")
    private String pipelineTaskName;
    /**
     * WhenExpressions is the list of checks guarding the execution of the PipelineTask
     * 
     */
    @JsonProperty("whenExpressions")
    @JsonPropertyDescription("WhenExpressions is the list of checks guarding the execution of the PipelineTask")
    @Valid
    private List<WhenExpression> whenExpressions = new ArrayList<WhenExpression>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ChildReference withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * DisplayName is a user-facing name of the pipelineTask that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * DisplayName is a user-facing name of the pipelineTask that may be
     * used to populate a UI.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ChildReference withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    public ChildReference withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Name is the name of the TaskRun or Run this is referencing.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name is the name of the TaskRun or Run this is referencing.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public ChildReference withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * PipelineTaskName is the name of the PipelineTask this is referencing.
     * 
     */
    @JsonProperty("pipelineTaskName")
    public String getPipelineTaskName() {
        return pipelineTaskName;
    }

    /**
     * PipelineTaskName is the name of the PipelineTask this is referencing.
     * 
     */
    @JsonProperty("pipelineTaskName")
    public void setPipelineTaskName(String pipelineTaskName) {
        this.pipelineTaskName = pipelineTaskName;
    }

    public ChildReference withPipelineTaskName(String pipelineTaskName) {
        this.pipelineTaskName = pipelineTaskName;
        return this;
    }

    /**
     * WhenExpressions is the list of checks guarding the execution of the PipelineTask
     * 
     */
    @JsonProperty("whenExpressions")
    public List<WhenExpression> getWhenExpressions() {
        return whenExpressions;
    }

    /**
     * WhenExpressions is the list of checks guarding the execution of the PipelineTask
     * 
     */
    @JsonProperty("whenExpressions")
    public void setWhenExpressions(List<WhenExpression> whenExpressions) {
        this.whenExpressions = whenExpressions;
    }

    public ChildReference withWhenExpressions(List<WhenExpression> whenExpressions) {
        this.whenExpressions = whenExpressions;
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

    public ChildReference withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChildReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("apiVersion");
        sb.append('=');
        sb.append(((this.apiVersion == null)?"<null>":this.apiVersion));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("kind");
        sb.append('=');
        sb.append(((this.kind == null)?"<null>":this.kind));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("pipelineTaskName");
        sb.append('=');
        sb.append(((this.pipelineTaskName == null)?"<null>":this.pipelineTaskName));
        sb.append(',');
        sb.append("whenExpressions");
        sb.append('=');
        sb.append(((this.whenExpressions == null)?"<null>":this.whenExpressions));
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
        result = ((result* 31)+((this.apiVersion == null)? 0 :this.apiVersion.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.kind == null)? 0 :this.kind.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.pipelineTaskName == null)? 0 :this.pipelineTaskName.hashCode()));
        result = ((result* 31)+((this.whenExpressions == null)? 0 :this.whenExpressions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChildReference) == false) {
            return false;
        }
        ChildReference rhs = ((ChildReference) other);
        return ((((((((this.apiVersion == rhs.apiVersion)||((this.apiVersion!= null)&&this.apiVersion.equals(rhs.apiVersion)))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.kind == rhs.kind)||((this.kind!= null)&&this.kind.equals(rhs.kind))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.pipelineTaskName == rhs.pipelineTaskName)||((this.pipelineTaskName!= null)&&this.pipelineTaskName.equals(rhs.pipelineTaskName))))&&((this.whenExpressions == rhs.whenExpressions)||((this.whenExpressions!= null)&&this.whenExpressions.equals(rhs.whenExpressions))));
    }

}
