/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Customer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author pupil
 */
public class StatisticalBuyerCounter {
  public HashSet getListCities(List<Customer>customers){
     HashSet<String> cities = new HashSet();
      for (int i = 0; i < customers.size(); i++) {
          Customer customer = customers.get(i);
          cities.add(customer.getCity());
      }
     return cities;
  }
  public void customersOfCities(List<Customer>customers){
     HashSet<String> cities = this.getListCities(customers);
     String city = "";
      Iterator<String> iterator = cities.iterator();
    while (iterator.hasNext()) {
        city=iterator.next();
        System.out.println("Город "+city+":");
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if (city.equals(customer.getCity())){
                System.out.println(customer.getName()+" "+customer.getSurname());
            }
                   
        }
    }
  }
}
