/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muaaz
 */
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Emily Rojas
 */
public class UserView {

    public UserView(User user) {
        this.user = user;
        this.userController = new UserController(user);
    }

    
    public void showUserView() {
        
        JFrame frame = new JFrame("GameBay Login");
        JLabel label = new JLabel("Login Screen");
        
        JTextField name = new JTextField();
        JLabel userName = new JLabel("Username:");
        JTextField password = new JTextField();
        JLabel pwd = new JLabel("Password:");
        JCheckBox customer = new JCheckBox("Customer");
        JCheckBox seller = new JCheckBox("Seller");
        JButton login = new JButton("Log In");
        
        
        JPanel comp= new JPanel();
        comp.setLayout(new GridLayout(3,2));
        
        comp.add(userName);
        comp.add(name);
        comp.add(pwd);
        comp.add(password);
        comp.add(customer);
        comp.add(seller);
        
        JTextField[] tf= {name,password};
        JCheckBox[] cb= {customer, seller};
        
        userController.loginHandler(login, tf, cb);
        
        
        frame.setBackground(Color.BLUE);
        frame.setLayout(new BorderLayout());
        frame.setPreferredSize(new Dimension(300,150));
        frame.add(comp,BorderLayout.CENTER);
        frame.add(login,BorderLayout.SOUTH);
        
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    public static void main(String[] args) {
     
        User user= new User("Muaaz","1234","Customer");
        UserView uV= new UserView(user);
        uV.showUserView();
    }

    private User user;
    private UserController userController;
}
