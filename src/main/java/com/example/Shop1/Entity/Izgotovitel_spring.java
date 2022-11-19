package com.example.Shop1.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Izgotovitel_spring {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Name_Izgot;

    public Izgotovitel_spring() {
    }

    public long getId() {
        return id;
    }

    public String getName_Izgot() {
        return Name_Izgot;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName_Izgot(String name_Izgot) {
        Name_Izgot = name_Izgot;
    }
}
