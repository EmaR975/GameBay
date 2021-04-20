/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import Model.Checkout;
import Model.Cart;
import Controller.CheckoutController;

/**
 *
 * @author Muaaz
 */
public class CheckoutView {

    public CheckoutView(Cart cart) {
        this.checkout = checkout;
        this.cart = cart;
        this.checkoutController = new CheckoutController(checkout, cart);
    }

    public void showCheckoutView() {
        JFrame frame = new JFrame("Checkout");
        JTextField nameField = new JTextField();
        JTextField cardNumber = new JTextField();
        JTextField address = new JTextField();
        JTextField email = new JTextField();
        JTextField contactInfo = new JTextField();
        JLabel label1 = new JLabel("Billing Details:");
        JLabel label2 = new JLabel("Name on the Card:");
        JLabel label3 = new JLabel("Card Number:");
        JLabel label4 = new JLabel("Billing Address:");
        JLabel label5 = new JLabel("Cellphone Number:");
        JLabel label6 = new JLabel("Email Address:");

        JButton btn = new JButton("Confirm Payment");

        JPanel fieldPanels = new JPanel();
        fieldPanels.setLayout(new GridLayout(5, 2));
        fieldPanels.add(label2);
        fieldPanels.add(nameField);
        fieldPanels.add(label3);
        fieldPanels.add(cardNumber);
        fieldPanels.add(label4);
        fieldPanels.add(address);
        fieldPanels.add(label5);
        fieldPanels.add(contactInfo);
        fieldPanels.add(label6);
        fieldPanels.add(email);
        checkoutController.confirmOrder(btn, cart, nameField, cardNumber, address, contactInfo, email, frame);
        frame.setLayout(new BorderLayout());
        frame.add(label1, BorderLayout.NORTH);
        frame.add(fieldPanels, BorderLayout.CENTER);
        frame.add(btn, BorderLayout.SOUTH);
        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
//    public static void main(String[] args) {
//        CheckoutView cv= new CheckoutView(cart);
//        cv.showCheckoutView();
//    }

    private Checkout checkout = new Checkout();
    private CheckoutController checkoutController;
    private Cart cart;
}
