
package io.tekton.crd.model.taskruns.v1beta1;

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
 * LabelSelector is used to find matching pods.
 * Pods that match this label selector are counted to determine the number of pods
 * in their corresponding topology domain.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "matchExpressions",
    "matchLabels"
})
@Generated("jsonschema2pojo")
public class LabelSelector {

    /**
     * matchExpressions is a list of label selector requirements. The requirements are ANDed.
     * 
     */
    @JsonProperty("matchExpressions")
    @JsonPropertyDescription("matchExpressions is a list of label selector requirements. The requirements are ANDed.")
    @Valid
    private List<MatchExpression> matchExpressions = new ArrayList<MatchExpression>();
    /**
     * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels
     * map is equivalent to an element of matchExpressions, whose key field is "key", the
     * operator is "In", and the values array contains only "value". The requirements are ANDed.
     * 
     */
    @JsonProperty("matchLabels")
    @JsonPropertyDescription("matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels\nmap is equivalent to an element of matchExpressions, whose key field is \"key\", the\noperator is \"In\", and the values array contains only \"value\". The requirements are ANDed.")
    @Valid
    private MatchLabels matchLabels;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * matchExpressions is a list of label selector requirements. The requirements are ANDed.
     * 
     */
    @JsonProperty("matchExpressions")
    public List<MatchExpression> getMatchExpressions() {
        return matchExpressions;
    }

    /**
     * matchExpressions is a list of label selector requirements. The requirements are ANDed.
     * 
     */
    @JsonProperty("matchExpressions")
    public void setMatchExpressions(List<MatchExpression> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    public LabelSelector withMatchExpressions(List<MatchExpression> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }

    /**
     * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels
     * map is equivalent to an element of matchExpressions, whose key field is "key", the
     * operator is "In", and the values array contains only "value". The requirements are ANDed.
     * 
     */
    @JsonProperty("matchLabels")
    public MatchLabels getMatchLabels() {
        return matchLabels;
    }

    /**
     * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels
     * map is equivalent to an element of matchExpressions, whose key field is "key", the
     * operator is "In", and the values array contains only "value". The requirements are ANDed.
     * 
     */
    @JsonProperty("matchLabels")
    public void setMatchLabels(MatchLabels matchLabels) {
        this.matchLabels = matchLabels;
    }

    public LabelSelector withMatchLabels(MatchLabels matchLabels) {
        this.matchLabels = matchLabels;
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

    public LabelSelector withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LabelSelector.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("matchExpressions");
        sb.append('=');
        sb.append(((this.matchExpressions == null)?"<null>":this.matchExpressions));
        sb.append(',');
        sb.append("matchLabels");
        sb.append('=');
        sb.append(((this.matchLabels == null)?"<null>":this.matchLabels));
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
        result = ((result* 31)+((this.matchExpressions == null)? 0 :this.matchExpressions.hashCode()));
        result = ((result* 31)+((this.matchLabels == null)? 0 :this.matchLabels.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LabelSelector) == false) {
            return false;
        }
        LabelSelector rhs = ((LabelSelector) other);
        return ((((this.matchExpressions == rhs.matchExpressions)||((this.matchExpressions!= null)&&this.matchExpressions.equals(rhs.matchExpressions)))&&((this.matchLabels == rhs.matchLabels)||((this.matchLabels!= null)&&this.matchLabels.equals(rhs.matchLabels))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
