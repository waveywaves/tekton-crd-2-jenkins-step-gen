
package io.tekton.crd.model.taskruns.v1beta1;

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
 * WorkspaceBinding maps a Task's declared workspace to a Volume.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "configMap",
    "csi",
    "emptyDir",
    "name",
    "persistentVolumeClaim",
    "projected",
    "secret",
    "subPath",
    "volumeClaimTemplate"
})
@Generated("jsonschema2pojo")
public class Workspace {

    /**
     * ConfigMap represents a configMap that should populate this workspace.
     * 
     */
    @JsonProperty("configMap")
    @JsonPropertyDescription("ConfigMap represents a configMap that should populate this workspace.")
    @Valid
    private ConfigMap configMap;
    /**
     * CSI (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers.
     * 
     */
    @JsonProperty("csi")
    @JsonPropertyDescription("CSI (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers.")
    @Valid
    private Csi csi;
    /**
     * EmptyDir represents a temporary directory that shares a Task's lifetime.
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     * Either this OR PersistentVolumeClaim can be used.
     * 
     */
    @JsonProperty("emptyDir")
    @JsonPropertyDescription("EmptyDir represents a temporary directory that shares a Task's lifetime.\nMore info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir\nEither this OR PersistentVolumeClaim can be used.")
    @Valid
    private EmptyDir emptyDir;
    /**
     * Name is the name of the workspace populated by the volume.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name is the name of the workspace populated by the volume.")
    @NotNull
    private String name;
    /**
     * PersistentVolumeClaimVolumeSource represents a reference to a
     * PersistentVolumeClaim in the same namespace. Either this OR EmptyDir can be used.
     * 
     */
    @JsonProperty("persistentVolumeClaim")
    @JsonPropertyDescription("PersistentVolumeClaimVolumeSource represents a reference to a\nPersistentVolumeClaim in the same namespace. Either this OR EmptyDir can be used.")
    @Valid
    private PersistentVolumeClaim persistentVolumeClaim;
    /**
     * Projected represents a projected volume that should populate this workspace.
     * 
     */
    @JsonProperty("projected")
    @JsonPropertyDescription("Projected represents a projected volume that should populate this workspace.")
    @Valid
    private Projected projected;
    /**
     * Secret represents a secret that should populate this workspace.
     * 
     */
    @JsonProperty("secret")
    @JsonPropertyDescription("Secret represents a secret that should populate this workspace.")
    @Valid
    private Secret__3 secret;
    /**
     * SubPath is optionally a directory on the volume which should be used
     * for this binding (i.e. the volume will be mounted at this sub directory).
     * 
     */
    @JsonProperty("subPath")
    @JsonPropertyDescription("SubPath is optionally a directory on the volume which should be used\nfor this binding (i.e. the volume will be mounted at this sub directory).")
    private String subPath;
    /**
     * VolumeClaimTemplate is a template for a claim that will be created in the same namespace.
     * The PipelineRun controller is responsible for creating a unique claim for each instance of PipelineRun.
     * See PersistentVolumeClaim (API version: v1)
     * 
     */
    @JsonProperty("volumeClaimTemplate")
    @JsonPropertyDescription("VolumeClaimTemplate is a template for a claim that will be created in the same namespace.\nThe PipelineRun controller is responsible for creating a unique claim for each instance of PipelineRun.\nSee PersistentVolumeClaim (API version: v1)")
    private Object volumeClaimTemplate;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * ConfigMap represents a configMap that should populate this workspace.
     * 
     */
    @JsonProperty("configMap")
    public ConfigMap getConfigMap() {
        return configMap;
    }

    /**
     * ConfigMap represents a configMap that should populate this workspace.
     * 
     */
    @JsonProperty("configMap")
    public void setConfigMap(ConfigMap configMap) {
        this.configMap = configMap;
    }

    public Workspace withConfigMap(ConfigMap configMap) {
        this.configMap = configMap;
        return this;
    }

    /**
     * CSI (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers.
     * 
     */
    @JsonProperty("csi")
    public Csi getCsi() {
        return csi;
    }

    /**
     * CSI (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers.
     * 
     */
    @JsonProperty("csi")
    public void setCsi(Csi csi) {
        this.csi = csi;
    }

    public Workspace withCsi(Csi csi) {
        this.csi = csi;
        return this;
    }

    /**
     * EmptyDir represents a temporary directory that shares a Task's lifetime.
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     * Either this OR PersistentVolumeClaim can be used.
     * 
     */
    @JsonProperty("emptyDir")
    public EmptyDir getEmptyDir() {
        return emptyDir;
    }

