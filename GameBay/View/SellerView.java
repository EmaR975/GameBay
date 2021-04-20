package View;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Emily Rojas
 */
public class SellerView extends JFrame{
    public SellerView(){
        JPanel titlePanel = new JPanel();
            
        
        compPanel.setLayout(new BorderLayout());
        
        title.setFont(new Font("Serif", Font.BOLD, 25));
        
        titlePanel.add(title);
        titlePanel.add(addGameButton);
        titlePanel.add(revenueButton);
        
        compPanel.add(titlePanel, BorderLayout.NORTH);
        compPanel.add(partPanel, BorderLayout.CENTER);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.add(compPanel);
        
    }
    
    public void amountofProducts(int aProd){
        amountProducts = aProd;
    }
    
    public void setProduct(String ID){
        product.setText(ID);
    }
    
    public void setProductInfo(String productInfos){
        productInfo.setText(productInfos);
    }
    
    public void setGameNum(int gameNumber){
        gameNum.setText(Integer.toString(gameNumber));
    }
    
    public int getNewNumber(){
        return Integer.parseInt(gameNum.getText());
    }
    
    public void addGameActionListener(ActionListener listenAddGame){
        addGameButton.addActionListener(listenAddGame);
    }
    
    public void revenueButtonActionListener(ActionListener listenRev){
        revenueButton.addActionListener(listenRev);
    }
    
    public void saveChangesActionListener(ActionListener listenSave){
        saveChangeButton.addActionListener(listenSave);
    }
    
    public void addProducts(){
        JPanel prodPanel = new JPanel();
        prodPanel.setLayout(new GridLayout(0,1));
        prodPanel.setBackground(Color.white);
        product.setFont(new Font("Serif", Font.BOLD, 15));
        prodPanel.add(product);
        prodPanel.add(productInfo);
        prodPanel.add(numGames);
        prodPanel.add(gameNum);
        prodPanel.add(saveChangeButton);
        partPanel.add(prodPanel);
    }
    
    private JPanel partPanel = new JPanel();
    private JPanel compPanel = new JPanel();
    private int amountProducts;
    private JLabel title = new JLabel("Seller's HomePage ");
    private JButton addGameButton = new JButton("Add Game");
    private JButton revenueButton = new JButton("Revenue");
    private JLabel product = new JLabel();
    private JLabel productInfo = new JLabel();
    private JLabel numGames = new JLabel("# of Games:");
    private JTextField gameNum = new JTextField(10);
    private JButton saveChangeButton = new JButton("Save Changes");
    
    
}

