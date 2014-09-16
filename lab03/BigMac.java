//Grant David Moore
//September, 12, 2014
//Course: CSE002
    //Section: 00

        //Basic Adding Assignment
            //You're really craving a big mac right now... like really
            //This program will let you input how much your burger will cost and how many you're eating
            //It will then incorporate the percentage tax and tell you how much your meal will cost... so lets get to eating!
            
import java.util.Scanner; //Sets up the ability of inputs from the user


//Class required for java program
public class BigMac {
    //main method required for program
    public static void main(String[] args) {
        
        //Setting up variables for input
        Scanner myScanner;
        myScanner = new Scanner( System.in );
                                            //Setting variables -- tax rate, total cost, number you ate, cost
                                            
        //Instructions for the user (parameters)
        System.out.print("Enter the number of Big Macs (enter an integer > 0):  ");
            int nBigMacs = myScanner.nextInt();
       
        System.out.print("Enter the cost per Big Mac as a double (in the form xx.xx): "); //Instructions for user cost per burger
            double bigMac$ = myScanner.nextDouble();
       
        System.out.print("Enter the percent tax as a whole number (xx):  "); //Instructions for user taxes
            double taxRate = myScanner.nextDouble();
        
        
        
                    //Setting variable for total cost to be used later -- we'll break it up later
                    double cost$;
                    int dollars, dimes, pennies; //necessary for the entire dollar amount cost of mac (later)
                    taxRate/=100; //input for taxes? I'm confused as to the necessity of this function


        cost$ = (nBigMacs*bigMac$*(1+taxRate)); //get the whole amount, dropping decimal fraction



            dollars=(int)cost$; //yea, this is just taking the cost variable and splitting it into dollars, dimes and pennies (this first part is simply dollars)
            dimes=(int)(cost$*10)%10; //getting the dime amount 
            pennies=(int)(cost$*100)%10;//getting the penny amount


      //final dollar amount print statement -- summary
      System.out.println("The total Cost of " +nBigMacs + " BigMac(s), at $"+bigMac$ +" per bigMac, with a" +
      " sales tax of "+ (int)(taxRate*100) + "%, is $" +dollars+'.'+dimes+pennies); 
        

        
        
    }//End main method
    
}//End Class

