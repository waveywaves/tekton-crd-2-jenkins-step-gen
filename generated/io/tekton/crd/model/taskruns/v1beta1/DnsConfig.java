
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
 * Specifies the DNS parameters of a pod.
 * Parameters specified here will be merged to the generated DNS
 * configuration based on DNSPolicy.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nameservers",
    "options",
    "searches"
})
@Generated("jsonschema2pojo")
public class DnsConfig {

    /**
     * A list of DNS name server IP addresses.
     * This will be appended to the base nameservers generated from DNSPolicy.
     * Duplicated nameservers will be removed.
     * 
     */
    @JsonProperty("nameservers")
    @JsonPropertyDescription("A list of DNS name server IP addresses.\nThis will be appended to the base nameservers generated from DNSPolicy.\nDuplicated nameservers will be removed.")
    @Valid
    private List<String> nameservers = new ArrayList<String>();
    /**
     * A list of DNS resolver options.
     * This will be merged with the base options generated from DNSPolicy.
     * Duplicated entries will be removed. Resolution options given in Options
     * will override those that appear in the base DNSPolicy.
     * 
     */
    @JsonProperty("options")
    @JsonPropertyDescription("A list of DNS resolver options.\nThis will be merged with the base options generated from DNSPolicy.\nDuplicated entries will be removed. Resolution options given in Options\nwill override those that appear in the base DNSPolicy.")
    @Valid
    private List<Option> options = new ArrayList<Option>();
    /**
     * A list of DNS search domains for host-name lookup.
     * This will be appended to the base search paths generated from DNSPolicy.
     * Duplicated search paths will be removed.
     * 
     */
    @JsonProperty("searches")
    @JsonPropertyDescription("A list of DNS search domains for host-name lookup.\nThis will be appended to the base search paths generated from DNSPolicy.\nDuplicated search paths will be removed.")
    @Valid
    private List<String> searches = new ArrayList<String>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * A list of DNS name server IP addresses.
     * This will be appended to the base nameservers generated from DNSPolicy.
     * Duplicated nameservers will be removed.
     * 
     */
    @JsonProperty("nameservers")
    public List<String> getNameservers() {
        return nameservers;
    }

    /**
     * A list of DNS name server IP addresses.
     * This will be appended to the base nameservers generated from DNSPolicy.
     * Duplicated nameservers will be removed.
     * 
     */
    @JsonProperty("nameservers")
    public void setNameservers(List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public DnsConfig withNameservers(List<String> nameservers) {
        this.nameservers = nameservers;
        return this;
    }

    /**
     * A list of DNS resolver options.
     * This will be merged with the base options generated from DNSPolicy.
     * Duplicated entries will be removed. Resolution options given in Options
     * will override those that appear in the base DNSPolicy.
     * 
     */
    @JsonProperty("options")
    public List<Option> getOptions() {
        return options;
    }

    /**
     * A list of DNS resolver options.
     * This will be merged with the base options generated from DNSPolicy.
     * Duplicated entries will be removed. Resolution options given in Options
     * will override those that appear in the base DNSPolicy.
     * 
     */
    @JsonProperty("options")
    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public DnsConfig withOptions(List<Option> options) {
        this.options = options;
        return this;
    }

    /**
     * A list of DNS search domains for host-name lookup.
     * This will be appended to the base search paths generated from DNSPolicy.
     * Duplicated search paths will be removed.
     * 
     */
    @JsonProperty("searches")
    public List<String> getSearches() {
        return searches;
    }

    /**
     * A list of DNS search domains for host-name lookup.
     * This will be appended to the base search paths generated from DNSPolicy.
     * Duplicated search paths will be removed.
     * 
     */
    @JsonProperty("searches")
    public void setSearches(List<String> searches) {
        this.searches = searches;
    }

    public DnsConfig withSearches(List<String> searches) {
        this.searches = searches;
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

    public DnsConfig withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DnsConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nameservers");
        sb.append('=');
        sb.append(((this.nameservers == null)?"<null>":this.nameservers));
        sb.append(',');
        sb.append("options");
        sb.append('=');
        sb.append(((this.options == null)?"<null>":this.options));
        sb.append(',');
        sb.append("searches");
        sb.append('=');
        sb.append(((this.searches == null)?"<null>":this.searches));
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
        result = ((result* 31)+((this.options == null)? 0 :this.options.hashCode()));
        result = ((result* 31)+((this.searches == null)? 0 :this.searches.hashCode()));
        result = ((result* 31)+((this.nameservers == null)? 0 :this.nameservers.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DnsConfig) == false) {
            return false;
        }
        DnsConfig rhs = ((DnsConfig) other);
        return (((((this.options == rhs.options)||((this.options!= null)&&this.options.equals(rhs.options)))&&((this.searches == rhs.searches)||((this.searches!= null)&&this.searches.equals(rhs.searches))))&&((this.nameservers == rhs.nameservers)||((this.nameservers!= null)&&this.nameservers.equals(rhs.nameservers))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
