//Grant David Moore
//October, 21, 2014
//Course: CSE002
//Section: 00
//This program takes an input from the user and produces a decending pyramid of numbers of length dependent on input 

import java.util.Scanner; //Sets up the ability of inputs from the user

//define class
public class Testing {
    //add main method -- required for every Java Program
    public static void main(String[] args) {

            //Finalizes allowing user input -- the first input
            Scanner Ask;
            Ask = new Scanner(System.in);

            //Asking the user for an integer between 1 and 9
            System.out.print("Enter a number between 1 and 9: "); //Instructions for the user regarding input needed
            int nUser = Ask.nextInt(); //Actually taking the integer from the user


            //Setting up variables to be used for my for loops
            int q = 0;
            int w = 0;
            int e = 0;
            int r = 0;
            int t = 0;
            int y = 0;


            while (q < nUser) {

                while (w < q + 1) {

                    while (e < (nUser - q)) {
                        System.out.print(" ");
                        e++;
                    }
                    e = 0;

                    while (r < ((q * 2) + 1)) {
                        System.out.print(q + 1);
                        r++;
                    }
                    r = 0;
                    System.out.println();

                w++;
                }
                w = 0;

                while (t < (nUser - q)) {
                    System.out.print(" ");
                    t++;
                }
                t=0;

                while (y < ((q * 2) + 1)) {
                    System.out.print("-");
                    y++;
                }
                y=0;
                System.out.println();

            q++;
            }



        } //ending void

} //Ending class