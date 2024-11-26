package com.xworkz.zepto.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.zepto.dto.ZeptoEntity;

public class ZeptoRunner {

	public static void main(String[] args) {
		EntityManagerFactory evm = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = evm.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();

		     Integer id=6;
			ZeptoEntity zeptoEntity = em.find(ZeptoEntity.class,id);
			em.remove(zeptoEntity);

			et.commit();
		} catch (Exception e) {
			
			if(et.isActive()) {
				et.rollback();
				e.printStackTrace();
			
		}
		
		} finally {
			em.close();
			evm.close();
		}
		if (evm != null) {
			System.out.println("this is connected");
		} else {
			System.out.println("this is not connected");
		}

	}

}
