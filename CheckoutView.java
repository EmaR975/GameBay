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
    private JLabel cardLabel = new JLabel("Name on the card");
    private JTextField cardName = new JTextField();
    private JLabel addressLabel = new JLabel("Shipping address");
    private JTextField address = new JTextField();
    private JLabel phoneLabel = new JLabel("Phone number");
    private JTextField phoneNum = new JTextField();
    private JLabel emailLabel = new JLabel("Email address");
    private JTextField email = new JTextField();
    private JButton confirmButton = new JButton("Confirm");      
    
    
    public void showCheckoutView(){
        JPanel checkoutPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(500, 300);
        checkoutPanel.setLayout(new GridLayout(0, 1));
        title.setFont(new Font("Serif", Font.BOLD, 25));
        checkoutPanel.add(title);
        checkoutPanel.add(cardLabel);
        checkoutPanel.add(cardName);
        checkoutPanel.add(addressLabel);
        checkoutPanel.add(address);
        checkoutPanel.add(phoneLabel);
        checkoutPanel.add(phoneNum);
        checkoutPanel.add(emailLabel);
        checkoutPanel.add(email);
        checkoutPanel.add(confirmButton);
        this.add(checkoutPanel);
        this.setVisible(true);
    }    
    
    void addConfirmListener(ActionListener listenForConfirmButton){
        confirmButton.addActionListener(listenForConfirmButton);	
    }
        
    
    public static void main(String[] args){
        CheckoutView cv = new CheckoutView();
        cv.showCheckoutView();        
        
    }
    
}
