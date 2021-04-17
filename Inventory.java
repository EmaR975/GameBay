
import java.util.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Muaaz
 */
public class Inventory {

    public Inventory(List<Product> products) {
        this.products = products;
    }
    public Inventory() {
        
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    
    public void addProduct() {
        
        for (int i = 1; i <= 10; i++) {
            Product p = new Product(i, "Fortnite" + i, i, 40.0, 70.0);
            this.products.add(p);
        }        
    }
    
    private List<Product> products= new ArrayList<>();
}
