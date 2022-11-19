package com.example.Shop1.controller;
import com.example.Shop1.Entity.Tovar_spring;
import com.example.Shop1.exceptions.ExcpTov;
import com.example.Shop1.repository.Tovar_Repo;
import com.example.Shop1.service.Tovar_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/tovars")
public class Tovar {
    @Autowired
    public Tovar_Service tovar_service;
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
    @GetMapping("/test2")
    public ResponseEntity getFromid() throws ExcpTov {
        try {
            long m=1;
            Tovar_spring z= tovar_service.get_byId(m);
            return ResponseEntity.ok(z.getName());
        }catch (ExcpTov e){
            return  ResponseEntity.badRequest().body(e.getMessage());
        }
        catch (Exception e){
            return  ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
