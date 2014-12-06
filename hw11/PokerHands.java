//Grant David Moore
//Poker Hands Homework 11
//CSE 2
//Practice with Arrays and everything else before them


import java.util.Scanner; //Setting up a scanner for user input
public class PokerHands{ //The main class for all methods
  
  
  
  
public static void main(String [] arg){ 
        
    Scanner scan=new Scanner(System.in); //Finalizing the scanner
    
    int Suit1; //Setting up variable outside of following if statements for use later
    int Suit2;
    int Suit3;
    int Suit4;
    int Suit5;
    int Rank1;
    int Rank2;
    int Rank3;
    int Rank4;
    int Rank5;
    int [] Suit = new int[5];
    int [] Rank = new int[5];
        
    System.out.println("This program will check to see if a set of cards you enter come together to make a royal flush");
    System.out.println("Enter 'y' or 'Y' to enter a(nother) hand, enter anything else to quit- ");
    String UserInput = scan.nextString();
        
        while(UserInput=="y" || UserInput=="Y"){
            
            Suit1 = getSuit(); Suit[0]=Suit1; //Obtains a different card combination for five cards
            Rank1 = getRank(); Rank[0]=Rank1;    
            
            Suit2 = getSuit(); Suit[1]=Suit2;
            Rank2 = getRank(); Rank[1]=Rank2;
            
                while(Suit[0] == Suit[1] && Rank[0] == Rank[1]){
                    System.out.println("You already entered that card");
                    Suit2 = getSuit(); Suit[1]=Suit2;
                    Rank2 = getRank(); Rank[1]=Rank2;
                }
                       
            Suit3 = getSuit(); Suit[2]=Suit3;
            Rank3 = getRank(); Rank[2]=Rank3;
                while(Suit[1] == Suit[2] && Rank[1] == Rank[2]){
                    System.out.println("You already entered that card");
                    Suit3 = getSuit(); Suit[2]=Suit3;
                    Rank3 = getRank(); Rank[2]=Rank3;
                }
            
            Suit4 = getSuit(); Suit[3]=Suit4;
            Rank4 = getRank(); Rank[3]=Rank4;
                while(Suit[2] == Suit[3] && Rank[2] == Rank[3]){
                    System.out.println("You already entered that card");
                    Suit4 = getSuit(); Suit[3]=Suit4;
                    Rank4 = getRank(); Rank[3]=Rank4;
                }
            
            Suit5 = getSuit(); Suit[4]=Suit5;
            Rank5 = getRank(); Rank[4]=Rank5;
                while(Suit[3] == Suit[4] && Rank[3] == Rank[4]){
                    System.out.println("You already entered that card");
                    Suit5 = getSuit(); Suit[4]=Suit5;
                    Rank5 = getRank(); Rank[4]=Rank5;
                }       
        
        
        int Finisher = checkHand(Suit, Rank); //goes to a final point which prints out what the person has
        
        
        System.out.println("Enter 'y' or 'Y' to enter a(nother) hand, enter anything else to quit- ");
        String UserInput = scan.nextString(); 
        }
}
  
 
 
 public static void getSuit(){
    System.out.println("Enter the suit: 'c', 'd', 'h', or 's'- ");
    String Suit =  scan.nextString();
    int RS; //return variable      
            while(!Suit == 'c' || !Suit == 'd' || !Suit == 'h' || !Suit == 's'){ //Makes sure user enters a valid letter
                System.out.println("You did not enter a valid response");
                System.out.println("Enter the suit: 'c', 'd', 'h', or 's'- ");
                String Suit =  scan.nextString();
            }
            
        if(Suit=='c'){
            RS=1;
        }
        if(Suit=='d'){
            RS=2;
        }
        if(Suit=='h'){
            RS=3;
        }
        if(Suit=='s'){
            RS=4;
        }
        
        
    
    return(RS);
 }


public static void getRank(){

    System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ... '2'- ");
    String Rank =  scan.next();  
    int RS;
            while(!Rank == 'a' || !Rank == 'k' || !Rank == 'q' || !Rank == 'j' || /*!Rank == '10' ||*/ !Rank == '9' || !Rank == '8' || !Rank == '7' || !Rank == '6' || !Rank == '5' || !Rank == '4' || !Rank == '3' || !Rank == '2'){ //Makes sure user enters a valid letter
                System.out.println("You did not enter a valid response");
                System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ... '2'- ");
                String Rank = scan.nextString();
            }
            
        if(Rank=='a'){
            RS=1;
        }
        if(Rank=='k'){
            RS=13;
        }
        if(Rank=='q'){
            RS=12;
        }
        if(Rank=='j'){
            RS=11;
        }
        //if(Rank=='10'){
          //  RS=10;
        //}
        if(Rank=='9'){
            RS=9;
        }
        if(Rank=='8'){
            RS=8;
        }
        if(Rank=='7'){
            RS=7;
        }
        if(Rank=='6'){
            RS=6;
        }
        if(Rank=='5'){
            RS=5;
        }
        if(Rank=='4'){
            RS=4;
        }
        if(Rank=='3'){
            RS=3;
        }
        if(Rank=='2'){
            RS=2;
        }
       
    return(RS);
}
 
 
  
public static void checkHand(int Suit[], int Rank[]){
    for(int i=0; i<5; i++){
        if(Rank[i]==1){
            for(int j=0; j<5; j++){
                if(Rank[i]==13){
                    for(int k=0; k<5; k++){    
                        if(Rank[i]==12){
                            for(int l=0; l<5; l++){
                                if(Rank[i]==12){
                                    System.out.println("You have entered a royal flush!");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    System.out.println("You did not enter a royal flush");
    return(1);
}
  
  
public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }//End given method
}//End Class
