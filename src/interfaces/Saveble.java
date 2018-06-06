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
public interface Saveble {
    public void saveHistories(List<History> histories);
    public void saveCustomers(List<Customer> customers);
    public void saveProducts(List<Product> products);
    
    public List<History> loadHistories();
    public List<Customer> loadCustomers();
    public List<Product> loadProducts();
    
}

