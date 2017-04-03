package org.wso2.analytics.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the API_THROTTLED_OUT_SUMMARY database table.
 * 
 */
@Embeddable
public class ApiThrottledOutSummaryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String api;

	@Column(name="api_version")
	private String apiVersion;

	private String context;

	private String apiPublisher;

	private String applicationName;

	private String tenantDomain;

	private int year;

	private int month;

	private int day;

	private String throttledOutReason;

	public ApiThrottledOutSummaryPK() {
	}
	public String getApi() {
		return this.api;
	}
	public void setApi(String api) {
		this.api = api;
	}
	public String getApiVersion() {
		return this.apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}
	public String getContext() {
		return this.context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getApiPublisher() {
		return this.apiPublisher;
	}
	public void setApiPublisher(String apiPublisher) {
		this.apiPublisher = apiPublisher;
	}
	public String getApplicationName() {
		return this.applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public String getTenantDomain() {
		return this.tenantDomain;
	}
	public void setTenantDomain(String tenantDomain) {
		this.tenantDomain = tenantDomain;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return this.month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return this.day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getThrottledOutReason() {
		return this.throttledOutReason;
	}
	public void setThrottledOutReason(String throttledOutReason) {
		this.throttledOutReason = throttledOutReason;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ApiThrottledOutSummaryPK)) {
			return false;
		}
		ApiThrottledOutSummaryPK castOther = (ApiThrottledOutSummaryPK)other;
		return 
			this.api.equals(castOther.api)
			&& this.apiVersion.equals(castOther.apiVersion)
			&& this.context.equals(castOther.context)
			&& this.apiPublisher.equals(castOther.apiPublisher)
			&& this.applicationName.equals(castOther.applicationName)
			&& this.tenantDomain.equals(castOther.tenantDomain)
			&& (this.year == castOther.year)
			&& (this.month == castOther.month)
			&& (this.day == castOther.day)
			&& this.throttledOutReason.equals(castOther.throttledOutReason);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.api.hashCode();
		hash = hash * prime + this.apiVersion.hashCode();
		hash = hash * prime + this.context.hashCode();
		hash = hash * prime + this.apiPublisher.hashCode();
		hash = hash * prime + this.applicationName.hashCode();
		hash = hash * prime + this.tenantDomain.hashCode();
		hash = hash * prime + this.year;
		hash = hash * prime + this.month;
		hash = hash * prime + this.day;
		hash = hash * prime + this.throttledOutReason.hashCode();
		
		return hash;
	}
}