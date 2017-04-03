package org.wso2.analytics.model;

public class APIResponse {

	private int			recordsTotal;
	private Object[]	data;

	public int getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(int recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public Object[] getData() {
		return data;
	}

	public void setData(Object[] data) {
		this.data = data;
	}

	public APIResponse(int recordsTotal) {
		this.recordsTotal = recordsTotal;
		this.data = new Object[recordsTotal];
	}

}
