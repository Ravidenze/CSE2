//Grant David Moore
//October, 21, 2014
//Course: CSE002
//Section: 00
//This program takes an input from the user and produces a decending pyramid of numbers of length dependent on input 

import java.util.Scanner; //Sets up the ability of inputs from the user

//define class
public class NumberStack {
    //add main method -- required for every Java Program
    public static void main(String[] args) {

            //Finalizes allowing user input -- the first input
            Scanner Ask;
            Ask = new Scanner(System.in);

            //Asking the user for an integer between 1 and 9
            System.out.print("Enter a number between 1 and 9: "); //Instructions for the user regarding input needed
            int nUser = Ask.nextInt(); //Actually taking the integer from the user


        //Setting up variables to be used for my for loops
        int q = 0;//Runs the farthest outside loop --descriptions of what each loop does follow below
        int w = 0;//Runs Second nested loop overall
        int e = 0;//Runs First loop nested in Second overall loop
        int r = 0;//Runs Second loop nested in Second overal loop
        int t = 0;//Runs Third loop
        int y = 0;//Runs Fourth loop

System.out.println("Method of For Loops:"); //setting a stage
System.out.println(); //space for clarity
            
            for (q = 0; q < nUser; q++) { //Starts the main loop which runs from zero to the inputted number

                for (w = 0; w < q + 1; w++) { //Dictates how many lines of each number counting upwards from 1 to the input must be displayed -- number of lines equal to input

                    for (e = 0; e < (nUser - q); e++) { //Gives the approriate number of spaces before printing the actual needed number
                        System.out.print(" "); //Print statement for a space
                    }//end loop

                    for (r = 0; r < ((q * 2) + 1); r++) {//The equation for how many times each number should be printed in a specific line -- loop runs the print statement that many times
                        System.out.print(q + 1);//Print statement for number in line
                    }
                    System.out.println(); //Printing out a line before entering next loops
                }


                for (t = 0; t < (nUser - q); t++) {//Gives the approriate number of spaces before printing the dashes
                    System.out.print(" ");//Print statement for a space
                }

                for (y = 0; y < ((q * 2) + 1); y++) {//The equation for how many times a dash should be printed in a specific line -- loop runs the print statement that many times
                    System.out.print("-");//Printing the dash
                }
                System.out.println(); //Printing out a line for space before running through the whole thing again
            }//the entire for loop part contained here
        
        
        //Resetting variables instated above because they are all at different values following the end of the above for loops
        q = 0;//Runs the farthest outside loop --descriptions of what each loop does follow below
        w = 0;//Runs Second nested loop overall
        e = 0;//Runs First loop nested in Second overall loop
        r = 0;//Runs Second loop nested in Second overal loop
        t = 0;//Runs Third loop
        y = 0;//Runs Fourth loop
        
//Starting the while loop section
System.out.println("Method of While Loops:"); //setting a stage
System.out.println(); //space for clarity       
        
        while (q < nUser) { //Starts the main loop which runs from zero to the inputted number

                while (w < q + 1) { //Dictates how many lines of each number counting upwards from 1 to the input must be displayed -- number of lines equal to input

                    while (e < (nUser - q)) {//Gives the approriate number of spaces before printing the actual needed number
                        System.out.print(" ");//Print statement for a space
                        e++;//progressing while loop
                    }
                    e = 0;//resetting variable for following rerun after following loops

                    while (r < ((q * 2) + 1)) {//The equation for how many times each number should be printed in a specific line -- loop runs the print statement that many times
                        System.out.print(q + 1);//Print statement for number in line
                        r++;//progressing while loop
                    }
                    r = 0;//resetting variable for following rerun after following loops
                    System.out.println();//Printing out a line before entering next loops

                w++;
                }
                w = 0;//resets variable so when reentering while loop everything is computed properly

                while (t < (nUser - q)) {//Gives the approriate number of spaces before printing the dashes
                    System.out.print(" ");//Print statement for a space
                    t++;//progressing while loop
                }
                t=0;//resetting variable for following rerun after following loops

                while (y < ((q * 2) + 1)) {//The equation for how many times a dash should be printed in a specific line -- loop runs the print statement that many times
                    System.out.print("-");//Printing the dash
                    y++;//progressing while loop
                }
                y=0;//resetting variable for following rerun after following loops
                System.out.println();//Printing out a line before entering next loops

            q++;//progressing while loop
            }//the entire while loop contained here
            
        //Resetting variables instated above because they are all at different values following the end of the above for loops
        q = 0;//Runs the farthest outside loop --descriptions of what each loop does follow below
        w = 0;//Runs Second nested loop overall
        e = 0;//Runs First loop nested in Second overall loop
        r = 0;//Runs Second loop nested in Second overal loop
        t = 0;//Runs Third loop
        y = 0;//Runs Fourth loop
        
//Starting the do-while loop section
System.out.println("Method of Do-While Loops:"); //setting a stage
System.out.println(); //space for clarity             
            
            
//I am not going to put comments on this section because everything is essentially the same as the while loop section -- only one thing has been flipped
    //To put in comments may just become crowded and more confusing
           
            do {
                do {
                    do {
                        System.out.print(" ");
                        e++;//progressing do while loop
                    } while (e < (nUser - q));
                    e = 0;

                    do {
                        System.out.print(q + 1);
                        r++;//progressing do while loop
                    } while (r < ((q * 2) + 1));
                    r = 0;
                    
                    System.out.println();
                    w++;//progressing do while loop
                } while (w < q + 1);
                w = 0;

                do {
                    System.out.print(" ");
                    t++;//progressing do while loop
                } while (t < (nUser - q));
                t = 0;

                do {
                    System.out.print("-");
                    y++;//progressing do while loop
                } while (y < ((q * 2) + 1));
                y = 0;
                
                System.out.println();
                q++;//progressing do while loop
            } while (q < nUser);



        } //ending void

} //Ending class