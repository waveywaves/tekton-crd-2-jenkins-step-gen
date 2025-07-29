
package io.tekton.crd.model.taskruns.v1beta1;

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
 * FeatureFlags identifies the feature flags that were used during the task/pipeline run
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "awaitSidecarReadiness",
    "coschedule",
    "disableCredsInit",
    "disableInlineSpec",
    "enableAPIFields",
    "enableArtifacts",
    "enableCELInWhenExpression",
    "enableConciseResolverSyntax",
    "enableKeepPodOnCancel",
    "enableKubernetesSidecar",
    "enableParamEnum",
    "enableProvenanceInStatus",
    "enableStepActions",
    "enforceNonfalsifiability",
    "maxResultSize",
    "requireGitSSHSecretKnownHosts",
    "resultExtractionMethod",
    "runningInEnvWithInjectedSidecars",
    "sendCloudEventsForRuns",
    "setSecurityContext",
    "setSecurityContextReadOnlyRootFilesystem",
    "verificationNoMatchPolicy"
})
@Generated("jsonschema2pojo")
public class FeatureFlags__1 {

    @JsonProperty("awaitSidecarReadiness")
    private Boolean awaitSidecarReadiness;
    @JsonProperty("coschedule")
    private String coschedule;
    @JsonProperty("disableCredsInit")
    private Boolean disableCredsInit;
    @JsonProperty("disableInlineSpec")
    private String disableInlineSpec;
    @JsonProperty("enableAPIFields")
    private String enableAPIFields;
    @JsonProperty("enableArtifacts")
    private Boolean enableArtifacts;
    @JsonProperty("enableCELInWhenExpression")
    private Boolean enableCELInWhenExpression;
    @JsonProperty("enableConciseResolverSyntax")
    private Boolean enableConciseResolverSyntax;
    @JsonProperty("enableKeepPodOnCancel")
    private Boolean enableKeepPodOnCancel;
    @JsonProperty("enableKubernetesSidecar")
    private Boolean enableKubernetesSidecar;
    @JsonProperty("enableParamEnum")
    private Boolean enableParamEnum;
    @JsonProperty("enableProvenanceInStatus")
    private Boolean enableProvenanceInStatus;
    /**
     * EnableStepActions is a no-op flag since StepActions are stable
     * 
     */
    @JsonProperty("enableStepActions")
    @JsonPropertyDescription("EnableStepActions is a no-op flag since StepActions are stable")
    private Boolean enableStepActions;
    @JsonProperty("enforceNonfalsifiability")
    private String enforceNonfalsifiability;
    @JsonProperty("maxResultSize")
    private Integer maxResultSize;
    @JsonProperty("requireGitSSHSecretKnownHosts")
    private Boolean requireGitSSHSecretKnownHosts;
    @JsonProperty("resultExtractionMethod")
    private String resultExtractionMethod;
    @JsonProperty("runningInEnvWithInjectedSidecars")
    private Boolean runningInEnvWithInjectedSidecars;
    @JsonProperty("sendCloudEventsForRuns")
    private Boolean sendCloudEventsForRuns;
    @JsonProperty("setSecurityContext")
    private Boolean setSecurityContext;
    @JsonProperty("setSecurityContextReadOnlyRootFilesystem")
    private Boolean setSecurityContextReadOnlyRootFilesystem;
    /**
     * VerificationNoMatchPolicy is the feature flag for "trusted-resources-verification-no-match-policy"
     * VerificationNoMatchPolicy can be set to "ignore", "warn" and "fail" values.
     * ignore: skip trusted resources verification when no matching verification policies found
     * warn: skip trusted resources verification when no matching verification policies found and log a warning
     * fail: fail the taskrun or pipelines run if no matching verification policies found
     * 
     */
    @JsonProperty("verificationNoMatchPolicy")
    @JsonPropertyDescription("VerificationNoMatchPolicy is the feature flag for \"trusted-resources-verification-no-match-policy\"\nVerificationNoMatchPolicy can be set to \"ignore\", \"warn\" and \"fail\" values.\nignore: skip trusted resources verification when no matching verification policies found\nwarn: skip trusted resources verification when no matching verification policies found and log a warning\nfail: fail the taskrun or pipelines run if no matching verification policies found")
    private String verificationNoMatchPolicy;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("awaitSidecarReadiness")
    public Boolean getAwaitSidecarReadiness() {
        return awaitSidecarReadiness;
    }

