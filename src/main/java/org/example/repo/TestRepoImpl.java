package org.example.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.example.domain.User;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class TestRepoImpl implements TestRepo {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void test() {
		System.out.println("Testing..............");
		System.out.println(em.find(User.class, 1).getUserName());
	}

}
