/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kanbanboard;

/**
 *
 * @author Tahir Naranjee - ST10383600
 */
public class AccountLogin {
    
    //  Register User for Account
    public boolean checkUserName(String username) {
         return username.contains("_") && username.length() <= 5;
    }
    
    public boolean checkPasswordComplexity(String password) {
         return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*()].*");
    }
    
    public String registerUser(String username, String password) {
        if (!checkUserName(username)) {
         return "Username is not correctly formatted, Please ensure that your username contains an underscore and is no more than 5 characters in length.";
        }
        if (!checkPasswordComplexity(password)) {
         return "Password is not correctly formatted, Please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        }
         return "User Registration successful.";
    }
    
    public boolean loginUser(String username, String password, String enteredUsername, String enteredPassword) 
    {
         return username.equals(enteredUsername) && password.equals(enteredPassword);
    }
    
    public String returnLoginStatus(boolean loggedIn) {
        if (loggedIn) {
         return "Login Successful";
            }
        else {
         return "Login Failed";
        }
    }

}
