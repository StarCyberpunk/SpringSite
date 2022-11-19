package com.example.Shop1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class Main_page {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    /*@GetMapping("/")*/
    public String getUsers(){

        return "main_page";
    }
}

