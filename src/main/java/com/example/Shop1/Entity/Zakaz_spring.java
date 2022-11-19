package com.example.Shop1.Entity;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Entity
public class Zakaz_spring {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name="id_tov")
    private Tovar_spring listTov;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User_spring users;
    private Date Datetime;

    public void setKol_vo(int kol_vo) {
        this.kol_vo = kol_vo;
    }

    public int getKol_vo() {
        return kol_vo;
    }

    private int kol_vo;

    public Zakaz_spring() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setListTov(Tovar_spring listTov) {
        this.listTov = listTov;
    }

    public void setUsers(User_spring users) {
        this.users = users;
    }

    public void setDatetime(Date datetime) {
        Datetime = datetime;
    }

    public long getId() {
        return id;
    }

    public Tovar_spring getListTov() {
        return listTov;
    }

    public User_spring getUsers() {
        return users;
    }

    public Date getDatetime() {
        return Datetime;
    }
}
