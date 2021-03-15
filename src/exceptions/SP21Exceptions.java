/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alia
 */
public class SP21Exceptions {

    public static void main(String[] args) {
        
        Scanner scan = null;

        System.out.println("Enter an integer and press enter: ");
        int userIntInput = -9;
        
        //Keep looping as long as the input has not changed from -9
        while(userIntInput == -9){
            scan = new Scanner(System.in);
            
            //Scanner.nextInt() could throw an input mismatch exception
            // so we will prepare for that event by surrounding it with try/catch 
            //TODO! why do we get an infinite loop without the nextLine() method on 
            // the Scanner?
//          String stringIn = scan.nextLine();
                
        
        try {
             userIntInput = scan.nextInt();
             
             // When an exception is thrown anywhere in try{}, we get a handle 
             //to that objectin our catch block
             
            } catch (InputMismatchException ex) {
            System.out.println("Error: can not convert your input to an integer");
            System.out.println("Exception Details: ");
            System.out.println(ex.toString());
//           scan.close();
        }//close catch

    }//close while 
        System.out.println("You Entered: " + userIntInput);
        
    }//close main
    public static void computeTax(double subtotal){
        
    }//close computeTax
}//close class