    @JsonProperty("awaitSidecarReadiness")
    public void setAwaitSidecarReadiness(Boolean awaitSidecarReadiness) {
        this.awaitSidecarReadiness = awaitSidecarReadiness;
    }

    public FeatureFlags__1 withAwaitSidecarReadiness(Boolean awaitSidecarReadiness) {
        this.awaitSidecarReadiness = awaitSidecarReadiness;
        return this;
    }

    @JsonProperty("coschedule")
    public String getCoschedule() {
        return coschedule;
    }

    @JsonProperty("coschedule")
    public void setCoschedule(String coschedule) {
        this.coschedule = coschedule;
    }

    public FeatureFlags__1 withCoschedule(String coschedule) {
        this.coschedule = coschedule;
        return this;
    }

    @JsonProperty("disableCredsInit")
    public Boolean getDisableCredsInit() {
        return disableCredsInit;
    }

    @JsonProperty("disableCredsInit")
    public void setDisableCredsInit(Boolean disableCredsInit) {
        this.disableCredsInit = disableCredsInit;
    }

    public FeatureFlags__1 withDisableCredsInit(Boolean disableCredsInit) {
        this.disableCredsInit = disableCredsInit;
        return this;
    }

    @JsonProperty("disableInlineSpec")
    public String getDisableInlineSpec() {
        return disableInlineSpec;
    }

    @JsonProperty("disableInlineSpec")
    public void setDisableInlineSpec(String disableInlineSpec) {
        this.disableInlineSpec = disableInlineSpec;
    }

    public FeatureFlags__1 withDisableInlineSpec(String disableInlineSpec) {
        this.disableInlineSpec = disableInlineSpec;
        return this;
    }

    @JsonProperty("enableAPIFields")
    public String getEnableAPIFields() {
        return enableAPIFields;
    }

    @JsonProperty("enableAPIFields")
    public void setEnableAPIFields(String enableAPIFields) {
        this.enableAPIFields = enableAPIFields;
    }

    public FeatureFlags__1 withEnableAPIFields(String enableAPIFields) {
        this.enableAPIFields = enableAPIFields;
        return this;
    }

    @JsonProperty("enableArtifacts")
    public Boolean getEnableArtifacts() {
        return enableArtifacts;
    }

    @JsonProperty("enableArtifacts")
    public void setEnableArtifacts(Boolean enableArtifacts) {
        this.enableArtifacts = enableArtifacts;
    }

    public FeatureFlags__1 withEnableArtifacts(Boolean enableArtifacts) {
        this.enableArtifacts = enableArtifacts;
        return this;
    }

    @JsonProperty("enableCELInWhenExpression")
    public Boolean getEnableCELInWhenExpression() {
        return enableCELInWhenExpression;
    }

    @JsonProperty("enableCELInWhenExpression")
    public void setEnableCELInWhenExpression(Boolean enableCELInWhenExpression) {
        this.enableCELInWhenExpression = enableCELInWhenExpression;
    }

    public FeatureFlags__1 withEnableCELInWhenExpression(Boolean enableCELInWhenExpression) {
        this.enableCELInWhenExpression = enableCELInWhenExpression;
        return this;
    }

    @JsonProperty("enableConciseResolverSyntax")
    public Boolean getEnableConciseResolverSyntax() {
        return enableConciseResolverSyntax;
    }

    @JsonProperty("enableConciseResolverSyntax")
    public void setEnableConciseResolverSyntax(Boolean enableConciseResolverSyntax) {
        this.enableConciseResolverSyntax = enableConciseResolverSyntax;
    }

    public FeatureFlags__1 withEnableConciseResolverSyntax(Boolean enableConciseResolverSyntax) {
        this.enableConciseResolverSyntax = enableConciseResolverSyntax;
        return this;
    }

    @JsonProperty("enableKeepPodOnCancel")
    public Boolean getEnableKeepPodOnCancel() {
        return enableKeepPodOnCancel;
    }

