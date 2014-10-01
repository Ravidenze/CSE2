//Grant David Moore
//September, 29, 2014
//Course: CSE002
    //Section: 00
//Random Games
    //This program lets the user play one of three cames -- Roulette, Craps or Picking a card from a deck of cards
    //It makes use of the random generator for just about everything
    
//All return statements end the program
//All break statements break the string once the desired change has been made

import java.util.Scanner; //Sets up the ability of inputs from the user -- multiple inputs
       
    //define class
    public class RandomGames {
        //add main method -- required for every Java Program
        public static void main(String[] args) {
    
    
        //Finalizes allowing user input -- the first input
        Scanner myScanner1;
        myScanner1 = new Scanner( System.in );
            
                
        
                    //Askign the user for a specific input
                    System.out.println("The follow program will let you play one of three games. Either variable (X/x) may be used for the respective game "); //Instructions for the user
                    System.out.print("Enter R/r for Roulette, C/c for Craps or P/p for Pick a Random Card: "); //Instructions for the user regarding specific card game options
                                    String Game = myScanner1.next();//Actually taking and recording the user input
                    
                    
                    if (Game.equals("R") || Game.equals("r")) {//Checks to see if user wants to play roulette
                                
                                int RT = (int)((Math.random()*38)); //Stands for Roulette Try -- sets up a random number representing your roulette try
                            
                                            if (RT == 37) {
                                                RT = 00;
                                            }
            
                                System.out.println("Roulette: " +(RT)+ "");//this line prints the random roulette number generated
                                return;
                    }
                            
                    else if (Game.equals("C") || Game.equals("c")) { //Checks to see if user wants to play craps
                                
                                int DR1 = (int)(1+(Math.random()*6)); //Stands for Die Roll 1 -- sets up a random number representing one die roll 1
                                int DR2 = (int)(1+(Math.random()*6)); //Stands for Die Roll 2 -- sets up a random number representing one die roll 2
                                int CrapsTotal = (DR1 + DR2);
                                System.out.println("Craps: " +(DR1)+ "+" +(DR2)+ "=" +(CrapsTotal)+ "");//this line prints the craps number attained
                                return;
                    }
                    
                    else if (Game.equals("P") || Game.equals("p")) { //Checks to see if user wants to play Pick a random card
                                
                                int CS = (int)((Math.random()*4)); //Stands for card suit -- sets up a random number representing the card suit
                                int CN = (int)((Math.random()*13)); //Stands for card number -- sets up a random number representing the card number
                                
                                System.out.print("Your card is the ");//Starting the print statement 
                                   
                                  //This entire swtich statement prints out the number of the random card 
                                    switch (CN % 13) {
                                        case 0: System.out.print("Ace of "); break;
                                        case 1: System.out.print("2 of "); break;
                                        case 2: System.out.print("3 of "); break;
                                        case 3: System.out.print("4 of "); break;
                                        case 4: System.out.print("5 of "); break;
                                        case 5: System.out.print("6 of "); break;
                                        case 6: System.out.print("7 of "); break;
                                        case 7: System.out.print("8 of "); break;
                                        case 8: System.out.print("9 of "); break;
                                        case 9: System.out.print("10 of "); break;
                                        case 10: System.out.print("Jack of "); break;
                                        case 11: System.out.print("Queen of "); break;
                                        case 12: System.out.print("King of "); break;
                                        
                                    }
                                
                                //And this switch statement prints out the suit of the random card
                                    switch (CS % 4) {
                                        case 0: System.out.println("Clubs"); break;
                                        case 1: System.out.println("Spades"); break;
                                        case 2: System.out.println("Hearts"); break;
                                        case 3: System.out.println("Diamonds"); break;
                                    }
                                
                    return;
                    }
                            
                    
                    else {
                        if (Game.length()>1) {
                             System.out.println("A single character was expected");//The user did not enter the correct number of characters
                             System.out.println("Please try again.");//Prompting user to do it correctly this time
                             return;
                        }
                                
                        else   {     
                            System.out.println("You did not enter any of the letters R/r, C/c or P/p.");//The user did not enter an available letter for playing a game
                            System.out.println("Please try again.");//Prompting user to do it correctly this time
                            return;
                        }
                    }

                       
    }   //End of the main method
} //End of class