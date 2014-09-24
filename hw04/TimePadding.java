//Grant David Moore
//September, 23, 2014
//Course: CSE002
    //Section: 00
//Time Padding Program
    //This program has the user enter an positive integer giving the number of seconds that have passed during the day and then
    //displays the time in conventional form. (The problem here is displaying time with “padded” 0s, e.g., 10:03:05). 



import java.util.Scanner; //Sets up the ability of inputs from the user
 
       
    //define class
    public class TimePadding {
        //add main method -- required for every Java Program
        public static void main(String[] args) {
    
    
            //Finalizes allowing user input
            Scanner myScanner;
            myScanner = new Scanner( System.in );
            
                  
                    //Variables for user input and their respective instructions
                    System.out.print("Enter an integer for the number of seconds passed in a day: ");
                        
                        
                        //Setting up variables for later use
                        int nSeconds = myScanner.nextInt();//Actually taking in the number for cubedrooting
                        int nHour;
                        int nMin;
                        int nSec;
                        
                        //Changeing those variables so that they come up with number I want -- the barebones of the numbers for time 
                        nHour = (int)(nSeconds/3600);
                        nMin = (int)((nSeconds - (nHour*3600))/60);
                        nSec = (int)(nSeconds - (nMin*60) - (nHour*3600));
                        
                        //All RETURN functions terminate the program -- I was having isues with it continuing outside of the ifs
                        //Provides for time padding if secodns and min need it
                        if (nMin<10 && nSec<10){
                        System.out.print("The time is " +(nHour)+ ":0" +(nMin)+ ":0" +(nSec)+ "");//print statement for final
                        System.out.print("       ");//space for clarity
                        return;
                        }
                        
                        //Provides for time padding if minutes need it
                        if (nMin<10){
                        System.out.print("The time is " +(nHour)+ ":0" +(nMin)+ ":" +(nSec)+ "");//print statement for final
                        System.out.print("       ");//space for clarity
                        return;
                        }
                        
                        //Provides for time padding if seconds need it
                        if (nSec<10){
                        System.out.print("The time is " +(nHour)+ ":" +(nMin)+ ":0" +(nSec)+ "");//print statement for final
                        System.out.print("       ");//space for clarity
                        return;
                        }
                        
                        //The go to if nothing needs time padding
                        else{
                        System.out.print("The time is " +(nHour)+ ":" +(nMin)+ ":" +(nSec)+ "");//print statement for final
                        System.out.print("       ");//space for clarity
                        return;
                        }
                        
                       
    }   //End of the main method
} //End of class 