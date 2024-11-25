package com.xworkz.swiggy.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.swiggy.dto.SwiggyEntity;

public class SwiggyRunner {

	public static void main(String[] args) 
	{
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("xworkz");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et =em.getTransaction();
	
	
	
	try
	{
		et.begin();
		SwiggyEntity swiggyEntity=new SwiggyEntity();
		swiggyEntity.setId(5);
		swiggyEntity.setFooditem("Biryani");
		swiggyEntity.setPrice(800);
		
	            
		
		em.persist(swiggyEntity);
		et.commit();
		
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		
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