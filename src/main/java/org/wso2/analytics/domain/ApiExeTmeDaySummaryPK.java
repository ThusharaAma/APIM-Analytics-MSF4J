package org.wso2.analytics.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the API_EXE_TME_DAY_SUMMARY database table.
 * 
 */
@Embeddable
public class ApiExeTmeDaySummaryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String api;

	private String version;

	private String apiPublisher;

	private String context;

	private int year;

	private int month;

	private int day;

	private String tenantDomain;

	public ApiExeTmeDaySummaryPK() {
	}
	public String getApi() {
		return this.api;
	}
	public void setApi(String api) {
		this.api = api;
	}
	public String getVersion() {
		return this.version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getApiPublisher() {
		return this.apiPublisher;
	}
	public void setApiPublisher(String apiPublisher) {
		this.apiPublisher = apiPublisher;
	}
	public String getContext() {
		return this.context;
	}
	public void setContext(String context) {
		this.context = context;
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
	public String getTenantDomain() {
		return this.tenantDomain;
	}
	public void setTenantDomain(String tenantDomain) {
		this.tenantDomain = tenantDomain;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ApiExeTmeDaySummaryPK)) {
			return false;
		}
		ApiExeTmeDaySummaryPK castOther = (ApiExeTmeDaySummaryPK)other;
		return 
			this.api.equals(castOther.api)
			&& this.version.equals(castOther.version)
			&& this.apiPublisher.equals(castOther.apiPublisher)
			&& this.context.equals(castOther.context)
			&& (this.year == castOther.year)
			&& (this.month == castOther.month)
			&& (this.day == castOther.day)
			&& this.tenantDomain.equals(castOther.tenantDomain);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.api.hashCode();
		hash = hash * prime + this.version.hashCode();
		hash = hash * prime + this.apiPublisher.hashCode();
		hash = hash * prime + this.context.hashCode();
		hash = hash * prime + this.year;
		hash = hash * prime + this.month;
		hash = hash * prime + this.day;
		hash = hash * prime + this.tenantDomain.hashCode();
		
		return hash;
	}
}