//Grant David Moore
//December 2 2014
//CSE -- Lab 13
//Practice with Arrays and random number generators as well as sorting

import java.util.Scanner; //Setting up a scanner for user input
import java.util.Arrays; //Setting up the ability for array java commands
public class lab13{ //The main class for all methods
  
        public static void main(String [] arg){ //The main method which runs first and calls all of the other methods
         
                //Must introduce all fo the variables outside of the "if" scopes below so that the print statements outside of the if statements dont get confused
                int[]line1=null;
                int[]line2=null;
                int[]line3=null;
                int[]line4=null;
                int[]line5=null;
                
                System.out.println("The array before sorting");//Astetic for clarity
                    
                    for(int B=0; B<5; B++){ //loop that runs through all my lines to fill each array on each line with correct variables
                    int C= (B*3+5); //Dictates how many slots are in each line
                     
                        if(B==0){ //Need to do this so I can differentiate which line is which
                            line1 = fillarray(C); //Fills the first line with random variables between 0-39
                            print(line1); //Prints the randomized line
                            Arrays.sort(line1); //Sorts the line from smallest to largest for future use
                       }
                        if(B==1){
                           line2 = fillarray(C);
                           print(line2);
                           Arrays.sort(line2);
                       }
                        if(B==2){
                           line3 = fillarray(C);
                           print(line3);
                           Arrays.sort(line3);
                       }
                        if(B==3){
                           line4 = fillarray(C);
                           print(line4);
                           Arrays.sort(line4);
                       }
                        if(B==4){
                           line5 = fillarray(C);
                           print(line5);
                           Arrays.sort(line5);
                       }
                    }
                    
        System.out.println(); //Space for clarity
        System.out.println();            
        System.out.println("The array after sorting");//Athestic for what im doing
            print(line1);//Prints sorted array
            print(line2);
            print(line3);
            print(line4);
            print(line5);
            
        }
        
        
        public static int[] fillarray(int ArrayLength){ //Method which fills my arrays
            int [] ArrayToReturn = new int [ArrayLength]; //Setting up my array to return
            
                for(int i=0; i<ArrayLength; i++){ //Runs down each slot and fills it with a random number
                    ArrayToReturn[i] = (int)((Math.random()*39));
                }
                
            return(ArrayToReturn);
        }
        
       
        public static String print(int []PrintArray){ //Goes down the length of my array and prints it out slot by slot because I wrote this before I used array java commands -- there is a better way but, meh
            
            for (int i=0; i<PrintArray.length; i++){
				
				System.out.print(PrintArray[i]+ " ");
				}
				System.out.println();
				return("");
	    }
	    
	    
	   /* public static int[] sort(int [] ArrayToSort){
            int [] ArrayToReturn = new int [ArrayToSort.length];
            
                for(int i=0; i<ArrayToSort.length; i++){
                    ArrayToReturn[i]=ArrayToSort[i];
                    for (int j=i+1; j<ArrayToSort.length; j++){
                        
                        
                        if(ArrayToSort[j]<=ArrayToSort[i]){
                            ArrayToReturn[i]=ArrayToSort[j];
                        }
                    }
                }
                
            return(ArrayToReturn);
        }*/

}//Close class