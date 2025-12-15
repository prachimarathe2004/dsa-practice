//Constructor Overloading
//This is a key concept in OOP related to constructors is constructor overloading. This allows us to create multiple constructors in the same class with different parameter lists.



import java.io.*;

public class Geeks4 {
    
    // constructor with one argument (String)
    Geeks4(String name){
        
        System.out.println("Constructor with one "
                           + "argument - String: " + name);
    }

    // constructor with two arguments (String and int)
    Geeks4(String name, int age){

        System.out.println(
            "Constructor with two arguments: "
            + " String and Integer: " + name + " " + age);
    }

    // Constructor with one argument (long)
    Geeks4(long id)
    {
        System.out.println(
            "Constructor with one argument: "
            + "Long: " + id);
    }
    
    // The main method acts as the entry point for the program
    public static void main(String[] args){
        
        // Creating the objects of the class named 'Geeks4'
        // by passing different arguments to invoke specific constructors
        System.out.println("--- Creating Objects ---");
        
        Geeks4 geek2 = new Geeks4("Sweta");

        // Invoke the constructor with two arguments
        Geeks4 geek3 = new Geeks4("Amiya", 28);

        // Invoke the constructor with one argument of
        // type 'Long'.
        Geeks4 geek4 = new Geeks4(325614567L); // Added 'L' suffix for long literal
    }
}