    @JsonProperty("enableKeepPodOnCancel")
    public void setEnableKeepPodOnCancel(Boolean enableKeepPodOnCancel) {
        this.enableKeepPodOnCancel = enableKeepPodOnCancel;
    }

    public FeatureFlags__1 withEnableKeepPodOnCancel(Boolean enableKeepPodOnCancel) {
        this.enableKeepPodOnCancel = enableKeepPodOnCancel;
        return this;
    }

    @JsonProperty("enableKubernetesSidecar")
    public Boolean getEnableKubernetesSidecar() {
        return enableKubernetesSidecar;
    }

    @JsonProperty("enableKubernetesSidecar")
    public void setEnableKubernetesSidecar(Boolean enableKubernetesSidecar) {
        this.enableKubernetesSidecar = enableKubernetesSidecar;
    }

    public FeatureFlags__1 withEnableKubernetesSidecar(Boolean enableKubernetesSidecar) {
        this.enableKubernetesSidecar = enableKubernetesSidecar;
        return this;
    }

    @JsonProperty("enableParamEnum")
    public Boolean getEnableParamEnum() {
        return enableParamEnum;
    }

    @JsonProperty("enableParamEnum")
    public void setEnableParamEnum(Boolean enableParamEnum) {
        this.enableParamEnum = enableParamEnum;
    }

    public FeatureFlags__1 withEnableParamEnum(Boolean enableParamEnum) {
        this.enableParamEnum = enableParamEnum;
        return this;
    }

    @JsonProperty("enableProvenanceInStatus")
    public Boolean getEnableProvenanceInStatus() {
        return enableProvenanceInStatus;
    }

    @JsonProperty("enableProvenanceInStatus")
    public void setEnableProvenanceInStatus(Boolean enableProvenanceInStatus) {
        this.enableProvenanceInStatus = enableProvenanceInStatus;
    }

    public FeatureFlags__1 withEnableProvenanceInStatus(Boolean enableProvenanceInStatus) {
        this.enableProvenanceInStatus = enableProvenanceInStatus;
        return this;
    }

    /**
     * EnableStepActions is a no-op flag since StepActions are stable
     * 
     */
    @JsonProperty("enableStepActions")
    public Boolean getEnableStepActions() {
        return enableStepActions;
    }

    /**
     * EnableStepActions is a no-op flag since StepActions are stable
     * 
     */
    @JsonProperty("enableStepActions")
    public void setEnableStepActions(Boolean enableStepActions) {
        this.enableStepActions = enableStepActions;
    }

    public FeatureFlags__1 withEnableStepActions(Boolean enableStepActions) {
        this.enableStepActions = enableStepActions;
        return this;
    }

    @JsonProperty("enforceNonfalsifiability")
    public String getEnforceNonfalsifiability() {
        return enforceNonfalsifiability;
    }

    @JsonProperty("enforceNonfalsifiability")
    public void setEnforceNonfalsifiability(String enforceNonfalsifiability) {
        this.enforceNonfalsifiability = enforceNonfalsifiability;
    }

    public FeatureFlags__1 withEnforceNonfalsifiability(String enforceNonfalsifiability) {
        this.enforceNonfalsifiability = enforceNonfalsifiability;
        return this;
    }

    @JsonProperty("maxResultSize")
    public Integer getMaxResultSize() {
        return maxResultSize;
    }

    @JsonProperty("maxResultSize")
    public void setMaxResultSize(Integer maxResultSize) {
        this.maxResultSize = maxResultSize;
    }

    public FeatureFlags__1 withMaxResultSize(Integer maxResultSize) {
        this.maxResultSize = maxResultSize;
        return this;
    }

    @JsonProperty("requireGitSSHSecretKnownHosts")
    public Boolean getRequireGitSSHSecretKnownHosts() {
        return requireGitSSHSecretKnownHosts;
    }

    @JsonProperty("requireGitSSHSecretKnownHosts")
    public void setRequireGitSSHSecretKnownHosts(Boolean requireGitSSHSecretKnownHosts) {
        this.requireGitSSHSecretKnownHosts = requireGitSSHSecretKnownHosts;
    }

