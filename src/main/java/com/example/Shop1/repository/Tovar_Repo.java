package com.example.Shop1.repository;

import com.example.Shop1.Entity.Tovar_spring;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Tovar_Repo  extends CrudRepository<Tovar_spring,Long> {


    /*Tovar_spring findAllByName(String name);*/
    List<Tovar_spring> findAll();
    Tovar_spring findById(long id);
}
