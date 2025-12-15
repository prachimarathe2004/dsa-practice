// Parameterized Constructor



class Geeks2{

    // data members of the class
    String name;
    int id;

    // Parameterized Constructor
    Geeks2(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    // Method to display object data
    void display(){
        
        System.out.println("GeekName: " + name
                           + " and GeekId: " + id);
    }

    // main() method — placed inside the same class for
    // universal compatibility
    public static void main(String[] args){
        
        // This will invoke the parameterized constructor
        Geeks2 geek1 = new Geeks2("Sweta", 68);
        geek1.display();
    }
}
