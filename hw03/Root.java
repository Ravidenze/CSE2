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
                    System.out.print("Enter a number which you wish to cube root in the form of (xx.xx): ");
                        double nForCubing = myScanner.nextDouble();//Actually taking in the number for cubedrooting
                   
                   
                   double cubedRoot;
                   cubedRoot= Math.pow(nForCubing, (1.0/3));
                   
                   
                    System.out.println("The cubed root of "+ (nForCubing) +" is " +(cubedRoot)+ ".");//Printing the cubed root
                    System.out.println("("+cubedRoot+"*"+cubedRoot+"*"+cubedRoot+") is equal to " +(cubedRoot*cubedRoot*cubedRoot)+ "");//Printing out what the sample looks like
                   
                   //I don't like the way that this prints out, but this is what the example looked like...so yea haha
    
    
   
    }   //End of the main method
} //End of class

