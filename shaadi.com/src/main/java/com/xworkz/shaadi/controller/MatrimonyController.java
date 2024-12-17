package com.xworkz.shaadi.controller;

import com.xworkz.shaadi.dto.MatrimoneyDTO;
import com.xworkz.shaadi.service.MatrimonoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MatrimonyController {

    @Autowired
    public MatrimonoyService service;
    public MatrimonyController()
    {
        System.out.println("matrimony is running");
    }
    @RequestMapping("/matrimony")
   public String see(MatrimoneyDTO matrimoneyDTO) {
       System.out.println(matrimoneyDTO);
       if (this.service.validate(matrimoneyDTO)) {
           System.out.println("saved");
       } else {
           System.out.println("not saved");
       }
       return "Matrimony.jsp";
   }
}

