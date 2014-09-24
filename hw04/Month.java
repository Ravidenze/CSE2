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
            
            
                
                   
            
                    //Variables for user input and their respective instructions
                    System.out.print("Enter an integer representing a month: ");
                         int nForMonth = myScanner1.nextInt();//Actually taking in the number for 
                        
                             
                                   if ((nForMonth < 1) || (nForMonth>12)) { 
                                       System.out.println("You did not enter a valid month.");//Printing out an error on the users part
                                       return;
                                   }
                           
                                   if ((nForMonth == 1) || (nForMonth == 3) || (nForMonth == 5) || (nForMonth == 7) || (nForMonth == 8) || (nForMonth == 10) || (nForMonth == 12)) {//checking for months
                                       System.out.println("This month has 31 days");//Printing how many days are in these months
                                   }
                                   
                                   if ((nForMonth == 4) || (nForMonth == 6) || (nForMonth == 9) || (nForMonth == 11)) {//chekcing for months
                                       System.out.println("This month has 28 days");//Printing how many days are in these months
                                   }
                                  
                                   if (nForMonth == 2)  {
                                       //setting up a second scanner for the year ebcause feb
                                       Scanner myScanner2;
                                       myScanner2 = new Scanner( System.in );
                                       
                                            System.out.print("Enter an integer giving the year: ");//Finishing scanner set up by asking user
                                            int nForYear = myScanner2.nextInt();//Taking a number for the year
                                            boolean isLeapYear = ((nForYear % 4 == 0) && (nForYear % 100 != 0) || (nForYear % 400 == 0));//computation for leap year

                                        if (isLeapYear)//self explanatory
                                        {
                                            System.out.println("This month has 29 days this year");//Printing how many days are in this month during a leap year
                                        } else
                                            System.out.println("This month has 28 days this year");//Printing how many days are in this month not a leap year
                                   }
                                   

                        
    }   //End of the main method
} //End of class