package com.xworkz.scholoarship.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class QueryRunner8 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction entityTransaction = em.getTransaction();

		try {
			entityTransaction.begin();

			Query query = em.createNamedQuery("updateByName&Email");
			query.setParameter("name", "Sohita");
			query.setParameter("email", "sohita@gmail.com");
			query.setParameter("amount", 20000);
			double result = query.executeUpdate();
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
