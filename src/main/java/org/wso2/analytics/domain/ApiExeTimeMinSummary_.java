package org.wso2.analytics.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-04-03T12:19:50.615+0530")
@StaticMetamodel(ApiExeTimeMinSummary.class)
public class ApiExeTimeMinSummary_ {
	public static volatile SingularAttribute<ApiExeTimeMinSummary, ApiExeTimeMinSummaryPK> id;
	public static volatile SingularAttribute<ApiExeTimeMinSummary, Long> apiResponseTime;
	public static volatile SingularAttribute<ApiExeTimeMinSummary, Long> backendLatency;
	public static volatile SingularAttribute<ApiExeTimeMinSummary, Long> otherLatency;
	public static volatile SingularAttribute<ApiExeTimeMinSummary, Long> requestMediationLatency;
	public static volatile SingularAttribute<ApiExeTimeMinSummary, Long> responseMediationLatency;
	public static volatile SingularAttribute<ApiExeTimeMinSummary, Long> securityLatency;
	public static volatile SingularAttribute<ApiExeTimeMinSummary, Long> throttlingLatency;
	public static volatile SingularAttribute<ApiExeTimeMinSummary, Long> time;
}
