//Grant David Moore
//September, 23, 2014
//Course: CSE002
    //Section: 00
//Income Tax Assignment
    //This program allows the user to input an income and it than computes the income tax on that dollar amount
    


import java.util.Scanner; //Sets up the ability of inputs from the user
 
       
    //define class
    public class IncomeTax {
        //add main method -- required for every Java Program
        public static void main(String[] args) {
    
    
            //Finalizes allowing user input
            Scanner myScanner;
            myScanner = new Scanner( System.in );
            
             //double IntCheck = nForTax-((int)nForTax);
                   double TaxAmount, ActualIncome;
                   double Tax1=0.05, Tax2=0.07, Tax3=0.12, Tax4=0.14;
                   
            
                    //Variables for user input and their respective instructions
                    System.out.print("Enter an integer giving the number of thousands you wish to calculate the income tax on: ");
                        
                        
                       
                        if (myScanner.hasNextInt()){
                            int nForTax = myScanner.nextInt();//Actually taking in the number for cubedrooting
                             
                                     if (nForTax < 0) { 
                                       System.out.println("You did not enter a poitive integer.");//Printing out an error on the users part
                                       return;
                                   }
                           
                                   if (nForTax < 20) {
                                       TaxAmount=(nForTax*Tax1);
                                       ActualIncome=(nForTax*1000);
                                       System.out.println("The tax rate on $" +(ActualIncome)+ " is 5.0%, and the tax is $" +(TaxAmount*1000)+ "");//Printing the tax amount and actual income made with percent tax 
                                   }
                                   if ((20 <= nForTax) && (nForTax < 40)) {
                                       TaxAmount=(nForTax*Tax2);
                                       ActualIncome=(nForTax*1000);
                                       System.out.println("The tax rate on $" +(ActualIncome)+ " is 7.0%, and the tax is $" +(TaxAmount*1000)+ "");//Printing the tax amount and actual income made with percent tax
                                   }
                                   if ((40 <= nForTax) && (nForTax < 78))  {
                                       TaxAmount=(nForTax*Tax3);
                                       ActualIncome=(nForTax*1000);
                                       System.out.println("The tax rate on $" +(ActualIncome)+ " is 12.0%, and the tax is $" +(TaxAmount*1000)+ "");//Printing the tax amount and actual income made with percent tax
                                   }
                                   if (nForTax >= 78) {
                                       TaxAmount=(nForTax*Tax4);
                                       ActualIncome=(nForTax*1000);
                                       System.out.println("The tax rate on $" +(ActualIncome)+ " is 14.0%, and the tax is $" +(TaxAmount*1000)+ "");//Printing the tax amount and actual income made with percent tax
                                   }
                           
                        }
                        
                       
                        else {
                             System.out.println("You did not enter an integer.");//Printing out an error on the users part
                             return;
                        }
                        
    }   //End of the main method
} //End of class