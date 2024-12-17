package com.xworkz.password.controller;

import com.xworkz.password.dto.PasswordDTO;
import com.xworkz.password.service.PasswordService;
import com.xworkz.password.service.PasswordServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class PasswordController {

    @Autowired
   private PasswordService passwordService;
    public PasswordController()
    {
        System.out.println("controller is running");
    }

    @PostMapping("/save")
    public String noservice(PasswordDTO passwordDTO)
    {

        boolean saved=passwordService.save(passwordDTO);
        System.out.println(passwordDTO.toString());

        System.out.println("running in service");
        return "Success.jsp";
    }

    @PostMapping("/login")
    public String loginservice(@RequestParam String name,String password,Model  model)
    {



        model.addAttribute("msg","password matched");


        return "SignIn.jsp";

    }

}
