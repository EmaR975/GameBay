/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author truon
 */
public class CartController { 
    private CartView view;
    private CartModel model;
    
    public CartController(CartView cartView, CartModel cartMode){
        this.view = view;
        this.model = model;
        
        this.view.homeActionListener(new homeListener());
        this.view.checkoutActionListener(new checkoutListener());
    }
    
    class homeListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent homepage) {
            System.out.println("hi");
        }
    }
    class checkoutListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent checkout) {
            //checkoutController.main();
        }
    }
    
}
