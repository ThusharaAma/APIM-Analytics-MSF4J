package org.wso2.analytics.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-04-03T12:19:50.618+0530")
@StaticMetamodel(ApiExeTmeDaySummary.class)
public class ApiExeTmeDaySummary_ {
	public static volatile SingularAttribute<ApiExeTmeDaySummary, ApiExeTmeDaySummaryPK> id;
	public static volatile SingularAttribute<ApiExeTmeDaySummary, Long> apiResponseTime;
	public static volatile SingularAttribute<ApiExeTmeDaySummary, Long> backendLatency;
	public static volatile SingularAttribute<ApiExeTmeDaySummary, Long> otherLatency;
	public static volatile SingularAttribute<ApiExeTmeDaySummary, Long> requestMediationLatency;
	public static volatile SingularAttribute<ApiExeTmeDaySummary, Long> responseMediationLatency;
	public static volatile SingularAttribute<ApiExeTmeDaySummary, Long> securityLatency;
	public static volatile SingularAttribute<ApiExeTmeDaySummary, Long> throttlingLatency;
	public static volatile SingularAttribute<ApiExeTmeDaySummary, Long> time;
}
