package org.wso2.analytics.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the API_LAST_ACCESS_TIME_SUMMARY database table.
 * 
 */
@Embeddable
public class ApiLastAccessTimeSummaryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String tenantDomain;

	private String apiPublisher;

	private String api;

	public ApiLastAccessTimeSummaryPK() {
	}
	public String getTenantDomain() {
		return this.tenantDomain;
	}
	public void setTenantDomain(String tenantDomain) {
		this.tenantDomain = tenantDomain;
	}
	public String getApiPublisher() {
		return this.apiPublisher;
	}
	public void setApiPublisher(String apiPublisher) {
		this.apiPublisher = apiPublisher;
	}
	public String getApi() {
		return this.api;
	}
	public void setApi(String api) {
		this.api = api;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ApiLastAccessTimeSummaryPK)) {
			return false;
		}
		ApiLastAccessTimeSummaryPK castOther = (ApiLastAccessTimeSummaryPK)other;
		return 
			this.tenantDomain.equals(castOther.tenantDomain)
			&& this.apiPublisher.equals(castOther.apiPublisher)
			&& this.api.equals(castOther.api);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tenantDomain.hashCode();
		hash = hash * prime + this.apiPublisher.hashCode();
		hash = hash * prime + this.api.hashCode();
		
		return hash;
	}
}