//Grant David Moore
//September, 15, 2014
//Course: CSE002
    //Section: 00
//Cyclometer Assignment -- #2
    //Brian Chen's cyclometer still records two kinds of data:
        //The time elapsed in seconds
        //The number of rotations of the front wheel during that time
    //This program allows Brian to input the data recorded on his cyclometer which it will then take and change into:
        //a. Distance Travled
        //b. Average Miles per hour
    
 

import java.util.Scanner; //Sets up the ability of inputs from the user
 
 
       
//define class
public class Bicycle {
    
    //  add main method -- required for every Java Program
    public static void main(String[] args) {


        //Setting up the scanner which allows user input
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        
                //Variables for user input and their respective instructions
                System.out.print("Enter the number counts on the cyclometer (enter an integer > 0):  ");
                    int nCountsCyclometer = myScanner.nextInt();
               
                System.out.print("Enter the number of seconds during which these counts occured (enter an integer > 0: "); //Instructions for user cost per burger
                    int nSeconds = myScanner.nextInt();

            
        //Necessary Constants
        double wheelDiameter=27.0, //Diameter of the Bike Wheel
        PI=3.14159, //Constant for PI
        feetPerMile=5280, //The amount of feet per mile
        inchesPerFoot=12, //The amount of inches per foot
        secondsPerMinute=60; //The amount of seconds per minute
        double distanceTrip, nHours; //Inputting variable for distance

                
                //(for each count, a rotation of the wheel travels the diameter in inches times PI)
                //This equation gives the distance in miles traveled
                distanceTrip=nCountsCyclometer*wheelDiameter*PI/inchesPerFoot/feetPerMile;
                
                nHours=(((nSeconds/secondsPerMinute)/60));//finding number of hours


        System.out.println("This trip took "+ (nSeconds/secondsPerMinute) +" minutes and covered a distance of "+((int)(distanceTrip))+" miles (rounded).");//Print statement for time and distance
        System.out.println("The average speed for the trip (in MPH) was " +(int)(distanceTrip/nHours)+ " (rounded).");//Print statement for average mph
    }   //End of the main method
} //End of class

