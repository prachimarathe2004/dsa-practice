public class PalindromeCheck {
    // 1. Added 'static' so it can be called from the main method
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true; // 2. Added missing return statement
    }

    public static void main(String[] args) {
        String s = "madam";
        // 3. Store the result in a variable and print that variable
        boolean result = isPalindrome(s);
        System.out.println("Is palindrome: " + result);
    }
}
