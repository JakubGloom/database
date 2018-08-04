package com.databasetests.database.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Acess {
    @Id
    private int idAcess;

    private String type;

    public Acess(){}
    public Acess(int idAcess, String type) {
        this.idAcess = idAcess;
        this.type = type;
    }
    public Acess(String type) {
        this.type = type;
    }

    public int getIdAcess() {
        return idAcess;
    }

    public void setIdAcess(int idAcess) {
        this.idAcess = idAcess;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
