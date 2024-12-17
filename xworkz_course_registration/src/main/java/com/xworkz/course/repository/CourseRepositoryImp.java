package com.xworkz.course.repository;

import com.xworkz.course.dto.CourseDTO;
import com.xworkz.course.entity.CourseEntity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class CourseRepositoryImp implements CourseRepository {

    @Autowired
    EntityManagerFactory emf;


    @Override
    public boolean save(CourseEntity courseEntity) {
        System.out.println(courseEntity);

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(courseEntity);
            et.commit();
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
        } finally {
        }
        return true;

    }

    @Override
    public String getNameByEmailAndPassword(String email, String password) {


        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        String name = null;
        try {
            entityTransaction.begin();
            Query query = entityManager.createNamedQuery("getNameByEmailAndPassword");
            query.setParameter("byEmail", email).setParameter("byPassword", password);
            name = (String) query.getSingleResult();


            entityTransaction.commit();
        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
        } finally {
            entityManager.close();
        }
        return name;


    }

    @Override
    public boolean validPassword(CourseDTO courseDTO) {

        return false;
    }

    @Override
    public List<CourseEntity> getAll(String name) {


        EntityManager entityManager=emf.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();


        try{
            entityTransaction.begin();
            entityManager.createNamedQuery("getAll").setParameter("setName",name).getResultList();

            System.out.println("c");
            entityTransaction.commit();
        } catch (Exception e) {
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
        }
        finally {
            entityManager.close();

        }
        return Collections.emptyList();
    }
}



