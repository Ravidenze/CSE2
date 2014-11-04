//Grant David Moore
//November, 3, 2014
//Course: CSE002
//Section: 00
//This program will give us practice with understanding how to split up a problem into sub-problems for ease of work


import java.util.Scanner; //Setting up the ability for a scanner
public class BlockedAgain{

//The Following 6 lines are given to us by the assignment and are not allowed to change
public static void main(String []s){                                            //Starting the main void
int m;                                                                          //Introducing a variable to operate the first method I introduce
                                                                                //Directions: force user to enter int in range 1-9, inclusive.
m = getInt();                                                                   //Sending user to first method to take an input and check it to previous set standards
allBlocks(m);                                                                   //The last method which will actually run the bulk of the program for what needs to be printed out based on the user input
}//Closing the main void



public static int getInt(){  //Opening method for obtaining an integer from the user for use in our program
  
        int CheckRange;                                                         //Setting up a variable for me to start void checkRange()
        System.out.print("Enter an integer between 1 and 9, inlcusive: ");      //Print statement for instructions to the user
        CheckRange =  checkRange();                                             //Pushing the program to a new method which will check the user's input to see if it is within the desired range -- and if not, will send the program back to where it called for an input with an error message

return CheckRange;                                                              //Return statement for the final value obtained while running through checking user input for being an integer and within set bounds
}//Closing method of getInt



public static int checkRange(){ //The method for CheckRange called in under int CUI which stands for "Checking User Input"

String nine="123456789";                                                        //Setting up a string to check my variable from checkInt for vailidity in my range
    
    String UserInput = (checkInt());                                            //Setting up a variable for me to start void checkInt() and pushing the program to the new method which will call for a user input and make sure that input is an integer

String CEL;                                                                     //Introducing a variable for use in my inner while statement below -- Means: Counting every letter 
int ChangeToInt;      
        
        int count = 0;                                                          //Introducing a counter to run through the users input and check it back to string nine for range validity
		int outside = 0;                                                        //Introducing a variable for running my while loop below until it comes out with a usable value
			
			while (outside == 0) { //initiating while loop of description line 46
				while (count < nine.length() && nine.charAt(count) != ' ') { //initiating while loop of description line 45
					CEL = nine.charAt(count) + "";                              //Assigning a value to CEL based on position in string to back check it to the input

					if (CEL.equals(UserInput)) { //if the user inputed something usable, this should return that value to the next aprt oft he program
						ChangeToInt = (UserInput.charAt(0)-'0');                //Changes the returned value to an integer because it will be easier later
						return ChangeToInt; 
				    } 
					count++;                                                    //Moving count along to check next part of string for equality to user input 
			    } 

				System.out.print("You did not enter an int in [1,9]; try again "); //Print statement for an error on the input
				UserInput = checkInt();                                         //Re-enters the check int method to obtain a new user input and then run through everything again
				count = 0;                                                      //Re-sets the counting variable for inner while we are currently in so that it can re-check the new user input against the available range again                                                     
			} 
			return ' ';                                                         //Java requires a return statement here because it senses that the program could continue forever and it doesnt like that -- this essentially tricks it into liking ym code
}//Closing Method for Check Range



public static String checkInt(){ //The method for CheckInteger called in under the int UI standing for "User Input" which does as stated above

    Scanner scan = new Scanner(System.in);                                      //Finalizing the ability to use a scanner

        while(!scan.hasNextInt()){ //starting a while loop that checks the user input against being an integer -- the loop is automatically entered and then exited based on the input inside it -- if 'Int', it kicks
            scan.next();                                                        //Taking user input
            System.out.print("You did not enter an int; try again: ");          //Print statement reached if the user did not enter an integer
        }
return (scan.nextInt()+"");                                                     //When an integer is achived, this return statement takes it and changes it to a string before kicking out of the method -- I chose to do this because the next method used is better entered with strings

}//Closing method checkInt()



public static int allBlocks(int x){ //The start for the method called for above by the unchangeable code -- this is a direct copy of a pat homework which creates a stack of numbers and dashes based on a user input -- the user input being 'm' changed here to 'run'

    int q = 0;                                                                  //Runs the farthest outside loop --descriptions of what each loop does follow below
    for (q = 0; q < x; q++) {                                                   //Starts the main loop which runs from zero to the inputted number and holds the methods
                int RunSpacesandNumbers = block(x,q);                           //Calling the program to a method which produces the appropriate block of numbers based on the changing opperator q which goes to x
                int RunSpacesandDashes = line(x,q);                             //Calling the program to a method which produces the appropriate number of spaces before the line of dashes and actually prints that line
    }                                                                           //closeing for loop which runs my entire method
            
return ' ';                                                                     //Was getting a return statement error again because the program needs to end in main method, so I went ahead and returned nothing because my program is finished here                           
}



public static int block(int x, int q){ //The method called to from above --Description line 82
    int w = 0;                                                                  //Runs Outside loop for obtaining correct spacing before each set of number blocks
    int e = 0;                                                                  //Runs First loop nested which specifically controls how many spaces come before each line in the block
    int r = 0;                                                                  //Runs Second loop nested which specifcally controls how many numbers get printed in this block
     
     for (w = 0; w < q + 1; w++) {                                              //Dictates how many lines of each number counting upwards from 1 to the input must be displayed -- number of lines equal to input

                for (e = 0; e < (x - q); e++) {                                 //Gives the approriate number of spaces before printing the actual needed number
                    System.out.print(" ");                                      //Print statement for a space controlled by opperator line above
                }                                                               //end loop

                for (r = 0; r < ((q * 2) + 1); r++) {                           //The equation for how many times each number should be printed in a specific line -- loop runs the print statement that many times
                    System.out.print(q + 1);                                    //Print statement for number in line
                }
                System.out.println();                                           //Printing out a line before returning to AllBlocks method and running the line method which will bring me my line of dashes
}
return ' ';   
}



public static int line(int x, int q){ //The method called to above -- description line 83
    int t = 0;                                                                  //Runs loop giving me appropriate number of spaces before printing dashes for the line
    int y = 0;                                                                  //Runs loop for the actual amount of dashes which make up the line   
            
                for (t = 0; t < (x - q); t++) {                                 //Gives the approriate number of spaces before printing the dashes
                    System.out.print(" ");                                      //Print statement for a space based on line-above opperator
                }

                for (y = 0; y < ((q * 2) + 1); y++) {                           //The equation for how many times a dash should be printed in a specific line -- loop runs the print statement that many times
                    System.out.print("-");                                      //Printing the dash
                }
                System.out.println();                                           //Printing out a line for space before returning to AllBlocks method which will run itself again

return ' ';    
}


}//Closing the main class