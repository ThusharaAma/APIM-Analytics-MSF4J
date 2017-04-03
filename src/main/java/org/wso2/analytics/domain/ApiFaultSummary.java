package org.wso2.analytics.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the API_FAULT_SUMMARY database table.
 * 
 */
@Entity
@Table(name="API_FAULT_SUMMARY")
@NamedQuery(name="ApiFaultSummary.findAll", query="SELECT a FROM ApiFaultSummary a")
public class ApiFaultSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ApiFaultSummaryPK id;

	private String time;

	@Column(name="total_fault_count")
	private int totalFaultCount;

	public ApiFaultSummary() {
	}

	public ApiFaultSummaryPK getId() {
		return this.id;
	}

	public void setId(ApiFaultSummaryPK id) {
		this.id = id;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getTotalFaultCount() {
		return this.totalFaultCount;
	}

	public void setTotalFaultCount(int totalFaultCount) {
		this.totalFaultCount = totalFaultCount;
	}

}