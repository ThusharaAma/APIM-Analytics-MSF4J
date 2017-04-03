package org.wso2.analytics.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-04-03T12:19:50.630+0530")
@StaticMetamodel(ApiRequestSummary.class)
public class ApiRequestSummary_ {
	public static volatile SingularAttribute<ApiRequestSummary, ApiRequestSummaryPK> id;
	public static volatile SingularAttribute<ApiRequestSummary, Long> maxRequestTime;
	public static volatile SingularAttribute<ApiRequestSummary, String> time;
	public static volatile SingularAttribute<ApiRequestSummary, Integer> totalRequestCount;
}
