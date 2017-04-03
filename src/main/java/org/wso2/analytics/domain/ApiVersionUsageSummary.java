package org.wso2.analytics.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the API_VERSION_USAGE_SUMMARY database table.
 * 
 */
@Entity
@Table(name="API_VERSION_USAGE_SUMMARY")
@NamedQuery(name="ApiVersionUsageSummary.findAll", query="SELECT a FROM ApiVersionUsageSummary a")
public class ApiVersionUsageSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ApiVersionUsageSummaryPK id;

	private String time;

	@Column(name="total_request_count")
	private int totalRequestCount;

	public ApiVersionUsageSummary() {
	}

	public ApiVersionUsageSummaryPK getId() {
		return this.id;
	}

	public void setId(ApiVersionUsageSummaryPK id) {
		this.id = id;
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