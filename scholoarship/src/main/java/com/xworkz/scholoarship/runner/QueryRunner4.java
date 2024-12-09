package com.xworkz.scholoarship.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.scholorship.entity.ScholorshipEntity;

public class QueryRunner4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction entityTransaction = em.getTransaction();

		try {
			entityTransaction.begin();
			Query query = em.createNamedQuery("getSingleAll");
			query.setParameter("id", 3);
			List<ScholorshipEntity> ref = (List<ScholorshipEntity>) query.getResultList();
			ref.forEach(dto -> System.out.println(ref));

			entityTransaction.commit();

		} catch (Exception e) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}


	}

}
