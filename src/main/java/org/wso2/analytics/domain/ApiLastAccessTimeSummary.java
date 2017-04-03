package org.wso2.analytics.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the API_LAST_ACCESS_TIME_SUMMARY database table.
 * 
 */
@Entity
@Table(name="API_LAST_ACCESS_TIME_SUMMARY")
@NamedQuery(name="ApiLastAccessTimeSummary.findAll", query="SELECT a FROM ApiLastAccessTimeSummary a")
public class ApiLastAccessTimeSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ApiLastAccessTimeSummaryPK id;

	private String context;

	@Column(name="max_request_time")
	private Long maxRequestTime;

	private String userId;

	private String version;

	public ApiLastAccessTimeSummary() {
	}

	public ApiLastAccessTimeSummaryPK getId() {
		return this.id;
	}

	public void setId(ApiLastAccessTimeSummaryPK id) {
		this.id = id;
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Long getMaxRequestTime() {
		return this.maxRequestTime;
	}

	public void setMaxRequestTime(Long maxRequestTime) {
		this.maxRequestTime = maxRequestTime;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}