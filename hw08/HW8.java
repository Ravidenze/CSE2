//Grant David Moore
//October, 28, 2014
//Course: CSE002
//Section: 00
//This program takes us on an adventure of methods to output certain things dictated in and by each method



import java.util.Scanner; //Setting up the ability for a scanner in this program
public class HW8 { //Stating a class -- Necessary for running
	public static void main(String[] arg) { //Introducing the main method

		char input; //Introducing variable for use throughout main method and respective methods

		Scanner scan = new Scanner(System.in); //Finalizing the ability to use a scanner


		System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); //Prompting user for something
		input = getInput(scan, "Cc"); //Sending program to first method
		System.out.println("You entered '" + input + "'"); //When the program returns from completing the first method, it outputs here and prints the value finally achieved


		System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); //Prompting the user for something
		input = getInput(scan, "yYnN", 5); //Sending the program to the second method which will give up after 5 attempts


		if (input != ' ') { //Checking to see what the second method output
			System.out.println("You entered '" + input + "'"); //If the second method outputed anything besides a blank, this prints out the output -- should be a charcter in this string: "YyNn"
		}


		input = getInput(scan, "Choose a digit.", "0123456789");//Sending program to thirs method -- similar to first
		System.out.println("You entered '" + input + "'"); //Print statement for third method


	}//Closing main void





	public static char getInput(Scanner scan, String Continue) { //First method to be run

			String Length = CheckLength(scan); //Sending this method to another side method which checks the user input length
			String CEL; //Introducing a variable for use in my inner while statement below -- Means: Counting every letter


			int count = 0; //A variable to perpetuate my inner while loop
			int outside = 0; //A variable which perpetuates my outer while loop until the inner finds a solution
			while (outside == 0) { //This will run until user inputs something correct

				while (count < Continue.length() && Continue.charAt(count) != ' ') { //Starting the while loop which checks every letter in the string given to me by assignment "Cc" and sees if it is equal to input of user found in inside method
					CEL = Continue.charAt(count) + ""; //Taking my 'Check Every Letter' variable and assigning it to the character at whatever point my while loop is at along the length of the string Continue

					if (CEL.equals(Length)) { //Checking to see if the letter we are currently at along the string of Continue is equal to our inputed string
						return Length.charAt(0); //If the user inputed a correct character, this returns that character to the main method for use in a follow up statement
					} //Closing if statement
					count++; //Each time this loop passes my if statement, the count increases to check the next letter -- i.e. This is just progressing my loop
				} //closing inner while loop


				System.out.print("You did not enter a character from the list '" + Continue + "'; try again- "); //Print statement for an error on the input
				Length = CheckLength(scan); //Re-enters the inner method to re-ask the user for an input
				count = 0; //resetting the count to allow my inner while loop to do its thing again
			} //closing outer while loop
			return ' '; //Tricking java into allowing me to run this method like I want it to
		} //Ending Frist method



	public static String CheckLength(Scanner scan) { //Method that runs within the first method -- The inner method

			String InputScan = scan.next(); //Actually taking the users input

			while (!(InputScan.length() == 1)) { //A while loop checking if what the user entered is not one character long
				System.out.print("You should enter exactly one character- "); //If it is not one character long, this loops runs until the user enters one only one character long -- once it gets that it goes back to the upper method and starts again where it left off
				InputScan = scan.next(); //Re-taking the user input
			}
			return InputScan; //A return statement for when the user actually enters the right amount of letters
		} //Ending Inner method for first method





	public static char getInput(Scanner scan, String Four, int Five) { //Second method to be run

			int Run = 0; //Setting a variable to run my while loop
			int count = 0; //Resetting my count variable for the same use in this method as above
			String CEL; //Resetting my CEL variable for the same use in this method as above					

			while (Run < Five) { //Loop to run five times

				String Beer = scan.next(); //Setting a variable to take the place of my user input

				while (count < Four.length() && Four.charAt(count) != ' ') { //Starting the while loop which checks every letter in the string given to me by assignment "YyNn" and sees if it is equal to input
					CEL = Four.charAt(count) + ""; //Taking my 'Check Every Letter' variable and assigning it to the character at whatever point my while loop is at along the length of the string Four

					if (CEL.equals(Beer)) { //Checking to see if the letter we are currently at along the string of Four is equal to our inputed string
						return Beer.charAt(0); //If the user inputed a correct character, this returns that character to the main method for use in a follow up statement
					}
					count++; //Each time this loop passes my if statement, the count increases to check the next letter -- i.e. This is just progressing my loop
				}


				System.out.print("You did not enter a character from the list '" + Four + "'; try again- "); //Print statement for an error on the input
				count = 0; //resetting the count to allow my inner while loop to do its thing again
				Run++; //Increment for the number of times I have run the inner while loop -- Used to kick out after five tries if the user can't get it right in five tries
			}
			System.out.println(); //space for clarity
			System.out.println("You failed after 5 tries "); //Print statement for ultimate failure	
			return ' ';
		} //Ending second method





	//A lot of this code in the third method is going to be a direct copy of the first method because it is so similar
		//I will only comment where changes occur to avoid redundency

	public static char getInput(Scanner scan, String Choose, String Ten) { //Third method to be run

			System.out.println("" + Choose + ""); //Print statement using the string given to us
			System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- "); //What the user should be inputing
			String Length2 = CheckLength2(scan); //Sending this method to a second side method which checks the user input length
			String CEL; 


			int count = 0; 
			int outside = 0; 
			while (outside == 0) { 

				while (count < Ten.length() && Ten.charAt(count) != ' ') { 
					CEL = Ten.charAt(count) + ""; 

					if (CEL.equals(Length2)) { 
						return Length2.charAt(0); 
					} 
					count++; 
				} 


				System.out.println("You did not enter an acceptable character "); //Print statement for an error on the input
				System.out.println("" + Choose + ""); //Utilizing the given string again
				System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");//What suer should be inputing
				Length2 = CheckLength2(scan); //Re-enters the inner method to re-ask the user for an input
				count = 0; 
			} 
			return ' '; 
		} 


	public static String CheckLength2(Scanner scan) { //Method that runs within the third method -- The 2nd inner method

			String InputScan = scan.next();

			while (!(InputScan.length() == 1)) { 
				System.out.println("Enter exactly one character "); //If it is not one character long, this loops runs until the user enters one only one character long -- once it gets that it goes back to the upper method and starts again where it left off
				System.out.println("Choose a digit"); //The string given to us in the above method doesnt reach here, so I just wrote it out manually
				System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");//More of the same
				InputScan = scan.next(); //Re-taking the user input
			}
			return InputScan; //A return statement for when the user actually enters the right amount of letters for third method
		} //Ending Inner method for third method

}//Ending Class overall