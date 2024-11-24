package com.xworkz.zomato.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.zomato.dto.ZomatoEntity;

public class ZomatoRunner {

	public static void main(String[] args) {
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();
		
		try {
			et.begin();
			 ZomatoEntity zomatoEntity = new ZomatoEntity();

		        
		        zomatoEntity.setId(5);                         
		        zomatoEntity.setFoodname("Chicken Biryani");     
		        zomatoEntity.setPrice(350.75);                   
		        zomatoEntity.setQuantity(3);                   
		        zomatoEntity.setOffer("Buy 1 Get 1 Free");      
		        zomatoEntity.setDiscount(10);                 
		        zomatoEntity.setTaste("Spicy and Aromatic");     
		        zomatoEntity.setPaymentMode("Cash on Delivery");
		        zomatoEntity.setRatings(2);        

			
			
		
		entityManager.persist(zomatoEntity);
		et.commit();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			entityManager.close();
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
