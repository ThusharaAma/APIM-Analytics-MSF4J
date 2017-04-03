package org.wso2.analytics.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the API_RESPONSE_SUMMARY database table.
 * 
 */
@Entity
@Table(name="API_RESPONSE_SUMMARY")
@NamedQuery(name="ApiResponseSummary.findAll", query="SELECT a FROM ApiResponseSummary a")
public class ApiResponseSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ApiResponseSummaryPK id;

	private int serviceTime;

	private String time;

	@Column(name="total_response_count")
	private int totalResponseCount;

	public ApiResponseSummary() {
	}

	public ApiResponseSummaryPK getId() {
		return this.id;
	}

	public void setId(ApiResponseSummaryPK id) {
		this.id = id;
	}

	public int getServiceTime() {
		return this.serviceTime;
	}

	public void setServiceTime(int serviceTime) {
		this.serviceTime = serviceTime;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getTotalResponseCount() {
		return this.totalResponseCount;
	}

	public void setTotalResponseCount(int totalResponseCount) {
		this.totalResponseCount = totalResponseCount;
	}

}