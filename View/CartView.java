/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import Model.Cart;
import Controller.CartController;
import Main.Product;

/**
 *
 * @author Muaaz
 */
public class CartView {

    public CartView(JFrame frame, Cart cart) {
        this.cart = cart;
        this.cartController = new CartController(cart);
        this.homeFrame = frame;
    }

    public void showCartView() {

        JFrame cartFrame = new JFrame("Shopping Cart");
        JButton homeButton = new JButton("Home");
        JButton checkoutButton = new JButton("Checkout");
        JToolBar keys = new JToolBar();
        JButton[] removeButton = new JButton[cart.getProducts().size()];
        JPanel productPanel = new JPanel();
        productPanel.setLayout(new GridLayout(cart.getProducts().size() + 1, 2));

        for (int i = 0; i < cart.getProducts().size(); i++) {
            Product p = cart.getProducts().get(i);
            JLabel pLabel = new JLabel(p.productDetails());
            productPanel.add(pLabel);
            removeButton[i] = new JButton("Remove");
            productPanel.add(removeButton[i]);
        }
        JLabel priceLabel = new JLabel("Total Amount:" + cart.getPrice());
        productPanel.add(priceLabel);
//        for(Product p: cart.getProducts()) {
//                               
//            productPanel.add(pLabel);            
//        }

        keys.setPreferredSize(new Dimension(80, 50));
        keys.add(homeButton);
        keys.add(checkoutButton);
        keys.setFloatable(false);
        keys.setRollover(true);

        cartFrame.setLayout(new BorderLayout());
        cartFrame.add(keys, BorderLayout.NORTH);
        cartFrame.add(productPanel, BorderLayout.CENTER);
        cartFrame.setPreferredSize(new Dimension(1000, 600));

        cartController.goToHomepage(homeButton, cartFrame, homeFrame);
        cartController.removeProduct(removeButton, cart, cartFrame, homeFrame);
        cartController.goToCheckout(checkoutButton, cartFrame, cart);

        cartFrame.pack();
        cartFrame.setVisible(true);
        cartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

//    public static void main(String[] args) {
//        
//        CartView cV= new CartView();
//        cV.showCartView();
//        
//    }
    private CartController cartController;
    private Cart cart;
    private JFrame homeFrame;
}
