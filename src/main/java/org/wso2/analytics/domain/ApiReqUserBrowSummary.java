package org.wso2.analytics.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the API_REQ_USER_BROW_SUMMARY database table.
 * 
 */
@Entity
@Table(name="API_REQ_USER_BROW_SUMMARY")
@NamedQuery(name="ApiReqUserBrowSummary.findAll", query="SELECT a FROM ApiReqUserBrowSummary a")
public class ApiReqUserBrowSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ApiReqUserBrowSummaryPK id;

	private Long requestTime;

	@Column(name="total_request_count")
	private int totalRequestCount;

	public ApiReqUserBrowSummary() {
	}

	public ApiReqUserBrowSummaryPK getId() {
		return this.id;
	}

	public void setId(ApiReqUserBrowSummaryPK id) {
		this.id = id;
	}

	public Long getRequestTime() {
		return this.requestTime;
	}

	public void setRequestTime(Long requestTime) {
		this.requestTime = requestTime;
	}

	public int getTotalRequestCount() {
		return this.totalRequestCount;
	}

	public void setTotalRequestCount(int totalRequestCount) {
		this.totalRequestCount = totalRequestCount;
	}

}