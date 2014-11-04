//Grant David Moore
//October, 21, 2014
//Course: CSE002
//Section: 00
//This program takes an input from the user and produces a decending pyramid of numbers of length dependent on input 

import java.util.Scanner; //Sets up the ability of inputs from the user


public static void main(String[] args){
/*	int x =1;
	println("be" + x);fore the call
	increment(x);
	…println(“After the call, x= ” + x);

*/

Scanner sc=new Scanner(System.in);
try
{
  System.out.println("Please input an integer");
  //nextInt will throw InputMismatchException
  //if the next token does not match the Integer
  //regular expression, or is out of range
  int usrInput=sc.nextInt();
}

catch(InputMismatchException exception)
{
  //Print "This is not an integer"
  //when user put other than integer
  System.out.println("This is not an integer");

}}




