package org.wso2.analytics.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-04-03T12:19:50.639+0530")
@StaticMetamodel(ApiThrottledOutSummary.class)
public class ApiThrottledOutSummary_ {
	public static volatile SingularAttribute<ApiThrottledOutSummary, ApiThrottledOutSummaryPK> id;
	public static volatile SingularAttribute<ApiThrottledOutSummary, Integer> successRequestCount;
	public static volatile SingularAttribute<ApiThrottledOutSummary, Integer> throttleoutCount;
	public static volatile SingularAttribute<ApiThrottledOutSummary, String> time;
	public static volatile SingularAttribute<ApiThrottledOutSummary, Integer> week;
}
