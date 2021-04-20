/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customer;
import Main.Inventory;
import Model.Cart;
import View.CartView;
import View.CheckoutView;
import Main.Product;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author Muaaz
 */
public class CustomerController {

    public CustomerController(Customer customer) {

        this.customer = customer;
        this.inventory = new Inventory();
//        inventory.addProduct();
        this.cart = new Cart();
    }

    public void searchProduct(JButton searchButton, JTextField textField, JFrame frame, JPanel productPanel) {

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                List<Product> listProducts = inventory.getProducts();
                for (Product p : listProducts) {
                    if (p.getName().equals(textField.getText())) {
                        customer.setProduct(p);
                    }
                }
                if (null != customer.getProduct()) {
                    JButton addToCartButton = new JButton("Add to Cart");
                    addToCart(addToCartButton);
                    JLabel pLabel = new JLabel(customer.getProduct().productDetails());
                    productPanel.add(pLabel);
                    productPanel.add(addToCartButton);
                    frame.add(productPanel);
                    frame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "No Product Found.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public void addToCart(JButton addToCartButton) {
        addToCartButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                products = cart.getProducts();
                products.add(customer.getProduct());
                double tempPrice = cart.getPrice();
                cart.setPrice(tempPrice + customer.getProduct().getSellingPrice());
                cart.setProducts(products);
            }
        });
    }

    public void getCartInfo(JButton cartButton, JFrame frame) {
        cartButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                cartView = new CartView(frame, cart);
                frame.setVisible(false);
                cartView.showCartView();
            }
        });
    }

    public void getCheckoutInfo(JButton checkoutButton, JFrame frame) {
        checkoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                checkoutView = new CheckoutView(cart);
                frame.setVisible(false);
                checkoutView.showCheckoutView();
            }
        });
    }

    private Customer customer;
    private Inventory inventory;
    private Cart cart;
    private CartView cartView;
    private CheckoutView checkoutView;
    private List<Product> products;

}
