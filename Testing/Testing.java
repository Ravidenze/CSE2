//Grant David Moore
//October, 21, 2014
//Course: CSE002
//Section: 00
//This program takes an input from the user and produces a decending pyramid of numbers of length dependent on input 

import java.util.Scanner; //Sets up the ability of inputs from the user



import java.util.Scanner;
public class Testing {
	public static void main(String [] args){

int [] A = {4, 2, 25};

System.out.println(A[i]);

int [] B = new int[A.length];
int j = 1; 
int maxlength = A.length; 				
				
				for (int i=0; i<A.length; i++){
				B[maxlength-j]=A[i];
				j++;
				System.out.print(B[i]+ " ");
				}
				System.out.println();
	}
}

