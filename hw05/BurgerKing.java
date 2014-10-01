//Grant David Moore
//September, 29, 2014
//Course: CSE002
    //Section: 00
//This program gives burger king a chance
    //Prompts user to input a choice of burger, soda or fries and details around that



    
//All return statements end the program
//All break statements break the string once the desired change has been made

import java.util.Scanner; //Sets up the ability of inputs from the user -- multiple inputs
       
    //define class
    public class BurgerKing {
        //add main method -- required for every Java Program
        public static void main(String[] args) {
    
    
        //Finalizes allowing user input -- the first input
        Scanner myScanner1;
        myScanner1 = new Scanner( System.in );
            
                
        
                    //Askign the user for a specific input
                    System.out.println("Below you will be prompted for what you would like to order at Burger King. You may only order one item at once. "); //Instructions for the user
                    System.out.println("Please make your selection in the form of a single character as per the instructions to follow. You may type the lower or capital letter of character listed. "); //Instructions for the user
                    System.out.println("Anything else will kick you out of the program. "); //Instructions for the user
                    System.out.println("                                                                                                                 ");//Space for clarity in actual program
                    System.out.println("Your options are a Burger, Soda or Fries:"); //Instructions for the user
                    System.out.println("For a Burger enter B or b "); //Instructions for the user
                    System.out.println("For a Soda enter S or s "); //Instructions for the user
                    System.out.println("For a order of Fries enter F or f "); //Instructions for the user
                    System.out.println("                                                                                                                 ");//Space for clarity in actual program
                    System.out.print("What would you like: ");//Prompting user for input following all instructions
                            String Order = myScanner1.next();//Actually taking and recording the user input
                    
                    System.out.println("                                                                                                                 ");//Space for clarity in actual program
                    
                    if (Order.equals("B") || Order.equals("b")) {//Checks to see if user wants a Burger
                                
                            System.out.println("What would you like on the Burger: ");//Clarity for following instructions
                            System.out.println("Select 'A/a' for all toppings ");//Details for burger
                            System.out.println("Select 'C/c' for just cheese ");//Details for burger    
                            System.out.println("Select 'N/n' for just the plain burger ");//Details for burger
                            System.out.print("Topping Choice: ");//Details for burger
                                String Topping = myScanner1.next();//Actually taking and recording the user input for toppings
                         
                                 switch (Topping) { //changing user input to what it is supposed to be
                                     case ("A"): Topping=("All Toppings"); break;
                                     case ("a"): Topping=("All Toppings"); break;
                                     case ("C"): Topping=("Cheese"); break;
                                     case ("c"): Topping=("Cheese"); break;
                                     case ("N"): Topping=("No Toppings"); break;
                                     case ("n"): Topping=("No Toppings"); break;
                                     default:
                                        if (Topping.length()>1){
                                            System.out.println("You did not enter a single character. ");//Printing out that the user made an error
                                            return;
                                        }
                                        else{
                                            System.out.println("You did not enter a valid Topping choice. ");//Printing out that the user made an error
                                            return;
                                        }
                                 }                 
                        System.out.println("You ordered a Burger with topping " +(Topping)+ ".");//final Print statement for burger
                                
                                return;
                    }
                            
                    else if (Order.equals("S") || Order.equals("s")) { //Checks to see if user wants to order a soda
                            
                            System.out.println("What type of soda do you want? ");//Clarity for following instructions
                            System.out.println("Select 'P/p' for pepsi ");//Details soda order
                            System.out.println("Select 'C/c' for coke ");//Details for soda order
                            System.out.println("Select 'S/s' for sprite ");//Details for soda order
                            System.out.println("Or select 'M/m' for sprite ");//Details for soda order
                            System.out.print("Soda Choice: ");//Details for soda order
                                String SodaChoice = myScanner1.next();//Actually taking and recording the user input for specific soda
                         
                                 switch (SodaChoice) { //setting soda choice to what it actually is
                                     case ("P"): SodaChoice=("Pepsi"); break;
                                     case ("p"): SodaChoice=("Pepsi"); break;
                                     case ("C"): SodaChoice=("Coke"); break;
                                     case ("c"): SodaChoice=("Coke"); break;
                                     case ("S"): SodaChoice=("Sprite"); break;
                                     case ("s"): SodaChoice=("Sprite"); break;
                                     case ("M"): SodaChoice=("Mountain Dew"); break;
                                     case ("m"): SodaChoice=("Mountain Dew"); break;
                                     default:
                                        if (SodaChoice.length()>1){
                                            System.out.println("You did not enter a single character. ");//Printing out that the user made an error
                                            return;
                                        }
                                        else{
                                            System.out.println("You did not enter a valid Soda choice. ");//Printing out that the user made an error
                                            return;
                                        }
                                 }                     

                        System.out.println("You ordered a " +(SodaChoice)+ ".");//final Print statement for soda
                                return;    
                               
                    }
                    
                    else if (Order.equals("F") || Order.equals("f")) { //Checks to see if user wants to order fries
                    
                            System.out.println("Do you want a large or small order of fries? ");//Clarity for following instructions
                            System.out.println("Select 'L/l' for a large fry ");//Details for fry
                            System.out.println("Select 'S/s' for a small fry ");//Details for fry
                            System.out.print("Choice of fries: ");//User input for what type of fry
                                String FryChoice = myScanner1.next();//Actually taking and recording the user input for type of fry
                         
                                 switch (FryChoice) { //switching fry choice to what it actually is
                                     case ("L"): FryChoice=("Large"); break;
                                     case ("l"): FryChoice=("Large"); break;
                                     case ("S"): FryChoice=("Small"); break;
                                     case ("s"): FryChoice=("Small"); break;
                                     default: 
                                        if (FryChoice.length()>1){
                                            System.out.println("You did not enter a single character. ");//Printing out that the user made an error
                                            return;
                                        }
                                        else{
                                            System.out.println("You did not enter a valid Fry choice. ");//Printing out that the user made an error
                                            return;
                                        }
                                 }                     

                        System.out.println("You ordered a " +(FryChoice)+ " Fry.");//final Print statement for fries
                         return;
                    }
                                
                               
                    
                    
                    else {
                        if (Order.length()>1) {
                             System.out.println("A single character was expected");//The user did not enter the correct number of characters
                             System.out.println("Please try again.");//Prompting user to do it correctly this time
                             return;
                        }
                                
                        else   {     
                            System.out.println("You did not enter any of the letters B/b, S/s or F/f.");//The user did not enter an available letter for an order
                            System.out.println("Please try again.");//Prompting user to do it correctly this time
                            return;
                        }
                    }

                       
    }   //End of the main method
} //End of class