    public FeatureFlags__1 withRequireGitSSHSecretKnownHosts(Boolean requireGitSSHSecretKnownHosts) {
        this.requireGitSSHSecretKnownHosts = requireGitSSHSecretKnownHosts;
        return this;
    }

    @JsonProperty("resultExtractionMethod")
    public String getResultExtractionMethod() {
        return resultExtractionMethod;
    }

    @JsonProperty("resultExtractionMethod")
    public void setResultExtractionMethod(String resultExtractionMethod) {
        this.resultExtractionMethod = resultExtractionMethod;
    }

    public FeatureFlags__1 withResultExtractionMethod(String resultExtractionMethod) {
        this.resultExtractionMethod = resultExtractionMethod;
        return this;
    }

    @JsonProperty("runningInEnvWithInjectedSidecars")
    public Boolean getRunningInEnvWithInjectedSidecars() {
        return runningInEnvWithInjectedSidecars;
    }

    @JsonProperty("runningInEnvWithInjectedSidecars")
    public void setRunningInEnvWithInjectedSidecars(Boolean runningInEnvWithInjectedSidecars) {
        this.runningInEnvWithInjectedSidecars = runningInEnvWithInjectedSidecars;
    }

    public FeatureFlags__1 withRunningInEnvWithInjectedSidecars(Boolean runningInEnvWithInjectedSidecars) {
        this.runningInEnvWithInjectedSidecars = runningInEnvWithInjectedSidecars;
        return this;
    }

    @JsonProperty("sendCloudEventsForRuns")
    public Boolean getSendCloudEventsForRuns() {
        return sendCloudEventsForRuns;
    }

    @JsonProperty("sendCloudEventsForRuns")
    public void setSendCloudEventsForRuns(Boolean sendCloudEventsForRuns) {
        this.sendCloudEventsForRuns = sendCloudEventsForRuns;
    }

    public FeatureFlags__1 withSendCloudEventsForRuns(Boolean sendCloudEventsForRuns) {
        this.sendCloudEventsForRuns = sendCloudEventsForRuns;
        return this;
    }

    @JsonProperty("setSecurityContext")
    public Boolean getSetSecurityContext() {
        return setSecurityContext;
    }

    @JsonProperty("setSecurityContext")
    public void setSetSecurityContext(Boolean setSecurityContext) {
        this.setSecurityContext = setSecurityContext;
    }

    public FeatureFlags__1 withSetSecurityContext(Boolean setSecurityContext) {
        this.setSecurityContext = setSecurityContext;
        return this;
    }

    @JsonProperty("setSecurityContextReadOnlyRootFilesystem")
    public Boolean getSetSecurityContextReadOnlyRootFilesystem() {
        return setSecurityContextReadOnlyRootFilesystem;
    }

    @JsonProperty("setSecurityContextReadOnlyRootFilesystem")
    public void setSetSecurityContextReadOnlyRootFilesystem(Boolean setSecurityContextReadOnlyRootFilesystem) {
        this.setSecurityContextReadOnlyRootFilesystem = setSecurityContextReadOnlyRootFilesystem;
    }

    public FeatureFlags__1 withSetSecurityContextReadOnlyRootFilesystem(Boolean setSecurityContextReadOnlyRootFilesystem) {
        this.setSecurityContextReadOnlyRootFilesystem = setSecurityContextReadOnlyRootFilesystem;
        return this;
    }

    /**
     * VerificationNoMatchPolicy is the feature flag for "trusted-resources-verification-no-match-policy"
     * VerificationNoMatchPolicy can be set to "ignore", "warn" and "fail" values.
     * ignore: skip trusted resources verification when no matching verification policies found
     * warn: skip trusted resources verification when no matching verification policies found and log a warning
     * fail: fail the taskrun or pipelines run if no matching verification policies found
     * 
     */
    @JsonProperty("verificationNoMatchPolicy")
    public String getVerificationNoMatchPolicy() {
        return verificationNoMatchPolicy;
    }

