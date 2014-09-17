//Grant David Moore
//September, 15, 2014
//Course: CSE002
    //Section: 00
//Cubed root assignment
    //This program takes an input from the user and then cubes it
    


import java.util.Scanner; //Sets up the ability of inputs from the user
 
       
    //define class
    public class Root {
        
        //add main method -- required for every Java Program
        public static void main(String[] args) {
    
    
            //Finalizes allowing user input
            Scanner myScanner;
            myScanner = new Scanner( System.in );
            
            
                    //Variables for user input and their respective instructions
                    System.out.print("Enter a number which you wish to cube in the form of (xx.xx): ");
                        double nForCubing = myScanner.nextDouble();//Actually taking in the number for cubing
                   
                   System.out.println("The cubed root of "+ (nForCubing) +" is ("+nForCubing+"*"+nForCubing+"*"+nForCubing+") which is equal to " +(nForCubing*nForCubing*nForCubing)+ ".");//Printing the cubed root
                   //I don't like the way that this prints out, but this is what the example looked like...so yea haha
                
    }   //End of the main method
} //End of class

