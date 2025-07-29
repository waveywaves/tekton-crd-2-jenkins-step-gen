
package io.tekton.crd.model.taskruns.v1;

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
 * The Windows specific settings applied to all containers.
 * If unspecified, the options from the PodSecurityContext will be used.
 * If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
 * Note that this field cannot be set when spec.os.name is linux.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "gmsaCredentialSpec",
    "gmsaCredentialSpecName",
    "hostProcess",
    "runAsUserName"
})
@Generated("jsonschema2pojo")
public class WindowsOptions__2 {

    /**
     * GMSACredentialSpec is where the GMSA admission webhook
     * (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the
     * GMSA credential spec named by the GMSACredentialSpecName field.
     * 
     */
    @JsonProperty("gmsaCredentialSpec")
    @JsonPropertyDescription("GMSACredentialSpec is where the GMSA admission webhook\n(https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the\nGMSA credential spec named by the GMSACredentialSpecName field.")
    private String gmsaCredentialSpec;
    /**
     * GMSACredentialSpecName is the name of the GMSA credential spec to use.
     * 
     */
    @JsonProperty("gmsaCredentialSpecName")
    @JsonPropertyDescription("GMSACredentialSpecName is the name of the GMSA credential spec to use.")
    private String gmsaCredentialSpecName;
    /**
     * HostProcess determines if a container should be run as a 'Host Process' container.
     * All of a Pod's containers must have the same effective HostProcess value
     * (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers).
     * In addition, if HostProcess is true then HostNetwork must also be set to true.
     * 
     */
    @JsonProperty("hostProcess")
    @JsonPropertyDescription("HostProcess determines if a container should be run as a 'Host Process' container.\nAll of a Pod's containers must have the same effective HostProcess value\n(it is not allowed to have a mix of HostProcess containers and non-HostProcess containers).\nIn addition, if HostProcess is true then HostNetwork must also be set to true.")
    private Boolean hostProcess;
    /**
     * The UserName in Windows to run the entrypoint of the container process.
     * Defaults to the user specified in image metadata if unspecified.
     * May also be set in PodSecurityContext. If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @JsonProperty("runAsUserName")
    @JsonPropertyDescription("The UserName in Windows to run the entrypoint of the container process.\nDefaults to the user specified in image metadata if unspecified.\nMay also be set in PodSecurityContext. If set in both SecurityContext and\nPodSecurityContext, the value specified in SecurityContext takes precedence.")
    private String runAsUserName;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * GMSACredentialSpec is where the GMSA admission webhook
     * (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the
     * GMSA credential spec named by the GMSACredentialSpecName field.
     * 
     */
    @JsonProperty("gmsaCredentialSpec")
    public String getGmsaCredentialSpec() {
        return gmsaCredentialSpec;
    }

    /**
     * GMSACredentialSpec is where the GMSA admission webhook
     * (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the
     * GMSA credential spec named by the GMSACredentialSpecName field.
     * 
     */
    @JsonProperty("gmsaCredentialSpec")
    public void setGmsaCredentialSpec(String gmsaCredentialSpec) {
        this.gmsaCredentialSpec = gmsaCredentialSpec;
    }

    public WindowsOptions__2 withGmsaCredentialSpec(String gmsaCredentialSpec) {
        this.gmsaCredentialSpec = gmsaCredentialSpec;
        return this;
    }

    /**
     * GMSACredentialSpecName is the name of the GMSA credential spec to use.
     * 
     */
    @JsonProperty("gmsaCredentialSpecName")
    public String getGmsaCredentialSpecName() {
        return gmsaCredentialSpecName;
    }

    /**
     * GMSACredentialSpecName is the name of the GMSA credential spec to use.
     * 
     */
    @JsonProperty("gmsaCredentialSpecName")
    public void setGmsaCredentialSpecName(String gmsaCredentialSpecName) {
        this.gmsaCredentialSpecName = gmsaCredentialSpecName;
    }

