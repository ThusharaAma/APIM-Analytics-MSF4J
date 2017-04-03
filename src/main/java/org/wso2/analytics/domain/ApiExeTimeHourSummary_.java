package org.wso2.analytics.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-04-03T12:19:50.612+0530")
@StaticMetamodel(ApiExeTimeHourSummary.class)
public class ApiExeTimeHourSummary_ {
	public static volatile SingularAttribute<ApiExeTimeHourSummary, ApiExeTimeHourSummaryPK> id;
	public static volatile SingularAttribute<ApiExeTimeHourSummary, Long> apiResponseTime;
	public static volatile SingularAttribute<ApiExeTimeHourSummary, Long> backendLatency;
	public static volatile SingularAttribute<ApiExeTimeHourSummary, Long> otherLatency;
	public static volatile SingularAttribute<ApiExeTimeHourSummary, Long> requestMediationLatency;
	public static volatile SingularAttribute<ApiExeTimeHourSummary, Long> responseMediationLatency;
	public static volatile SingularAttribute<ApiExeTimeHourSummary, Long> securityLatency;
	public static volatile SingularAttribute<ApiExeTimeHourSummary, Long> throttlingLatency;
	public static volatile SingularAttribute<ApiExeTimeHourSummary, Long> time;
}
