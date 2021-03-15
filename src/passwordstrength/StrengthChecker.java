/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordstrength;

/**
 * Tool class for evaluating candidate password strength 
 * against a set of requirement
 * 
 * TODO: Consider how to store/encode the strength requirements for
 * the candidate passwords. Option 1: FINAL variables in this class
 * Option 2: Store requirements in an external file and read that file
 * into Java and then check candidate passwords
 * 
 * @author Alia
 */
public class StrengthChecker {
    
    // member variables
    private int minLength = 8;
    private final int MIN_DEFAULT = 8;
    private int maxLength = 10;
    private final int MAX_DEFAULT = 20;
    
    private final String SPEC_CHAR_REGEXP = ".*[$%^&*@#!].*";
    
    
    
    /**
     * Primary method which applies strength rules to the inputted
     * candidate password
     * @param candidate password to check
     * @return null if password passes all checks, not null with
     * tips for fixing the password if it failed any check
     */
    public String verifyCandidatePassword(String candidate){
        StringBuilder failMessage = new StringBuilder(); // by default, passwords do NOT
                                            // meet requirement
                                            
        // delegate checking each component of the password to
        // private (internal) methods
        // be prepare to receive messages from each sub-method
        failMessage.append(checkLength(candidate)); // returns null if length is passed
        // check other requirements in their own methods
        failMessage.append(checkForSpecialCharacters(candidate));
        failMessage.append(checkForUppercase(candidate));
        failMessage.append(checkForLowercase(candidate));
        failMessage.append(checkForDigit(candidate));
        failMessage.append(checkForNoSpace(candidate));
        
                                            
      
        return failMessage.toString(); // give complete message back to caller
        
    }
    
    /**
     * Uses regular expressions to look for patterns in the password
     * @param pswd
     * @return 
     */
    private String checkForSpecialCharacters(String pswd){
        // apply regexp check
        if(pswd.matches(SPEC_CHAR_REGEXP)){
            return "";
        }else{
           return "No special characters found!!\n"; 
        }
      }
    
    /**
     * Uses regular expressions to look for patterns in the password
     * @param pswd
     * @return 
     */
    private String checkForLowercase(String pswd){
        // apply regexp check
        if(pswd.matches(".*[a-z].*")){
            return "";
        }else{
           return "No lowercase characters found!!\n"; 
        }
      }
    
    /**
     * Uses regular expressions to look for patterns in the password
     * @param pswd
     * @return 
     */
    private String checkForUppercase(String pswd){
        // apply regexp check
        if(pswd.matches(".*[A-Z].*")){
            return "";
        }else{
           return "No uppercase characters found!!\n"; 
        }
      }
    
    /**
     * Uses regular expressions to look for patterns in the password
     * @param pswd
     * @return 
     */
    private String checkForDigit(String pswd){
        // apply regexp check
        if(pswd.matches(".*\\d.*")){
            return "";
        }else{
           return "No numeric characters found!!\n"; 
        }
      }
    
    /**
     * check for spaces in the password
     * @param pswd
     * @return 
     */
    private String checkForNoSpace(String pswd){
        // apply regexp check
        if(!pswd.contains(" ")){
            return "";
        }else{
           return "No spaces allowed!!\n"; 
        }
      }
    
    
    /**
     * Check a given candidate for length requirements
     * @param pswd
     * @return null if length requirements are met, not null with
     * info message if failed
     */
    private String checkLength(String pswd){
        int lgth = pswd.length();
        if(lgth < minLength){
            // feedback to user
            return"Password does not meet minimum length requirement.\n";
        } else if (lgth > maxLength){
            return "Password is too long. \n";
        }
        else {
            return "";
        }
    }
    
    /**
     * Allow client to set the min and max password length
     * @param min
     * @param max 
     */
    public void setMinMaxLength(int min, int max){
        if(min < 1){
            minLength = MIN_DEFAULT;
        } else {
            // make the inputted min the actual minLength
            minLength = min;
        }
        if (max < min) {  // we cannot have a max less than min
            // overwrite max to be min * 2
            maxLength = min * 2;
        } else {
            maxLength = max;
        }
        
    }
   } // close class
