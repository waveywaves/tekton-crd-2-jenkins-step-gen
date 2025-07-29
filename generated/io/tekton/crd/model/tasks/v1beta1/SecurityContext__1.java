
package io.tekton.crd.model.tasks.v1beta1;

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
 * SecurityContext defines the security options the Step should be run with.
 * If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
 * More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "allowPrivilegeEscalation",
    "appArmorProfile",
    "capabilities",
    "privileged",
    "procMount",
    "readOnlyRootFilesystem",
    "runAsGroup",
    "runAsNonRoot",
    "runAsUser",
    "seLinuxOptions",
    "seccompProfile",
    "windowsOptions"
})
@Generated("jsonschema2pojo")
public class SecurityContext__1 {

    /**
     * AllowPrivilegeEscalation controls whether a process can gain more
     * privileges than its parent process. This bool directly controls if
     * the no_new_privs flag will be set on the container process.
     * AllowPrivilegeEscalation is true always when the container is:
     *  1) run as Privileged
     *  2) has CAP_SYS_ADMIN
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("allowPrivilegeEscalation")
    @JsonPropertyDescription("AllowPrivilegeEscalation controls whether a process can gain more\nprivileges than its parent process. This bool directly controls if\nthe no_new_privs flag will be set on the container process.\nAllowPrivilegeEscalation is true always when the container is:\n1) run as Privileged\n2) has CAP_SYS_ADMIN\nNote that this field cannot be set when spec.os.name is windows.")
    private Boolean allowPrivilegeEscalation;
    /**
     * appArmorProfile is the AppArmor options to use by this container. If set, this profile
     * overrides the pod's appArmorProfile.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("appArmorProfile")
    @JsonPropertyDescription("appArmorProfile is the AppArmor options to use by this container. If set, this profile\noverrides the pod's appArmorProfile.\nNote that this field cannot be set when spec.os.name is windows.")
    @Valid
    private AppArmorProfile__1 appArmorProfile;
    /**
     * The capabilities to add/drop when running containers.
     * Defaults to the default set of capabilities granted by the container runtime.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("capabilities")
    @JsonPropertyDescription("The capabilities to add/drop when running containers.\nDefaults to the default set of capabilities granted by the container runtime.\nNote that this field cannot be set when spec.os.name is windows.")
    @Valid
    private Capabilities__1 capabilities;
    /**
     * Run container in privileged mode.
     * Processes in privileged containers are essentially equivalent to root on the host.
     * Defaults to false.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("privileged")
    @JsonPropertyDescription("Run container in privileged mode.\nProcesses in privileged containers are essentially equivalent to root on the host.\nDefaults to false.\nNote that this field cannot be set when spec.os.name is windows.")
    private Boolean privileged;
    /**
     * procMount denotes the type of proc mount to use for the containers.
     * The default value is Default which uses the container runtime defaults for
     * readonly paths and masked paths.
     * This requires the ProcMountType feature flag to be enabled.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("procMount")
    @JsonPropertyDescription("procMount denotes the type of proc mount to use for the containers.\nThe default value is Default which uses the container runtime defaults for\nreadonly paths and masked paths.\nThis requires the ProcMountType feature flag to be enabled.\nNote that this field cannot be set when spec.os.name is windows.")
    private String procMount;
    /**
     * Whether this container has a read-only root filesystem.
     * Default is false.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("readOnlyRootFilesystem")
    @JsonPropertyDescription("Whether this container has a read-only root filesystem.\nDefault is false.\nNote that this field cannot be set when spec.os.name is windows.")
    private Boolean readOnlyRootFilesystem;
    /**
     * The GID to run the entrypoint of the container process.
     * Uses runtime default if unset.
     * May also be set in PodSecurityContext.  If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("runAsGroup")
    @JsonPropertyDescription("The GID to run the entrypoint of the container process.\nUses runtime default if unset.\nMay also be set in PodSecurityContext.  If set in both SecurityContext and\nPodSecurityContext, the value specified in SecurityContext takes precedence.\nNote that this field cannot be set when spec.os.name is windows.")
    private Integer runAsGroup;
    /**
     * Indicates that the container must run as a non-root user.
     * If true, the Kubelet will validate the image at runtime to ensure that it
     * does not run as UID 0 (root) and fail to start the container if it does.
     * If unset or false, no such validation will be performed.
     * May also be set in PodSecurityContext.  If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @JsonProperty("runAsNonRoot")
    @JsonPropertyDescription("Indicates that the container must run as a non-root user.\nIf true, the Kubelet will validate the image at runtime to ensure that it\ndoes not run as UID 0 (root) and fail to start the container if it does.\nIf unset or false, no such validation will be performed.\nMay also be set in PodSecurityContext.  If set in both SecurityContext and\nPodSecurityContext, the value specified in SecurityContext takes precedence.")
    private Boolean runAsNonRoot;
    /**
     * The UID to run the entrypoint of the container process.
     * Defaults to user specified in image metadata if unspecified.
     * May also be set in PodSecurityContext.  If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("runAsUser")
    @JsonPropertyDescription("The UID to run the entrypoint of the container process.\nDefaults to user specified in image metadata if unspecified.\nMay also be set in PodSecurityContext.  If set in both SecurityContext and\nPodSecurityContext, the value specified in SecurityContext takes precedence.\nNote that this field cannot be set when spec.os.name is windows.")
    private Integer runAsUser;
    /**
     * The SELinux context to be applied to the container.
     * If unspecified, the container runtime will allocate a random SELinux context for each
     * container.  May also be set in PodSecurityContext.  If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("seLinuxOptions")
    @JsonPropertyDescription("The SELinux context to be applied to the container.\nIf unspecified, the container runtime will allocate a random SELinux context for each\ncontainer.  May also be set in PodSecurityContext.  If set in both SecurityContext and\nPodSecurityContext, the value specified in SecurityContext takes precedence.\nNote that this field cannot be set when spec.os.name is windows.")
    @Valid
    private SeLinuxOptions__1 seLinuxOptions;
    /**
     * The seccomp options to use by this container. If seccomp options are
     * provided at both the pod & container level, the container options
     * override the pod options.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("seccompProfile")
    @JsonPropertyDescription("The seccomp options to use by this container. If seccomp options are\nprovided at both the pod & container level, the container options\noverride the pod options.\nNote that this field cannot be set when spec.os.name is windows.")
    @Valid
    private SeccompProfile__1 seccompProfile;
    /**
     * The Windows specific settings applied to all containers.
     * If unspecified, the options from the PodSecurityContext will be used.
     * If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * Note that this field cannot be set when spec.os.name is linux.
     * 
     */
    @JsonProperty("windowsOptions")
    @JsonPropertyDescription("The Windows specific settings applied to all containers.\nIf unspecified, the options from the PodSecurityContext will be used.\nIf set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.\nNote that this field cannot be set when spec.os.name is linux.")
    @Valid
    private WindowsOptions__1 windowsOptions;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * AllowPrivilegeEscalation controls whether a process can gain more
     * privileges than its parent process. This bool directly controls if
     * the no_new_privs flag will be set on the container process.
     * AllowPrivilegeEscalation is true always when the container is:
     *  1) run as Privileged
     *  2) has CAP_SYS_ADMIN
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("allowPrivilegeEscalation")
    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    /**
     * AllowPrivilegeEscalation controls whether a process can gain more
     * privileges than its parent process. This bool directly controls if
     * the no_new_privs flag will be set on the container process.
     * AllowPrivilegeEscalation is true always when the container is:
     *  1) run as Privileged
     *  2) has CAP_SYS_ADMIN
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("allowPrivilegeEscalation")
    public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }

    public SecurityContext__1 withAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        return this;
    }

    /**
     * appArmorProfile is the AppArmor options to use by this container. If set, this profile
     * overrides the pod's appArmorProfile.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("appArmorProfile")
    public AppArmorProfile__1 getAppArmorProfile() {
        return appArmorProfile;
    }

    /**
     * appArmorProfile is the AppArmor options to use by this container. If set, this profile
     * overrides the pod's appArmorProfile.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("appArmorProfile")
    public void setAppArmorProfile(AppArmorProfile__1 appArmorProfile) {
        this.appArmorProfile = appArmorProfile;
    }

    public SecurityContext__1 withAppArmorProfile(AppArmorProfile__1 appArmorProfile) {
        this.appArmorProfile = appArmorProfile;
        return this;
    }

    /**
     * The capabilities to add/drop when running containers.
     * Defaults to the default set of capabilities granted by the container runtime.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("capabilities")
    public Capabilities__1 getCapabilities() {
        return capabilities;
    }

    /**
     * The capabilities to add/drop when running containers.
     * Defaults to the default set of capabilities granted by the container runtime.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("capabilities")
    public void setCapabilities(Capabilities__1 capabilities) {
        this.capabilities = capabilities;
    }

    public SecurityContext__1 withCapabilities(Capabilities__1 capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Run container in privileged mode.
     * Processes in privileged containers are essentially equivalent to root on the host.
     * Defaults to false.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("privileged")
    public Boolean getPrivileged() {
        return privileged;
    }

    /**
     * Run container in privileged mode.
     * Processes in privileged containers are essentially equivalent to root on the host.
     * Defaults to false.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("privileged")
    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public SecurityContext__1 withPrivileged(Boolean privileged) {
        this.privileged = privileged;
        return this;
    }

    /**
     * procMount denotes the type of proc mount to use for the containers.
     * The default value is Default which uses the container runtime defaults for
     * readonly paths and masked paths.
     * This requires the ProcMountType feature flag to be enabled.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("procMount")
    public String getProcMount() {
        return procMount;
    }

    /**
     * procMount denotes the type of proc mount to use for the containers.
     * The default value is Default which uses the container runtime defaults for
     * readonly paths and masked paths.
     * This requires the ProcMountType feature flag to be enabled.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("procMount")
    public void setProcMount(String procMount) {
        this.procMount = procMount;
    }

    public SecurityContext__1 withProcMount(String procMount) {
        this.procMount = procMount;
        return this;
    }

    /**
     * Whether this container has a read-only root filesystem.
     * Default is false.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("readOnlyRootFilesystem")
    public Boolean getReadOnlyRootFilesystem() {
        return readOnlyRootFilesystem;
    }

    /**
     * Whether this container has a read-only root filesystem.
     * Default is false.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("readOnlyRootFilesystem")
    public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    }

    public SecurityContext__1 withReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        return this;
    }

    /**
     * The GID to run the entrypoint of the container process.
     * Uses runtime default if unset.
     * May also be set in PodSecurityContext.  If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("runAsGroup")
    public Integer getRunAsGroup() {
        return runAsGroup;
    }

    /**
     * The GID to run the entrypoint of the container process.
     * Uses runtime default if unset.
     * May also be set in PodSecurityContext.  If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("runAsGroup")
    public void setRunAsGroup(Integer runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    public SecurityContext__1 withRunAsGroup(Integer runAsGroup) {
        this.runAsGroup = runAsGroup;
        return this;
    }

    /**
     * Indicates that the container must run as a non-root user.
     * If true, the Kubelet will validate the image at runtime to ensure that it
     * does not run as UID 0 (root) and fail to start the container if it does.
     * If unset or false, no such validation will be performed.
     * May also be set in PodSecurityContext.  If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @JsonProperty("runAsNonRoot")
    public Boolean getRunAsNonRoot() {
        return runAsNonRoot;
    }

    /**
     * Indicates that the container must run as a non-root user.
     * If true, the Kubelet will validate the image at runtime to ensure that it
     * does not run as UID 0 (root) and fail to start the container if it does.
     * If unset or false, no such validation will be performed.
     * May also be set in PodSecurityContext.  If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @JsonProperty("runAsNonRoot")
    public void setRunAsNonRoot(Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
    }

    public SecurityContext__1 withRunAsNonRoot(Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
        return this;
    }

    /**
     * The UID to run the entrypoint of the container process.
     * Defaults to user specified in image metadata if unspecified.
     * May also be set in PodSecurityContext.  If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("runAsUser")
    public Integer getRunAsUser() {
        return runAsUser;
    }

    /**
     * The UID to run the entrypoint of the container process.
     * Defaults to user specified in image metadata if unspecified.
     * May also be set in PodSecurityContext.  If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("runAsUser")
    public void setRunAsUser(Integer runAsUser) {
        this.runAsUser = runAsUser;
    }

    public SecurityContext__1 withRunAsUser(Integer runAsUser) {
        this.runAsUser = runAsUser;
        return this;
    }

    /**
     * The SELinux context to be applied to the container.
     * If unspecified, the container runtime will allocate a random SELinux context for each
     * container.  May also be set in PodSecurityContext.  If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("seLinuxOptions")
    public SeLinuxOptions__1 getSeLinuxOptions() {
        return seLinuxOptions;
    }

    /**
     * The SELinux context to be applied to the container.
     * If unspecified, the container runtime will allocate a random SELinux context for each
     * container.  May also be set in PodSecurityContext.  If set in both SecurityContext and
     * PodSecurityContext, the value specified in SecurityContext takes precedence.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("seLinuxOptions")
    public void setSeLinuxOptions(SeLinuxOptions__1 seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    public SecurityContext__1 withSeLinuxOptions(SeLinuxOptions__1 seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
        return this;
    }

    /**
     * The seccomp options to use by this container. If seccomp options are
     * provided at both the pod & container level, the container options
     * override the pod options.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("seccompProfile")
    public SeccompProfile__1 getSeccompProfile() {
        return seccompProfile;
    }

    /**
     * The seccomp options to use by this container. If seccomp options are
     * provided at both the pod & container level, the container options
     * override the pod options.
     * Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    @JsonProperty("seccompProfile")
    public void setSeccompProfile(SeccompProfile__1 seccompProfile) {
        this.seccompProfile = seccompProfile;
    }

    public SecurityContext__1 withSeccompProfile(SeccompProfile__1 seccompProfile) {
        this.seccompProfile = seccompProfile;
        return this;
    }

    /**
     * The Windows specific settings applied to all containers.
     * If unspecified, the options from the PodSecurityContext will be used.
     * If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * Note that this field cannot be set when spec.os.name is linux.
     * 
     */
    @JsonProperty("windowsOptions")
    public WindowsOptions__1 getWindowsOptions() {
        return windowsOptions;
    }

    /**
     * The Windows specific settings applied to all containers.
     * If unspecified, the options from the PodSecurityContext will be used.
     * If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * Note that this field cannot be set when spec.os.name is linux.
     * 
     */
    @JsonProperty("windowsOptions")
    public void setWindowsOptions(WindowsOptions__1 windowsOptions) {
        this.windowsOptions = windowsOptions;
    }

    public SecurityContext__1 withWindowsOptions(WindowsOptions__1 windowsOptions) {
        this.windowsOptions = windowsOptions;
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

    public SecurityContext__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SecurityContext__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("allowPrivilegeEscalation");
        sb.append('=');
        sb.append(((this.allowPrivilegeEscalation == null)?"<null>":this.allowPrivilegeEscalation));
        sb.append(',');
        sb.append("appArmorProfile");
        sb.append('=');
        sb.append(((this.appArmorProfile == null)?"<null>":this.appArmorProfile));
        sb.append(',');
        sb.append("capabilities");
        sb.append('=');
        sb.append(((this.capabilities == null)?"<null>":this.capabilities));
        sb.append(',');
        sb.append("privileged");
        sb.append('=');
        sb.append(((this.privileged == null)?"<null>":this.privileged));
        sb.append(',');
        sb.append("procMount");
        sb.append('=');
        sb.append(((this.procMount == null)?"<null>":this.procMount));
        sb.append(',');
        sb.append("readOnlyRootFilesystem");
        sb.append('=');
        sb.append(((this.readOnlyRootFilesystem == null)?"<null>":this.readOnlyRootFilesystem));
        sb.append(',');
        sb.append("runAsGroup");
        sb.append('=');
        sb.append(((this.runAsGroup == null)?"<null>":this.runAsGroup));
        sb.append(',');
        sb.append("runAsNonRoot");
        sb.append('=');
        sb.append(((this.runAsNonRoot == null)?"<null>":this.runAsNonRoot));
        sb.append(',');
        sb.append("runAsUser");
        sb.append('=');
        sb.append(((this.runAsUser == null)?"<null>":this.runAsUser));
        sb.append(',');
        sb.append("seLinuxOptions");
        sb.append('=');
        sb.append(((this.seLinuxOptions == null)?"<null>":this.seLinuxOptions));
        sb.append(',');
        sb.append("seccompProfile");
        sb.append('=');
        sb.append(((this.seccompProfile == null)?"<null>":this.seccompProfile));
        sb.append(',');
        sb.append("windowsOptions");
        sb.append('=');
        sb.append(((this.windowsOptions == null)?"<null>":this.windowsOptions));
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
        result = ((result* 31)+((this.capabilities == null)? 0 :this.capabilities.hashCode()));
        result = ((result* 31)+((this.seLinuxOptions == null)? 0 :this.seLinuxOptions.hashCode()));
        result = ((result* 31)+((this.appArmorProfile == null)? 0 :this.appArmorProfile.hashCode()));
        result = ((result* 31)+((this.procMount == null)? 0 :this.procMount.hashCode()));
        result = ((result* 31)+((this.runAsGroup == null)? 0 :this.runAsGroup.hashCode()));
        result = ((result* 31)+((this.runAsNonRoot == null)? 0 :this.runAsNonRoot.hashCode()));
        result = ((result* 31)+((this.readOnlyRootFilesystem == null)? 0 :this.readOnlyRootFilesystem.hashCode()));
        result = ((result* 31)+((this.privileged == null)? 0 :this.privileged.hashCode()));
        result = ((result* 31)+((this.runAsUser == null)? 0 :this.runAsUser.hashCode()));
        result = ((result* 31)+((this.seccompProfile == null)? 0 :this.seccompProfile.hashCode()));
        result = ((result* 31)+((this.windowsOptions == null)? 0 :this.windowsOptions.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.allowPrivilegeEscalation == null)? 0 :this.allowPrivilegeEscalation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecurityContext__1) == false) {
            return false;
        }
        SecurityContext__1 rhs = ((SecurityContext__1) other);
        return ((((((((((((((this.capabilities == rhs.capabilities)||((this.capabilities!= null)&&this.capabilities.equals(rhs.capabilities)))&&((this.seLinuxOptions == rhs.seLinuxOptions)||((this.seLinuxOptions!= null)&&this.seLinuxOptions.equals(rhs.seLinuxOptions))))&&((this.appArmorProfile == rhs.appArmorProfile)||((this.appArmorProfile!= null)&&this.appArmorProfile.equals(rhs.appArmorProfile))))&&((this.procMount == rhs.procMount)||((this.procMount!= null)&&this.procMount.equals(rhs.procMount))))&&((this.runAsGroup == rhs.runAsGroup)||((this.runAsGroup!= null)&&this.runAsGroup.equals(rhs.runAsGroup))))&&((this.runAsNonRoot == rhs.runAsNonRoot)||((this.runAsNonRoot!= null)&&this.runAsNonRoot.equals(rhs.runAsNonRoot))))&&((this.readOnlyRootFilesystem == rhs.readOnlyRootFilesystem)||((this.readOnlyRootFilesystem!= null)&&this.readOnlyRootFilesystem.equals(rhs.readOnlyRootFilesystem))))&&((this.privileged == rhs.privileged)||((this.privileged!= null)&&this.privileged.equals(rhs.privileged))))&&((this.runAsUser == rhs.runAsUser)||((this.runAsUser!= null)&&this.runAsUser.equals(rhs.runAsUser))))&&((this.seccompProfile == rhs.seccompProfile)||((this.seccompProfile!= null)&&this.seccompProfile.equals(rhs.seccompProfile))))&&((this.windowsOptions == rhs.windowsOptions)||((this.windowsOptions!= null)&&this.windowsOptions.equals(rhs.windowsOptions))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.allowPrivilegeEscalation == rhs.allowPrivilegeEscalation)||((this.allowPrivilegeEscalation!= null)&&this.allowPrivilegeEscalation.equals(rhs.allowPrivilegeEscalation))));
    }

}
