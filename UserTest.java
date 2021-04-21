/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import junit.framework.TestCase;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Muaaz
 */
public class UserTest  {
    
//    public UserTest(String testName) {
//        super(testName);
//    }
//    
//    @Override
//    protected void setUp() throws Exception {
//        super.setUp();
//    }
//    
//    @Override
//    protected void tearDown() throws Exception {
//        super.tearDown();
//    }

    /**
     * Test of getUserName method, of class User.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        User instance = new User("Muaaz","1234","Customer");
        String expResult = "Muaaz";
        String unExpResult= "Truong";
        String result = instance.getUserName();
        assertTrue(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        assertFalse(unExpResult.equals(result));
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User("Muaaz","1234","Customer");
        String expResult = "1234";
        String result = instance.getPassword();
        assertTrue(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        assertFalse(expResult.equals("123"));
    }

    /**
     * Test of setUserName method, of class User.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "Muaaz";
        User instance = new User("Muaaz","1234","Customer");
        instance.setUserName(userName);
        assertTrue(userName.equals(instance.getUserName()));
        // TODO review the generated test code and remove the default call to fail.
        assertFalse(userName.equals("Emily"));
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "1234";
        User instance = new User("Muaaz","1234","Customer");
        instance.setPassword(password);
        
         assertTrue(password.equals(instance.getPassword()));
        // TODO review the generated test code and remove the default call to fail.
        assertFalse(password.equals("567"));
    }

    /**
     * Test of setUserType method, of class User.
     */
    @Test
    public void testSetUserType() {
        System.out.println("setUserType");
        String userType = "Customer";
        User instance =new User("Muaaz","1234","Customer");
        instance.setUserType(userType);
        assertTrue(userType.equals(instance.getUserType()));
        // TODO review the generated test code and remove the default call to fail.
        assertFalse(userType.equals("Seller"));
    }

    /**
     * Test of getUserType method, of class User.
     */
    @Test
    public void testGetUserType() {
        System.out.println("getUserType");
        User instance =new User("Truong","1234","Customer");
        String expResult = "Customer";
        String result = instance.getUserType();
        assertTrue(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        assertFalse(expResult.equals("Seller"));
    }
    
}
