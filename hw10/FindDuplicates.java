//Grant Moore
//CSE002 -- November 18 2014
//Homework 10
//This program checks to see if an array of ten numbers the user inputs has an duplicates


import java.util.Scanner; //Setting up a scanner for user input
public class FindDuplicates{ //The main class for all methods
  
        public static void main(String [] arg){ //The main method which runs first and calls all of the other methods
                Scanner scan=new Scanner(System.in); // Finalizing the scanner
                int num[]=new int[10]; //Setting up how many numbers will be in our array
                String answer=""; //Setting up a variable to use at the end of our pragrama dn see if the user wants to run it over again
                do{
                  System.out.print("Enter 10 ints- "); //Print statement for user instruction
                  for(int j=0;j<10;j++){ //A for loop which takes all four integers from the user
                    num[j]=scan.nextInt();
                  }
                  String out="The array "; //Print statement for what happenes in the following method
                  out+=listArray(num); //entering into the method given to us 
                  if(hasDups(num)){ //Calling into the first method we write
                    out+="has "; //Printing if first method true
                  }
                  else{
                    out+="does not have ";//Printing if first method false
                  }
                  out+="duplicates."; //Adding the last of the what is to be printed to our statement
                  System.out.println(out); //Printing out our print statement 
                  out="The array "; //Resetting our variable out for the next method
                  out+=listArray(num); //Recalling the user inputed numbers    
                  if(exactlyOneDup(num)){ //Calling into second method and adding has to print statement if true
                    out+="has ";
                  }
                  else{
                    out+="does not have ";//Adding this if not
                  }
                  out+="exactly one duplicate."; //Finsihing the print statement
                  System.out.println(out); //Printing all we have added to one
                System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); //U?ser instruction
                  answer=scan.next(); //Input if continue
        }while(answer.equals("Y") || answer.equals("y")); //Running out do while loop
      }//Closing main method

  
  
  
  public static String listArray(int num[]){ //Given method -- this changes our inputed in varaibles intoa  usable array -- no need to comment out each loop and counter
    String out="{"; 
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
        
        
        public static boolean exactlyOneDup(int num[]){//Second called method which checks to see if the is exactly one duplicate
            boolean a=false; //Setting variable to be pushed out eventually
            int runner=0; //running variable which changes depended upon there being more than one duplicate number
            
            for(int z=0; z<num.length; z++){ //The next two loops run down the entire array and check it for duplciates
                for(int y=z+1; y<num.length; y++){
                    if(num[z]==num[y]){
                        runner++;//If there is a duplicate, this goes up one
                    }
                }
            }
            
            if(runner==1){ //if it only went up one above, then this prints out because there was only one duplciate
                a=true;
            }
            return a;//Return statement
        }
        
                
        public static boolean hasDups(int num[]){ //First method checks to see if there are any duplicates
                
            for(int z=0; z<num.length; z++){ //The next two loops run down array seeing if any part of the array is equal to itself
                for(int y=z+1; y<num.length; y++){
                    if(num[z]==num[y]){
                        return true;//if any part of the array is equal to itself then returns that there is at least one dup
                    }
                }  
            }
            return false; //if not dup, return not
        }
            
}
