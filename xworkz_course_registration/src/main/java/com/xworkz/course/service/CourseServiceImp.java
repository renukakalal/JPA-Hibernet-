package com.xworkz.course.service;

import com.xworkz.course.dto.CourseDTO;
import com.xworkz.course.entity.CourseEntity;
import com.xworkz.course.repository.CourseRepository;
import com.xworkz.course.repository.CourseRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


@Service

public class CourseServiceImp implements CourseService {

    @Autowired
    CourseRepository courseRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public boolean save(CourseDTO courseDTO) {


        System.out.println("service imp is running");
        System.out.println(courseDTO);

        boolean valid = true;

        if (courseDTO.getName() == null || courseDTO.getName().length() > 5) {
            System.out.println("name is valid.");
            valid = true;
        } else {
            valid = false;
            System.out.println("name is invalid");
        }

        int age = courseDTO.getAge();
        if (age > 18) {

            System.out.println("age is valid");
            valid = true;
        } else {
            valid = false;
            System.out.println("age is invalid");

        }
        String email = courseDTO.getEmail();
        if (email.contains("@gmail.com")) {

            System.out.println("email is valid");
            valid = true;
        } else {
            valid = false;
            System.out.println("email is invalid");
        }

        String phNo = String.valueOf(courseDTO.getPhonenumber());
        if (phNo.startsWith("9") && phNo.length() == 10) {

            System.out.println("phone is valid");
            valid = true;
        } else {
            valid = false;
            System.out.println("phone is in valid");

        }


        String password = courseDTO.getPassword();
        String confirmPassword = courseDTO.getConformpassword();
        if (confirmPassword.equals(password)) {

            System.out.println("password password is valid");
            valid = true;
        } else {
            valid = false;
            System.err.println("password is in-valid");

        }
        if(valid)
        {
            String rawPassword =courseDTO.getPassword();

            CourseEntity entity = new CourseEntity();
            entity.setName(courseDTO.getName());
            entity.setAge(courseDTO.getAge());
            entity.setEmail(courseDTO.getEmail());
            entity.setPassword(passwordEncoder.encode(courseDTO.getPassword()));
            System.out.println("password:"+passwordEncoder.encode(courseDTO.getPassword()));

            System.out.println("");

            entity.setConformpassword(courseDTO.getConformpassword());
            entity.setPhonenumber(courseDTO.getPhonenumber());
            System.out.println("calling save to repository");

            boolean saved = courseRepository.save(entity);

        }
        return true;

    }

    @Override
    public String getNameByEmailAndPassword(String email, String password) {
        String name=courseRepository.getNameByEmailAndPassword(email,password);
        return name;

    }

    @Override
    public boolean validPassword(CourseDTO courseDTO) {
        return true;
    }


    @Override
    public List<CourseEntity> getAll(String name) {
       List<CourseEntity>  list= (List<CourseEntity>) courseRepository.getAll(name);


        return list;


    }


}
