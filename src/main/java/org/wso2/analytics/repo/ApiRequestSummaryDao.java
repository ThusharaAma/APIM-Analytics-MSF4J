package org.wso2.analytics.repo;

import java.util.Date;
import java.util.List;

import org.wso2.analytics.domain.ApiRequestSummary;

public interface ApiRequestSummaryDao {
	public List<ApiRequestSummary> getApiRequestSummary(String apiName, String version, String userId, Date fromDate,
			Date toDate, int start, int limit, String orderBy, String orderByOrder);
}
