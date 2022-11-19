package com.example.Shop1.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category_spring {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Name;

    public Category_spring() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }
}
