/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.History;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pupil
 */
public class Profit {
    public int getProfit(List<History> histories){
        int profit = 0;
        for (int i = 0; i < histories.size(); i++) {
            History history = histories.get(i);
            profit+=history.getProduct().getPrice()*history.getCount();
        }
        return profit;
    }
    
}
