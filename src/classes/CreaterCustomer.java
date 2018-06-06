/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Customer;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CreaterCustomer {
    public Customer create(){
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Добавляем покупателя-----");
        System.out.println("Имя: ");
        customer.setName(scanner.nextLine());
        System.out.println("Фамилия: ");
        customer.setSurname(scanner.nextLine());
        System.out.println("Город: ");
        customer.setCity(scanner.nextLine());
        System.out.println("КЭШ: ");
        String cashStr = scanner.nextLine();
        Integer cash = new Integer(cashStr);
        customer.setCash(cash);
        return customer;
        
    }
}
