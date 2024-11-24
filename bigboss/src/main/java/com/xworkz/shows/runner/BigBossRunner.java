package com.xworkz.shows.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.shows.dto.BigBossEntity;

public class BigBossRunner {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

		try {
			et.begin();
			BigBossEntity bigBossEntity = new BigBossEntity();
			bigBossEntity.setId(5);
			bigBossEntity.setName("hanumanta");
			bigBossEntity.setScore(60);
			bigBossEntity.setTrp(5.6);
			bigBossEntity.setHost_name("host123");
			bigBossEntity.setLanaguge("kannada");
			bigBossEntity.setBudget("70M");
			bigBossEntity.setPayment(900);
			bigBossEntity.setMonths(3);
			bigBossEntity.setSeason(11);

			entityManager.persist(bigBossEntity);
			et.commit();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			entityManager.close();
			emf.close();
		}

	}

}
