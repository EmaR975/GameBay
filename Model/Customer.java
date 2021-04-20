/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Main.Product;
/**
 *
 * @author Muaaz
 */
public class Customer {

    public Customer(Product product) {
        this.product = product;
    }

    public Customer() {
    }
    

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    
    private Product product=null;
}
