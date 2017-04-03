package org.wso2.analytics.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the API_DESTINATION_SUMMARY database table.
 * 
 */
@Entity
@Table(name="API_DESTINATION_SUMMARY")
@NamedQuery(name="ApiDestinationSummary.findAll", query="SELECT a FROM ApiDestinationSummary a")
public class ApiDestinationSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ApiDestinationSummaryPK id;

	private String time;

	@Column(name="total_request_count")
	private int totalRequestCount;

	public ApiDestinationSummary() {
	}

	public ApiDestinationSummaryPK getId() {
		return this.id;
	}

	public void setId(ApiDestinationSummaryPK id) {
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