
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muaaz
 */
public class CartView {

    public CartView(JFrame frame,Cart cart) {
        this.cart = cart;
        this.cartController=new CartController(cart);  
        this.frame=frame;
    }

   
    
    public void showCartView() {
        
        JFrame frame1= new JFrame("Shopping Cart");        
        JButton homeButton= new JButton("Home");
        JButton checkoutButton= new JButton("Checkout");
        JToolBar keys= new JToolBar();  
        JButton[] removeButton= new JButton[cart.getProducts().size()];
        JPanel productPanel= new JPanel();
        productPanel.setLayout(new GridLayout(cart.getProducts().size()+1,2));
        
        for(int i=0; i<cart.getProducts().size();i++) {
            Product p=cart.getProducts().get(i);
            JLabel pLabel=new JLabel(p.productDetails());
            productPanel.add(pLabel);            
            removeButton[i]=new JButton("Remove");
            productPanel.add(removeButton[i]);              
        }
        JLabel priceLabel=new JLabel("Total Amount:"+cart.getPrice());
        productPanel.add(priceLabel);
//        for(Product p: cart.getProducts()) {
//                               
//            productPanel.add(pLabel);            
//        }
        
        keys.setPreferredSize(new Dimension(80,50));
        keys.add(homeButton);
        keys.add(checkoutButton);
        keys.setFloatable(false);
        keys.setRollover(true);
        
        frame1.setLayout(new BorderLayout());       
        frame1.add(keys,BorderLayout.NORTH);
        frame1.add(productPanel, BorderLayout.CENTER);
        frame1.setPreferredSize(new Dimension(600,400));
        
        cartController.goToHomepage(homeButton, frame1,frame);
        //cartController.removeProduct(removeButton);
        frame1.pack();
        frame1.setVisible(true);
        
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }    
    
//    public static void main(String[] args) {
//        
//        CartView cV= new CartView();
//        cV.showCartView();
//        
//    }
    private CartController cartController;
    private Cart cart;   
    private JFrame frame;
}
