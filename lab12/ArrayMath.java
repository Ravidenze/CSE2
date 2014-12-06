//Grant David Moore
//December 2 2014
//CSE -- Lab 12
//Practice with Arrays and multiplying/adding them

import java.util.Scanner; //Setting up a scanner for user input
import java.util.Arrays; //Setting up the ability for array java commands

public class ArrayMath{
  
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+ " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+ " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+ " == "+display(z));
  }


  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  
    public static boolean equals(double []one, double []two){
      
    if(one.length != two.length){
        return false;
    }
    
    for(int i=0; i<one.length; i++) {
        if(one[i] != two[i])
            return false;
    }
    
    return true;
    }

    
    
    public static double[] addArrays(double []one, double []two){
    
          
    int length1 = one.length;
    int length2 = one.length;
        
        if(one.length>two.length){
            length1=two.length;
        }
        
        if(one.length<two.length){
            length2=two.length;
        }
  
    double [] ArrayToReturn = new double [length2]; //Setting up my array to return
    
    for(int i=0; i<length1; i++){
        ArrayToReturn[i]=(one[i]+two[i]);
    }
    
    for(int i=length1; i<length2; i++){
        
        if(one.length<two.length){
            ArrayToReturn[i]=(two[i]);
        }
        else if(two.length<one.length){
            ArrayToReturn[i]=(one[i]);     
        }
    }
    return(ArrayToReturn);   
    }
}