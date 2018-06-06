/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopptvr16;



import entity.Product;

import entity.History;
import entity.Customer;
import interfaces.Saveble;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Melnikov
 */
public class SaveToFile implements Saveble{
    
    public void saveHistories(List<History> histories) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {    
            fos = new FileOutputStream("Histories.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(histories);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Не могу записать в файл", ex);
        }
    }

    public void saveCustomers(List<Customer> customers) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {    
            fos = new FileOutputStream("Customers.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(customers);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Не могу записать в файл", ex);
        }
    }

    public void saveProducts(List<Product> products) {
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {    
            fos = new FileOutputStream("Products.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Не могу записать в файл", ex);
        }
        
    }

    public List<History> loadHistories() {
        List<History> histories = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream oin = null;
        try {    
            fis = new FileInputStream("Histories.txt");
            oin = new ObjectInputStream(fis);
            histories = (List<History>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Не могу отрыть файл", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Не могу прочесть файл", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        return histories;
    }

    public List<Customer> loadCustomers() {
        List<Customer> customers = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream oin = null;
        try {    
            fis = new FileInputStream("Customers.txt");
            oin = new ObjectInputStream(fis);
            customers = (List<Customer>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Не могу отрыть файл", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Не могу прочесть файл", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        return customers;
    }

    public List<Product> loadProducts() {
        List<Product> products = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream oin = null;
        try {    
            fis = new FileInputStream("Products.txt");
            oin = new ObjectInputStream(fis);
            products = (List<Product>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Не могу отрыть файл", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Не могу прочесть файл", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        return products;
    }
    
}
