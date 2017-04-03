package org.wso2.analytics.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-04-03T12:19:50.625+0530")
@StaticMetamodel(ApiLastAccessTimeSummary.class)
public class ApiLastAccessTimeSummary_ {
	public static volatile SingularAttribute<ApiLastAccessTimeSummary, ApiLastAccessTimeSummaryPK> id;
	public static volatile SingularAttribute<ApiLastAccessTimeSummary, String> context;
	public static volatile SingularAttribute<ApiLastAccessTimeSummary, Long> maxRequestTime;
	public static volatile SingularAttribute<ApiLastAccessTimeSummary, String> userId;
	public static volatile SingularAttribute<ApiLastAccessTimeSummary, String> version;
}
