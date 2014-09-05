//Grant David Moore
//September, 4, 2014
//Course: CSE002
    //Section: 00
//Cyclometer Assignment
    //Brian Chen's cyclometer records two kinds of data:
        //The time elapsed in seconds
        //The number of rotations of the front wheel during that time
    //This program should take in that data and -- 
        //a. print the number of minutes for each trip
        //b. print the number of counts for each tirp
        //c. print the distance of each trip in miles
        //d. print the distance for the two trips combined
        
//define class
public class Cyclometer{
    
    //  add main method -- required for every Java Program
    public static void main(String[] args) {


//Variables for input
int secsTrip1=480;  //Seconds for trip 1
int secsTrip2=3220;   //Seconds for trip 2
int countsTrip1=1561; //Number of rotations for trip 1
int countsTrip2=9037;    //Number of rotations for trip 2



//Useful Constants
double wheelDiameter=27.0, //Diameter of the Bike Wheel
PI=3.14159, //Constant for PI
feetPerMile=5280, //The amount of feet per mile
inchesPerFoot=12, //The amount of inches per foot
secondsPerMinute=60; //The amount of seconds per minute
double distanceTrip1, distanceTrip2,totalDistance; //Inputting Variables for the distances


        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute) +" minutes and had " +countsTrip1+" counts.");
        
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute) +" minutes and had " +countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches for conversion below


        //(for each count, a rotation of the wheel travels the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;

//The next three lines print out the formulated distances from our above equation
System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+totalDistance+" miles");


    }   //End of the main method
} //End of class