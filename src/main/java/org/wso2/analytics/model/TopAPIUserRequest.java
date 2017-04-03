package org.wso2.analytics.model;

import java.util.Date;

public class TopAPIUserRequest {

	String apiName;
	String version;
	Date fromDate;
	Date toDate;
	String apiFilter;
	int start;
	int limit;
	String orderBy;
	String orderByOrder;

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getApiFilter() {
		return apiFilter;
	}

	public void setApiFilter(String apiFilter) {
		this.apiFilter = apiFilter;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getOrderByOrder() {
		return orderByOrder;
	}

	public void setOrderByOrder(String orderByOrder) {
		this.orderByOrder = orderByOrder;
	}

}
