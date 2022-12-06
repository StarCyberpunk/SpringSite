package com.example.Shop1.controller;

import com.example.Shop1.Entity.Tovar_spring;
import com.example.Shop1.Entity.User_spring;
import com.example.Shop1.exceptions.ExcpTov;
import com.example.Shop1.service.Buying_Service;
import com.example.Shop1.service.Tovar_Service;
import com.example.Shop1.service.Zakaz_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.Shop1.Entity.Tovar_spring;
import com.example.Shop1.exceptions.ExcpTov;
import com.example.Shop1.service.Tovar_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@Controller
public class Buying_Page {

    /*Здесь будет оформляться заказ*/
    @Autowired
    public Buying_Service buying_service;
    @Autowired
    public Tovar_Service tovar_service;
    @Autowired
    public Zakaz_Service zakaz_service;
    @RequestMapping(value = "/buying/{id}",method = RequestMethod.GET)
    public String getRobot(@PathVariable("id") long id, Model model) throws ExcpTov {

        Tovar_spring z= tovar_service.get_byId(id);

        if(z!=null){
            model.addAttribute("Tov",z);
            model.addAttribute("User",null);
            model.addAttribute("user_sp", new User_spring());

        }
        return "Buying_Page";
    }
    @RequestMapping(value = "/buying/cart/{id}",method = RequestMethod.POST)
    public String selling(@ModelAttribute("user_sp") User_spring us, BindingResult result,@PathVariable("id") long id) throws ExcpTov {

        User_spring uss=buying_service.get_Phone(us.getPhone());
        Tovar_spring ts= tovar_service.get_byId(id);
        boolean added=false;
        if(uss==null){

            ResponseEntity r=buying_service.save(us);

                added=true;

        }

       if(added){
           uss=buying_service.get_Phone(us.getPhone());
       }

        zakaz_service.add_order(uss,ts);

        return "resual_page";
    }

    /*
    Валидация
     */
}
