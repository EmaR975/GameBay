/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.Inventory;
import View.AddGameView;
import Controller.SellerController;
import java.util.List;
import Main.Product;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Emily Rojas
 */
public class AddGameController {
    public AddGameController(AddGameView view, Inventory model){
        this.view = view;
        this.model = model;
        
        this.view.submitButton(new submitListener());
        
    }
    
    class submitListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int i, q;
            double in,s;
            String n;
            try{
                i = view.getID();
                n = view.getName();
                q = view.getQuantity();
                in = view.getInvoice();
                s = view.getSelling();
                
                model.addProduct(i,n,q,in,s);
                
                view.setVisible(false);
                
                SellerController.main(new String[] {"main"});
            }
            catch(NumberFormatException ex){
                view.displayErrorMessage("Fields are empty. No changes made.");
                
                view.setVisible(false);
                
                SellerController.main(new String[] {"main"});
            }
            
        }
    }
    
    public static void main(String[] args){
        AddGameView view = new AddGameView();
        Inventory model = new Inventory();
        AddGameController controller = new AddGameController(view, model);
        
        view.setVisible(true);
    }
    
    private AddGameView view;
    private Inventory model;
}
