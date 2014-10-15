//Grant David Moore
//October, 14, 2014
//Course: CSE002
    //Section: 00
//Squareroot
    //This program is used to find the square root of a ceratin number
   
import java.util.Scanner; //Sets up the ability of inputs from the user

//define class
public class Root{
    //add main method -- required for every Java Program
    public static void main(String[] args) {
        
        //Finalizes allowing user input -- the first input
        Scanner myScanner1;
        myScanner1 = new Scanner( System.in );

                //Asking the user for a number to square root
                System.out.print("Please enter a number which you wish to take the square root of: "); //Instructions for the user regarding specific card game options
                    double nSquareRoot = myScanner1.nextDouble();//Actually taking the double from the user
                                   

        
        double low = 0.0; //Introducing "low variable"
        double high; //Introducing variable high
        high = (nSquareRoot+1); //Setting what high actually is
        
        
        int runLoop = 1; //Variable to enter loop
        
        double difference;//Setting up a variable for difference
        double middle=0; //Setting an initial variable for middle

   
        double startloop; //Setting variable for use later
        startloop = (nSquareRoot+1); //Defining this variable
       
                    
        
        
        while (runLoop == 1) { //Starting while loop to do the program
                                 
            middle=(low+high)/2;
            if (middle*middle>nSquareRoot){  //If the square of teh middle is larger than the inputed number, then set high to middle
                high=middle;
            }
            if (middle*middle<nSquareRoot){ //If the square of teh middle is less than the inputed number, then set low to middle
                low=middle;
            }
            
            difference = (high-low); //Setting a number variable to the difference
            
            if (difference <= 0.0000001*startloop){ //Cehcking the difference so that it can terminate program when needed
                runLoop++; //Adding to run loop variable
            }
           
        }
        System.out.println("The square root of the number you entered is: " +(middle)+ ""); //Print Statement for square root
        
    }//ending void
    
}//Ending class
        
        
        

