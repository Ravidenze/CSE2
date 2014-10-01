//Grant David Moore
//September, 29, 2014
//Course: CSE002
    //Section: 00
//This program introduces three random variables of true and false with 'and' and 'or' statements inbetween
    //It will then prompt the user if the resulting statement is true or false
        //If the user is correct, it will say so and vice versa

    
//All return statements end the program
//All break statements break the string once the desired change has been made

import java.util.Scanner; //Sets up the ability of inputs from the user -- multiple inputs
       
    //define class
    public class BoolaBoola {
        //add main method -- required for every Java Program
        public static void main(String[] args) {
    
    
        //Finalizes allowing user input -- the first input
        Scanner myScanner1;
        myScanner1 = new Scanner( System.in );
        
        
        //Introducing Variables for swtiching true and false
        boolean a = false,b=false,c=false; 
       
       
        int B1 = (int)((Math.random()*2)); //Setting up random for true or false Boolean variable 1
        int B2 = (int)((Math.random()*2)); //Setting up random for true or false Boolean variable 2                       
        int B3 = (int)((Math.random()*2)); //Setting up random for true or false Boolean variable 3                       
        
        String a1= "";
        String b2= "";      
        String c3= "";      
                                   
                                 
                                 //This switch statement determines Whether Boolean a is true or false
                                    switch (B1) {
                                        case (0): a = true;
                                                  a1 = "true"; break;
                                        case (1): 
                                                  a = false;
                                                  a1 = "false"; break;
                                    }
                                
                                //This switch statement determines Whether Boolean b is true or false
                                    switch (B2) {
                                        case (0): b = true;
                                                  b2 = "true"; break;
                                        
                                        case (1): b = false; 
                                                  b2 = "false"; break;
                                    }
                                
                                //This switch statement determines Whether Boolean c is true or false
                                    switch (B3) {
                                        case (0): c = true; 
                                                  c3 = "true"; break;
                                        
                                        case (1): c = false; 
                                                  c3 = "false"; break;
                                    }
      
      
      //boolean F = false;
      String x="";
      String y="";
        
       
        int C1 = (int)((Math.random()*2)); //Setting up random for deciding an and or or statement in place of x
        int C2 = (int)((Math.random()*2));             
        
        
                                //This switch statment randomizes the location of the || and && statements
                                    switch (C1) {
                                        case (0): x = "&&"; break;
                                        case (1): x = "||"; break;
                                        
                                    }
                                //This switch statment randomizes the location of the || and && statements
                                    switch (C2) {
                                        case (0): y = "&&"; break;
                                        case (1): y = "||"; break;
                                        
                                    }
                              
                                
                                

      boolean g = false;  
        System.out.println("Does " +(a1)+ " " +(x)+ " " +(b2)+ " " +(y)+ " " +(c3)+ " have the value of true (t/T) or false (f/F)?"); //Print statement for what just happened
            String UAnswer = myScanner1.next();//Recording User Answer
        
                   
                   
                   switch (UAnswer){
                             case ("T"): g=true; break;
                             case ("t"): g=true; break;
                             case ("F"): g=false; break;
                             case ("f"): g=false; break;
                             default:
                                if (UAnswer.length()>1){
                                    System.out.println("You did not enter a single character. ");//Printing out that the user made an error
                                    return;
                                }
                                else{
                                    System.out.println("You did not enter a valid Character. ");//Printing out that the user made an error
                                    return;
                                }
                        }
                    boolean Answer = false;
                    if (UAnswer.equals("T") || UAnswer.equals("t") ||  UAnswer.equals("F") ||  UAnswer.equals("f")) {//Checks to see if user entered usable variable
                    
                    
                        if (x.equals("||") && (y.equals("||"))) {
                            if(a || b || c)
                                g = true;
                            else
                                g= false;
                        }
                       
                       else if (x.equals("&&") && (y.equals("||"))) {
                            if(a && b || c)
                                g = true;
                            else
                                g= false;
                        }
                        
                        else if (x.equals("||") && (y.equals("&&"))) {
                            if(a || b || c)
                                g = true;
                            else
                                g= false;
                        }
                        
                        else if (x.equals("&&") && (y.equals("&&"))) {
                            if(a || b || c)
                                g = true;
                            else
                                g= false;
                        }
                        
                        if (g && Answer)
                            System.out.println("You are correct. ");//Printing out that the user was correct in his guess of whether the boolean was true or false
                            
                        
                        else if (!g && Answer)
                            System.out.println("You are incorrect. ");//Printing out that the user was incorrect in his guess of whether the boolean was true or false
                            
                        
                        else if (g && !Answer)
                            System.out.println("You are incorrect. ");//Printing out that the user was incorrect in his guess of whether the boolean was true or false
                               
                        
                        else if (!g && !Answer)
                            System.out.println("You are correct. ");//Printing out that the user was correct in his guess of whether the boolean was true or false
                    }   
                    
                    else{
                             System.out.println("Wrong: Try again. ");//Printing out that the user was incorrect in his guess of whether the boolean was true or false
                            return;
                    }
                        
                        
      
                       
    }   //End of the main method
} //End of class