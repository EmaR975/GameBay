/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muaaz
 */
public class Product {

    public Product(int ID, String type, int quantity, double invoicePrice, double sellingPrice) {
        this.ID = ID;
        this.name = type;
        this.quantity = quantity;
        this.invoicePrice = invoicePrice;
        this.sellingPrice = sellingPrice;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getInvoicePrice() {
        return invoicePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setInvoicePrice(double invoicePrice) {
        this.invoicePrice = invoicePrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String toString() {
        return "Product{" + "ID=" + ID + ", name=" + name + ", quantity=" + quantity + ", invoicePrice=" + invoicePrice + ", sellingPrice=" + sellingPrice + '}';
    }
    public String productDetails () {
        return "Name: "+ name+" Price: $"+sellingPrice;
    }
   
    private int ID;
    private String name;
    private int quantity;
    private double invoicePrice;
    private double sellingPrice;
}
