package com.xworkz.swiggy.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.swiggy.dto.BigBasketEntity;
import com.xworkz.swiggy.dto.SwiggyEntity;

public class BigBasketRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("xworkz");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et =em.getTransaction();
		
		try
		{
			et.begin();
			
			BigBasketEntity bigBasketEntity=new BigBasketEntity();
			bigBasketEntity.setId(5);
			bigBasketEntity.setProductname(" chips");
			bigBasketEntity.setProductprice(130.0);
			
			em.persist(bigBasketEntity);
			em.merge(bigBasketEntity);
			
			et.commit();
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
			emf.close();
			
		}
		
		
		if(emf!=null)
		{
			System.out.println("this is connected");
		}
		else
		{
			System.out.println("this is not connected");
		}

	}

}
