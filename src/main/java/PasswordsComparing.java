



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Try to push code
/**
 *
 * @author maosmani
 * 
 */


import java.io.IOException;  // Import the IOException class to handle errors
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
public  class PasswordsComparing {

    /**
     *
     * @param UserPassword
     * @return
     */
    public  static Boolean   PasswordCompare(String UserPassword){
    
        Boolean Result = false;



    try {
          // Getting ClassLoader obj
        String fileName = "lists/list.txt";
   
        InputStream instr = PasswordsComparing.class.getClassLoader().getResourceAsStream(fileName);
  
        // reading the files with buffered reader 
        InputStreamReader file = new InputStreamReader(instr);
          
         
     
       //FileReader file = new FileReader("src/main/resources/lists/list.txt");
       //FileReader file = new FileReader(path);
      
  
      
      
         
                
            try (BufferedReader reader = new BufferedReader(file)) {
                String line;
                
                
                while ((line = reader.readLine()) != null) {
                   
                    String Password = line.strip();
                    UserPassword = UserPassword.strip();
                    
                    
                  
                    if(UserPassword.equals(Password)){
                        Result = true;
                        break;

                    }else{
                        Result = false;
                    }
                }
            }
              
              
    } catch (IOException e) {
      
      e.printStackTrace();
    }
         
    

        return Result;
    }
    
    
    public static String Resutls(String Password) {
        
       // String[] pathnames;
        //String Result = "Your Password is not in the list";
        String Result = "Your Password is not a Common Password";
        // /opt/passapp/lib/app/classes/lists
        //String Path = "src/main/resources/lists/";
        //String Path = "./classes/lists/";
        //String Path = PasswordsComparing.class.getResource("/resources/").toString();
        Boolean result;
        //File f = new File(Path);
        //pathnames = f.list();
      
        //for (String pathname : pathnames) {
            //System.out.println(pathname);
            //String currentPath = Path + pathname;
            //result = PasswordCompare(Password,currentPath);
            result = PasswordCompare(Password);
            if(result == true){
                //Result = "Your Password is in the list";
                Result = "Your Password is a Common Password";

                //System.out.println(Result);
               // break;
                
            }else{
                Result = "Your Password is not a Common Password";
            }
            //System.out.println(Result);
       // }

       
        return Result;
    }
    
}
    
