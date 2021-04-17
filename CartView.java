/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author truon
 */
public class CartView extends JFrame{       
    
    private JLabel title = new JLabel("Shopping Cart", SwingConstants.LEFT);
    private JButton home = new JButton("Homepage");
    private JButton checkout = new JButton("Check out");
    private JButton remove = new JButton("Remove item");
    
    CartView(){          
        JPanel cartPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(600, 200);	
        this.setLayout(new GridLayout(1, 1));
        cartPanel.add(title);
        cartPanel.add(home);
        cartPanel.add(checkout);      
        
        this.add(cartPanel);
    }
    public void homeActionListener(ActionListener listenHomeButton){
        home.addActionListener(listenHomeButton);
    }
    public void checkoutActionListener(ActionListener listenCheckoutButton){
        checkout.addActionListener(listenCheckoutButton);
    }
    
    public static void main(String[] args){
        CartView cv = new CartView();
        cv.setVisible(true);
    }
}  
