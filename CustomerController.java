
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Muaaz
 */
public class CustomerController {

    public CustomerController(Customer customer) {
        
        this.customer = customer;
        this.inventory = new Inventory();
        inventory.addProduct();
        this.cart = new Cart();
    }

    public void searchProduct(JButton searchButton, JTextField textField, JFrame frame, JPanel searchPanel, JButton cartButton, JButton checkoutButton) {
            
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                List<Product> listProducts = inventory.getProducts();
                for (Product p : listProducts) {
                    if (p.getName().equals(textField.getText())) {
                        customer.setProduct(p);
                    }
                }
                if (null != customer.getProduct()) {

                    JButton addToCartButton = new JButton("Add to Cart");
                    //double total=0;
                    addToCartButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent ae) {
                            List<Product> products = cart.getProducts();
                            products.add(customer.getProduct());                           
                            cart.setProducts(products);                            
                            //total= customer.getProduct().getSellingPrice();
                            //cart.setPrice(total);
                        }
                    });
                    JLabel pLabel = new JLabel(customer.getProduct().productDetails());
                    searchPanel.add(pLabel);
                    searchPanel.add(addToCartButton);
                    frame.add(searchPanel);
                    frame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "No Product Found.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        cartButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {                
                
                cartView = new CartView(frame,cart);
                frame.setVisible(false);
                cartView.showCartView();
            }
        });

    }
    
    private Customer customer;
    private Inventory inventory;
    private Cart cart;
    private CartView cartView;

}
