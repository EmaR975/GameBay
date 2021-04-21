/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Emily Rojas
 */
public class SellerTest {
    
    public SellerTest() {
    }

    @Test
    public void testGetProducts() {
        Seller model = new Seller();
        model.findProfit();
        assertTrue(model.getProfit() == 40);
    }
    
    @Test
    public void testGetCost() {
        Seller model = new Seller();
        double cost = 30;
        assertEquals(model.getCost(), cost);
    }
    
    @Test
    public void testGetRevenue() {
        Seller model = new Seller();
        double rev = 70;
        assertEquals(model.getRevenue(), rev);
    }
    
    @Test
    public void testUpdateRevenue() {
        Seller model = new Seller();
        double rev = 120;
        model.updateRevenue(50);
        assertEquals(model.getRevenue(), rev);
    }
    
}
