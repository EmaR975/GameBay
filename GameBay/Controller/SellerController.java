package Controller;

import Main.Inventory;
import Model.Seller;
import Main.Product;
import View.SellerView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author Emily Rojas
 */
public class SellerController {
    SellerController(SellerView view, Seller model){
        this.view = view;
        this.model = model;
        this.inventory = new Inventory();
        
        List<Product> listProducts = inventory.getProducts();
        
        for (Product p : listProducts){
            model.setProduct(p);
            this.view.setProductInfo(this.model.getProduct().toString());
            this.view.setProduct(this.model.getProduct().productName());
            this.view.setGameNum(this.model.getProduct().productQuantity());
            this.view.addProducts();
            
        }
        
        this.view.addGameActionListener(new AddGameListener());
        this.view.revenueButtonActionListener(new RevenueListener());
        this.view.saveChangesActionListener(new SaveChangesListener());
    }
    
    class AddGameListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            AddGameController.main(new String[] {"main"});
        }
        
    }
    
    class RevenueListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            RevenueController.main(new String[] {"main"});
        }
        
    }
    
    class SaveChangesListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            inventory.updateInventory(view.getNewNumber());
        }
        
    }
    
    public static void main(String[] args){
        SellerView view = new SellerView();
        Seller model = new Seller();
        SellerController controller = new SellerController(view, model);
        
        view.setVisible(true);
    }
    
    private SellerView view;
    private Seller model;
    private Inventory inventory;
}

