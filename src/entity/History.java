/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author pupil
 */
public class History implements Serializable{
    private Product product;
    private Customer customer;
    private Date dateBegin;
    private Integer count;

    public History() {
    }

    public History(Product product, Customer customer, Date dateBegin, Integer count) {
        this.product = product;
        this.customer = customer;
        this.dateBegin = dateBegin;
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Dobuy{" + "product=" + product + ", customer=" + customer + ", dateBegin=" + dateBegin + ", count=" + count + '}';
    }

   
}
