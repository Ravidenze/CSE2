//Grant David Moore
//September, 9, 2014
//Course: CSE002
    //Section: 00

//Arithmetic Assignment
    //While shooping at walmart, we want to compute the price of all the items we bought
        //We also need to account for the PA sales tax of 6%


//define class
public class Arithmetic{

  //add main method -- required for every Java Program
    public static void main(String[] args) {


    //Independent Variables
        int nSocks=3; //Number of pairs of socks
        int nGlasses=6;  //Number of drinking glasses
        int nEnvelopes=1;   //Number of boxes of envelopes
    
   
    //Necessary Constants
      //('$' is part of the variable name)
        double sockCost$=2.58, //Cost per pair of socks
        glassCost$=2.29, //Cost per glass
        envelopeCost$=3.25,  //Cost per box of envelopes
        taxPercent=0.06; //Percent tax
      
    //Dependent Variables        
        double totalSockCost$, totalGlassCost$, totalEnvelopeCost$; //Total costs of everything -- but I don't actually use these variables (it made more sense in my mind not to), hope thats not a problem
        double totalCostEverything$; //Adding all the totals
        double totalActuallyPaid$; //Multiplying by the tax for final value
        double totalTaxEverything$; //Taxes total
        
        
        totalTaxEverything$=((((nSocks*sockCost$))*taxPercent)+(((nGlasses*glassCost$))*taxPercent)+((nEnvelopes*envelopeCost$)*taxPercent)); //total taxes for everything
        totalCostEverything$=((nSocks*sockCost$)+(nGlasses*glassCost$)+(nEnvelopes*envelopeCost$)); //total cost everything before taxes
        totalActuallyPaid$=(totalCostEverything$+totalTaxEverything$); //calculation for total everything paid
                
                //Creating a Table for my data
                System.out.println("                                                                   ");//space for clarity
                System.out.println("                                                                   ");//space for clarity
                System.out.println("Below I created a table that has columns for every item I purchased -- widen your terminal to see it perfectly"); //defineing my table -- it does require a large window to view it perfectly, but you can figure that out
                System.out.println("Each of these numbers is in a layout format of (dollars).(cents)");//space for clarity
                System.out.println("                                                                   "); //space for clarity
                System.out.println("-------------------------------------------------------------------------------------------------------------"); //separating table from everything else
                System.out.println("I bought three items:                   SOCKS                      GLASSES                 ENVELOPES  "); //items purchased
                System.out.println("Quantity of each item:               "+(nSocks)+   "                            "+(nGlasses)+"                      "+(nEnvelopes) ); //number of items purchased
                System.out.println("Cost of each item alone:             "+(sockCost$)+"                         "+(glassCost$)+"                   "+(envelopeCost$) ); //specific costs
                System.out.println("Sales tax per item:                  "+(int)(sockCost$*taxPercent*100)/100.0+"                         " +(int)(glassCost$*taxPercent*100)/100.0+"                   " +(int)(envelopeCost$*taxPercent*100)/100.0 ); //tax costs per item
                System.out.println("--------------------------------------------------------------------------------------------------------------"); //separating table from everything else
                System.out.println("                                                                   ");//space for clarity
                System.out.println("The total cost of my purchase before tax will be "+(totalCostEverything$)+" dollars."); //total cost before tax
                System.out.println("The total sales tax for my purchase will be "+ (int)(totalTaxEverything$*100)/100.0+" dollars."); //Total taxes paid
                System.out.println("The total cost of my purchase including sales tax will be "+ (int)(totalActuallyPaid$*100)/100.0+" dollars."); //Total total everything paid
                System.out.println("                                                                   ");//space for clarity
                System.out.println("                                                                   ");//space for clarity




    }   //End of the main method
} //End of class