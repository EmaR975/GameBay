package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 *
 * @author Emily Rojas
 */
public class AddGameView extends JFrame{
    
    public AddGameView(){
        JPanel aGamePanel = new JPanel();
        JPanel comp = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        
        comp.setLayout(new BorderLayout());
        aGamePanel.setLayout(new GridLayout(0, 2));
        title.setFont(new Font("Serif", Font.BOLD, 25));
        
        comp.add(title, BorderLayout.NORTH);
        aGamePanel.add(idLabel);
        aGamePanel.add(id);
        
        aGamePanel.add(nameLabel);
        aGamePanel.add(name);
        
        aGamePanel.add(quantityLabel);
        aGamePanel.add(quantity);
        
        aGamePanel.add(invoiceLabel);
        aGamePanel.add(invoicePrice);
        
        aGamePanel.add(sellingLabel);
        aGamePanel.add(sellingPrice);
        
        comp.add(aGamePanel, BorderLayout.CENTER);
        comp.add(submit, BorderLayout.PAGE_END);
        
        this.add(comp);   
    }
    
    public void submitButton(ActionListener listenSubmitButton){
        submit.addActionListener(listenSubmitButton);
    }
    
    public int getID(){
        return Integer.parseInt(id.getText());
    }
    
    public String getName(){
        return name.getText();
    }
    
    public int getQuantity(){
        return Integer.parseInt(quantity.getText());
    }
    
    public double getInvoice(){
        return Double.parseDouble(invoicePrice.getText());
    }
    
    public double getSelling(){
        return Double.parseDouble(sellingPrice.getText());
    }
    
    public void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
    
    private JLabel title = new JLabel("Add Game");
    private JButton submit = new JButton("Submit");
    private JTextField id = new JTextField(10);
    private JLabel idLabel = new JLabel("ID");
    private JTextField name = new JTextField(10);
    private JLabel nameLabel = new JLabel("Name");
    private JTextField quantity = new JTextField(10);
    private JLabel quantityLabel = new JLabel("Quantity");
    private JTextField invoicePrice = new JTextField(10);
    private JLabel invoiceLabel = new JLabel("Invoice Price");
    private JTextField sellingPrice = new JTextField(10);
    private JLabel sellingLabel = new JLabel("Selling Price");
    
}
