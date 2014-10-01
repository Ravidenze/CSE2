//Grant David Moore
//September, 29, 2014
//Course: CSE002
    //Section: 00
//Re-visitng the Big Mac Assignment with renewed vigor
    //This code will allow a user to input the amount of Big Macs he is buying
    //as well as if he wants fries or not...
        //It will then calculate how much the transaction will cost with fries or without fries
    


import java.util.Scanner; //Sets up the ability of inputs from the user -- multiple inputs
 
       
    //define class
    public class BigMacAgain {
        //add main method -- required for every Java Program
        public static void main(String[] args) {
    
    
            //Finalizes allowing user input -- the first input -- in this case the only
            Scanner myScanner1;
            myScanner1 = new Scanner( System.in );
            
                
            
                
                   
            
                    //Variables for user input and their respective instructions
                    System.out.print("Enter the number of BigMacs being purchased (as an integer): "); //Asking the user for the amount of big macs they would like to consume
                         int nBM = myScanner1.nextInt();//Actually taking in the number for amount of BigMacs
                    
                     //introducing a variable for cost of BigMacs and giving it a number  
                    double costBM;
                    costBM = ((nBM*2.22)*100)/100.0;
                    
                             
                                   if (nBM>0){ //Checking to see if the user inputed a integer, and if so, allowing the program to continue
                                                       
                                    System.out.println("You ordered " +(nBM)+ " BigMac(s) at a total cost of (" +(nBM)+ ")x(2.22)= $" +(costBM)+ "");//Print statement with the amoutn ordered and the cost
                                   }
                                   
                                   else{
                                       
                                       System.out.println("You did not enter an interger greater than zero -- Can you eat negative BigMacs? ");
                                       return;
                                   }
                                                
                                                
                    //Asking about the fries                         
                    System.out.print("Would you like to get an order of fries with this order (enter either of the characters Y/N/y/n): ");//Finishing scanner set up for asking if user wants fries
                    String Fries = myScanner1.next();//Finding if the user of this program would like to include fries with the order
                    
                          

                                        if (Fries.equals("Y") || Fries.equals("y")) {//checks to see if yes
                                            System.out.println("You ordered fries at a cost of $2.15 ");//this line prints if the user ordered fries
                                            System.out.println("The total cost of your order is now $" +(costBM + 2.15)+ "");//this line prints if the user ordered fries
                                            return;
                                        }
                                        
                                        if (Fries.equals("N") || Fries.equals("n")) { //checks to see if no
                                            System.out.println("The total cost of your order then without fries stays at $" +(costBM)+ "");//this line prints if the user chooses to not order fries
                                            return;
                                        }
                                        
                                        else {
                                            System.out.println("You did not enter one fo the correct options, please try again.");//this line prints if the user chooses to not order fries
                                            return;
                                        }
                
                          
                       
    }   //End of the main method
} //End of class