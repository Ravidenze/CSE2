//Grant David Moore
//October, 21, 2014
//Course: CSE002
//Section: 00
//This program takes an input from the user and produces a decending pyramid of numbers of length dependent on input 

import java.util.Scanner; //Sets up the ability of inputs from the user

//define class
public class Testing2 {
    //add main method -- required for every Java Program
    public static void main(String[] args) {
int i;
int temp =1;

//for(i=0; i<4; i++){

    
    for(int j=0; j<6; j++){
        
        for(int k=0; k<j+1; k++){
            
            System.out.print( temp );
            
        }
        System.out.println();
    }
     temp=temp*2;
//}


}
} //Ending class