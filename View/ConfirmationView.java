/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import Model.Cart;
import Model.Checkout;

/**
 *
 * @author Muaaz
 */
public class ConfirmationView {

    public ConfirmationView(Checkout checkout, Cart cart) {
        this.cart = cart;
        this.checkout = checkout;
    }

    public void showConfirmationView() {

        JFrame frame = new JFrame("Confirmation");
        JLabel label = new JLabel("Congratulations " + checkout.getName() + "!" + " Your order of worth $" + cart.getPrice() + " has been placed." + " Thank You for Shopping on GameBay.");
        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.CENTER);
        frame.setPreferredSize(new Dimension(800, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int delay = 10000; // Delay in milliseconds

        Timer timer = new Timer(delay, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);

            }
        });
        timer.start();
    }
    private Cart cart;
    private Checkout checkout;
}
