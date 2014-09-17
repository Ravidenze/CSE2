//Grant David Moore
//September, 15, 2014
//Course: CSE002
    //Section: 00
//four Digits Assignment
    //This program takes an input from the user with a decimal and then displays the first four digits of that decimal


import java.util.Scanner; //Sets up the ability of inputs from the user
 
       
    //defines class
    public class FourDigits {
        
        //add main method -- required for every Java Program
        public static void main(String[] args) {
    
    
            //Finalizes allowing user input
            Scanner myScanner;
            myScanner = new Scanner( System.in );
            
            //Variable to make my life easy
            double decAlone, decAloneMult, decInt;
            
            
            //Variables for user input and their respective instructions
                System.out.print("Enter a number in the form of (xx.xx) with any number of digits in the decimal or before: ");
                        double nDecimal = myScanner.nextDouble();//Actually taking in the number for the decimalizing stuff
           
           
                                //Equations to find the first four decimals
                                decAlone=((int)nDecimal)-nDecimal;//converts inputed number to only the decimal typed in
                                decAloneMult=decAlone*10000;//takes that decimal found above and brings the first four digits in it in front of the decimal
                                decInt=(-1)*(int)decAloneMult;//converts the immidiate number above to a integer -- effectivly giving the answer
                                
                   
                   
                System.out.println("The first four digits of the decimal for the number you inputed are: ");//telling the user whats happening with his/her input
                    
                System.out.println(""+ ((int)decInt*100)/100 +"");//Printing the first four digits of the decimal
                   
                
    }   //End of the main method
} //End of class

