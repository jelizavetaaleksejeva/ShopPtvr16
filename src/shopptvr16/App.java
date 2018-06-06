/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopptvr16;

import classes.Profit;
import classes.StatisticalBuyerCounter;
import entity.Customer;
import entity.History;
import entity.Product;
import interfaces.InterfaceAdd;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    public List<Product> products = new ArrayList<>();
    public List<Customer> customers = new ArrayList<>();
    public List<History> histories = new ArrayList<>();
    public InterfaceAdd insertData = new ShopAdded();
    public StatisticalBuyerCounter statisticalBuyerCounter = new StatisticalBuyerCounter();
    public Profit profit = new Profit();
   
   public SaveToFile saveToFile;

    public App() {
        this.saveToFile = new SaveToFile() {};
        this.products=saveToFile.loadProducts();
        this.customers = saveToFile.loadCustomers();
        this.histories = saveToFile.loadHistories();
    }
    



    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Наш магазин----------");
        String repeat = "r";
        do{
            System.out.println("Выберите нужное действие:");
            System.out.println("0 - для выхода из программы");
            System.out.println("1 - для добавления продукта");
            System.out.println("2 - для добавления покупателя");
            System.out.println("3 - для покупки");
            System.out.println("4 - доход магазина");
            System.out.println("5 - статистика покупок");
            String action = scanner.next();

            switch (action) {
                case "0":
                    repeat = "n";
                    break;
                case "1":
                    this.products.add(insertData.addProduct());
                    saveToFile.saveProducts(products);
                    System.out.println("Продукт добавлен!");
                    break;
                case "2":
                    this.customers.add(insertData.addCustomer());
                     saveToFile.saveCustomers(customers);
                   
                    System.out.println("Покупатель добавлен!");
                    break; 
                case "3":
                    this.histories.add(insertData.buyerProduct(products,customers));
                     saveToFile.saveHistories(histories);
                    System.out.println("Продукт выдан покупателю");
                    break;
                case "4":
                    System.out.println("Доход магазина: "+profit.getProfit(histories));
                    break;
                  case "5":
                    System.out.println("Статистика покупок: ");
                    statisticalBuyerCounter.customersOfCities(customers);
                    break;

                default:
                    System.out.println("Выберите действие из списка!");
                    System.out.println("----------------------------");
                    repeat="r";
            }
        
        }while("r".equals(repeat));
    }
    
}


