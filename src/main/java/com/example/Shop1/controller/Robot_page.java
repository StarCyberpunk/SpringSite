package com.example.Shop1.controller;
import com.example.Shop1.Entity.Tovar_spring;
import com.example.Shop1.exceptions.ExcpTov;
import com.example.Shop1.service.Tovar_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class Robot_page {
    @Autowired
    public Tovar_Service tovar_service;
    @RequestMapping(value = "/robot/{id}",method = RequestMethod.GET)
    public String getRobot(@PathVariable("id") long id, Model model) throws ExcpTov {

            Tovar_spring z= tovar_service.get_byId(id);

        if(z!=null){
            model.addAttribute("Tov",z);
        }
        return "robot_page";
    }
}
