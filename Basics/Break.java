// Java Program to Illustrate break statement
import java.io.*;

class Break {
  
    public static void main (String[] args) {
      
      //assigning n as integer value
      int n = 8;
      
      //passing n to switch
      // it will check n and display output accordingly
      switch(n) {
          
        case 1: 
          System.out.println("GFG");
          break;
        case 2:
          System.out.println("Second Case");
          break;
        default:
          System.out.println("default case");
      }
    }
}
