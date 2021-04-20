/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import Model.Cart;
import Main.Product;
import View.CustomerView;
import View.CheckoutView;
/**
 *
 * @author Muaaz
 */
public class CartController {

    public CartController(Cart cart) {
        this.cart = cart;

    }

//    public void addToCart(Product p) {
//       List<Product> products= cart.getProducts();
//       products.add(p);
//       cart.setProducts(products);
//    }
    public void goToHomepage(JButton btn, JFrame cartFrame, JFrame homeFrame) {
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                cartFrame.setVisible(false);
                homeFrame.setVisible(true);
            }
        });
    }

    public void removeProduct(JButton[] remove, Cart cart, JFrame cartFrame, JFrame homeFrame) {
        List<Product> products = new ArrayList<Product>(cart.getProducts());
        for (int i = 0; i < cart.getProducts().size(); i++) {
            
            remove[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    
                    products.remove(p);
                    cart.setProducts(products);                    
                    cartFrame.setVisible(false);
                    homeFrame.setVisible(true);
                    double tempPrice = cart.getPrice();
                    cart.setPrice(tempPrice - p.getSellingPrice());
                    cart.setProducts(products);

                }
            });
            p = products.get(i);
        }
    }

    public void goToCheckout(JButton btn, JFrame cartFrame, Cart cart) {
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                cartFrame.setVisible(false);
                checkoutView = new CheckoutView(cart);
                checkoutView.showCheckoutView();
            }
        });
    }

    private Product p;
    private Cart cart;
    private CustomerView customerView;
    private CheckoutView checkoutView;
}
