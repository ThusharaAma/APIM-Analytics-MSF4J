package org.wso2.analytics.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-04-03T12:19:50.643+0530")
@StaticMetamodel(ApiVersionUsageSummary.class)
public class ApiVersionUsageSummary_ {
	public static volatile SingularAttribute<ApiVersionUsageSummary, ApiVersionUsageSummaryPK> id;
	public static volatile SingularAttribute<ApiVersionUsageSummary, String> time;
	public static volatile SingularAttribute<ApiVersionUsageSummary, Integer> totalRequestCount;
}
