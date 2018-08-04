package com.databasetests.database.entity;

import javax.persistence.*;

@Entity
@NamedQuery(name="find_all_employee", query="select e from Employee e")
public class Employee {
    @Id
    @GeneratedValue
    private int idEmployee;


    private String name;
    private String surname;
    private String login;
    private String password;
    private int seed;

    public Employee() {}

    public Employee(String name, String surname, String login, String password, int seed) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.seed = seed;
    }

    public Employee(int idEmployee, String name, String surname, String login, String password, int seed) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.seed = seed;
    }


    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSeed() {
        return seed;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", seed=" + seed +
                '}';
    }
}