    public WindowsOptions__2 withGmsaCredentialSpecName(String gmsaCredentialSpecName) {
        this.gmsaCredentialSpecName = gmsaCredentialSpecName;
        return this;
    }

    /**
     * HostProcess determines if a container should be run as a 'Host Process' container.
     * All of a Pod's containers must have the same effective HostProcess value
     * (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers).
     * In addition, if HostProcess is true then HostNetwork must also be set to true.
     * 
     */
    @JsonProperty("hostProcess")
    public Boolean getHostProcess() {
        return hostProcess;
    }

    /**
     * HostProcess determines if a container should be run as a 'Host Process' container.
     * All of a Pod's containers must have the same effective HostProcess value
     * (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers).
     * In addition, if HostProcess is true then HostNetwork must also be set to true.
     * 
     */
    @JsonProperty("hostProcess")
    public void setHostProcess(Boolean hostProcess) {
        this.hostProcess = hostProcess;
    }

    public WindowsOptions__2 withHostProcess(Boolean hostProcess) {
        this.hostProcess = hostProcess;
        return this;
    }

    /**
     * The UserName in Windows to run the entrypoint of the container process.
     * Defaults to the user specified in image metadata if unspecified.
     * May also be set in PodSecurityContext. If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @JsonProperty("runAsUserName")
    public String getRunAsUserName() {
        return runAsUserName;
    }

    /**
     * The UserName in Windows to run the entrypoint of the container process.
     * Defaults to the user specified in image metadata if unspecified.
     * May also be set in PodSecurityContext. If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @JsonProperty("runAsUserName")
    public void setRunAsUserName(String runAsUserName) {
        this.runAsUserName = runAsUserName;
    }

    public WindowsOptions__2 withRunAsUserName(String runAsUserName) {
        this.runAsUserName = runAsUserName;
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

    public WindowsOptions__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WindowsOptions__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gmsaCredentialSpec");
        sb.append('=');
        sb.append(((this.gmsaCredentialSpec == null)?"<null>":this.gmsaCredentialSpec));
        sb.append(',');
        sb.append("gmsaCredentialSpecName");
        sb.append('=');
        sb.append(((this.gmsaCredentialSpecName == null)?"<null>":this.gmsaCredentialSpecName));
        sb.append(',');
        sb.append("hostProcess");
        sb.append('=');
        sb.append(((this.hostProcess == null)?"<null>":this.hostProcess));
        sb.append(',');
        sb.append("runAsUserName");
        sb.append('=');
        sb.append(((this.runAsUserName == null)?"<null>":this.runAsUserName));
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
        result = ((result* 31)+((this.gmsaCredentialSpec == null)? 0 :this.gmsaCredentialSpec.hashCode()));
        result = ((result* 31)+((this.hostProcess == null)? 0 :this.hostProcess.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.runAsUserName == null)? 0 :this.runAsUserName.hashCode()));
        result = ((result* 31)+((this.gmsaCredentialSpecName == null)? 0 :this.gmsaCredentialSpecName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WindowsOptions__2) == false) {
            return false;
        }
        WindowsOptions__2 rhs = ((WindowsOptions__2) other);
        return ((((((this.gmsaCredentialSpec == rhs.gmsaCredentialSpec)||((this.gmsaCredentialSpec!= null)&&this.gmsaCredentialSpec.equals(rhs.gmsaCredentialSpec)))&&((this.hostProcess == rhs.hostProcess)||((this.hostProcess!= null)&&this.hostProcess.equals(rhs.hostProcess))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.runAsUserName == rhs.runAsUserName)||((this.runAsUserName!= null)&&this.runAsUserName.equals(rhs.runAsUserName))))&&((this.gmsaCredentialSpecName == rhs.gmsaCredentialSpecName)||((this.gmsaCredentialSpecName!= null)&&this.gmsaCredentialSpecName.equals(rhs.gmsaCredentialSpecName))));
    }

}
