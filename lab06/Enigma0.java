/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  
  public static void main(String[] args){
    Scanner scan;
    scan = new Scanner(System.in);
    
    System.out.print("Enter an int- ");
    int n=scan.nextInt();
    System.out.println("You entered "+n);
    
    
    int k=4,p=6,q=7,r=8;
  
  
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
1.The existing if and else statements were used wrong, their purpose was supposedly to
exit the program if the user did not enter an integer -- which was done wrong and is unecessary anyway because if the user enters
anything but an integer, due to the scan statement, the program will automatically kick out. They can just be removed and the 
print statement for 'n' can just be moved out along with the statement actually asking for input

      
2. When introducing variables (k,p,q,r), it is unecessary to introduce 'n' because it has already been introduced above
 */
