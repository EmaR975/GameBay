/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.*;
import java.util.ArrayList;
import Model.Seller;

/**
 *
 * @author Muaaz
 */

public class Inventory {

    public Inventory(List<Product> products) {
        this.products = products;
    }
    public Inventory() {
        Product p = new Product(5689, "Fortnite", 3, 40.0, 70.0);
        this.products.add(p);
        this.amount = 1;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    
    public void addProduct(int i, String n, int q, double ip, double s){
        
        Product l = new Product(i, n , q, ip, s);
        this.products.add(l);
        this.amount++;
        /*for (int i = 1; i <= 10; i++) {
            Product p = new Product(i, "Fortnite" + i, i, 40.0, 70.0);
            this.products.add(p);
        }*/    
    }
    
    public void updateInventory(int quantity){
        
    }
    
    private int amount;
    private List<Product> products= new ArrayList<>();
}