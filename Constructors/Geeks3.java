public class Geeks3 {

    // Private constructor for the Geeks3 class
    // This prevents direct instantiation of the class from outside
    private Geeks3(){
        
        System.out.println("Private constructor called");
    }

    // Static method
    public static void displayMessage(){
        
        System.out.println("Hello from Geeks3 class!");
    }
    
    // The main method serves as the entry point for the program
    public static void main(String[] args){
        
        // We call the static method directly using the class name.
        // We cannot use 'new Geeks3()' here because the constructor is private.
        Geeks3.displayMessage();
    }
}
