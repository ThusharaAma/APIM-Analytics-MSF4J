package org.wso2.analytics.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-04-03T12:19:50.517+0530")
@StaticMetamodel(API_Resource_USAGE_SUMMARY.class)
public class API_Resource_USAGE_SUMMARY_ {
	public static volatile SingularAttribute<API_Resource_USAGE_SUMMARY, API_Resource_USAGE_SUMMARYPK> id;
	public static volatile SingularAttribute<API_Resource_USAGE_SUMMARY, String> time;
	public static volatile SingularAttribute<API_Resource_USAGE_SUMMARY, Integer> totalRequestCount;
}
