
import java.awt.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muaaz
 */
public class CustomerView {
    public void showCustomerView() {
        JFrame frame= new JFrame("Customer Homepage");
        JTextField searchField= new JTextField();
        JButton searchButton= new JButton("Search");
        JToolBar keys= new JToolBar();
        JButton cartButton= new JButton("Cart");
        JButton checkoutButton= new JButton("Checkout");
        JPanel searchPanel= new JPanel();
        
        searchPanel.setLayout(new GridLayout(5,2));
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        
        keys.setPreferredSize(new Dimension(80,50));
        keys.add(cartButton);
        keys.add(checkoutButton);
       
        keys.setFloatable(false);
        keys.setRollover(true);
        
        frame.setLayout(new BorderLayout());
        frame.setPreferredSize(new Dimension(300,150));
        frame.add(keys,BorderLayout.NORTH);
        frame.add(searchPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    public static void main(String[] args) {
        CustomerView cv= new CustomerView();
        cv.showCustomerView();
    }
}
