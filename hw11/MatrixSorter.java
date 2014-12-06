//Grant David Moore
//Matrix Sorter Homework 11
//CSE 2
//Practice with ThreeDs


import java.util.ThreeDs;
import java.util.Scanner; //Setting up a scanner for user input



public class MatrixSorter{

    public static void main(String arg[]){ //Given main method
        int mat3d[][][];
        mat3d = buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is " +
            findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }

    
    
    public static int[][][] buildMat3d(){
        int[][][] ThreeD = new int[7][7][]; //allocating the slabs spaces columns and rows

                for (int i=0; i<ThreeD.length; i++){
                    for (int j=0; j<ThreeD[i].length; j++){
                        ThreeD[i][j] = new int[i+j+1]; //Given to us in directions
                    }
                }
        
                for (int i=0; i<ThreeD.length; i++){ //This is main part of allocating and filling ThreeD -- everything below is tied into the first, second and then third layer as every allocated spot is filled
                    for (int j=0; j<ThreeD[i].length; j++){
                        for (int k=0; k<ThreeD[i][j].length; k++){
                            ThreeD[i][j][k] = (int)(Math.random() * 100); //From 0-99 radnom number filled
                        }
                    }
                }
    return(ThreeD);
    }

    
    
    public static void show(int[][][] ThreeD){ //Print statement for our newly allocated but unsorted arrays
        
                for (int i=0; i<ThreeD.length; i++){
                    System.out.println("-------------Slab " + (i + 1));
                    
                    for (int j=0; j<ThreeD[i].length; j++){
                        for (int k=0; k<ThreeD[i][j].length; k++){
                            System.out.println(ThreeD[i][j][k]);
                        }
                        
                        System.out.println();
                    }
                }
    return(' ');
    }

    
    
    public static void findMin(int[][][] ThreeD){
        int min = ThreeD[0][0][0];

                for (int i=0; i<ThreeD.length; i++){
                    for (int j=0; j<ThreeD[i].length; j++){
                        for (int k=0; k<ThreeD[i][j].length; k++){
                            if (ThreeD[i][j][k] < min)
                                min = ThreeD[i][j][k]; //Changes the set min above to the new min found here
                                
                        }
                    }
                }
    return(min);
    }

   
   
    public static void sort(int[][] ThreeD){ //This based on his hint is not correct? He says to sort line by line using a single array?
       
       //Couldnt get my selection sort to work at all and wasnt coming together so... I left it out
       //Not to mention I had pulled most of my knowledge for it off line so I didnt feel I'd learned it -- plus it only was working in a one line array at a time?
    
    //I could write code that checks and sorts single arrays for their values using single line sorting? I'm confused because this is what Brian's hint says to do but his directions say not to? Huh?     
    
    //Okay I have thouroughly confused myself, I give up 
    //Sorry I'm a failure haha
    return(' '); 
    }
} //closes everything... so done
