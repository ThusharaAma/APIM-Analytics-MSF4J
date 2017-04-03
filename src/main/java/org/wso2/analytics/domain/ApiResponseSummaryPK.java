package org.wso2.analytics.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the API_RESPONSE_SUMMARY database table.
 * 
 */
@Embeddable
public class ApiResponseSummaryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="api_version")
	private String apiVersion;

	private String apiPublisher;

	private String context;

	private String hostName;

	private int year;

	private int month;

	private int day;

	public ApiResponseSummaryPK() {
	}
	public String getApiVersion() {
		return this.apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
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
	public String getHostName() {
		return this.hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ApiResponseSummaryPK)) {
			return false;
		}
		ApiResponseSummaryPK castOther = (ApiResponseSummaryPK)other;
		return 
			this.apiVersion.equals(castOther.apiVersion)
			&& this.apiPublisher.equals(castOther.apiPublisher)
			&& this.context.equals(castOther.context)
			&& this.hostName.equals(castOther.hostName)
			&& (this.year == castOther.year)
			&& (this.month == castOther.month)
			&& (this.day == castOther.day);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.apiVersion.hashCode();
		hash = hash * prime + this.apiPublisher.hashCode();
		hash = hash * prime + this.context.hashCode();
		hash = hash * prime + this.hostName.hashCode();
		hash = hash * prime + this.year;
		hash = hash * prime + this.month;
		hash = hash * prime + this.day;
		
		return hash;
	}
}