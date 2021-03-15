/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 * this is our client class for an array of Collected Items 
 * @author Alia
 */
public class CollectionLand {
    /**
     * we can think of the main as a front door of our program 
     * practicing array based on object structures
     * @param args 
     */
    public static void main(String[] args) {

          CollectedItems kitTools = new CollectedItems();
          //called out-setup method, passing in 10 for numItems 
          // and a title of our collection
          kitTools.setupcollection(10,"Alia's kitchen tools" );
          // Add items with calls to insertItem
          kitTools.insertItem("mixer");
          kitTools.insertItem("can opener");
          kitTools.insertItem("silverware");
          
          // show collection
          kitTools.displayCollection();
          
          // TODO! for Thursday
          // Fill in several items in your first collection
          
          // TODO! Make a second instance of collectionItems 
          // and populate it with songs you like
          CollectedItems popSongs = new CollectedItems();
    }//closs method 
    
}// close class 
