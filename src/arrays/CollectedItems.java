/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *Object to manage and display 
 * an array of string 
 * representing collected items
 * @author Alia
 */
public class CollectedItems {
   // MEMBER VARIABLES
    private String[] collectionArray;
    private String title;
    
    //MEMBER METHOD
    /**
     * Constructor-like method that creates our array of
     * collected items and a title
     * @param collectionsize how many items you plan to store 
     * @param title name of the collection
     */
    public void setupcollection(int collectionsize, String t){
        // create an array of the requisted size, store in collectionArray
        //operating on my member vairable
        collectionArray = new String[collectionsize];
        //inject the given String as the title
        title = t;
        
    }// close setupcollection
    /**
     * adds the given item to this object's internal array
     * @param itemName the title of the item to store 
     */
    
    public void insertItem(String itemName){
       // which array shelf shoul i store the inputted item?
       // loop over collectionArray, and store the item in the
       //first bin  whose value is is Null
       for( int c = 0; c < collectionArray.length; c++){
           // see if the current "Bin" is Null
           // if it's Null, insert the item
           // not Null? keep going
           if(collectionArray[c] == null){
               collectionArray[c] = itemName;
            // once I wrote item, done!
            // leave my for loop
            break;
           }//close if           
       }//close for             
    }//close insertItem 
    /**
     * Dump to console this object's array
     */
    public void displayCollection(){
        System.out.println("Items in: " + title);
        for(int r = 0; r < collectionArray.length; r++){
            System.out.println("Item " + (r+1)+ " " + collectionArray[r]);
        }//close for
    }// close displayCollection
}// close class
