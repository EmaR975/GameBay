/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Seller;
import View.RevenueView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Emily Rojas
 */
public class RevenueController {
    
    public RevenueController(RevenueView view, Seller model){
        this.view = view;
        this.model = model;
        
        double cost, revenue;
        cost=this.model.getCost();
        revenue=this.model.getRevenue();
        
        this.view.setCost(cost);
        this.view.setRevenue(revenue);
        this.model.findProfit();
        this.view.setProfit(model.getProfit());
        
        this.view.homeActionListener(new HomeListener());
    }
    
    class HomeListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            SellerController.main(new String[] {"main"});
        }
    }
        
    public static void main(String[] args){
        RevenueView view = new RevenueView();
        Seller model = new Seller();
        RevenueController controller = new RevenueController(view, model);
        
        view.setVisible(true);       
        
    }
    
    private RevenueView view;
    private Seller model;
}
