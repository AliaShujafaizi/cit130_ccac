/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordstrength;
import java.util.Scanner;
/**
 * client class for our Password Strength checking machine 
 * @author Alia
 */
public class passwordClient {
    public static void main(String[] args) {
        //Creat an instance of our password checking machine 
        StrengthChecker checker = new StrengthChecker();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a password to test: ");
        
        String message = "";
        //fire up our checker machine, and store messages
        // The user gets ten tries to come up with a valid password 
        for(int i = 0; i < 10; i++){
            String candidatePswd = scan.nextLine();
            message = checker.verifyCandidatePassword(candidatePswd);
            if(message.length() == 0){
                 System.out.println("Excellent! You got it.");
                 break;
            }else {
                 System.out.println(message); 
            }
        }
        if(message.length() != 0){
            System.out.println("Too many attempts, please restart the program and try again.");            
        }      
    }
}
