package org.wso2.analytics.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

/**
 * The primary key class for the API_REQUEST_SUMMARY database table.
 * 
 */
@Component
@Embeddable
public class ApiRequestSummaryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String api;

	@Column(name="api_version")
	private String apiVersion;

	private String version;

	private String apiPublisher;

	private String consumerKey;

	private String userId;

	private String context;

	private String hostName;

	private int year;

	private int month;

	private int day;

	public ApiRequestSummaryPK() {
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
	public String getConsumerKey() {
		return this.consumerKey;
	}
	public void setConsumerKey(String consumerKey) {
		this.consumerKey = consumerKey;
	}
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
		if (!(other instanceof ApiRequestSummaryPK)) {
			return false;
		}
		ApiRequestSummaryPK castOther = (ApiRequestSummaryPK)other;
		return 
			this.api.equals(castOther.api)
			&& this.apiVersion.equals(castOther.apiVersion)
			&& this.version.equals(castOther.version)
			&& this.apiPublisher.equals(castOther.apiPublisher)
			&& this.consumerKey.equals(castOther.consumerKey)
			&& this.userId.equals(castOther.userId)
			&& this.context.equals(castOther.context)
			&& this.hostName.equals(castOther.hostName)
			&& (this.year == castOther.year)
			&& (this.month == castOther.month)
			&& (this.day == castOther.day);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.api.hashCode();
		hash = hash * prime + this.apiVersion.hashCode();
		hash = hash * prime + this.version.hashCode();
		hash = hash * prime + this.apiPublisher.hashCode();
		hash = hash * prime + this.consumerKey.hashCode();
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + this.context.hashCode();
		hash = hash * prime + this.hostName.hashCode();
		hash = hash * prime + this.year;
		hash = hash * prime + this.month;
		hash = hash * prime + this.day;
		
		return hash;
	}
}