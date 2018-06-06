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
public class CreaterHistory {
        public History create(List<Product> products,List<Customer> customers){
        History history = new History();
        Scanner scanner = new Scanner(System.in);
        System.out.println("------Магазин ------");
        System.out.println("Покупатели: ");
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println(i+1+". "+customer.getName()+" "+customer.getSurname()+customer.getCash()+" ");
        }
        System.out.println("Список продуктов: ");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println(i+1+". "+product.getName()+". "+product.getPrice());
        }
        System.out.println("Выбери номер покупателя и продукт.");
        System.out.println("№ покупателя:");
        String numCustomer = scanner.nextLine();
        System.out.println("№ продукта:");
        String numProduct = scanner.nextLine();
        history.setProduct(products.get(new Integer(numProduct)-1));
        history.setCustomer(customers.get(new Integer(numCustomer)-1));
        Calendar c = new GregorianCalendar();
        history.setDateBegin(c.getTime());
        return history;
    }
}


