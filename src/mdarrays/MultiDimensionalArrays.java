/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdarrays;

/**
 *
 * @author Alia
 */
public class MultiDimensionalArrays {
    public static void main(String[] args){
        //Creating multiDimensional Array of string value. 
        String[][] kitchenTools = new String[6][3];
        kitchenTools[0][0] = "mixer";
        kitchenTools[0][1] = "can opener";
        kitchenTools[5][2] = "silverware";
        
        System.out.println("kitchenTools.length = " + kitchenTools.length);
        
        for(int row = 0; row<kitchenTools.length; row++){
            for(int column = 0; column<kitchenTools[row].length; column++){
                //created if to not print nulls
                if(kitchenTools[row][column]!=null){
                 System.out.println("Drawer " + row + ", " + column +" contains: " +
                        kitchenTools[row][column] );   
                }//close if statement.
            }//close nested for loop.
        }//close for loop.
    }//close main.
    
}
