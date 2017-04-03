package org.wso2.analytics.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the API_THROTTLED_OUT_SUMMARY database table.
 * 
 */
@Entity
@Table(name="API_THROTTLED_OUT_SUMMARY")
@NamedQuery(name="ApiThrottledOutSummary.findAll", query="SELECT a FROM ApiThrottledOutSummary a")
public class ApiThrottledOutSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ApiThrottledOutSummaryPK id;

	@Column(name="success_request_count")
	private int successRequestCount;

	@Column(name="throttleout_count")
	private int throttleoutCount;

	private String time;

	private int week;

	public ApiThrottledOutSummary() {
	}

	public ApiThrottledOutSummaryPK getId() {
		return this.id;
	}

	public void setId(ApiThrottledOutSummaryPK id) {
		this.id = id;
	}

	public int getSuccessRequestCount() {
		return this.successRequestCount;
	}

	public void setSuccessRequestCount(int successRequestCount) {
		this.successRequestCount = successRequestCount;
	}

	public int getThrottleoutCount() {
		return this.throttleoutCount;
	}

	public void setThrottleoutCount(int throttleoutCount) {
		this.throttleoutCount = throttleoutCount;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getWeek() {
		return this.week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

}