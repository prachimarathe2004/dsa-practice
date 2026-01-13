import java.util.Arrays;

public class RemoveDuplicatesString {
    
    public static void main(String[] args) {
        String originalStr = "aabbccddeeff";
        // Convert the string to a character array
        char[] arr = originalStr.toCharArray();
        
        // Sort the character array
        Arrays.sort(arr);
        
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            // If the current character is different from the previous one, it's unique
            if (arr[i] != arr[i - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }
        
        // Convert the modified character array back to a string using only the unique characters
        String result = new String(arr, 0, index);
        System.out.println("Original string: " + originalStr);
        System.out.println("String with duplicates removed: " + result);
    }
}
