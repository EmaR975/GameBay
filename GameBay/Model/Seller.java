/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Emily Rojas
 */
public class Seller{
    
    public void findProfit(){
        profit = revenue - costs;
    }
    
    public double getProfit(){
        return profit;
    }
    
    public void updateCost(double invoicePrice){
        costs = costs + invoicePrice;
    }
    
    public double getCost(){
        return costs;
    }
    
    public void updateRevenue(double sellPrice){
        revenue = revenue + sellPrice;
    }
    
    public double getRevenue(){
        return revenue;
    }
    
    private double costs=1;
    private double revenue=3;
    private double profit;
    
}

