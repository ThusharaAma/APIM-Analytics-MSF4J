package org.wso2.analytics.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-04-03T12:19:50.621+0530")
@StaticMetamodel(ApiFaultSummary.class)
public class ApiFaultSummary_ {
	public static volatile SingularAttribute<ApiFaultSummary, ApiFaultSummaryPK> id;
	public static volatile SingularAttribute<ApiFaultSummary, String> time;
	public static volatile SingularAttribute<ApiFaultSummary, Integer> totalFaultCount;
}
