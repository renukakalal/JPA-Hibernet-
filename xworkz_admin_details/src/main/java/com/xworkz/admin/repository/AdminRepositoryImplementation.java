package com.xworkz.admin.repository;

import com.xworkz.admin.Entity.AdminEntity;
import com.xworkz.admin.service.Adminservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class AdminRepositoryImplementation implements AdminRepository {

    @Autowired
    EntityManagerFactory emf;

    @Override
    public boolean save(AdminEntity adminEntity) {

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Xworkz");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
         try {
         et.begin();
        em.persist(adminEntity);
        et.commit();
        } catch (Exception e) {
       if(et.isActive()){
           et.rollback();
       }
        }
         finally {
        }
        return true;
    }
}




