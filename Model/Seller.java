/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Main.Inventory;
import Main.Product;

/**
 *
 * @author Emily Rojas
 */
public class Seller{
    
    //functions for seller
    public Seller(Product product){
        this.product = product;
    }
    
    public Seller(){
        costs = 30;
        revenue = 70;
    }
    
    public Product getProduct() {
        return product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    

    //functions for revenue
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
    
    
    private double costs;
    private double revenue;
    private double profit;
    private Product product=null;
    
}
