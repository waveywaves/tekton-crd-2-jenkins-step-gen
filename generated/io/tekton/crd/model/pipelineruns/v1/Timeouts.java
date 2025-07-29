
package io.tekton.crd.model.pipelineruns.v1;

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
 * Time after which the Pipeline times out.
 * Currently three keys are accepted in the map
 * pipeline, tasks and finally
 * with Timeouts.pipeline >= Timeouts.tasks + Timeouts.finally
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "finally",
    "pipeline",
    "tasks"
})
@Generated("jsonschema2pojo")
public class Timeouts {

    /**
     * Finally sets the maximum allowed duration of this pipeline's finally
     * 
     */
    @JsonProperty("finally")
    @JsonPropertyDescription("Finally sets the maximum allowed duration of this pipeline's finally")
    private String _finally;
    /**
     * Pipeline sets the maximum allowed duration for execution of the entire pipeline. The sum of individual timeouts for tasks and finally must not exceed this value.
     * 
     */
    @JsonProperty("pipeline")
    @JsonPropertyDescription("Pipeline sets the maximum allowed duration for execution of the entire pipeline. The sum of individual timeouts for tasks and finally must not exceed this value.")
    private String pipeline;
    /**
     * Tasks sets the maximum allowed duration of this pipeline's tasks
     * 
     */
    @JsonProperty("tasks")
    @JsonPropertyDescription("Tasks sets the maximum allowed duration of this pipeline's tasks")
    private String tasks;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Finally sets the maximum allowed duration of this pipeline's finally
     * 
     */
    @JsonProperty("finally")
    public String getFinally() {
        return _finally;
    }

    /**
     * Finally sets the maximum allowed duration of this pipeline's finally
     * 
     */
    @JsonProperty("finally")
    public void setFinally(String _finally) {
        this._finally = _finally;
    }

    public Timeouts withFinally(String _finally) {
        this._finally = _finally;
        return this;
    }

    /**
     * Pipeline sets the maximum allowed duration for execution of the entire pipeline. The sum of individual timeouts for tasks and finally must not exceed this value.
     * 
     */
    @JsonProperty("pipeline")
    public String getPipeline() {
        return pipeline;
    }

    /**
     * Pipeline sets the maximum allowed duration for execution of the entire pipeline. The sum of individual timeouts for tasks and finally must not exceed this value.
     * 
     */
    @JsonProperty("pipeline")
    public void setPipeline(String pipeline) {
        this.pipeline = pipeline;
    }

    public Timeouts withPipeline(String pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Tasks sets the maximum allowed duration of this pipeline's tasks
     * 
     */
    @JsonProperty("tasks")
    public String getTasks() {
        return tasks;
    }

    /**
     * Tasks sets the maximum allowed duration of this pipeline's tasks
     * 
     */
    @JsonProperty("tasks")
    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public Timeouts withTasks(String tasks) {
        this.tasks = tasks;
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

    public Timeouts withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Timeouts.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_finally");
        sb.append('=');
        sb.append(((this._finally == null)?"<null>":this._finally));
        sb.append(',');
        sb.append("pipeline");
        sb.append('=');
        sb.append(((this.pipeline == null)?"<null>":this.pipeline));
        sb.append(',');
        sb.append("tasks");
        sb.append('=');
        sb.append(((this.tasks == null)?"<null>":this.tasks));
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
        result = ((result* 31)+((this.pipeline == null)? 0 :this.pipeline.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tasks == null)? 0 :this.tasks.hashCode()));
        result = ((result* 31)+((this._finally == null)? 0 :this._finally.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Timeouts) == false) {
            return false;
        }
        Timeouts rhs = ((Timeouts) other);
        return (((((this.pipeline == rhs.pipeline)||((this.pipeline!= null)&&this.pipeline.equals(rhs.pipeline)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tasks == rhs.tasks)||((this.tasks!= null)&&this.tasks.equals(rhs.tasks))))&&((this._finally == rhs._finally)||((this._finally!= null)&&this._finally.equals(rhs._finally))));
    }

}
