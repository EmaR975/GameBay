/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.Timer;
import Model.Checkout;
import Model.Cart;
import View.ConfirmationView;


/**
 *
 * @author Muaaz
 */
public class CheckoutController {

    public CheckoutController(Checkout checkout,Cart cart) {
        this.checkout = checkout;
        this.cart=cart;
       
    }
    
    public void confirmOrder(JButton btn,Cart cart, JTextField nameField,JTextField cardNumber,JTextField address,JTextField contactInfo,JTextField email, JFrame frame)  {
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                checkout.setName(nameField.getText());
                checkout.setCardNumber(cardNumber.getText());
                checkout.setBillingAddress(address.getText());
                checkout.setEmailAddress(email.getText());
                checkout.setContactInfo(contactInfo.getText()); 
                frame.setVisible(false);                
                confirmationView=new ConfirmationView(checkout,cart);
                confirmationView.showConfirmationView();        
            }
        });
    }
    private Checkout checkout;
    private ConfirmationView confirmationView;
    private Cart cart;
}
