// Java program to demonstrates the use of
// continue in an if statement
import java.util.*;

class ContinueStat {
    public static void main(String args[])
    {
        for (int i = 0; i < 10; i++) {
          
            // If the number is even
            // skip and continue
            if (i % 2 == 0)
                continue;

            // If number is odd, print it
            System.out.print(i + " ");
        }
    }
}
