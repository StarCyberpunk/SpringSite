package com.example.Shop1.repository;

import com.example.Shop1.Entity.User_spring;
import com.example.Shop1.Entity.Zakaz_spring;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface User_Repo  extends CrudRepository<User_spring,Long> {
   /* User_spring findById(long id);*/
    User_spring findFirstByPhone(String number);
    /*ResponseEntity SaveNewUser(User_spring us);*/
}
