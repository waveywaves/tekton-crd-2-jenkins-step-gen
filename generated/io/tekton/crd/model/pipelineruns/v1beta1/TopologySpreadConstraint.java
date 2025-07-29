
package io.tekton.crd.model.pipelineruns.v1beta1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
 * TopologySpreadConstraint specifies how to spread matching pods among the given topology.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "labelSelector",
    "matchLabelKeys",
    "maxSkew",
    "minDomains",
    "nodeAffinityPolicy",
    "nodeTaintsPolicy",
    "topologyKey",
    "whenUnsatisfiable"
})
@Generated("jsonschema2pojo")
public class TopologySpreadConstraint {

    /**
     * LabelSelector is used to find matching pods.
     * Pods that match this label selector are counted to determine the number of pods
     * in their corresponding topology domain.
     * 
     */
    @JsonProperty("labelSelector")
    @JsonPropertyDescription("LabelSelector is used to find matching pods.\nPods that match this label selector are counted to determine the number of pods\nin their corresponding topology domain.")
    @Valid
    private LabelSelector labelSelector;
    /**
     * MatchLabelKeys is a set of pod label keys to select the pods over which
     * spreading will be calculated. The keys are used to lookup values from the
     * incoming pod labels, those key-value labels are ANDed with labelSelector
     * to select the group of existing pods over which spreading will be calculated
     * for the incoming pod. The same key is forbidden to exist in both MatchLabelKeys and LabelSelector.
     * MatchLabelKeys cannot be set when LabelSelector isn't set.
     * Keys that don't exist in the incoming pod labels will
     * be ignored. A null or empty list means only match against labelSelector.
     * 
     * This is a beta field and requires the MatchLabelKeysInPodTopologySpread feature gate to be enabled (enabled by default).
     * 
     */
    @JsonProperty("matchLabelKeys")
    @JsonPropertyDescription("MatchLabelKeys is a set of pod label keys to select the pods over which\nspreading will be calculated. The keys are used to lookup values from the\nincoming pod labels, those key-value labels are ANDed with labelSelector\nto select the group of existing pods over which spreading will be calculated\nfor the incoming pod. The same key is forbidden to exist in both MatchLabelKeys and LabelSelector.\nMatchLabelKeys cannot be set when LabelSelector isn't set.\nKeys that don't exist in the incoming pod labels will\nbe ignored. A null or empty list means only match against labelSelector.\n\nThis is a beta field and requires the MatchLabelKeysInPodTopologySpread feature gate to be enabled (enabled by default).")
    @Valid
    private List<String> matchLabelKeys = new ArrayList<String>();
    /**
     * MaxSkew describes the degree to which pods may be unevenly distributed.
     * When `whenUnsatisfiable=DoNotSchedule`, it is the maximum permitted difference
     * between the number of matching pods in the target topology and the global minimum.
     * The global minimum is the minimum number of matching pods in an eligible domain
     * or zero if the number of eligible domains is less than MinDomains.
     * For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same
     * labelSelector spread as 2/2/1:
     * In this case, the global minimum is 1.
     * | zone1 | zone2 | zone3 |
     * |  P P  |  P P  |   P   |
     * - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 2/2/2;
     * scheduling it onto zone1(zone2) would make the ActualSkew(3-1) on zone1(zone2)
     * violate MaxSkew(1).
     * - if MaxSkew is 2, incoming pod can be scheduled onto any zone.
     * When `whenUnsatisfiable=ScheduleAnyway`, it is used to give higher precedence
     * to topologies that satisfy it.
     * It's a required field. Default value is 1 and 0 is not allowed.
     * (Required)
     * 
     */
    @JsonProperty("maxSkew")
    @JsonPropertyDescription("MaxSkew describes the degree to which pods may be unevenly distributed.\nWhen `whenUnsatisfiable=DoNotSchedule`, it is the maximum permitted difference\nbetween the number of matching pods in the target topology and the global minimum.\nThe global minimum is the minimum number of matching pods in an eligible domain\nor zero if the number of eligible domains is less than MinDomains.\nFor example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same\nlabelSelector spread as 2/2/1:\nIn this case, the global minimum is 1.\n| zone1 | zone2 | zone3 |\n|  P P  |  P P  |   P   |\n- if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 2/2/2;\nscheduling it onto zone1(zone2) would make the ActualSkew(3-1) on zone1(zone2)\nviolate MaxSkew(1).\n- if MaxSkew is 2, incoming pod can be scheduled onto any zone.\nWhen `whenUnsatisfiable=ScheduleAnyway`, it is used to give higher precedence\nto topologies that satisfy it.\nIt's a required field. Default value is 1 and 0 is not allowed.")
    @NotNull
    private Integer maxSkew;
    /**
     * MinDomains indicates a minimum number of eligible domains.
     * When the number of eligible domains with matching topology keys is less than minDomains,
     * Pod Topology Spread treats "global minimum" as 0, and then the calculation of Skew is performed.
     * And when the number of eligible domains with matching topology keys equals or greater than minDomains,
     * this value has no effect on scheduling.
     * As a result, when the number of eligible domains is less than minDomains,
     * scheduler won't schedule more than maxSkew Pods to those domains.
     * If value is nil, the constraint behaves as if MinDomains is equal to 1.
     * Valid values are integers greater than 0.
     * When value is not nil, WhenUnsatisfiable must be DoNotSchedule.
     * 
     * For example, in a 3-zone cluster, MaxSkew is set to 2, MinDomains is set to 5 and pods with the same
     * labelSelector spread as 2/2/2:
     * | zone1 | zone2 | zone3 |
     * |  P P  |  P P  |  P P  |
     * The number of domains is less than 5(MinDomains), so "global minimum" is treated as 0.
     * In this situation, new pod with the same labelSelector cannot be scheduled,
     * because computed skew will be 3(3 - 0) if new Pod is scheduled to any of the three zones,
     * it will violate MaxSkew.
     * 
     */
    @JsonProperty("minDomains")
    @JsonPropertyDescription("MinDomains indicates a minimum number of eligible domains.\nWhen the number of eligible domains with matching topology keys is less than minDomains,\nPod Topology Spread treats \"global minimum\" as 0, and then the calculation of Skew is performed.\nAnd when the number of eligible domains with matching topology keys equals or greater than minDomains,\nthis value has no effect on scheduling.\nAs a result, when the number of eligible domains is less than minDomains,\nscheduler won't schedule more than maxSkew Pods to those domains.\nIf value is nil, the constraint behaves as if MinDomains is equal to 1.\nValid values are integers greater than 0.\nWhen value is not nil, WhenUnsatisfiable must be DoNotSchedule.\n\nFor example, in a 3-zone cluster, MaxSkew is set to 2, MinDomains is set to 5 and pods with the same\nlabelSelector spread as 2/2/2:\n| zone1 | zone2 | zone3 |\n|  P P  |  P P  |  P P  |\nThe number of domains is less than 5(MinDomains), so \"global minimum\" is treated as 0.\nIn this situation, new pod with the same labelSelector cannot be scheduled,\nbecause computed skew will be 3(3 - 0) if new Pod is scheduled to any of the three zones,\nit will violate MaxSkew.")
    private Integer minDomains;
    /**
     * NodeAffinityPolicy indicates how we will treat Pod's nodeAffinity/nodeSelector
     * when calculating pod topology spread skew. Options are:
     * - Honor: only nodes matching nodeAffinity/nodeSelector are included in the calculations.
     * - Ignore: nodeAffinity/nodeSelector are ignored. All nodes are included in the calculations.
     * 
     * If this value is nil, the behavior is equivalent to the Honor policy.
     * This is a beta-level feature default enabled by the NodeInclusionPolicyInPodTopologySpread feature flag.
     * 
     */
    @JsonProperty("nodeAffinityPolicy")
    @JsonPropertyDescription("NodeAffinityPolicy indicates how we will treat Pod's nodeAffinity/nodeSelector\nwhen calculating pod topology spread skew. Options are:\n- Honor: only nodes matching nodeAffinity/nodeSelector are included in the calculations.\n- Ignore: nodeAffinity/nodeSelector are ignored. All nodes are included in the calculations.\n\nIf this value is nil, the behavior is equivalent to the Honor policy.\nThis is a beta-level feature default enabled by the NodeInclusionPolicyInPodTopologySpread feature flag.")
    private String nodeAffinityPolicy;
    /**
     * NodeTaintsPolicy indicates how we will treat node taints when calculating
     * pod topology spread skew. Options are:
     * - Honor: nodes without taints, along with tainted nodes for which the incoming pod
     * has a toleration, are included.
     * - Ignore: node taints are ignored. All nodes are included.
     * 
     * If this value is nil, the behavior is equivalent to the Ignore policy.
     * This is a beta-level feature default enabled by the NodeInclusionPolicyInPodTopologySpread feature flag.
     * 
     */
    @JsonProperty("nodeTaintsPolicy")
    @JsonPropertyDescription("NodeTaintsPolicy indicates how we will treat node taints when calculating\npod topology spread skew. Options are:\n- Honor: nodes without taints, along with tainted nodes for which the incoming pod\nhas a toleration, are included.\n- Ignore: node taints are ignored. All nodes are included.\n\nIf this value is nil, the behavior is equivalent to the Ignore policy.\nThis is a beta-level feature default enabled by the NodeInclusionPolicyInPodTopologySpread feature flag.")
    private String nodeTaintsPolicy;
    /**
     * TopologyKey is the key of node labels. Nodes that have a label with this key
     * and identical values are considered to be in the same topology.
     * We consider each <key, value> as a "bucket", and try to put balanced number
     * of pods into each bucket.
     * We define a domain as a particular instance of a topology.
     * Also, we define an eligible domain as a domain whose nodes meet the requirements of
     * nodeAffinityPolicy and nodeTaintsPolicy.
     * e.g. If TopologyKey is "kubernetes.io/hostname", each Node is a domain of that topology.
     * And, if TopologyKey is "topology.kubernetes.io/zone", each zone is a domain of that topology.
     * It's a required field.
     * (Required)
     * 
     */
    @JsonProperty("topologyKey")
    @JsonPropertyDescription("TopologyKey is the key of node labels. Nodes that have a label with this key\nand identical values are considered to be in the same topology.\nWe consider each <key, value> as a \"bucket\", and try to put balanced number\nof pods into each bucket.\nWe define a domain as a particular instance of a topology.\nAlso, we define an eligible domain as a domain whose nodes meet the requirements of\nnodeAffinityPolicy and nodeTaintsPolicy.\ne.g. If TopologyKey is \"kubernetes.io/hostname\", each Node is a domain of that topology.\nAnd, if TopologyKey is \"topology.kubernetes.io/zone\", each zone is a domain of that topology.\nIt's a required field.")
    @NotNull
    private String topologyKey;
    /**
     * WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy
     * the spread constraint.
     * - DoNotSchedule (default) tells the scheduler not to schedule it.
     * - ScheduleAnyway tells the scheduler to schedule the pod in any location,
     *   but giving higher precedence to topologies that would help reduce the
     *   skew.
     * A constraint is considered "Unsatisfiable" for an incoming pod
     * if and only if every possible node assignment for that pod would violate
     * "MaxSkew" on some topology.
     * For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same
     * labelSelector spread as 3/1/1:
     * | zone1 | zone2 | zone3 |
     * | P P P |   P   |   P   |
     * If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled
     * to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies
     * MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler
     * won't make it *more* imbalanced.
     * It's a required field.
     * (Required)
     * 
     */
    @JsonProperty("whenUnsatisfiable")
    @JsonPropertyDescription("WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy\nthe spread constraint.\n- DoNotSchedule (default) tells the scheduler not to schedule it.\n- ScheduleAnyway tells the scheduler to schedule the pod in any location,\n  but giving higher precedence to topologies that would help reduce the\n  skew.\nA constraint is considered \"Unsatisfiable\" for an incoming pod\nif and only if every possible node assignment for that pod would violate\n\"MaxSkew\" on some topology.\nFor example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same\nlabelSelector spread as 3/1/1:\n| zone1 | zone2 | zone3 |\n| P P P |   P   |   P   |\nIf WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled\nto zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies\nMaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler\nwon't make it *more* imbalanced.\nIt's a required field.")
    @NotNull
    private String whenUnsatisfiable;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * LabelSelector is used to find matching pods.
     * Pods that match this label selector are counted to determine the number of pods
     * in their corresponding topology domain.
     * 
     */
    @JsonProperty("labelSelector")
    public LabelSelector getLabelSelector() {
        return labelSelector;
    }

