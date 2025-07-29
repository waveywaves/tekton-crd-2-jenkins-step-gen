
package io.tekton.crd.model.pipelineruns.v1;

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
 * PodTemplate holds pod specific configuration
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "affinity",
    "automountServiceAccountToken",
    "dnsConfig",
    "dnsPolicy",
    "enableServiceLinks",
    "env",
    "hostAliases",
    "hostNetwork",
    "imagePullSecrets",
    "nodeSelector",
    "priorityClassName",
    "runtimeClassName",
    "schedulerName",
    "securityContext",
    "tolerations",
    "topologySpreadConstraints",
    "volumes"
})
@Generated("jsonschema2pojo")
public class PodTemplate {

    /**
     * If specified, the pod's scheduling constraints.
     * See Pod.spec.affinity (API version: v1)
     * 
     */
    @JsonProperty("affinity")
    @JsonPropertyDescription("If specified, the pod's scheduling constraints.\nSee Pod.spec.affinity (API version: v1)")
    private Object affinity;
    /**
     * AutomountServiceAccountToken indicates whether pods running as this
     * service account should have an API token automatically mounted.
     * 
     */
    @JsonProperty("automountServiceAccountToken")
    @JsonPropertyDescription("AutomountServiceAccountToken indicates whether pods running as this\nservice account should have an API token automatically mounted.")
    private Boolean automountServiceAccountToken;
    /**
     * Specifies the DNS parameters of a pod.
     * Parameters specified here will be merged to the generated DNS
     * configuration based on DNSPolicy.
     * 
     */
    @JsonProperty("dnsConfig")
    @JsonPropertyDescription("Specifies the DNS parameters of a pod.\nParameters specified here will be merged to the generated DNS\nconfiguration based on DNSPolicy.")
    @Valid
    private DnsConfig dnsConfig;
    /**
     * Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are
     * 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig
     * will be merged with the policy selected with DNSPolicy.
     * 
     */
    @JsonProperty("dnsPolicy")
    @JsonPropertyDescription("Set DNS policy for the pod. Defaults to \"ClusterFirst\". Valid values are\n'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig\nwill be merged with the policy selected with DNSPolicy.")
    private String dnsPolicy;
    /**
     * EnableServiceLinks indicates whether information about services should be injected into pod's
     * environment variables, matching the syntax of Docker links.
     * Optional: Defaults to true.
     * 
     */
    @JsonProperty("enableServiceLinks")
    @JsonPropertyDescription("EnableServiceLinks indicates whether information about services should be injected into pod's\nenvironment variables, matching the syntax of Docker links.\nOptional: Defaults to true.")
    private Boolean enableServiceLinks;
    /**
     * List of environment variables that can be provided to the containers belonging to the pod.
     * 
     */
    @JsonProperty("env")
    @JsonPropertyDescription("List of environment variables that can be provided to the containers belonging to the pod.")
    @Valid
    private List<Env> env = new ArrayList<Env>();
    /**
     * HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts
     * file if specified. This is only valid for non-hostNetwork pods.
     * 
     */
    @JsonProperty("hostAliases")
    @JsonPropertyDescription("HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts\nfile if specified. This is only valid for non-hostNetwork pods.")
    @Valid
    private List<HostAlias> hostAliases = new ArrayList<HostAlias>();
    /**
     * HostNetwork specifies whether the pod may use the node network namespace
     * 
     */
    @JsonProperty("hostNetwork")
    @JsonPropertyDescription("HostNetwork specifies whether the pod may use the node network namespace")
    private Boolean hostNetwork;
    /**
     * ImagePullSecrets gives the name of the secret used by the pod to pull the image if specified
     * 
     */
    @JsonProperty("imagePullSecrets")
    @JsonPropertyDescription("ImagePullSecrets gives the name of the secret used by the pod to pull the image if specified")
    @Valid
    private List<ImagePullSecret> imagePullSecrets = new ArrayList<ImagePullSecret>();
    /**
     * NodeSelector is a selector which must be true for the pod to fit on a node.
     * Selector which must match a node's labels for the pod to be scheduled on that node.
     * More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
     * 
     */
    @JsonProperty("nodeSelector")
    @JsonPropertyDescription("NodeSelector is a selector which must be true for the pod to fit on a node.\nSelector which must match a node's labels for the pod to be scheduled on that node.\nMore info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/")
    @Valid
    private NodeSelector nodeSelector;
    /**
     * If specified, indicates the pod's priority. "system-node-critical" and
     * "system-cluster-critical" are two special keywords which indicate the
     * highest priorities with the former being the highest priority. Any other
     * name must be defined by creating a PriorityClass object with that name.
     * If not specified, the pod priority will be default or zero if there is no
     * default.
     * 
     */
    @JsonProperty("priorityClassName")
    @JsonPropertyDescription("If specified, indicates the pod's priority. \"system-node-critical\" and\n\"system-cluster-critical\" are two special keywords which indicate the\nhighest priorities with the former being the highest priority. Any other\nname must be defined by creating a PriorityClass object with that name.\nIf not specified, the pod priority will be default or zero if there is no\ndefault.")
    private String priorityClassName;
    /**
     * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io
     * group, which should be used to run this pod. If no RuntimeClass resource
     * matches the named class, the pod will not be run. If unset or empty, the
     * "legacy" RuntimeClass will be used, which is an implicit class with an
     * empty definition that uses the default runtime handler.
     * More info: https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md
     * This is a beta feature as of Kubernetes v1.14.
     * 
     */
    @JsonProperty("runtimeClassName")
    @JsonPropertyDescription("RuntimeClassName refers to a RuntimeClass object in the node.k8s.io\ngroup, which should be used to run this pod. If no RuntimeClass resource\nmatches the named class, the pod will not be run. If unset or empty, the\n\"legacy\" RuntimeClass will be used, which is an implicit class with an\nempty definition that uses the default runtime handler.\nMore info: https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md\nThis is a beta feature as of Kubernetes v1.14.")
    private String runtimeClassName;
    /**
     * SchedulerName specifies the scheduler to be used to dispatch the Pod
     * 
     */
    @JsonProperty("schedulerName")
    @JsonPropertyDescription("SchedulerName specifies the scheduler to be used to dispatch the Pod")
    private String schedulerName;
    /**
     * SecurityContext holds pod-level security attributes and common container settings.
     * Optional: Defaults to empty.  See type description for default values of each field.
     * See Pod.spec.securityContext (API version: v1)
     * 
     */
    @JsonProperty("securityContext")
    @JsonPropertyDescription("SecurityContext holds pod-level security attributes and common container settings.\nOptional: Defaults to empty.  See type description for default values of each field.\nSee Pod.spec.securityContext (API version: v1)")
    private Object securityContext;
    /**
     * If specified, the pod's tolerations.
     * 
     */
    @JsonProperty("tolerations")
    @JsonPropertyDescription("If specified, the pod's tolerations.")
    @Valid
    private List<Toleration> tolerations = new ArrayList<Toleration>();
    /**
     * TopologySpreadConstraints controls how Pods are spread across your cluster among
     * failure-domains such as regions, zones, nodes, and other user-defined topology domains.
     * 
     */
    @JsonProperty("topologySpreadConstraints")
    @JsonPropertyDescription("TopologySpreadConstraints controls how Pods are spread across your cluster among\nfailure-domains such as regions, zones, nodes, and other user-defined topology domains.")
    @Valid
    private List<TopologySpreadConstraint> topologySpreadConstraints = new ArrayList<TopologySpreadConstraint>();
    /**
     * List of volumes that can be mounted by containers belonging to the pod.
     * More info: https://kubernetes.io/docs/concepts/storage/volumes
     * See Pod.spec.volumes (API version: v1)
     * 
     */
    @JsonProperty("volumes")
    @JsonPropertyDescription("List of volumes that can be mounted by containers belonging to the pod.\nMore info: https://kubernetes.io/docs/concepts/storage/volumes\nSee Pod.spec.volumes (API version: v1)")
    private Object volumes;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * If specified, the pod's scheduling constraints.
     * See Pod.spec.affinity (API version: v1)
     * 
     */
    @JsonProperty("affinity")
    public Object getAffinity() {
        return affinity;
    }

