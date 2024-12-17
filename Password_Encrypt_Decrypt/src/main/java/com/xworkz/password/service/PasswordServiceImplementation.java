package com.xworkz.password.service;

import com.xworkz.password.dto.PasswordDTO;
import com.xworkz.password.entity.PasswordEntity;
import com.xworkz.password.repository.PasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PasswordServiceImplementation implements PasswordService{

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    PasswordRepository passwordRepository;
    @Override
    public boolean save(PasswordDTO passwordDTO) {

        System.out.println("running in service impementation");


        boolean issaved=true;
        String name = passwordDTO.getName();
        if (name== null|| name.length() > 5) {
            System.out.println("name is valid.");
            issaved = true;
        } else {
            issaved = false;
            System.out.println("name is invalid");
        }

        String email = passwordDTO.getEmail();
        if (email.contains("@gmail.com")) {

            System.out.println("email is valid");
            issaved = true;
        } else {
            issaved = false;
            System.out.println("email is invalid");
        }
        String password= passwordDTO.getPassword();
        if (password!=null) {
            System.out.println("password is valid");
            issaved = true;
        } else {
            issaved = false;
            System.out.println("password is invalid");
        }



        if(issaved) {


            PasswordEntity passwordEntity = new PasswordEntity();
            passwordEntity.setId(passwordDTO.getId());
            passwordEntity.setName(passwordDTO.getName());
            passwordEntity.setEmail(passwordDTO.getEmail());
            passwordEntity.setPassword(passwordEncoder.encode(passwordDTO.getPassword()));
            System.out.println("password"+passwordEncoder.encode(passwordDTO.getPassword()));

            System.out.println("Encoded Password: " + passwordEncoder);

            // Check if raw password matches the encoded password
            if (passwordEncoder.matches(password,passwordEncoder.encode(passwordDTO.getPassword()))) {
                System.out.println("Password matches!");
            } else {
                System.out.println("Password does not match.");
            }

            boolean saved = passwordRepository.save(passwordEntity);
            System.out.println("running in repositoty");

        }
        return true;
    }


}
