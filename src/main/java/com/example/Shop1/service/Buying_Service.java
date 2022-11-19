package com.example.Shop1.service;
import com.example.Shop1.Entity.Tovar_spring;
import com.example.Shop1.Entity.User_spring;
import com.example.Shop1.exceptions.ExcpTov;
import com.example.Shop1.repository.Tovar_Repo;
import com.example.Shop1.repository.User_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Buying_Service {
    @Autowired
    private User_Repo user_repo;

    public User_spring get_Phone(String number) throws  ExcpTov{
        try{
            return user_repo.findFirstByPhone(number);
        }
        catch (Exception e){
            return null;
        }
    }
    public ResponseEntity save(User_spring us){
        try {
            user_repo.save(us);
            return ResponseEntity.ok("Данные сохранены");
        }
        catch (Exception e){
           return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
