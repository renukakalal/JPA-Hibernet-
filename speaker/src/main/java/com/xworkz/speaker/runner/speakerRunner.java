package com.xworkz.speaker.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.dto.ApplicationEntity;



public class speakerRunner {
	public static void main(String[] args)
	{
		
	
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager=emf.createEntityManager();
	EntityTransaction et=entityManager.getTransaction();
	
	try {
		et.begin();
		ApplicationEntity applicationEntity=new ApplicationEntity();
		applicationEntity.setId(5);
		applicationEntity.setName("mani");
		applicationEntity.setEmail("mani@gmail.com");
		applicationEntity.setMarks(70);
		applicationEntity.setDegree("M.tech");
		applicationEntity.setBranch("Mechanical");
		applicationEntity.setCgpa(9);
		applicationEntity.setAddress("Gurumitkal");
		applicationEntity.setFees(100);
		
		entityManager.persist(applicationEntity);
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

