package org.wso2.analytics.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-04-03T12:19:50.636+0530")
@StaticMetamodel(ApiResponseSummary.class)
public class ApiResponseSummary_ {
	public static volatile SingularAttribute<ApiResponseSummary, ApiResponseSummaryPK> id;
	public static volatile SingularAttribute<ApiResponseSummary, Integer> serviceTime;
	public static volatile SingularAttribute<ApiResponseSummary, String> time;
	public static volatile SingularAttribute<ApiResponseSummary, Integer> totalResponseCount;
}
