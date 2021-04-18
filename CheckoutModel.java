/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author truon
 */
public class CheckoutModel {
    private String cardName;
    private String address;
    private String phoneNum;
    private String email;
    
    public void saveBillingInfo(String cardName, String address, String phoneNum, String email){
        this.cardName = cardName;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
    }
    
    public String getCardName(){
        return cardName;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getPhoneNum(){
        return phoneNum;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setCardName(String cardName){
        this.cardName = cardName;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
}
