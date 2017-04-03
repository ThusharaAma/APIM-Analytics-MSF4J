package org.wso2.analytics.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the API_REQ_USER_BROW_SUMMARY database table.
 * 
 */
@Embeddable
public class ApiReqUserBrowSummaryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String api;

	private String version;

	private String apiPublisher;

	private int year;

	private int month;

	private int day;

	private String os;

	private String browser;

	private String tenantDomain;

	public ApiReqUserBrowSummaryPK() {
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
	public String getOs() {
		return this.os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getBrowser() {
		return this.browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
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
		if (!(other instanceof ApiReqUserBrowSummaryPK)) {
			return false;
		}
		ApiReqUserBrowSummaryPK castOther = (ApiReqUserBrowSummaryPK)other;
		return 
			this.api.equals(castOther.api)
			&& this.version.equals(castOther.version)
			&& this.apiPublisher.equals(castOther.apiPublisher)
			&& (this.year == castOther.year)
			&& (this.month == castOther.month)
			&& (this.day == castOther.day)
			&& this.os.equals(castOther.os)
			&& this.browser.equals(castOther.browser)
			&& this.tenantDomain.equals(castOther.tenantDomain);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.api.hashCode();
		hash = hash * prime + this.version.hashCode();
		hash = hash * prime + this.apiPublisher.hashCode();
		hash = hash * prime + this.year;
		hash = hash * prime + this.month;
		hash = hash * prime + this.day;
		hash = hash * prime + this.os.hashCode();
		hash = hash * prime + this.browser.hashCode();
		hash = hash * prime + this.tenantDomain.hashCode();
		
		return hash;
	}
}