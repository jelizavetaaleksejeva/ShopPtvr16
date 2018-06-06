/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Product;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CreaterProduct {
    
    public Product create(){
        Product product= new Product();
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Добавление продукта ----");
        System.out.println("Название продукта :");
        product.setName(scanner.nextLine());
        System.out.println("Цена: ");
        String priceStr = scanner.nextLine();
        Integer price = new Integer(priceStr);
        product.setPrice(price);
        System.out.println("Количество:");
        String countStr = scanner.nextLine();
        Integer count = new Integer(countStr);
        product.setCount(count);
        
        return product;
    }
    
}


