/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopptvr16;

import classes.BuyerProduct;
import classes.CreaterCustomer;
import classes.CreaterProduct;
import entity.Customer;
import entity.History;
import entity.Product;
import interfaces.InterfaceAdd;
import java.util.List;



/**
 *
 * @author pupil
 */
public class ShopAdded implements InterfaceAdd {

    @Override
    public Product addProduct() {
        CreaterProduct createrProduct = new CreaterProduct();
        return createrProduct.create();
    }

    @Override
    public Customer addCustomer() {
       CreaterCustomer createrCustomer = new CreaterCustomer();
        return createrCustomer.create();
    }

    @Override
    public History buyerProduct(List<Product> products, List<Customer> customers) {
       BuyerProduct buyerProduct = new BuyerProduct();
        return buyerProduct.create(products, customers);
    }
 
}

