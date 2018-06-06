/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author pupil
 */
public class Customer implements Serializable {
    private String name;
    private String surname;
    private String city;
    private Integer cash;
    

    public Customer() {
    }

    public Customer(String name, String surname, String city, Integer cash) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.cash = cash;
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
     public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", surname=" + surname + ", city="+ city+" cash=" + cash + '}';
    }

}