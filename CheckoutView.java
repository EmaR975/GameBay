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
public class CheckoutView extends JFrame{
    private JLabel title = new JLabel("CHECK OUT", SwingConstants.CENTER);
    private JButton addressButton = new JButton("Add your shipping address");
    private JButton billingButton = new JButton("Payment method");
    private JButton reviewButton = new JButton("Review items");
    private JButton orderButton = new JButton("Place your order");
    
    private JLabel aLabel = new JLabel("Please enter your shipping address information");
    private JLabel nameLabel = new JLabel("Full name ");
    private JTextField aName = new JTextField();
    private JLabel addressLabel = new JLabel("Address ");
    private JTextField address = new JTextField();
    private JButton submitButton = new JButton("Submit");
    
    private JLabel bLabel = new JLabel("Add a credit or debit card");
    private JLabel cardNumLabel = new JLabel("Card Number ");
    private JTextField cardNumber = new JTextField();
    private JLabel cardNameLabel = new JLabel("Name on card ");
    private JTextField cardName = new JTextField();
    private JLabel cardExLabel = new JLabel("Expiration date ");
    private JTextField cardExp = new JTextField();
    private JLabel cardSecLabel = new JLabel("Security code (CVV)");
    private JTextField cardSec = new JTextField();
    //private JButton submitButton = new JButton("Submit");
    
    
    public void showCheckoutView(){
        JPanel checkoutPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(500, 300);
        checkoutPanel.setLayout(new GridLayout(5, 1));
        title.setFont(new Font("Serif", Font.BOLD, 25));
        checkoutPanel.add(title);
        checkoutPanel.add(addressButton);
        checkoutPanel.add(billingButton);
        checkoutPanel.add(reviewButton);
        checkoutPanel.add(orderButton);
        this.add(checkoutPanel);
        this.setVisible(true);
    }
    public void showAddressView(){
        
        JPanel aPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(500, 300);
        aPanel.setLayout(new GridLayout(0,1));  
        aLabel.setFont(new Font("Serif", Font.BOLD, 25));
        aPanel.add(aLabel);
        aPanel.add(nameLabel);
        aPanel.add(aName);
        aPanel.add(addressLabel);
        aPanel.add(address);
        aPanel.add(submitButton);
        this.add(aPanel);
        
        this.setVisible(true);        
    }
    
    public void showBillingView(){
        JPanel cPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(600, 300);
        cPanel.setLayout(new GridLayout(0,1));
        bLabel.setFont(new Font("Serif", Font.BOLD, 25));
        cPanel.add(bLabel);
        cPanel.add(cardNumLabel);
        cPanel.add(cardNumber);
        cPanel.add(cardNameLabel);
        cPanel.add(cardName);
        cPanel.add(cardExLabel);
        cPanel.add(cardExp);
        cPanel.add(cardSecLabel);
        cPanel.add(cardSec);
        cPanel.add(submitButton);
        this.add(cPanel);
        
        this.setVisible(true);  
    } 
    
    
    public static void main(String[] args){
        CheckoutView cv = new CheckoutView();
        cv.showCheckoutView();        
        //cv.showAddressView();
        //cv.showBillingView();
    }
    
}
