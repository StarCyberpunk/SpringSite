package com.example.Shop1.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Postavshik_spring {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String NameCompany;

    public Postavshik_spring() {
    }

    public long getId() {
        return id;
    }

    public String getNameCompany() {
        return NameCompany;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNameCompany(String nameCompany) {
        NameCompany = nameCompany;
    }
}
