//Grant David Moore
//October, 21, 2014
//Course: CSE002
//Section: 00
//This program takes an input from the user and produces a decending pyramid of numbers of length dependent on input 

import java.util.Scanner; //Sets up the ability of inputs from the user



import java.util.Scanner;
public class Testing {
	public static void main(String [] args){

int i=-1;
int j;
//int a=0;
int b=0;
int c=1;
System.out.println("[START]");

			
			for(j=0; j<6; j++){		
					
					for(i=i; i<j; i++){
					System.out.println("[" +(c)+ "]");		
					}
					
					b++;
					c=(c+b);
			}


System.out.println("[END]");		
		
	}
}

