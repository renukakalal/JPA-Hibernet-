package com.xworkz.scholoarship.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class QueryRunner9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction entityTransaction = em.getTransaction();

		try {
			entityTransaction.begin();

			Query query = em.createNamedQuery("updateByAge&Name");
			query.setParameter("age", 8);
			query.setParameter("name", "Sohita");
			query.setParameter("id", 8);
			int result = query.executeUpdate();
			if(result>0) {
				System.out.println("updated");
			}
			else {
				System.out.println("not updated");
			}
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
