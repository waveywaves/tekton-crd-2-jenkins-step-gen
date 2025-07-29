
package io.tekton.crd.model.tasks.v1beta1;

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
 * The capabilities to add/drop when running containers.
 * Defaults to the default set of capabilities granted by the container runtime.
 * Note that this field cannot be set when spec.os.name is windows.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "add",
    "drop"
})
@Generated("jsonschema2pojo")
public class Capabilities__1 {

    /**
     * Added capabilities
     * 
     */
    @JsonProperty("add")
    @JsonPropertyDescription("Added capabilities")
    @Valid
    private List<String> add = new ArrayList<String>();
    /**
     * Removed capabilities
     * 
     */
    @JsonProperty("drop")
    @JsonPropertyDescription("Removed capabilities")
    @Valid
    private List<String> drop = new ArrayList<String>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Added capabilities
     * 
     */
    @JsonProperty("add")
    public List<String> getAdd() {
        return add;
    }

    /**
     * Added capabilities
     * 
     */
    @JsonProperty("add")
    public void setAdd(List<String> add) {
        this.add = add;
    }

    public Capabilities__1 withAdd(List<String> add) {
        this.add = add;
        return this;
    }

    /**
     * Removed capabilities
     * 
     */
    @JsonProperty("drop")
    public List<String> getDrop() {
        return drop;
    }

    /**
     * Removed capabilities
     * 
     */
    @JsonProperty("drop")
    public void setDrop(List<String> drop) {
        this.drop = drop;
    }

    public Capabilities__1 withDrop(List<String> drop) {
        this.drop = drop;
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

    public Capabilities__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Capabilities__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("add");
        sb.append('=');
        sb.append(((this.add == null)?"<null>":this.add));
        sb.append(',');
        sb.append("drop");
        sb.append('=');
        sb.append(((this.drop == null)?"<null>":this.drop));
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
        result = ((result* 31)+((this.add == null)? 0 :this.add.hashCode()));
        result = ((result* 31)+((this.drop == null)? 0 :this.drop.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Capabilities__1) == false) {
            return false;
        }
        Capabilities__1 rhs = ((Capabilities__1) other);
        return ((((this.add == rhs.add)||((this.add!= null)&&this.add.equals(rhs.add)))&&((this.drop == rhs.drop)||((this.drop!= null)&&this.drop.equals(rhs.drop))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
