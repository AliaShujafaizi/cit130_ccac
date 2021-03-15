/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Demonstration of method types
 * point of sale: compute discount
 * @author Alia
 */
public class SandBox {
    /**
     * The official discount rate for java students at Ollie's
     */
    final static double DISCOUNT_RATE = 0.18; // Discount for java student
    public static void main(String[] args) {
        double sub =34.56;
        System.out.println("Price before discount: " + sub);
        // call our discount method and store value in result
        double result = computerPriceAfterDiscount(sub);
        System.out.println("Price after discount: " + result);
    }// close main
    /**
     * computes a grand total after applied discount
     * @param subTotal price before discount 
     * @return price after discount applied
     */
    public static double computerPriceAfterDiscount(double subTotal){
       //redius subtotal by discount rate 
       return subTotal * (1-DISCOUNT_RATE);
       
    
    }//close mathod   
}// close class
