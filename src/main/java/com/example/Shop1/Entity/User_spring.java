package com.example.Shop1.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User_spring {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_user;
    private String name;
    private String city;
    private String phone;

    public User_spring() {
    }

    public long getId() {
        return id_user;
    }

    public long getId_user() {
        return id_user;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
