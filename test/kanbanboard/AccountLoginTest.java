/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package kanbanboard;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Tahir Naranjee - ST10383600
 */
public class AccountLoginTest {
    
    public AccountLoginTest() {
    }

    /**
     * Test of checkUserName method, of class AccountLogin.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "kyl_1";
        AccountLogin instance = new AccountLogin();
        boolean expResult = true;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkPasswordComplexity method, of class AccountLogin.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Ch&&sec@ke99!";
        AccountLogin instance = new AccountLogin();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of registerUser method, of class AccountLogin.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        AccountLogin instance = new AccountLogin();
        String expResult = "";
        String result = instance.registerUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class AccountLogin.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "";
        String password = "";
        String enteredUsername = "";
        String enteredPassword = "";
        AccountLogin instance = new AccountLogin();
        boolean expResult = false;
        boolean result = instance.loginUser(username, password, enteredUsername, enteredPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class AccountLogin.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean loggedIn = false;
        AccountLogin instance = new AccountLogin();
        String expResult = "";
        String result = instance.returnLoginStatus(loggedIn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class AccountLogin.
     
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        AccountLogin instance = new AccountLogin();
        String expResult = "";
        String result = instance.registerUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    /**
     * Test of loginUser method, of class AccountLogin.
     
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "";
        String password = "";
        String enteredUsername = "";
        String enteredPassword = "";
        AccountLogin instance = new AccountLogin();
        boolean expResult = false;
        boolean result = instance.loginUser(username, password, enteredUsername, enteredPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    /**
     * Test of returnLoginStatus method, of class AccountLogin.
     
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean loggedIn = false;
        AccountLogin instance = new AccountLogin();
        String expResult = "";
        String result = instance.returnLoginStatus(loggedIn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
