package com.example.Shop1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/users")
public class Users {
    @GetMapping("/")
    public ResponseEntity getUsers(){
        try {
            return ResponseEntity.ok("Work");
        }catch (Exception e){
            return  ResponseEntity.badRequest().body("Error");
        }
    }
}
