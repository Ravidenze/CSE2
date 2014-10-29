//Grant David Moore
//October, 14, 2014
//Course: CSE002
    //Section: 00
//Roulette
    //This program is used to simulate the spinning of a roulette wheel 100 times, 1000 times
    //Confused yet? I was too
    




       
    //define class
    public class Roulette{
        //add main method -- required for every Java Program
        public static void main(String[] args) {
    
    
    int SpinCount = 0; //Setting a variable to run my roulette spinning loop
    int RunCount = 0; //Setting a variable for the amount of times my wheel gets spun 100 times
    
    
    int nWinsTotal = 0; //Setting a variable for my number of wins
    int nLoses = 0;
    int nWinsThisRound = 0;
    int nMoneyPerGame;
    int nTotalLoses = 0;
    
    
    int nTimesnetNeg = 0;
    int nTimesnetPos = 0;
    
    
    int Winnings; //Setting a variable as a place holder for the winnings
    
    
    while (RunCount>=0 && RunCount<=1000) { //Entering the loop to run my program
        
        while (SpinCount>=0 && SpinCount<=100){
        
            int PR = (int)((Math.random()*38));
                
                if (PR == 3){
                    nWinsTotal++; //Adding one to my number of games won
                    nWinsThisRound++;
                }
                else{
                    nLoses++; //Adding one to my number if losses
                }
                
               
                if (nLoses == 100){ //Checking to see if you never won during this spin sesh
                    nTotalLoses++; //Adding to your number of total loses
                }
                
                     nMoneyPerGame = (nWinsThisRound*36);
                     
                     if (nMoneyPerGame > 100){
                        nTimesnetPos++;
                     }
                     else{
                        nTimesnetNeg++;
                     }
         
        
        
        SpinCount++; //Adding one to spin count to progress while loop
        } //Terminating while loop actually doing the singular round of 100 spins
        
        RunCount++; //Progressing the numbner of times the simulation of 100 spins is run
    }
 
            Winnings=(36*nWinsTotal);//Firguring out dollar amount for winnings
 
    
    if (nTotalLoses > 0) {
        System.out.println("You totally lost everything " +(nTotalLoses)+ " times.");//Print statment for number of total failures
        }
    if (nWinsTotal> 0) {
        System.out.println("Your amount of winnings during this session of 1000 times spinning 100 times was " +(Winnings)+ " dollars.");//Print statment for amount of winnings
        }
    if (nTimesnetPos> 0) {
        System.out.println("You came out net positive in 100 spins of the wheel " +(nTimesnetPos)+ " times during these 1000 sessions.");//Print statment for number of times net postivitve
        }   
        
    }   //End of the main method
} //End of class