package com.example.Shop1.repository;

import com.example.Shop1.Entity.User_spring;
import com.example.Shop1.Entity.Zakaz_spring;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;

import java.util.Collection;
import java.util.List;

public interface Zakaz_Repo  extends CrudRepository<Zakaz_spring,Long> {

    List<Zakaz_spring> findAllByUsers(User_spring user_spring);
}
