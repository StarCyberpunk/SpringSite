package com.example.Shop1.Entity;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tovar_spring {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_tov;
    private String name;
    private String price;
    private String img;
    private int count;

    private String Opisanie;
private String Harakter;
    @OneToOne
    private Category_spring category_springs;

    public void setCount(int count) {
        this.count = count;
    }



    public int getCount() {
        return count;
    }

    public void setOpisanie(String opisanie) {
        Opisanie = opisanie;
    }

    public void setHarakter(String harakter) {
        Harakter = harakter;
    }

    public String getOpisanie() {
        return Opisanie;
    }

    public String getHarakter() {
        return Harakter;
    }

    @OneToOne
    private Postavshik_spring postavshik_springs;
    @OneToOne
    private Izgotovitel_spring izgotovitel_springs;

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public String getImg() {
        return img;
    }

    public void setCategory_springs(Category_spring category_springs) {
        this.category_springs = category_springs;
    }

    public void setPostavshik_springs(Postavshik_spring postavshik_springs) {
        this.postavshik_springs = postavshik_springs;
    }

    public void setIzgotovitel_springs(Izgotovitel_spring izgotovitel_springs) {
        this.izgotovitel_springs = izgotovitel_springs;
    }

    public Category_spring getCategory_springs() {
        return category_springs;
    }

    public Postavshik_spring getPostavshik_springs() {
        return postavshik_springs;
    }

    public Izgotovitel_spring getIzgotovitel_springs() {
        return izgotovitel_springs;
    }

    public void setImg(String img) {
        this.img = img;
    }






    public Tovar_spring() {

    }

    public long getId() {
        return id_tov;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id_tov = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
