package com.example.Shop1.service;
import com.example.Shop1.Entity.Tovar_spring;
import com.example.Shop1.Entity.User_spring;
import com.example.Shop1.Entity.Zakaz_spring;
import com.example.Shop1.repository.User_Repo;
import com.example.Shop1.repository.Zakaz_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class Zakaz_Service {
    @Autowired
    private Zakaz_Repo zakaz_repo;
    public ResponseEntity add_order(User_spring us, Tovar_spring ts){
        Zakaz_spring zs=new Zakaz_spring();
        zs.setId(new Random().nextLong());
        zs.setDatetime(new Date());
        zs.setKol_vo(1);
        zs.setUsers(us);
        zs.setListTov(ts);
        try {
            zakaz_repo.save(zs);
            return ResponseEntity.ok("Заказ оформлен");
        }catch (Exception e){
            return  ResponseEntity.badRequest().body(e.getMessage());
        }


    }
    public List<Zakaz_spring> show_orders_by_phone(User_spring us){

          return zakaz_repo.findAllByUsers(us);


    }
}
