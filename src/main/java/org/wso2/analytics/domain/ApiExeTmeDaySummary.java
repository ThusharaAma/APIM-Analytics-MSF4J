package org.wso2.analytics.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the API_EXE_TME_DAY_SUMMARY database table.
 * 
 */
@Entity
@Table(name="API_EXE_TME_DAY_SUMMARY")
@NamedQuery(name="ApiExeTmeDaySummary.findAll", query="SELECT a FROM ApiExeTmeDaySummary a")
public class ApiExeTmeDaySummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ApiExeTmeDaySummaryPK id;

	private Long apiResponseTime;

	private Long backendLatency;

	private Long otherLatency;

	private Long requestMediationLatency;

	private Long responseMediationLatency;

	private Long securityLatency;

	private Long throttlingLatency;

	private Long time;

	public ApiExeTmeDaySummary() {
	}

	public ApiExeTmeDaySummaryPK getId() {
		return this.id;
	}

	public void setId(ApiExeTmeDaySummaryPK id) {
		this.id = id;
	}

	public Long getApiResponseTime() {
		return this.apiResponseTime;
	}

	public void setApiResponseTime(Long apiResponseTime) {
		this.apiResponseTime = apiResponseTime;
	}

	public Long getBackendLatency() {
		return this.backendLatency;
	}

	public void setBackendLatency(Long backendLatency) {
		this.backendLatency = backendLatency;
	}

	public Long getOtherLatency() {
		return this.otherLatency;
	}

	public void setOtherLatency(Long otherLatency) {
		this.otherLatency = otherLatency;
	}

	public Long getRequestMediationLatency() {
		return this.requestMediationLatency;
	}

	public void setRequestMediationLatency(Long requestMediationLatency) {
		this.requestMediationLatency = requestMediationLatency;
	}

	public Long getResponseMediationLatency() {
		return this.responseMediationLatency;
	}

	public void setResponseMediationLatency(Long responseMediationLatency) {
		this.responseMediationLatency = responseMediationLatency;
	}

	public Long getSecurityLatency() {
		return this.securityLatency;
	}

	public void setSecurityLatency(Long securityLatency) {
		this.securityLatency = securityLatency;
	}

	public Long getThrottlingLatency() {
		return this.throttlingLatency;
	}

	public void setThrottlingLatency(Long throttlingLatency) {
		this.throttlingLatency = throttlingLatency;
	}

	public Long getTime() {
		return this.time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

}