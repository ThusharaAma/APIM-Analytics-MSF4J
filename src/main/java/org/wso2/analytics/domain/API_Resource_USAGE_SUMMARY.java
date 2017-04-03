package org.wso2.analytics.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the API_Resource_USAGE_SUMMARY database table.
 * 
 */
@Entity
@NamedQuery(name="API_Resource_USAGE_SUMMARY.findAll", query="SELECT a FROM API_Resource_USAGE_SUMMARY a")
public class API_Resource_USAGE_SUMMARY implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private API_Resource_USAGE_SUMMARYPK id;

	private String time;

	@Column(name="total_request_count")
	private int totalRequestCount;

	public API_Resource_USAGE_SUMMARY() {
	}

	public API_Resource_USAGE_SUMMARYPK getId() {
		return this.id;
	}

	public void setId(API_Resource_USAGE_SUMMARYPK id) {
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