package com.xworkz.scholoarship.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.scholorship.entity.ScholorshipEntity;

public class ScholorshipRunner {

	public static void main(String[] args) {

		EntityManagerFactory emv = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emv.createEntityManager();
		EntityTransaction entityTransaction = em.getTransaction();

		try {
			ScholorshipEntity sc=new ScholorshipEntity();
			entityTransaction.begin();
			List<ScholorshipEntity> list = new ArrayList<>();
			list.add(new ScholorshipEntity("Renuka", "renuka@gmail.com", 22, 20000, 1234567895,LocalDate.now(), true));
			 list.add(new ScholorshipEntity("Anil", "anil@gmail.com", 23, 15000, 9876543210L, LocalDate.now(), true));
		        list.add(new ScholorshipEntity("Priya", "priya@gmail.com", 21, 18000, 1234598765L, LocalDate.now(), false));
		        list.add(new ScholorshipEntity("Rahul", "rahul@gmail.com", 24, 17000, 9876512340L, LocalDate.now(), false));
		        list.add(new ScholorshipEntity("Sneha", "sneha@gmail.com", 22, 25000, 1234509876L, LocalDate.now(), true));
		        list.add(new ScholorshipEntity("Kiran", "kiran@gmail.com", 23, 21000, 9876523410L, LocalDate.now(), false));
		        list.add(new ScholorshipEntity("Megha", "megha@gmail.com", 20, 22000, 1234587650L, LocalDate.now(), true));
		        list.add(new ScholorshipEntity("Ravi", "ravi@gmail.com", 25, 19000, 9876532104L, LocalDate.now(), false));
		        list.add(new ScholorshipEntity("Divya", "divya@gmail.com", 22, 20000, 1234567089L, LocalDate.now(), true));
		        list.add(new ScholorshipEntity("Amit", "amit@gmail.com", 26, 23000, 9876543087L, LocalDate.now(), false));

			for(ScholorshipEntity ref:list)
			{
				em.persist(ref);
			}
			
			
			
			entityTransaction.commit();
		} catch (Exception e) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
			emv.close();
		}
	}
}