package org.wso2.analytics.repo;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.wso2.analytics.domain.ApiRequestSummary;
import org.wso2.analytics.domain.ApiRequestSummaryPK_;
import org.wso2.analytics.domain.ApiRequestSummary_;

@Repository
public class ApiRequestSummaryDaoImpl implements ApiRequestSummaryDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<ApiRequestSummary> getApiRequestSummary(String apiName, String apiVersion, String userId, Date fromDate,
			Date toDate, int start, int limit, String orderBy, String orderByOrder) {
		
		// Since the time column is varchar I had to filter dates this way
		
		Calendar fromCalendar = Calendar.getInstance();
		fromCalendar.setTimeInMillis(fromDate.getTime());
		int fromYear = fromCalendar.get(Calendar.YEAR);
		// Add one to month {0 - 11}
		int fromMonth = fromCalendar.get(Calendar.MONTH) + 1;
		int fromDay = fromCalendar.get(Calendar.DAY_OF_MONTH);

		Calendar toCalendar = Calendar.getInstance();
		toCalendar.setTimeInMillis(toDate.getTime());
		int toYear = toCalendar.get(Calendar.YEAR);
		// Add one to month {0 - 11}
		int toMonth = toCalendar.get(Calendar.MONTH) + 1;
		int toDay = toCalendar.get(Calendar.DAY_OF_MONTH);
	

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<ApiRequestSummary> query = cb.createQuery(ApiRequestSummary.class);
		Root<ApiRequestSummary> from = query.from(ApiRequestSummary.class);
		query.select(from).where(cb.and(
				cb.greaterThanOrEqualTo(from.get(ApiRequestSummary_.id).get(ApiRequestSummaryPK_.year), fromYear),
				cb.greaterThanOrEqualTo(from.get(ApiRequestSummary_.id).get(ApiRequestSummaryPK_.month), fromMonth),
				cb.greaterThanOrEqualTo(from.get(ApiRequestSummary_.id).get(ApiRequestSummaryPK_.day), fromDay),
				cb.lessThanOrEqualTo(from.get(ApiRequestSummary_.id).get(ApiRequestSummaryPK_.year), toYear),
				cb.lessThanOrEqualTo(from.get(ApiRequestSummary_.id).get(ApiRequestSummaryPK_.month), toMonth),
				cb.lessThanOrEqualTo(from.get(ApiRequestSummary_.id).get(ApiRequestSummaryPK_.day), toDay),
				cb.equal(from.get(ApiRequestSummary_.id).get(ApiRequestSummaryPK_.api), apiName),
				cb.equal(from.get(ApiRequestSummary_.id).get(ApiRequestSummaryPK_.apiVersion), apiVersion)
				));
		if (orderByOrder.equals("desc")) {
			query.orderBy(cb.desc(from.get(ApiRequestSummary_.id).get(orderBy)));
		} else if (orderByOrder.equals("asc")) {
			query.orderBy(cb.asc(from.get(ApiRequestSummary_.id).get(orderBy)));
		}
		return em.createQuery(query).setFirstResult(start) // offset
				.setMaxResults(limit) // limit
				.getResultList();

	}

}