    /**
     * If specified, the pod's scheduling constraints.
     * See Pod.spec.affinity (API version: v1)
     * 
     */
    @JsonProperty("affinity")
    public void setAffinity(Object affinity) {
        this.affinity = affinity;
    }

    public PodTemplate withAffinity(Object affinity) {
        this.affinity = affinity;
        return this;
    }

    /**
     * AutomountServiceAccountToken indicates whether pods running as this
     * service account should have an API token automatically mounted.
     * 
     */
    @JsonProperty("automountServiceAccountToken")
    public Boolean getAutomountServiceAccountToken() {
        return automountServiceAccountToken;
    }

    /**
     * AutomountServiceAccountToken indicates whether pods running as this
     * service account should have an API token automatically mounted.
     * 
     */
    @JsonProperty("automountServiceAccountToken")
    public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
    }

    public PodTemplate withAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
        return this;
    }

    /**
     * Specifies the DNS parameters of a pod.
     * Parameters specified here will be merged to the generated DNS
     * configuration based on DNSPolicy.
     * 
     */
    @JsonProperty("dnsConfig")
    public DnsConfig getDnsConfig() {
        return dnsConfig;
    }

    /**
     * Specifies the DNS parameters of a pod.
     * Parameters specified here will be merged to the generated DNS
     * configuration based on DNSPolicy.
     * 
     */
    @JsonProperty("dnsConfig")
    public void setDnsConfig(DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    public PodTemplate withDnsConfig(DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }

    /**
     * Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are
     * 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig
     * will be merged with the policy selected with DNSPolicy.
     * 
     */
    @JsonProperty("dnsPolicy")
    public String getDnsPolicy() {
        return dnsPolicy;
    }

    /**
     * Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are
     * 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig
     * will be merged with the policy selected with DNSPolicy.
     * 
     */
    @JsonProperty("dnsPolicy")
    public void setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
    }

    public PodTemplate withDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
        return this;
    }

    /**
     * EnableServiceLinks indicates whether information about services should be injected into pod's
     * environment variables, matching the syntax of Docker links.
     * Optional: Defaults to true.
     * 
     */
    @JsonProperty("enableServiceLinks")
    public Boolean getEnableServiceLinks() {
        return enableServiceLinks;
    }

    /**
     * EnableServiceLinks indicates whether information about services should be injected into pod's
     * environment variables, matching the syntax of Docker links.
     * Optional: Defaults to true.
     * 
     */
    @JsonProperty("enableServiceLinks")
    public void setEnableServiceLinks(Boolean enableServiceLinks) {
        this.enableServiceLinks = enableServiceLinks;
    }

    public PodTemplate withEnableServiceLinks(Boolean enableServiceLinks) {
        this.enableServiceLinks = enableServiceLinks;
        return this;
    }

    /**
     * List of environment variables that can be provided to the containers belonging to the pod.
     * 
     */
    @JsonProperty("env")
    public List<Env> getEnv() {
        return env;
    }

    /**
     * List of environment variables that can be provided to the containers belonging to the pod.
     * 
     */
    @JsonProperty("env")
    public void setEnv(List<Env> env) {
        this.env = env;
    }

    public PodTemplate withEnv(List<Env> env) {
        this.env = env;
        return this;
    }

    /**
     * HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts
     * file if specified. This is only valid for non-hostNetwork pods.
     * 
     */
    @JsonProperty("hostAliases")
    public List<HostAlias> getHostAliases() {
        return hostAliases;
    }

    /**
     * HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts
     * file if specified. This is only valid for non-hostNetwork pods.
     * 
     */
    @JsonProperty("hostAliases")
    public void setHostAliases(List<HostAlias> hostAliases) {
        this.hostAliases = hostAliases;
    }

    public PodTemplate withHostAliases(List<HostAlias> hostAliases) {
        this.hostAliases = hostAliases;
        return this;
    }

    /**
     * HostNetwork specifies whether the pod may use the node network namespace
     * 
     */
    @JsonProperty("hostNetwork")
    public Boolean getHostNetwork() {
        return hostNetwork;
    }

    /**
     * HostNetwork specifies whether the pod may use the node network namespace
     * 
     */
    @JsonProperty("hostNetwork")
    public void setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    public PodTemplate withHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    /**
     * ImagePullSecrets gives the name of the secret used by the pod to pull the image if specified
     * 
     */
    @JsonProperty("imagePullSecrets")
    public List<ImagePullSecret> getImagePullSecrets() {
        return imagePullSecrets;
    }

    /**
     * ImagePullSecrets gives the name of the secret used by the pod to pull the image if specified
     * 
     */
    @JsonProperty("imagePullSecrets")
    public void setImagePullSecrets(List<ImagePullSecret> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }

    public PodTemplate withImagePullSecrets(List<ImagePullSecret> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
        return this;
    }

    /**
     * NodeSelector is a selector which must be true for the pod to fit on a node.
     * Selector which must match a node's labels for the pod to be scheduled on that node.
     * More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
     * 
     */
    @JsonProperty("nodeSelector")
    public NodeSelector getNodeSelector() {
        return nodeSelector;
    }

    /**
     * NodeSelector is a selector which must be true for the pod to fit on a node.
     * Selector which must match a node's labels for the pod to be scheduled on that node.
     * More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
     * 
     */
    @JsonProperty("nodeSelector")
    public void setNodeSelector(NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    public PodTemplate withNodeSelector(NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }

    /**
     * If specified, indicates the pod's priority. "system-node-critical" and
     * "system-cluster-critical" are two special keywords which indicate the
     * highest priorities with the former being the highest priority. Any other
     * name must be defined by creating a PriorityClass object with that name.
     * If not specified, the pod priority will be default or zero if there is no
     * default.
     * 
     */
    @JsonProperty("priorityClassName")
    public String getPriorityClassName() {
        return priorityClassName;
    }

    /**
     * If specified, indicates the pod's priority. "system-node-critical" and
     * "system-cluster-critical" are two special keywords which indicate the
     * highest priorities with the former being the highest priority. Any other
     * name must be defined by creating a PriorityClass object with that name.
     * If not specified, the pod priority will be default or zero if there is no
     * default.
     * 
     */
    @JsonProperty("priorityClassName")
    public void setPriorityClassName(String priorityClassName) {
        this.priorityClassName = priorityClassName;
    }

    public PodTemplate withPriorityClassName(String priorityClassName) {
        this.priorityClassName = priorityClassName;
        return this;
    }

    /**
     * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io
     * group, which should be used to run this pod. If no RuntimeClass resource
     * matches the named class, the pod will not be run. If unset or empty, the
     * "legacy" RuntimeClass will be used, which is an implicit class with an
     * empty definition that uses the default runtime handler.
     * More info: https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md
     * This is a beta feature as of Kubernetes v1.14.
     * 
     */
    @JsonProperty("runtimeClassName")
    public String getRuntimeClassName() {
        return runtimeClassName;
    }

    /**
     * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io
     * group, which should be used to run this pod. If no RuntimeClass resource
     * matches the named class, the pod will not be run. If unset or empty, the
     * "legacy" RuntimeClass will be used, which is an implicit class with an
     * empty definition that uses the default runtime handler.
     * More info: https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md
     * This is a beta feature as of Kubernetes v1.14.
     * 
     */
    @JsonProperty("runtimeClassName")
    public void setRuntimeClassName(String runtimeClassName) {
        this.runtimeClassName = runtimeClassName;
    }

    public PodTemplate withRuntimeClassName(String runtimeClassName) {
        this.runtimeClassName = runtimeClassName;
        return this;
    }

    /**
     * SchedulerName specifies the scheduler to be used to dispatch the Pod
     * 
     */
    @JsonProperty("schedulerName")
    public String getSchedulerName() {
        return schedulerName;
    }

    /**
     * SchedulerName specifies the scheduler to be used to dispatch the Pod
     * 
     */
    @JsonProperty("schedulerName")
    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public PodTemplate withSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
        return this;
    }

    /**
     * SecurityContext holds pod-level security attributes and common container settings.
     * Optional: Defaults to empty.  See type description for default values of each field.
     * See Pod.spec.securityContext (API version: v1)
     * 
     */
    @JsonProperty("securityContext")
    public Object getSecurityContext() {
        return securityContext;
    }

    /**
     * SecurityContext holds pod-level security attributes and common container settings.
     * Optional: Defaults to empty.  See type description for default values of each field.
     * See Pod.spec.securityContext (API version: v1)
     * 
     */
    @JsonProperty("securityContext")
    public void setSecurityContext(Object securityContext) {
        this.securityContext = securityContext;
    }

    public PodTemplate withSecurityContext(Object securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    /**
     * If specified, the pod's tolerations.
     * 
     */
    @JsonProperty("tolerations")
    public List<Toleration> getTolerations() {
        return tolerations;
    }

    /**
     * If specified, the pod's tolerations.
     * 
     */
    @JsonProperty("tolerations")
    public void setTolerations(List<Toleration> tolerations) {
        this.tolerations = tolerations;
    }

    public PodTemplate withTolerations(List<Toleration> tolerations) {
        this.tolerations = tolerations;
        return this;
    }

    /**
     * TopologySpreadConstraints controls how Pods are spread across your cluster among
     * failure-domains such as regions, zones, nodes, and other user-defined topology domains.
     * 
     */
    @JsonProperty("topologySpreadConstraints")
    public List<TopologySpreadConstraint> getTopologySpreadConstraints() {
        return topologySpreadConstraints;
    }

    /**
     * TopologySpreadConstraints controls how Pods are spread across your cluster among
     * failure-domains such as regions, zones, nodes, and other user-defined topology domains.
     * 
     */
    @JsonProperty("topologySpreadConstraints")
    public void setTopologySpreadConstraints(List<TopologySpreadConstraint> topologySpreadConstraints) {
        this.topologySpreadConstraints = topologySpreadConstraints;
    }

    public PodTemplate withTopologySpreadConstraints(List<TopologySpreadConstraint> topologySpreadConstraints) {
        this.topologySpreadConstraints = topologySpreadConstraints;
        return this;
    }

    /**
     * List of volumes that can be mounted by containers belonging to the pod.
     * More info: https://kubernetes.io/docs/concepts/storage/volumes
     * See Pod.spec.volumes (API version: v1)
     * 
     */
    @JsonProperty("volumes")
    public Object getVolumes() {
        return volumes;
    }

    /**
     * List of volumes that can be mounted by containers belonging to the pod.
     * More info: https://kubernetes.io/docs/concepts/storage/volumes
     * See Pod.spec.volumes (API version: v1)
     * 
     */
    @JsonProperty("volumes")
    public void setVolumes(Object volumes) {
        this.volumes = volumes;
    }

    public PodTemplate withVolumes(Object volumes) {
        this.volumes = volumes;
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

    public PodTemplate withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PodTemplate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("affinity");
        sb.append('=');
        sb.append(((this.affinity == null)?"<null>":this.affinity));
        sb.append(',');
        sb.append("automountServiceAccountToken");
        sb.append('=');
        sb.append(((this.automountServiceAccountToken == null)?"<null>":this.automountServiceAccountToken));
        sb.append(',');
        sb.append("dnsConfig");
        sb.append('=');
        sb.append(((this.dnsConfig == null)?"<null>":this.dnsConfig));
        sb.append(',');
        sb.append("dnsPolicy");
        sb.append('=');
        sb.append(((this.dnsPolicy == null)?"<null>":this.dnsPolicy));
        sb.append(',');
        sb.append("enableServiceLinks");
        sb.append('=');
        sb.append(((this.enableServiceLinks == null)?"<null>":this.enableServiceLinks));
        sb.append(',');
        sb.append("env");
        sb.append('=');
        sb.append(((this.env == null)?"<null>":this.env));
        sb.append(',');
        sb.append("hostAliases");
        sb.append('=');
        sb.append(((this.hostAliases == null)?"<null>":this.hostAliases));
        sb.append(',');
        sb.append("hostNetwork");
        sb.append('=');
        sb.append(((this.hostNetwork == null)?"<null>":this.hostNetwork));
        sb.append(',');
        sb.append("imagePullSecrets");
        sb.append('=');
        sb.append(((this.imagePullSecrets == null)?"<null>":this.imagePullSecrets));
        sb.append(',');
        sb.append("nodeSelector");
        sb.append('=');
        sb.append(((this.nodeSelector == null)?"<null>":this.nodeSelector));
        sb.append(',');
        sb.append("priorityClassName");
        sb.append('=');
        sb.append(((this.priorityClassName == null)?"<null>":this.priorityClassName));
        sb.append(',');
        sb.append("runtimeClassName");
        sb.append('=');
        sb.append(((this.runtimeClassName == null)?"<null>":this.runtimeClassName));
        sb.append(',');
        sb.append("schedulerName");
        sb.append('=');
        sb.append(((this.schedulerName == null)?"<null>":this.schedulerName));
        sb.append(',');
        sb.append("securityContext");
        sb.append('=');
        sb.append(((this.securityContext == null)?"<null>":this.securityContext));
        sb.append(',');
        sb.append("tolerations");
        sb.append('=');
        sb.append(((this.tolerations == null)?"<null>":this.tolerations));
        sb.append(',');
        sb.append("topologySpreadConstraints");
        sb.append('=');
        sb.append(((this.topologySpreadConstraints == null)?"<null>":this.topologySpreadConstraints));
        sb.append(',');
        sb.append("volumes");
        sb.append('=');
        sb.append(((this.volumes == null)?"<null>":this.volumes));
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
        result = ((result* 31)+((this.dnsPolicy == null)? 0 :this.dnsPolicy.hashCode()));
        result = ((result* 31)+((this.enableServiceLinks == null)? 0 :this.enableServiceLinks.hashCode()));
        result = ((result* 31)+((this.dnsConfig == null)? 0 :this.dnsConfig.hashCode()));
        result = ((result* 31)+((this.hostNetwork == null)? 0 :this.hostNetwork.hashCode()));
        result = ((result* 31)+((this.imagePullSecrets == null)? 0 :this.imagePullSecrets.hashCode()));
        result = ((result* 31)+((this.priorityClassName == null)? 0 :this.priorityClassName.hashCode()));
        result = ((result* 31)+((this.topologySpreadConstraints == null)? 0 :this.topologySpreadConstraints.hashCode()));
        result = ((result* 31)+((this.volumes == null)? 0 :this.volumes.hashCode()));
        result = ((result* 31)+((this.hostAliases == null)? 0 :this.hostAliases.hashCode()));
        result = ((result* 31)+((this.securityContext == null)? 0 :this.securityContext.hashCode()));
        result = ((result* 31)+((this.env == null)? 0 :this.env.hashCode()));
        result = ((result* 31)+((this.nodeSelector == null)? 0 :this.nodeSelector.hashCode()));
        result = ((result* 31)+((this.runtimeClassName == null)? 0 :this.runtimeClassName.hashCode()));
        result = ((result* 31)+((this.tolerations == null)? 0 :this.tolerations.hashCode()));
        result = ((result* 31)+((this.automountServiceAccountToken == null)? 0 :this.automountServiceAccountToken.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.schedulerName == null)? 0 :this.schedulerName.hashCode()));
        result = ((result* 31)+((this.affinity == null)? 0 :this.affinity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PodTemplate) == false) {
            return false;
        }
        PodTemplate rhs = ((PodTemplate) other);
        return (((((((((((((((((((this.dnsPolicy == rhs.dnsPolicy)||((this.dnsPolicy!= null)&&this.dnsPolicy.equals(rhs.dnsPolicy)))&&((this.enableServiceLinks == rhs.enableServiceLinks)||((this.enableServiceLinks!= null)&&this.enableServiceLinks.equals(rhs.enableServiceLinks))))&&((this.dnsConfig == rhs.dnsConfig)||((this.dnsConfig!= null)&&this.dnsConfig.equals(rhs.dnsConfig))))&&((this.hostNetwork == rhs.hostNetwork)||((this.hostNetwork!= null)&&this.hostNetwork.equals(rhs.hostNetwork))))&&((this.imagePullSecrets == rhs.imagePullSecrets)||((this.imagePullSecrets!= null)&&this.imagePullSecrets.equals(rhs.imagePullSecrets))))&&((this.priorityClassName == rhs.priorityClassName)||((this.priorityClassName!= null)&&this.priorityClassName.equals(rhs.priorityClassName))))&&((this.topologySpreadConstraints == rhs.topologySpreadConstraints)||((this.topologySpreadConstraints!= null)&&this.topologySpreadConstraints.equals(rhs.topologySpreadConstraints))))&&((this.volumes == rhs.volumes)||((this.volumes!= null)&&this.volumes.equals(rhs.volumes))))&&((this.hostAliases == rhs.hostAliases)||((this.hostAliases!= null)&&this.hostAliases.equals(rhs.hostAliases))))&&((this.securityContext == rhs.securityContext)||((this.securityContext!= null)&&this.securityContext.equals(rhs.securityContext))))&&((this.env == rhs.env)||((this.env!= null)&&this.env.equals(rhs.env))))&&((this.nodeSelector == rhs.nodeSelector)||((this.nodeSelector!= null)&&this.nodeSelector.equals(rhs.nodeSelector))))&&((this.runtimeClassName == rhs.runtimeClassName)||((this.runtimeClassName!= null)&&this.runtimeClassName.equals(rhs.runtimeClassName))))&&((this.tolerations == rhs.tolerations)||((this.tolerations!= null)&&this.tolerations.equals(rhs.tolerations))))&&((this.automountServiceAccountToken == rhs.automountServiceAccountToken)||((this.automountServiceAccountToken!= null)&&this.automountServiceAccountToken.equals(rhs.automountServiceAccountToken))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.schedulerName == rhs.schedulerName)||((this.schedulerName!= null)&&this.schedulerName.equals(rhs.schedulerName))))&&((this.affinity == rhs.affinity)||((this.affinity!= null)&&this.affinity.equals(rhs.affinity))));
    }

}
