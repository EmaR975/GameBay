package Controller;


import Model.User;
import View.CustomerView;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muaaz
 */
public class UserController {

    public UserController(User user) {
        this.user = user;
    }
    
    public void loginHandler(JButton btn,JTextField[] tf, JCheckBox[] checkBox, JFrame frame) {
        
        
        btn.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            
            if(checkBox[0].isSelected()) {
            user.setUserType("Customer");
            
        }
        else if (checkBox[1].isSelected()) {
            user.setUserType("Seller");
        } 
        else if (checkBox[0].isSelected() && checkBox[1].isSelected()) {
            System.out.println("Please Check only one Box");
        }
        else {
            System.out.println("Please Check either Customer or Seller Box");
        }
            user.setUserName(tf[0].getText());
            user.setPassword(tf[1].getText());
            
            if(user.getUserName().equals("Muaaz") && user.getPassword().equals("1234") && user.getUserType().equals("Customer")) {
                customerView.showCustomerView();
                frame.setVisible(false);
                
            }
            else if (user.getUserName().equals("Emily") && user.getPassword().equals("1234") && user.getUserType().equals("Seller")){
                SellerController.main(new String[] {"main"});
                frame.setVisible(false);
            }
            else if (user.getUserName().equals("Truong") && user.getPassword().equals("1234") && user.getUserType().equals("Customer")) {
                customerView.showCustomerView();
                frame.setVisible(false);
                
            }
            else                
               JOptionPane.showMessageDialog(null, "Incorrect Username or Password or User Type.","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
//            
//           // JOptionPane.showMessageDialog(null, "Incorrect Username or Password or User Type.","Error", JOptionPane.ERROR_MESSAGE);
        );
    }
    
    private CustomerView customerView=new CustomerView();
    private User user;
    
}
