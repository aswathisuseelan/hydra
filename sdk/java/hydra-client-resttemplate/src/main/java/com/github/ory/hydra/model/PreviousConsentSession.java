/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * OpenAPI spec version: latest
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.ory.hydra.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.github.ory.hydra.model.ConsentRequest;
import com.github.ory.hydra.model.ConsentRequestSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * The response used to return used consent requests same as HandledLoginRequest, just with consent_request exposed as json
 */
@ApiModel(description = "The response used to return used consent requests same as HandledLoginRequest, just with consent_request exposed as json")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-11T14:10:17.875+02:00")
public class PreviousConsentSession {
  @JsonProperty("consent_request")
  private ConsentRequest consentRequest = null;

  @JsonProperty("grant_access_token_audience")
  private List<String> grantAccessTokenAudience = null;

  @JsonProperty("grant_scope")
  private List<String> grantScope = null;

  @JsonProperty("remember")
  private Boolean remember = null;

  @JsonProperty("remember_for")
  private Long rememberFor = null;

  @JsonProperty("session")
  private ConsentRequestSession session = null;

  public PreviousConsentSession consentRequest(ConsentRequest consentRequest) {
    this.consentRequest = consentRequest;
    return this;
  }

   /**
   * Get consentRequest
   * @return consentRequest
  **/
  @ApiModelProperty(value = "")
  public ConsentRequest getConsentRequest() {
    return consentRequest;
  }

  public void setConsentRequest(ConsentRequest consentRequest) {
    this.consentRequest = consentRequest;
  }

  public PreviousConsentSession grantAccessTokenAudience(List<String> grantAccessTokenAudience) {
    this.grantAccessTokenAudience = grantAccessTokenAudience;
    return this;
  }

  public PreviousConsentSession addGrantAccessTokenAudienceItem(String grantAccessTokenAudienceItem) {
    if (this.grantAccessTokenAudience == null) {
      this.grantAccessTokenAudience = new ArrayList<String>();
    }
    this.grantAccessTokenAudience.add(grantAccessTokenAudienceItem);
    return this;
  }

   /**
   * GrantedAudience sets the audience the user authorized the client to use. Should be a subset of &#x60;requested_access_token_audience&#x60;.
   * @return grantAccessTokenAudience
  **/
  @ApiModelProperty(value = "GrantedAudience sets the audience the user authorized the client to use. Should be a subset of `requested_access_token_audience`.")
  public List<String> getGrantAccessTokenAudience() {
    return grantAccessTokenAudience;
  }

  public void setGrantAccessTokenAudience(List<String> grantAccessTokenAudience) {
    this.grantAccessTokenAudience = grantAccessTokenAudience;
  }

  public PreviousConsentSession grantScope(List<String> grantScope) {
    this.grantScope = grantScope;
    return this;
  }

  public PreviousConsentSession addGrantScopeItem(String grantScopeItem) {
    if (this.grantScope == null) {
      this.grantScope = new ArrayList<String>();
    }
    this.grantScope.add(grantScopeItem);
    return this;
  }

   /**
   * GrantScope sets the scope the user authorized the client to use. Should be a subset of &#x60;requested_scope&#x60;
   * @return grantScope
  **/
  @ApiModelProperty(value = "GrantScope sets the scope the user authorized the client to use. Should be a subset of `requested_scope`")
  public List<String> getGrantScope() {
    return grantScope;
  }

  public void setGrantScope(List<String> grantScope) {
    this.grantScope = grantScope;
  }

  public PreviousConsentSession remember(Boolean remember) {
    this.remember = remember;
    return this;
  }

   /**
   * Remember, if set to true, tells ORY Hydra to remember this consent authorization and reuse it if the same client asks the same user for the same, or a subset of, scope.
   * @return remember
  **/
  @ApiModelProperty(value = "Remember, if set to true, tells ORY Hydra to remember this consent authorization and reuse it if the same client asks the same user for the same, or a subset of, scope.")
  public Boolean getRemember() {
    return remember;
  }

  public void setRemember(Boolean remember) {
    this.remember = remember;
  }

  public PreviousConsentSession rememberFor(Long rememberFor) {
    this.rememberFor = rememberFor;
    return this;
  }

   /**
   * RememberFor sets how long the consent authorization should be remembered for in seconds. If set to &#x60;0&#x60;, the authorization will be remembered indefinitely.
   * @return rememberFor
  **/
  @ApiModelProperty(value = "RememberFor sets how long the consent authorization should be remembered for in seconds. If set to `0`, the authorization will be remembered indefinitely.")
  public Long getRememberFor() {
    return rememberFor;
  }

  public void setRememberFor(Long rememberFor) {
    this.rememberFor = rememberFor;
  }

  public PreviousConsentSession session(ConsentRequestSession session) {
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @ApiModelProperty(value = "")
  public ConsentRequestSession getSession() {
    return session;
  }

  public void setSession(ConsentRequestSession session) {
    this.session = session;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviousConsentSession previousConsentSession = (PreviousConsentSession) o;
    return Objects.equals(this.consentRequest, previousConsentSession.consentRequest) &&
        Objects.equals(this.grantAccessTokenAudience, previousConsentSession.grantAccessTokenAudience) &&
        Objects.equals(this.grantScope, previousConsentSession.grantScope) &&
        Objects.equals(this.remember, previousConsentSession.remember) &&
        Objects.equals(this.rememberFor, previousConsentSession.rememberFor) &&
        Objects.equals(this.session, previousConsentSession.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentRequest, grantAccessTokenAudience, grantScope, remember, rememberFor, session);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviousConsentSession {\n");
    
    sb.append("    consentRequest: ").append(toIndentedString(consentRequest)).append("\n");
    sb.append("    grantAccessTokenAudience: ").append(toIndentedString(grantAccessTokenAudience)).append("\n");
    sb.append("    grantScope: ").append(toIndentedString(grantScope)).append("\n");
    sb.append("    remember: ").append(toIndentedString(remember)).append("\n");
    sb.append("    rememberFor: ").append(toIndentedString(rememberFor)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

