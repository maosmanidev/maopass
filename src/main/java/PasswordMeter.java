



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author maosmani
 */
import com.nulabinc.zxcvbn.Feedback;
import com.nulabinc.zxcvbn.Strength;
import com.nulabinc.zxcvbn.Zxcvbn;
import java.util.ResourceBundle;

public class PasswordMeter {
    
    
    
       public  static int   PasswordMeterInt(String Password) {
    
        // This function will return int Value of the score od the paswword
        int Result;
        Zxcvbn zxcvbn = new Zxcvbn();
        Strength   strength = zxcvbn.measure(Password);
        
        //This will give you your password score strength.getScore()
        //System.out.println(strength.getScore());
        Result = strength.getScore();
        // 0 Weak
        // 1 Fair
        // 2 Good 
        // 3 Strong
        // 4 Very strong
        
        return Result;
        
    }
    
     public  static String   PasswordMeterString(String Password) {
    
        // This function will return String Value of the score od the paswword
        String  Result = " ";
        int Score;
        
        Zxcvbn zxcvbn = new Zxcvbn();
        Strength   strength = zxcvbn.measure(Password);
        Feedback feedback = strength.getFeedback();
        
      
        
        //This will give you your password score strength.getScore()
        //System.out.println(strength.getScore());
        Score = strength.getScore();
        // 0 Weak
        // 1 Fair
        // 2 Good 
        // 3 Strong
        // 4 Very strong
        
         if (Score == 0) {
             
             //Result = "Weak Password";
              Result = "Weak";
               // 0 # too guessable: risky password. (guesses < 10^3)
         }
         else if (Score == 1) {
             //Result = "Faire Password";
            //1 # very guessable: protection from throttled online attacks. (guesses < 10^6)
             Result = "Weak";
             
         }
         else if (Score == 2) {
             //Result = "Good Password";
             // 2 # somewhat guessable: protection from unthrottled online attacks. (guesses < 10^8)
             Result = "Good";
             
         }
         else if (Score == 3) {
             //Result = "Strong Password";
             // 3 # safely unguessable: moderate protection from offline slow-hash scenario. (guesses < 10^10)
             Result = "Strong";
             
         }
         else if (Score == 4) {
             //Result = "Very strong Password";
             // 4 # very unguessable: strong protection from offline slow-hash scenario. (guesses >= 10^10)
             Result = "Very strong";
             
         }
         
        return Result; 
        
    }
}
