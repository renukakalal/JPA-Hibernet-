package com.xworkz.course.controller;


import com.xworkz.course.dto.CourseDTO;
import com.xworkz.course.entity.CourseEntity;
import com.xworkz.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class CourseContrller {

    @Autowired
    public CourseService courseService;


    @PostMapping("/course")
    public String noserve(CourseDTO courseDTO) {
        System.out.println("get course data");
        boolean saved = courseService.save(courseDTO);
        if (saved) {
            return "SignInSuccess.jsp";
        } else {
            return "SignIn.jsp";
        }
    }


        @PostMapping("/login")
        public String onSearch(@RequestParam String  email, @RequestParam String password, Model model)
        {
            String valid=courseService.getNameByEmailAndPassword(email,password);
            model.addAttribute("msg",valid);
            return "SignUp.jsp";
        }

        @GetMapping("")
    public String getDetails(String name ,Model model){
        System.out.println(name);
        List<CourseEntity>  courseEntities =courseService.getAll(name);
        System.out.println(courseEntities);
        model.addAttribute("printAll",courseEntities);
        return "successnew.jsp";

    }


    }








