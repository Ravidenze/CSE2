//Grant David Moore
//September, 23, 2014
//Course: CSE002
    //Section: 00
//Course number program
    //The semester during which a course is offered at Lehigh is given by a 6 digit number. The first four digits give the year, and the last two digits give  
    //the semester: 10 spring, 20 summer 1, 30 summer 2, and 40 fall. Write a program that reads in a 6 digit number, makes sure that it adheres to the above description, and then
    //prints out the semester and year
    


import java.util.Scanner; //Sets up the ability of inputs from the user
 
       
    //define class
    public class CourseNumber {
        //add main method -- required for every Java Program
        public static void main(String[] args) {
    
    
            //Finalizes allowing user input
            Scanner myScanner;
            myScanner = new Scanner( System.in );
            
                  
                   
            
                    //Variables for user input and their respective instructions
                    System.out.print("Enter the six digit course number of a course of your chooseing: ");
                        
                        
                        //Setting up variables for later use
                        int nCourse = myScanner.nextInt();//Actually taking in the number for cubedrooting
                        int dCourse;
                        int Year;
                        
                        //Changeing those variables so that they come up with number I want -- the dCourse gives me the numbers decimal when diveded by 100 multiplied by 100
                        dCourse = nCourse%100;
                        Year = ((int)(nCourse/100) - (dCourse/100));
                        
                        //All RETURN functions terminate the program -- I was having isues with it continuing outside of the ifs
                        //Setting the if statement for finding everything
                        if ((nCourse<=201440) && (nCourse>=186510) && (Year>=1865) && (Year<=2014)) {
                 
                                   if ( dCourse == 10 ) { 
                                       System.out.println("The course was offered in the Spring semester of " +(Year)+ ".");//Printing out when the course was done
                                       return;
                                   }
                           
                                   if (dCourse == 20) {
                                       System.out.println("The course was offered in the Summer 1 semester of " +(Year)+ ".");//Printing out when the course was done
                                       return;
                                   }
                                  
                                   if (dCourse == 30) {
                                       System.out.println("The course was offered in the Summer 2 semester of " +(Year)+ ".");//Printing out when the course was done
                                       return;
                                   }
                                   
                                   if (dCourse == 40)  {
                                       System.out.println("The course was offered in the Fall semester of " +(Year)+ ".");//Printing out when the course was done
                                       return;
                                   }
                                    else {
                                        System.out.println("" +(dCourse)+ " is not a legitimate semester.");//Printing out an error on the users part
                                        return;
                                    }
                        }
                         else {
                             System.out.println("" +(nCourse)+ " is not a legitimate course number -- it does not lie between 186510 and 201440.");//Printing out an error on the users part
                             return;//Should the number for the course not fit, this terminates the program
                        }
                        
                       
                     
    }   //End of the main method
} //End of class