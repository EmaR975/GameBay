/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Muaaz
 */
public class Checkout {

    public Checkout( String name, String billingAddress, String contactInfo, String cardNumber, String emailAddress) {
        
        this.name = name;
        this.billingAddress = billingAddress;
        this.contactInfo = contactInfo;
        this.cardNumber = cardNumber;
        this.emailAddress = emailAddress;
    }

    public Checkout() {
    }

    
  

    public String getName() {
        return name;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Checkout Info{" + "name= " + name + ", Billing Address= " + billingAddress + ", Contact Info=" + contactInfo + ", Card Number=" + cardNumber + ", Email Address=" + emailAddress + '}';
    }
       
    
    private String name;
    private String billingAddress;
    private String contactInfo;
    private String cardNumber;
    private String emailAddress;
    
}
