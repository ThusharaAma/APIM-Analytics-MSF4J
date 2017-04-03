package org.wso2.analytics.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.wso2.analytics.domain.ApiRequestSummary;

@Transactional
@Repository
public class ApiRequestSummaryDaoImpl implements ApiRequestSummaryDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void test() {
		CriteriaQuery<ApiRequestSummary> c = em.getCriteriaBuilder().createQuery(ApiRequestSummary.class);
		Root<ApiRequestSummary> from = c.from(ApiRequestSummary.class);
		c.select(from);
		c.where(em.getCriteriaBuilder().equal(from.get("totalRequestCount"), 10)); // <-
		ApiRequestSummary apiRequestSummary = em.createQuery(c).getSingleResult();
		System.out.println("Testing..............");
		System.out.println(apiRequestSummary.getMaxRequestTime());
	}

}
