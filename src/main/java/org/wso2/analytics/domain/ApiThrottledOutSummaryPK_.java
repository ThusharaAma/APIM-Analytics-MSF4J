package org.wso2.analytics.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-04-03T12:19:50.640+0530")
@StaticMetamodel(ApiThrottledOutSummaryPK.class)
public class ApiThrottledOutSummaryPK_ {
	public static volatile SingularAttribute<ApiThrottledOutSummaryPK, String> api;
	public static volatile SingularAttribute<ApiThrottledOutSummaryPK, String> apiVersion;
	public static volatile SingularAttribute<ApiThrottledOutSummaryPK, String> context;
	public static volatile SingularAttribute<ApiThrottledOutSummaryPK, String> apiPublisher;
	public static volatile SingularAttribute<ApiThrottledOutSummaryPK, String> applicationName;
	public static volatile SingularAttribute<ApiThrottledOutSummaryPK, String> tenantDomain;
	public static volatile SingularAttribute<ApiThrottledOutSummaryPK, Integer> year;
	public static volatile SingularAttribute<ApiThrottledOutSummaryPK, Integer> month;
	public static volatile SingularAttribute<ApiThrottledOutSummaryPK, Integer> day;
	public static volatile SingularAttribute<ApiThrottledOutSummaryPK, String> throttledOutReason;
}
