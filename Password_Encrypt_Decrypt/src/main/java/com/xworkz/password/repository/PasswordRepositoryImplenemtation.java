package com.xworkz.password.repository;

import com.xworkz.password.entity.PasswordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.Collections;
import java.util.List;


@Repository
public class PasswordRepositoryImplenemtation implements PasswordRepository{

    @Autowired
    EntityManagerFactory emf;
    @Override
    public boolean save(PasswordEntity passwordEntity) {
        System.out.println("running in repository implementation");

      EntityManager em =emf.createEntityManager();
      EntityTransaction et=em.getTransaction();

      try
      {
          et.begin();
          em.persist(passwordEntity);
          et.commit();


      }catch (Exception e)
      {
          et.isActive();
          {
              et.rollback();
          }


      }finally {
          em.close();
      }

        return true;
    }


}
