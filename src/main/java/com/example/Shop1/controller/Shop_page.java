package com.example.Shop1.controller;
import com.example.Shop1.Entity.Tovar_spring;
import com.example.Shop1.exceptions.ExcpTov;
import com.example.Shop1.service.Tovar_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller

public class Shop_page {
    @Autowired
    public Tovar_Service tovar_service;


    @RequestMapping(value = "/shop",method = RequestMethod.GET)

    /*@GetMapping("/")*/
    public String init(Model model) throws ExcpTov {
        try {
            List<Tovar_spring> list=tovar_service.get_List();
            model.addAttribute("ListTov",list);
        }catch (ExcpTov e){

    }

        return "shop_page";
    }

    @GetMapping("/test")

    public ResponseEntity getTovar() throws ExcpTov {
        try {
            List<Tovar_spring> z= tovar_service.get_List();
            return ResponseEntity.ok(z.get(2).getName());
        }catch (ExcpTov e){
            return  ResponseEntity.badRequest().body(e.getMessage());
        }
        catch (Exception e){
            return  ResponseEntity.badRequest().body(e.getMessage());
        }
    }


}
