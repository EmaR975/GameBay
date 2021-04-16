/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Emily Rojas
 */
public class RevenueView extends JFrame{
    
    public RevenueView(){
        JPanel revPanel = new JPanel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        
        //title.setBounds(130,100,100, 40);
        revPanel.add(title);
        homeButton.setBounds(130,100,100, 40);
        revPanel.add(homeButton);
        
        
        //costLabel.setBounds(100, 10, 50, 30);
        revPanel.add(costLabel);
        //totalCost.setBounds(100, 60, 50, 30);
        revPanel.add(totalCost);
        
        //revenueLabel.setBounds(140, 10, 50, 30);
        revPanel.add(revenueLabel);
        //totalRevenue.setBounds(140, 50, 50, 30);
        revPanel.add(totalRevenue);
        
        //profitLabel.setBounds(180, 10, 50, 30);
        revPanel.add(profitLabel);
        //totalProfit.setBounds(180, 50, 50, 30);
        revPanel.add(totalProfit);
        
        this.add(revPanel);
    }
    
    public void setCost(double cost){
        totalCost.setText(Double.toString(cost));
    }
    
    public void setRevenue(double revenue){
        totalRevenue.setText(Double.toString(revenue));
    }
    
    public void setProfit(double profit){
        totalProfit.setText(Double.toString(profit));
    }
    
    public void homeActionListener(ActionListener listenHomeButton){
        homeButton.addActionListener(listenHomeButton);
    }
    
    
    private JLabel costLabel = new JLabel("Cost: ");
    private JLabel revenueLabel = new JLabel("Revenue: ");
    private JLabel profitLabel = new JLabel("Profit: ");
    private JLabel title = new JLabel("Seller's Revenue");
    private JButton homeButton = new JButton("Home");
    private JTextField totalCost = new JTextField(10);
    private JTextField totalRevenue = new JTextField(10);
    private JTextField totalProfit = new JTextField(10);
    
    
}
