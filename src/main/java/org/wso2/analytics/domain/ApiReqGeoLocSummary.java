package org.wso2.analytics.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the API_REQ_GEO_LOC_SUMMARY database table.
 * 
 */
@Entity
@Table(name="API_REQ_GEO_LOC_SUMMARY")
@NamedQuery(name="ApiReqGeoLocSummary.findAll", query="SELECT a FROM ApiReqGeoLocSummary a")
public class ApiReqGeoLocSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ApiReqGeoLocSummaryPK id;

	private Long requestTime;

	@Column(name="total_request_count")
	private int totalRequestCount;

	public ApiReqGeoLocSummary() {
	}

	public ApiReqGeoLocSummaryPK getId() {
		return this.id;
	}

	public void setId(ApiReqGeoLocSummaryPK id) {
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