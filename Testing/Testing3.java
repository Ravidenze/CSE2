//Grant David Moore
//October, 21, 2014
//Course: CSE002
//Section: 00
//This program takes an input from the user and produces a decending pyramid of numbers of length dependent on input 

import java.util.Scanner; //Sets up the ability of inputs from the user



import java.util.Scanner;
public class Testing3 {
	public static void main(String [] args){

int i=-1;
int j;
int b=-1;
int c=1;


			
			for(j=0; j<5; j++){		
					
					for(i=-1; i<j; i++){
					System.out.print(c+b);		
					}
					b++;
					System.out.println();
			}

            
            
            for(j=5; j>=0; j--){		
					
					for(i=0; i<j; i++){
					System.out.print(c+b);		
					}
					b++;
					System.out.println();
			}

	
		
	}
}

