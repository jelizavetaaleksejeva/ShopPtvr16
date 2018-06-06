/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Customer;
import entity.History;
import entity.Product;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class BuyerProduct {

        public History create(List<Product> products,List<Customer> customers){
        History history = new History();
        Scanner scanner = new Scanner(System.in);
        System.out.println("------Магазин ------");
        System.out.println("Покупатели: ");
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println(i+1+". "+customer.getName()+". "+customer.getSurname()+" Город -"+customer.getCity()+" Количество денег у покупаетля "+customer.getCash());
        }
        System.out.println("Список продуктов: ");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println(i+1+". "+product.getName()+" Цена "+product.getPrice()+" Количество "+product.getCount());
        }
        System.out.println("Выбери номер покупателя и продукт.");
        System.out.println("№ покупателя:");
        String numCustomer = scanner.nextLine();
        System.out.println("№ продукта:");
        String numProduct = scanner.nextLine();
        
        
  
        System.out.println("Количество : ");
        Integer countProduct = scanner.nextInt();
        history.setProduct(products.get(new Integer(numProduct)-1));
        history.setCount(countProduct);
        Product product = products.get(new Integer(numProduct)-1);
        product.setCount(product.getCount()- countProduct);
        history.setProduct(product);
        
        String cashCustomer = scanner.nextLine();
        history.setCustomer(customers.get(new Integer(numCustomer)-1));
        Customer customer = customers.get(new Integer(numProduct)-1);
        customer.setCash(customer.getCash()- product.getPrice() * countProduct);
        history.setCustomer(customer);
        
              
        Calendar c = new GregorianCalendar();
        history.setDateBegin(c.getTime());

        return history;
    }

 

 
    }