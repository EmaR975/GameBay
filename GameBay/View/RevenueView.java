package View;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Emily Rojas
 */
public class RevenueView extends JFrame{
    
    public RevenueView(){
        JPanel titlePanel = new JPanel();
        JPanel revPanel = new JPanel();
        JPanel compPanel = new JPanel();
        
        compPanel.setLayout(new BorderLayout());
       
        title.setFont(new Font("Serif", Font.BOLD, 25));
        titlePanel.add(title);
        titlePanel.add(homeButton);
        
        compPanel.add(titlePanel, BorderLayout.NORTH);
        
        revPanel.add(costLabel);
        revPanel.add(totalCost);
        
        revPanel.add(revenueLabel);
        revPanel.add(totalRevenue);
        
        revPanel.add(profitLabel);
        revPanel.add(totalProfit);
        
        compPanel.add(revPanel, BorderLayout.CENTER);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,400);
        this.getContentPane().add(compPanel);
        
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