    /**
     * EmptyDir represents a temporary directory that shares a Task's lifetime.
     * More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     * Either this OR PersistentVolumeClaim can be used.
     * 
     */
    @JsonProperty("emptyDir")
    public void setEmptyDir(EmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public Workspace withEmptyDir(EmptyDir emptyDir) {
        this.emptyDir = emptyDir;
        return this;
    }

    /**
     * Name is the name of the workspace populated by the volume.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name is the name of the workspace populated by the volume.
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

    /**
     * PersistentVolumeClaimVolumeSource represents a reference to a
     * PersistentVolumeClaim in the same namespace. Either this OR EmptyDir can be used.
     * 
     */
    @JsonProperty("persistentVolumeClaim")
    public PersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    /**
     * PersistentVolumeClaimVolumeSource represents a reference to a
     * PersistentVolumeClaim in the same namespace. Either this OR EmptyDir can be used.
     * 
     */
    @JsonProperty("persistentVolumeClaim")
    public void setPersistentVolumeClaim(PersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public Workspace withPersistentVolumeClaim(PersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
        return this;
    }

    /**
     * Projected represents a projected volume that should populate this workspace.
     * 
     */
    @JsonProperty("projected")
    public Projected getProjected() {
        return projected;
    }

    /**
     * Projected represents a projected volume that should populate this workspace.
     * 
     */
    @JsonProperty("projected")
    public void setProjected(Projected projected) {
        this.projected = projected;
    }

    public Workspace withProjected(Projected projected) {
        this.projected = projected;
        return this;
    }

    /**
     * Secret represents a secret that should populate this workspace.
     * 
     */
    @JsonProperty("secret")
    public Secret__3 getSecret() {
        return secret;
    }

    /**
     * Secret represents a secret that should populate this workspace.
     * 
     */
    @JsonProperty("secret")
    public void setSecret(Secret__3 secret) {
        this.secret = secret;
    }

    public Workspace withSecret(Secret__3 secret) {
        this.secret = secret;
        return this;
    }

    /**
     * SubPath is optionally a directory on the volume which should be used
     * for this binding (i.e. the volume will be mounted at this sub directory).
     * 
     */
    @JsonProperty("subPath")
    public String getSubPath() {
        return subPath;
    }

    /**
     * SubPath is optionally a directory on the volume which should be used
     * for this binding (i.e. the volume will be mounted at this sub directory).
     * 
     */
    @JsonProperty("subPath")
    public void setSubPath(String subPath) {
        this.subPath = subPath;
    }

    public Workspace withSubPath(String subPath) {
        this.subPath = subPath;
        return this;
    }

    /**
     * VolumeClaimTemplate is a template for a claim that will be created in the same namespace.
     * The PipelineRun controller is responsible for creating a unique claim for each instance of PipelineRun.
     * See PersistentVolumeClaim (API version: v1)
     * 
     */
    @JsonProperty("volumeClaimTemplate")
    public Object getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    /**
     * VolumeClaimTemplate is a template for a claim that will be created in the same namespace.
     * The PipelineRun controller is responsible for creating a unique claim for each instance of PipelineRun.
     * See PersistentVolumeClaim (API version: v1)
     * 
     */
    @JsonProperty("volumeClaimTemplate")
    public void setVolumeClaimTemplate(Object volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    public Workspace withVolumeClaimTemplate(Object volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
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
        sb.append("configMap");
        sb.append('=');
        sb.append(((this.configMap == null)?"<null>":this.configMap));
        sb.append(',');
        sb.append("csi");
        sb.append('=');
        sb.append(((this.csi == null)?"<null>":this.csi));
        sb.append(',');
        sb.append("emptyDir");
        sb.append('=');
        sb.append(((this.emptyDir == null)?"<null>":this.emptyDir));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("persistentVolumeClaim");
        sb.append('=');
        sb.append(((this.persistentVolumeClaim == null)?"<null>":this.persistentVolumeClaim));
        sb.append(',');
        sb.append("projected");
        sb.append('=');
        sb.append(((this.projected == null)?"<null>":this.projected));
        sb.append(',');
        sb.append("secret");
        sb.append('=');
        sb.append(((this.secret == null)?"<null>":this.secret));
        sb.append(',');
        sb.append("subPath");
        sb.append('=');
        sb.append(((this.subPath == null)?"<null>":this.subPath));
        sb.append(',');
        sb.append("volumeClaimTemplate");
        sb.append('=');
        sb.append(((this.volumeClaimTemplate == null)?"<null>":this.volumeClaimTemplate));
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
        result = ((result* 31)+((this.projected == null)? 0 :this.projected.hashCode()));
        result = ((result* 31)+((this.configMap == null)? 0 :this.configMap.hashCode()));
        result = ((result* 31)+((this.emptyDir == null)? 0 :this.emptyDir.hashCode()));
        result = ((result* 31)+((this.csi == null)? 0 :this.csi.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.volumeClaimTemplate == null)? 0 :this.volumeClaimTemplate.hashCode()));
        result = ((result* 31)+((this.persistentVolumeClaim == null)? 0 :this.persistentVolumeClaim.hashCode()));
        result = ((result* 31)+((this.secret == null)? 0 :this.secret.hashCode()));
        result = ((result* 31)+((this.subPath == null)? 0 :this.subPath.hashCode()));
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
        return (((((((((((this.projected == rhs.projected)||((this.projected!= null)&&this.projected.equals(rhs.projected)))&&((this.configMap == rhs.configMap)||((this.configMap!= null)&&this.configMap.equals(rhs.configMap))))&&((this.emptyDir == rhs.emptyDir)||((this.emptyDir!= null)&&this.emptyDir.equals(rhs.emptyDir))))&&((this.csi == rhs.csi)||((this.csi!= null)&&this.csi.equals(rhs.csi))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.volumeClaimTemplate == rhs.volumeClaimTemplate)||((this.volumeClaimTemplate!= null)&&this.volumeClaimTemplate.equals(rhs.volumeClaimTemplate))))&&((this.persistentVolumeClaim == rhs.persistentVolumeClaim)||((this.persistentVolumeClaim!= null)&&this.persistentVolumeClaim.equals(rhs.persistentVolumeClaim))))&&((this.secret == rhs.secret)||((this.secret!= null)&&this.secret.equals(rhs.secret))))&&((this.subPath == rhs.subPath)||((this.subPath!= null)&&this.subPath.equals(rhs.subPath))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
