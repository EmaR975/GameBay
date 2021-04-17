
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muaaz
 */
public class CartController {

    public CartController(Cart cart) {
        this.cart = cart;
    }
    
//    public void addToCart(Product p) {
//       List<Product> products= cart.getProducts();
//       products.add(p);
//       cart.setProducts(products);
//    }
    public void goToHomepage(JButton btn, JFrame cartFrame, JFrame homeFrame) {
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {        
                               
                cartFrame.setVisible(false);
                homeFrame.setVisible(true);
            }
        });
    }
//    public void removeProduct(JButton[] remove) {
//       
//       for(int i=0; i<cart.getProducts().size();i++) {
//           final List<Product> products= new ArrayList<Product>(cart.getProducts());
//           final Product p= products.get(i);
//           remove[i].addActionListener(new ActionListener() {
//               public void acti onPerformed(ActionEvent ae) {                   
//                   products.remove(p);
//                   cart.setProducts(products);   
//                   System.out.println(cart.getProducts());
//               }
//           });          
//       }       
//    }
    
    
    private Cart cart;
    private CustomerView customerView;
    
}
