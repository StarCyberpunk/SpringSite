package com.example.Shop1.service;

import com.example.Shop1.Entity.Tovar_spring;
import com.example.Shop1.exceptions.ExcpTov;
import com.example.Shop1.repository.Tovar_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Tovar_Service {
    @Autowired
    private Tovar_Repo tovar_repo;

    public List<Tovar_spring> get_List() throws  ExcpTov{
        try{
            return tovar_repo.findAll();
        }
        catch (Exception e){
            throw  new ExcpTov("Dont have");
        }
    }

    public Tovar_spring get_byId(long id_tov) throws ExcpTov{
        Tovar_spring k= tovar_repo.findById(id_tov);
        if (k == null) {
            throw new ExcpTov("Yt");
        }
        return k;

    }
}