    /**
     * LabelSelector is used to find matching pods.
     * Pods that match this label selector are counted to determine the number of pods
     * in their corresponding topology domain.
     * 
     */
    @JsonProperty("labelSelector")
    public void setLabelSelector(LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    public TopologySpreadConstraint withLabelSelector(LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }

    /**
     * MatchLabelKeys is a set of pod label keys to select the pods over which
     * spreading will be calculated. The keys are used to lookup values from the
     * incoming pod labels, those key-value labels are ANDed with labelSelector
     * to select the group of existing pods over which spreading will be calculated
     * for the incoming pod. The same key is forbidden to exist in both MatchLabelKeys and LabelSelector.
     * MatchLabelKeys cannot be set when LabelSelector isn't set.
     * Keys that don't exist in the incoming pod labels will
     * be ignored. A null or empty list means only match against labelSelector.
     * 
     * This is a beta field and requires the MatchLabelKeysInPodTopologySpread feature gate to be enabled (enabled by default).
     * 
     */
    @JsonProperty("matchLabelKeys")
    public List<String> getMatchLabelKeys() {
        return matchLabelKeys;
    }

    /**
     * MatchLabelKeys is a set of pod label keys to select the pods over which
     * spreading will be calculated. The keys are used to lookup values from the
     * incoming pod labels, those key-value labels are ANDed with labelSelector
     * to select the group of existing pods over which spreading will be calculated
     * for the incoming pod. The same key is forbidden to exist in both MatchLabelKeys and LabelSelector.
     * MatchLabelKeys cannot be set when LabelSelector isn't set.
     * Keys that don't exist in the incoming pod labels will
     * be ignored. A null or empty list means only match against labelSelector.
     * 
     * This is a beta field and requires the MatchLabelKeysInPodTopologySpread feature gate to be enabled (enabled by default).
     * 
     */
    @JsonProperty("matchLabelKeys")
    public void setMatchLabelKeys(List<String> matchLabelKeys) {
        this.matchLabelKeys = matchLabelKeys;
    }

    public TopologySpreadConstraint withMatchLabelKeys(List<String> matchLabelKeys) {
        this.matchLabelKeys = matchLabelKeys;
        return this;
    }

    /**
     * MaxSkew describes the degree to which pods may be unevenly distributed.
     * When `whenUnsatisfiable=DoNotSchedule`, it is the maximum permitted difference
     * between the number of matching pods in the target topology and the global minimum.
     * The global minimum is the minimum number of matching pods in an eligible domain
     * or zero if the number of eligible domains is less than MinDomains.
     * For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same
     * labelSelector spread as 2/2/1:
     * In this case, the global minimum is 1.
     * | zone1 | zone2 | zone3 |
     * |  P P  |  P P  |   P   |
     * - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 2/2/2;
     * scheduling it onto zone1(zone2) would make the ActualSkew(3-1) on zone1(zone2)
     * violate MaxSkew(1).
     * - if MaxSkew is 2, incoming pod can be scheduled onto any zone.
     * When `whenUnsatisfiable=ScheduleAnyway`, it is used to give higher precedence
     * to topologies that satisfy it.
     * It's a required field. Default value is 1 and 0 is not allowed.
     * (Required)
     * 
     */
    @JsonProperty("maxSkew")
    public Integer getMaxSkew() {
        return maxSkew;
    }

    /**
     * MaxSkew describes the degree to which pods may be unevenly distributed.
     * When `whenUnsatisfiable=DoNotSchedule`, it is the maximum permitted difference
     * between the number of matching pods in the target topology and the global minimum.
     * The global minimum is the minimum number of matching pods in an eligible domain
     * or zero if the number of eligible domains is less than MinDomains.
     * For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same
     * labelSelector spread as 2/2/1:
     * In this case, the global minimum is 1.
     * | zone1 | zone2 | zone3 |
     * |  P P  |  P P  |   P   |
     * - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 2/2/2;
     * scheduling it onto zone1(zone2) would make the ActualSkew(3-1) on zone1(zone2)
     * violate MaxSkew(1).
     * - if MaxSkew is 2, incoming pod can be scheduled onto any zone.
     * When `whenUnsatisfiable=ScheduleAnyway`, it is used to give higher precedence
     * to topologies that satisfy it.
     * It's a required field. Default value is 1 and 0 is not allowed.
     * (Required)
     * 
     */
    @JsonProperty("maxSkew")
    public void setMaxSkew(Integer maxSkew) {
        this.maxSkew = maxSkew;
    }

    public TopologySpreadConstraint withMaxSkew(Integer maxSkew) {
        this.maxSkew = maxSkew;
        return this;
    }

    /**
     * MinDomains indicates a minimum number of eligible domains.
     * When the number of eligible domains with matching topology keys is less than minDomains,
     * Pod Topology Spread treats "global minimum" as 0, and then the calculation of Skew is performed.
     * And when the number of eligible domains with matching topology keys equals or greater than minDomains,
     * this value has no effect on scheduling.
     * As a result, when the number of eligible domains is less than minDomains,
     * scheduler won't schedule more than maxSkew Pods to those domains.
     * If value is nil, the constraint behaves as if MinDomains is equal to 1.
     * Valid values are integers greater than 0.
     * When value is not nil, WhenUnsatisfiable must be DoNotSchedule.
     * 
     * For example, in a 3-zone cluster, MaxSkew is set to 2, MinDomains is set to 5 and pods with the same
     * labelSelector spread as 2/2/2:
     * | zone1 | zone2 | zone3 |
     * |  P P  |  P P  |  P P  |
     * The number of domains is less than 5(MinDomains), so "global minimum" is treated as 0.
     * In this situation, new pod with the same labelSelector cannot be scheduled,
     * because computed skew will be 3(3 - 0) if new Pod is scheduled to any of the three zones,
     * it will violate MaxSkew.
     * 
     */
    @JsonProperty("minDomains")
    public Integer getMinDomains() {
        return minDomains;
    }

    /**
     * MinDomains indicates a minimum number of eligible domains.
     * When the number of eligible domains with matching topology keys is less than minDomains,
     * Pod Topology Spread treats "global minimum" as 0, and then the calculation of Skew is performed.
     * And when the number of eligible domains with matching topology keys equals or greater than minDomains,
     * this value has no effect on scheduling.
     * As a result, when the number of eligible domains is less than minDomains,
     * scheduler won't schedule more than maxSkew Pods to those domains.
     * If value is nil, the constraint behaves as if MinDomains is equal to 1.
     * Valid values are integers greater than 0.
     * When value is not nil, WhenUnsatisfiable must be DoNotSchedule.
     * 
     * For example, in a 3-zone cluster, MaxSkew is set to 2, MinDomains is set to 5 and pods with the same
     * labelSelector spread as 2/2/2:
     * | zone1 | zone2 | zone3 |
     * |  P P  |  P P  |  P P  |
     * The number of domains is less than 5(MinDomains), so "global minimum" is treated as 0.
     * In this situation, new pod with the same labelSelector cannot be scheduled,
     * because computed skew will be 3(3 - 0) if new Pod is scheduled to any of the three zones,
     * it will violate MaxSkew.
     * 
     */
    @JsonProperty("minDomains")
    public void setMinDomains(Integer minDomains) {
        this.minDomains = minDomains;
    }

    public TopologySpreadConstraint withMinDomains(Integer minDomains) {
        this.minDomains = minDomains;
        return this;
    }

    /**
     * NodeAffinityPolicy indicates how we will treat Pod's nodeAffinity/nodeSelector
     * when calculating pod topology spread skew. Options are:
     * - Honor: only nodes matching nodeAffinity/nodeSelector are included in the calculations.
     * - Ignore: nodeAffinity/nodeSelector are ignored. All nodes are included in the calculations.
     * 
     * If this value is nil, the behavior is equivalent to the Honor policy.
     * This is a beta-level feature default enabled by the NodeInclusionPolicyInPodTopologySpread feature flag.
     * 
     */
    @JsonProperty("nodeAffinityPolicy")
    public String getNodeAffinityPolicy() {
        return nodeAffinityPolicy;
    }

    /**
     * NodeAffinityPolicy indicates how we will treat Pod's nodeAffinity/nodeSelector
     * when calculating pod topology spread skew. Options are:
     * - Honor: only nodes matching nodeAffinity/nodeSelector are included in the calculations.
     * - Ignore: nodeAffinity/nodeSelector are ignored. All nodes are included in the calculations.
     * 
     * If this value is nil, the behavior is equivalent to the Honor policy.
     * This is a beta-level feature default enabled by the NodeInclusionPolicyInPodTopologySpread feature flag.
     * 
     */
    @JsonProperty("nodeAffinityPolicy")
    public void setNodeAffinityPolicy(String nodeAffinityPolicy) {
        this.nodeAffinityPolicy = nodeAffinityPolicy;
    }

    public TopologySpreadConstraint withNodeAffinityPolicy(String nodeAffinityPolicy) {
        this.nodeAffinityPolicy = nodeAffinityPolicy;
        return this;
    }

    /**
     * NodeTaintsPolicy indicates how we will treat node taints when calculating
     * pod topology spread skew. Options are:
     * - Honor: nodes without taints, along with tainted nodes for which the incoming pod
     * has a toleration, are included.
     * - Ignore: node taints are ignored. All nodes are included.
     * 
     * If this value is nil, the behavior is equivalent to the Ignore policy.
     * This is a beta-level feature default enabled by the NodeInclusionPolicyInPodTopologySpread feature flag.
     * 
     */
    @JsonProperty("nodeTaintsPolicy")
    public String getNodeTaintsPolicy() {
        return nodeTaintsPolicy;
    }

    /**
     * NodeTaintsPolicy indicates how we will treat node taints when calculating
     * pod topology spread skew. Options are:
     * - Honor: nodes without taints, along with tainted nodes for which the incoming pod
     * has a toleration, are included.
     * - Ignore: node taints are ignored. All nodes are included.
     * 
     * If this value is nil, the behavior is equivalent to the Ignore policy.
     * This is a beta-level feature default enabled by the NodeInclusionPolicyInPodTopologySpread feature flag.
     * 
     */
    @JsonProperty("nodeTaintsPolicy")
    public void setNodeTaintsPolicy(String nodeTaintsPolicy) {
        this.nodeTaintsPolicy = nodeTaintsPolicy;
    }

    public TopologySpreadConstraint withNodeTaintsPolicy(String nodeTaintsPolicy) {
        this.nodeTaintsPolicy = nodeTaintsPolicy;
        return this;
    }

    /**
     * TopologyKey is the key of node labels. Nodes that have a label with this key
     * and identical values are considered to be in the same topology.
     * We consider each <key, value> as a "bucket", and try to put balanced number
     * of pods into each bucket.
     * We define a domain as a particular instance of a topology.
     * Also, we define an eligible domain as a domain whose nodes meet the requirements of
     * nodeAffinityPolicy and nodeTaintsPolicy.
     * e.g. If TopologyKey is "kubernetes.io/hostname", each Node is a domain of that topology.
     * And, if TopologyKey is "topology.kubernetes.io/zone", each zone is a domain of that topology.
     * It's a required field.
     * (Required)
     * 
     */
    @JsonProperty("topologyKey")
    public String getTopologyKey() {
        return topologyKey;
    }

    /**
     * TopologyKey is the key of node labels. Nodes that have a label with this key
     * and identical values are considered to be in the same topology.
     * We consider each <key, value> as a "bucket", and try to put balanced number
     * of pods into each bucket.
     * We define a domain as a particular instance of a topology.
     * Also, we define an eligible domain as a domain whose nodes meet the requirements of
     * nodeAffinityPolicy and nodeTaintsPolicy.
     * e.g. If TopologyKey is "kubernetes.io/hostname", each Node is a domain of that topology.
     * And, if TopologyKey is "topology.kubernetes.io/zone", each zone is a domain of that topology.
     * It's a required field.
     * (Required)
     * 
     */
    @JsonProperty("topologyKey")
    public void setTopologyKey(String topologyKey) {
        this.topologyKey = topologyKey;
    }

    public TopologySpreadConstraint withTopologyKey(String topologyKey) {
        this.topologyKey = topologyKey;
        return this;
    }

    /**
     * WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy
     * the spread constraint.
     * - DoNotSchedule (default) tells the scheduler not to schedule it.
     * - ScheduleAnyway tells the scheduler to schedule the pod in any location,
     *   but giving higher precedence to topologies that would help reduce the
     *   skew.
     * A constraint is considered "Unsatisfiable" for an incoming pod
     * if and only if every possible node assignment for that pod would violate
     * "MaxSkew" on some topology.
     * For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same
     * labelSelector spread as 3/1/1:
     * | zone1 | zone2 | zone3 |
     * | P P P |   P   |   P   |
     * If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled
     * to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies
     * MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler
     * won't make it *more* imbalanced.
     * It's a required field.
     * (Required)
     * 
     */
    @JsonProperty("whenUnsatisfiable")
    public String getWhenUnsatisfiable() {
        return whenUnsatisfiable;
    }

    /**
     * WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy
     * the spread constraint.
     * - DoNotSchedule (default) tells the scheduler not to schedule it.
     * - ScheduleAnyway tells the scheduler to schedule the pod in any location,
     *   but giving higher precedence to topologies that would help reduce the
     *   skew.
     * A constraint is considered "Unsatisfiable" for an incoming pod
     * if and only if every possible node assignment for that pod would violate
     * "MaxSkew" on some topology.
     * For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same
     * labelSelector spread as 3/1/1:
     * | zone1 | zone2 | zone3 |
     * | P P P |   P   |   P   |
     * If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled
     * to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies
     * MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler
     * won't make it *more* imbalanced.
     * It's a required field.
     * (Required)
     * 
     */
    @JsonProperty("whenUnsatisfiable")
    public void setWhenUnsatisfiable(String whenUnsatisfiable) {
        this.whenUnsatisfiable = whenUnsatisfiable;
    }

    public TopologySpreadConstraint withWhenUnsatisfiable(String whenUnsatisfiable) {
        this.whenUnsatisfiable = whenUnsatisfiable;
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

    public TopologySpreadConstraint withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TopologySpreadConstraint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("labelSelector");
        sb.append('=');
        sb.append(((this.labelSelector == null)?"<null>":this.labelSelector));
        sb.append(',');
        sb.append("matchLabelKeys");
        sb.append('=');
        sb.append(((this.matchLabelKeys == null)?"<null>":this.matchLabelKeys));
        sb.append(',');
        sb.append("maxSkew");
        sb.append('=');
        sb.append(((this.maxSkew == null)?"<null>":this.maxSkew));
        sb.append(',');
        sb.append("minDomains");
        sb.append('=');
        sb.append(((this.minDomains == null)?"<null>":this.minDomains));
        sb.append(',');
        sb.append("nodeAffinityPolicy");
        sb.append('=');
        sb.append(((this.nodeAffinityPolicy == null)?"<null>":this.nodeAffinityPolicy));
        sb.append(',');
        sb.append("nodeTaintsPolicy");
        sb.append('=');
        sb.append(((this.nodeTaintsPolicy == null)?"<null>":this.nodeTaintsPolicy));
        sb.append(',');
        sb.append("topologyKey");
        sb.append('=');
        sb.append(((this.topologyKey == null)?"<null>":this.topologyKey));
        sb.append(',');
        sb.append("whenUnsatisfiable");
        sb.append('=');
        sb.append(((this.whenUnsatisfiable == null)?"<null>":this.whenUnsatisfiable));
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
        result = ((result* 31)+((this.nodeTaintsPolicy == null)? 0 :this.nodeTaintsPolicy.hashCode()));
        result = ((result* 31)+((this.whenUnsatisfiable == null)? 0 :this.whenUnsatisfiable.hashCode()));
        result = ((result* 31)+((this.maxSkew == null)? 0 :this.maxSkew.hashCode()));
        result = ((result* 31)+((this.nodeAffinityPolicy == null)? 0 :this.nodeAffinityPolicy.hashCode()));
        result = ((result* 31)+((this.labelSelector == null)? 0 :this.labelSelector.hashCode()));
        result = ((result* 31)+((this.minDomains == null)? 0 :this.minDomains.hashCode()));
        result = ((result* 31)+((this.topologyKey == null)? 0 :this.topologyKey.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.matchLabelKeys == null)? 0 :this.matchLabelKeys.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopologySpreadConstraint) == false) {
            return false;
        }
        TopologySpreadConstraint rhs = ((TopologySpreadConstraint) other);
        return ((((((((((this.nodeTaintsPolicy == rhs.nodeTaintsPolicy)||((this.nodeTaintsPolicy!= null)&&this.nodeTaintsPolicy.equals(rhs.nodeTaintsPolicy)))&&((this.whenUnsatisfiable == rhs.whenUnsatisfiable)||((this.whenUnsatisfiable!= null)&&this.whenUnsatisfiable.equals(rhs.whenUnsatisfiable))))&&((this.maxSkew == rhs.maxSkew)||((this.maxSkew!= null)&&this.maxSkew.equals(rhs.maxSkew))))&&((this.nodeAffinityPolicy == rhs.nodeAffinityPolicy)||((this.nodeAffinityPolicy!= null)&&this.nodeAffinityPolicy.equals(rhs.nodeAffinityPolicy))))&&((this.labelSelector == rhs.labelSelector)||((this.labelSelector!= null)&&this.labelSelector.equals(rhs.labelSelector))))&&((this.minDomains == rhs.minDomains)||((this.minDomains!= null)&&this.minDomains.equals(rhs.minDomains))))&&((this.topologyKey == rhs.topologyKey)||((this.topologyKey!= null)&&this.topologyKey.equals(rhs.topologyKey))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.matchLabelKeys == rhs.matchLabelKeys)||((this.matchLabelKeys!= null)&&this.matchLabelKeys.equals(rhs.matchLabelKeys))));
    }

}
