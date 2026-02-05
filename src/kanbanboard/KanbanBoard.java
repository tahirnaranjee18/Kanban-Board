/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kanbanboard;
import javax.swing.JOptionPane;
/**
 *
 * @author Tahir Naranjee - ST10383600
 */
public class KanbanBoard {

        /*
            Allow user to register on the system
        */
    
    public static void main(String[] args) {
        
        //  Capture First Name
        String firstName = JOptionPane.showInputDialog(null, "Enter your First Name:", "First Name", JOptionPane.INFORMATION_MESSAGE);
        
        //  Capture Surname 
        String lastName = JOptionPane.showInputDialog(null, "Enter your Last Name:", "Surname", JOptionPane.INFORMATION_MESSAGE);
        
        String username = "";
        String password = "";
        boolean validUsername = false;
        boolean validPassword = false;
        
        while (!validUsername) {
            
            //Allow User to Capture Username
            username = JOptionPane.showInputDialog(null, "Create a Username\n(Must contain an underscore and be no more than 5 characters): ", 
                    "Account Details", JOptionPane.INFORMATION_MESSAGE);
            
            AccountLogin accountLogin = new AccountLogin();
            validUsername = accountLogin.checkUserName(username);
            
            if (validUsername) {
                JOptionPane.showMessageDialog(null, "Username Successfully Captured", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
             else {
                //Validate User's Username
                JOptionPane.showMessageDialog(null, "Username is not correctly formatted,\nPlease ensure that your username contains an underscore and is no "
                        + "more than 5 characters in length.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        
        while (!validPassword) {
            
            //Allow User to Capture Password
            password = JOptionPane.showInputDialog(null, "Create a password\n(Must be at least 8 characters, contain a capital letter,"
                    + " a number and a special character):", "Account Details", JOptionPane.INFORMATION_MESSAGE);
            
            AccountLogin accountLogin = new AccountLogin();
            validPassword = accountLogin.checkPasswordComplexity(password);
            if (validPassword) {
                JOptionPane.showMessageDialog(null, "Password Successfully Captured", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
             else {
                //  Validate User's Password
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted,\nPlease ensure that the password contains at least 8 characters,"
                        + " a capital letter, a number and a special character.","Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        
        /*
            Allow user to log in using the username and password that they just created to validate the 
            login details and ask the user for additional information until the correct username and 
            password information have been entered. 
        */
        
        boolean loggedIn = false;
        while (!loggedIn) {
            String enteredUsername = JOptionPane.showInputDialog(null, "Enter your Username:", "Login", JOptionPane.INFORMATION_MESSAGE);
            
            String enteredPassword = JOptionPane.showInputDialog(null, "Enter your Password:", "Login", JOptionPane.INFORMATION_MESSAGE);
            
            AccountLogin accountLogin = new AccountLogin();
            loggedIn = accountLogin.loginUser(username, password, 
                    enteredUsername, enteredPassword);
            if (loggedIn) {
                JOptionPane.showMessageDialog(null, "Welcome back " + firstName + " " + lastName + ", it is great to see "+ "you again.", 
                        "Success", JOptionPane.INFORMATION_MESSAGE);
                }
             else {
                JOptionPane.showMessageDialog(null, "Username or Password incorrect, Please try again.", "Error", 
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

}
