package com.databasetests.database.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    private int idAccount;

    private int Idacces;
    private int idEmployee;

    public Account(){}
}
