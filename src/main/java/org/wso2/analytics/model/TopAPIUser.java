package org.wso2.analytics.model;

public class TopAPIUser {
	String	user;
	int		requestCount;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getRequestCount() {
		return requestCount;
	}

	public void setRequestCount(int requestCount) {
		this.requestCount = requestCount;
	}

	public TopAPIUser(String user, int i) {
		this.user = user;
		this.requestCount = i;
	}

}
