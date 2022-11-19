package com.example.Shop1.controller;

import com.example.Shop1.Entity.Tovar_spring;
import com.example.Shop1.Entity.User_spring;
import com.example.Shop1.Entity.Zakaz_spring;
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

@Controller
public class Zakaz_page {
    @Autowired
    public Zakaz_Service zakaz_service;
    @Autowired
    public Buying_Service buying_service;
    @RequestMapping(value = "/zakaz",method = RequestMethod.GET)
    public String getZakaz( Model model) throws ExcpTov {
        model.addAttribute("us", new User_spring());
        return "zakaz_page";
    }
    @RequestMapping(value = "/zakaz/info",method = RequestMethod.POST)
    public String getZakazPhone(@ModelAttribute("us") User_spring us, BindingResult result,Model model) throws ExcpTov {
        User_spring uss=buying_service.get_Phone(us.getPhone());
       List<Zakaz_spring> list=  zakaz_service.show_orders_by_phone(uss);
       model.addAttribute("List",list);
        return "zakaz_page";
    }

}
