/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import javax.swing.*;
import Model.Customer;
import Controller.CustomerController;

/**
 *
 * @author Muaaz
 */
public class CustomerView {

    public CustomerView() {
        this.customer = new Customer();
        this.customerController = new CustomerController(customer);
    }

    public void showCustomerView() {
        JFrame frame = new JFrame("Customer Homepage");
        JTextField searchField = new JTextField();
        JButton searchButton = new JButton("Search");
        JToolBar keys = new JToolBar();
        JButton cartButton = new JButton("Cart");
        JButton checkoutButton = new JButton("Checkout");
        JPanel searchPanel = new JPanel();

        searchPanel.setLayout(new GridLayout(1, 2));
        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        JPanel searchKeysPanel = new JPanel();
        searchKeysPanel.setLayout(new GridLayout(2, 1));
        searchKeysPanel.add(keys);
        searchKeysPanel.add(searchPanel);

        JPanel productPanel = new JPanel();
        productPanel.setLayout(new GridLayout(20, 2));

        keys.setPreferredSize(new Dimension(80, 50));
        keys.add(cartButton);
        keys.add(checkoutButton);
        keys.setFloatable(false);
        keys.setRollover(true);

        frame.setLayout(new BorderLayout());
        frame.add(searchKeysPanel, BorderLayout.NORTH);
        frame.add(productPanel, BorderLayout.CENTER);
        frame.setPreferredSize(new Dimension(1000, 600));

        customerController.searchProduct(searchButton, searchField, frame, productPanel);
        customerController.getCartInfo(cartButton, frame);
        customerController.getCheckoutInfo(checkoutButton, frame);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        CustomerView cv = new CustomerView();
        cv.showCustomerView();
    }
    private Customer customer;
    private CustomerController customerController;

}