    /**
     * VerificationNoMatchPolicy is the feature flag for "trusted-resources-verification-no-match-policy"
     * VerificationNoMatchPolicy can be set to "ignore", "warn" and "fail" values.
     * ignore: skip trusted resources verification when no matching verification policies found
     * warn: skip trusted resources verification when no matching verification policies found and log a warning
     * fail: fail the taskrun or pipelines run if no matching verification policies found
     * 
     */
    @JsonProperty("verificationNoMatchPolicy")
    public void setVerificationNoMatchPolicy(String verificationNoMatchPolicy) {
        this.verificationNoMatchPolicy = verificationNoMatchPolicy;
    }

    public FeatureFlags__1 withVerificationNoMatchPolicy(String verificationNoMatchPolicy) {
        this.verificationNoMatchPolicy = verificationNoMatchPolicy;
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

    public FeatureFlags__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FeatureFlags__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("awaitSidecarReadiness");
        sb.append('=');
        sb.append(((this.awaitSidecarReadiness == null)?"<null>":this.awaitSidecarReadiness));
        sb.append(',');
        sb.append("coschedule");
        sb.append('=');
        sb.append(((this.coschedule == null)?"<null>":this.coschedule));
        sb.append(',');
        sb.append("disableCredsInit");
        sb.append('=');
        sb.append(((this.disableCredsInit == null)?"<null>":this.disableCredsInit));
        sb.append(',');
        sb.append("disableInlineSpec");
        sb.append('=');
        sb.append(((this.disableInlineSpec == null)?"<null>":this.disableInlineSpec));
        sb.append(',');
        sb.append("enableAPIFields");
        sb.append('=');
        sb.append(((this.enableAPIFields == null)?"<null>":this.enableAPIFields));
        sb.append(',');
        sb.append("enableArtifacts");
        sb.append('=');
        sb.append(((this.enableArtifacts == null)?"<null>":this.enableArtifacts));
        sb.append(',');
        sb.append("enableCELInWhenExpression");
        sb.append('=');
        sb.append(((this.enableCELInWhenExpression == null)?"<null>":this.enableCELInWhenExpression));
        sb.append(',');
        sb.append("enableConciseResolverSyntax");
        sb.append('=');
        sb.append(((this.enableConciseResolverSyntax == null)?"<null>":this.enableConciseResolverSyntax));
        sb.append(',');
        sb.append("enableKeepPodOnCancel");
        sb.append('=');
        sb.append(((this.enableKeepPodOnCancel == null)?"<null>":this.enableKeepPodOnCancel));
        sb.append(',');
        sb.append("enableKubernetesSidecar");
        sb.append('=');
        sb.append(((this.enableKubernetesSidecar == null)?"<null>":this.enableKubernetesSidecar));
        sb.append(',');
        sb.append("enableParamEnum");
        sb.append('=');
        sb.append(((this.enableParamEnum == null)?"<null>":this.enableParamEnum));
        sb.append(',');
        sb.append("enableProvenanceInStatus");
        sb.append('=');
        sb.append(((this.enableProvenanceInStatus == null)?"<null>":this.enableProvenanceInStatus));
        sb.append(',');
        sb.append("enableStepActions");
        sb.append('=');
        sb.append(((this.enableStepActions == null)?"<null>":this.enableStepActions));
        sb.append(',');
        sb.append("enforceNonfalsifiability");
        sb.append('=');
        sb.append(((this.enforceNonfalsifiability == null)?"<null>":this.enforceNonfalsifiability));
        sb.append(',');
        sb.append("maxResultSize");
        sb.append('=');
        sb.append(((this.maxResultSize == null)?"<null>":this.maxResultSize));
        sb.append(',');
        sb.append("requireGitSSHSecretKnownHosts");
        sb.append('=');
        sb.append(((this.requireGitSSHSecretKnownHosts == null)?"<null>":this.requireGitSSHSecretKnownHosts));
        sb.append(',');
        sb.append("resultExtractionMethod");
        sb.append('=');
        sb.append(((this.resultExtractionMethod == null)?"<null>":this.resultExtractionMethod));
        sb.append(',');
        sb.append("runningInEnvWithInjectedSidecars");
        sb.append('=');
        sb.append(((this.runningInEnvWithInjectedSidecars == null)?"<null>":this.runningInEnvWithInjectedSidecars));
        sb.append(',');
        sb.append("sendCloudEventsForRuns");
        sb.append('=');
        sb.append(((this.sendCloudEventsForRuns == null)?"<null>":this.sendCloudEventsForRuns));
        sb.append(',');
        sb.append("setSecurityContext");
        sb.append('=');
        sb.append(((this.setSecurityContext == null)?"<null>":this.setSecurityContext));
        sb.append(',');
        sb.append("setSecurityContextReadOnlyRootFilesystem");
        sb.append('=');
        sb.append(((this.setSecurityContextReadOnlyRootFilesystem == null)?"<null>":this.setSecurityContextReadOnlyRootFilesystem));
        sb.append(',');
        sb.append("verificationNoMatchPolicy");
        sb.append('=');
        sb.append(((this.verificationNoMatchPolicy == null)?"<null>":this.verificationNoMatchPolicy));
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
        result = ((result* 31)+((this.enableConciseResolverSyntax == null)? 0 :this.enableConciseResolverSyntax.hashCode()));
        result = ((result* 31)+((this.requireGitSSHSecretKnownHosts == null)? 0 :this.requireGitSSHSecretKnownHosts.hashCode()));
        result = ((result* 31)+((this.maxResultSize == null)? 0 :this.maxResultSize.hashCode()));
        result = ((result* 31)+((this.enableStepActions == null)? 0 :this.enableStepActions.hashCode()));
        result = ((result* 31)+((this.enableCELInWhenExpression == null)? 0 :this.enableCELInWhenExpression.hashCode()));
        result = ((result* 31)+((this.enableParamEnum == null)? 0 :this.enableParamEnum.hashCode()));
        result = ((result* 31)+((this.setSecurityContext == null)? 0 :this.setSecurityContext.hashCode()));
        result = ((result* 31)+((this.verificationNoMatchPolicy == null)? 0 :this.verificationNoMatchPolicy.hashCode()));
        result = ((result* 31)+((this.disableInlineSpec == null)? 0 :this.disableInlineSpec.hashCode()));
        result = ((result* 31)+((this.enableKubernetesSidecar == null)? 0 :this.enableKubernetesSidecar.hashCode()));
        result = ((result* 31)+((this.setSecurityContextReadOnlyRootFilesystem == null)? 0 :this.setSecurityContextReadOnlyRootFilesystem.hashCode()));
        result = ((result* 31)+((this.enableArtifacts == null)? 0 :this.enableArtifacts.hashCode()));
        result = ((result* 31)+((this.resultExtractionMethod == null)? 0 :this.resultExtractionMethod.hashCode()));
        result = ((result* 31)+((this.enableAPIFields == null)? 0 :this.enableAPIFields.hashCode()));
        result = ((result* 31)+((this.coschedule == null)? 0 :this.coschedule.hashCode()));
        result = ((result* 31)+((this.disableCredsInit == null)? 0 :this.disableCredsInit.hashCode()));
        result = ((result* 31)+((this.enableProvenanceInStatus == null)? 0 :this.enableProvenanceInStatus.hashCode()));
        result = ((result* 31)+((this.runningInEnvWithInjectedSidecars == null)? 0 :this.runningInEnvWithInjectedSidecars.hashCode()));
        result = ((result* 31)+((this.awaitSidecarReadiness == null)? 0 :this.awaitSidecarReadiness.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.enforceNonfalsifiability == null)? 0 :this.enforceNonfalsifiability.hashCode()));
        result = ((result* 31)+((this.sendCloudEventsForRuns == null)? 0 :this.sendCloudEventsForRuns.hashCode()));
        result = ((result* 31)+((this.enableKeepPodOnCancel == null)? 0 :this.enableKeepPodOnCancel.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FeatureFlags__1) == false) {
            return false;
        }
        FeatureFlags__1 rhs = ((FeatureFlags__1) other);
        return ((((((((((((((((((((((((this.enableConciseResolverSyntax == rhs.enableConciseResolverSyntax)||((this.enableConciseResolverSyntax!= null)&&this.enableConciseResolverSyntax.equals(rhs.enableConciseResolverSyntax)))&&((this.requireGitSSHSecretKnownHosts == rhs.requireGitSSHSecretKnownHosts)||((this.requireGitSSHSecretKnownHosts!= null)&&this.requireGitSSHSecretKnownHosts.equals(rhs.requireGitSSHSecretKnownHosts))))&&((this.maxResultSize == rhs.maxResultSize)||((this.maxResultSize!= null)&&this.maxResultSize.equals(rhs.maxResultSize))))&&((this.enableStepActions == rhs.enableStepActions)||((this.enableStepActions!= null)&&this.enableStepActions.equals(rhs.enableStepActions))))&&((this.enableCELInWhenExpression == rhs.enableCELInWhenExpression)||((this.enableCELInWhenExpression!= null)&&this.enableCELInWhenExpression.equals(rhs.enableCELInWhenExpression))))&&((this.enableParamEnum == rhs.enableParamEnum)||((this.enableParamEnum!= null)&&this.enableParamEnum.equals(rhs.enableParamEnum))))&&((this.setSecurityContext == rhs.setSecurityContext)||((this.setSecurityContext!= null)&&this.setSecurityContext.equals(rhs.setSecurityContext))))&&((this.verificationNoMatchPolicy == rhs.verificationNoMatchPolicy)||((this.verificationNoMatchPolicy!= null)&&this.verificationNoMatchPolicy.equals(rhs.verificationNoMatchPolicy))))&&((this.disableInlineSpec == rhs.disableInlineSpec)||((this.disableInlineSpec!= null)&&this.disableInlineSpec.equals(rhs.disableInlineSpec))))&&((this.enableKubernetesSidecar == rhs.enableKubernetesSidecar)||((this.enableKubernetesSidecar!= null)&&this.enableKubernetesSidecar.equals(rhs.enableKubernetesSidecar))))&&((this.setSecurityContextReadOnlyRootFilesystem == rhs.setSecurityContextReadOnlyRootFilesystem)||((this.setSecurityContextReadOnlyRootFilesystem!= null)&&this.setSecurityContextReadOnlyRootFilesystem.equals(rhs.setSecurityContextReadOnlyRootFilesystem))))&&((this.enableArtifacts == rhs.enableArtifacts)||((this.enableArtifacts!= null)&&this.enableArtifacts.equals(rhs.enableArtifacts))))&&((this.resultExtractionMethod == rhs.resultExtractionMethod)||((this.resultExtractionMethod!= null)&&this.resultExtractionMethod.equals(rhs.resultExtractionMethod))))&&((this.enableAPIFields == rhs.enableAPIFields)||((this.enableAPIFields!= null)&&this.enableAPIFields.equals(rhs.enableAPIFields))))&&((this.coschedule == rhs.coschedule)||((this.coschedule!= null)&&this.coschedule.equals(rhs.coschedule))))&&((this.disableCredsInit == rhs.disableCredsInit)||((this.disableCredsInit!= null)&&this.disableCredsInit.equals(rhs.disableCredsInit))))&&((this.enableProvenanceInStatus == rhs.enableProvenanceInStatus)||((this.enableProvenanceInStatus!= null)&&this.enableProvenanceInStatus.equals(rhs.enableProvenanceInStatus))))&&((this.runningInEnvWithInjectedSidecars == rhs.runningInEnvWithInjectedSidecars)||((this.runningInEnvWithInjectedSidecars!= null)&&this.runningInEnvWithInjectedSidecars.equals(rhs.runningInEnvWithInjectedSidecars))))&&((this.awaitSidecarReadiness == rhs.awaitSidecarReadiness)||((this.awaitSidecarReadiness!= null)&&this.awaitSidecarReadiness.equals(rhs.awaitSidecarReadiness))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.enforceNonfalsifiability == rhs.enforceNonfalsifiability)||((this.enforceNonfalsifiability!= null)&&this.enforceNonfalsifiability.equals(rhs.enforceNonfalsifiability))))&&((this.sendCloudEventsForRuns == rhs.sendCloudEventsForRuns)||((this.sendCloudEventsForRuns!= null)&&this.sendCloudEventsForRuns.equals(rhs.sendCloudEventsForRuns))))&&((this.enableKeepPodOnCancel == rhs.enableKeepPodOnCancel)||((this.enableKeepPodOnCancel!= null)&&this.enableKeepPodOnCancel.equals(rhs.enableKeepPodOnCancel))));
    }

}
