public class FibonacciRecursive {

    // Recursive method to find nth Fibonacci number
    static int fibonacci(int n) {

        // Base case: stops recursion
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        // Recursive calls
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;

        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}
