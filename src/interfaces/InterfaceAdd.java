/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Customer;
import entity.History;
import entity.Product;
import java.util.List;


/**
 *
 * @author pupil
 */
public interface InterfaceAdd {
    public Product addProduct();
    public Customer addCustomer();
    public History buyerProduct(List<Product> products, List<Customer>customers);

}
