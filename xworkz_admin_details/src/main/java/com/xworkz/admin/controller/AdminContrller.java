package com.xworkz.admin.controller;

import com.xworkz.admin.dto.AdminDTO;
import com.xworkz.admin.service.AdminServiceImplementation;
import com.xworkz.admin.service.Adminservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AdminContrller {

    @Autowired
    public Adminservice adminservice;

//    @GetMapping("/save")
//    public String getservice(AdminDTO adminDTO) {
//        System.out.println(adminDTO);
//        System.out.println("data is get");
//        return "AdminPage.jsp";
//    }
    @PostMapping("/save")
    public String postservice(AdminDTO adminDTO)
    {
        System.out.println(adminDTO);
        boolean saved=adminservice.save(adminDTO);
        if(saved){
            return "AdminSucces.jsp";
        }
        else{
            return "AdminPage.jsp";
        }
    }
}




