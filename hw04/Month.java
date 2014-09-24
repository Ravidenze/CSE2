//Grant David Moore
//September, 23, 2014
//Course: CSE002
    //Section: 00
//Month assignment
    //This program prompts the user to enter the number of the month and then outputs how many days are in that month
    //If the month is 2 -- it will also ask for the year
    


import java.util.Scanner; //Sets up the ability of inputs from the user
 
       
    //define class
    public class Month {
        //add main method -- required for every Java Program
        public static void main(String[] args) {
    
    
            //Finalizes allowing user input
            Scanner myScanner1;
            myScanner1 = new Scanner( System.in );
            
            Scanner myScanner2;
            myScanner2 = new Scanner( System.in );
             //double IntCheck = nForTax-((int)nForTax);
                   double Year;
                
                   
            
                    //Variables for user input and their respective instructions
                    System.out.print("Enter an integer representing a month: ");
                        
                        
                       
                        if (myScanner.hasNextInt()){
                            int nForMonth = myScanner1.nextInt();//Actually taking in the number for 
                             
                                     if ((nForMonth < 1) || (nForMonth>12) { 
                                       System.out.println("You did not enter a valid month.");//Printing out an error on the users part
                                       return;
                                   }
                           
                                   if (nForMonth = (1,3,5,7,8,10,12) {
                                       System.out.println("This month has 31 days);//Printing how many days are in these months
                                   }
                                   
                                   if (nForMonth = (4,6,9,11)) {
                                       System.out.println("This month has 28 days);//Printing how many days are in these months
                                   }
                                  
                                   if (nForMonth = 2)  {
                                       int nForYear = myScanner2.nextInt();//Taking a number for the year
                                       
                                       
                                   }
                                   
                                   
                           
                        }
                        
                       
                        else {
                             System.out.println("You did not enter an integer -- can not display number of days for a non-existent month.");//Printing out an error on the users part
                             return;
                        }
                        
    }   //End of the main method
} //End of class