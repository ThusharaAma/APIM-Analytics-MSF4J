package org.wso2.analytics.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the API_REQUEST_SUMMARY database table.
 * 
 */
@Entity
@Table(name="API_REQUEST_SUMMARY")
@NamedQuery(name="ApiRequestSummary.findAll", query="SELECT a FROM ApiRequestSummary a")
public class ApiRequestSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ApiRequestSummaryPK id;

	@Column(name="max_request_time")
	private Long maxRequestTime;

	private String time;

	@Column(name="total_request_count")
	private int totalRequestCount;

	public ApiRequestSummary() {
	}

	public ApiRequestSummaryPK getId() {
		return this.id;
	}

	public void setId(ApiRequestSummaryPK id) {
		this.id = id;
	}

	public Long getMaxRequestTime() {
		return this.maxRequestTime;
	}

	public void setMaxRequestTime(Long maxRequestTime) {
		this.maxRequestTime = maxRequestTime;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getTotalRequestCount() {
		return this.totalRequestCount;
	}

	public void setTotalRequestCount(int totalRequestCount) {
		this.totalRequestCount = totalRequestCount;
	}

}