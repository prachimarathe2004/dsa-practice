import java.util.Arrays;

public class secondLargestWithSorting {

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return -1;
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Start from second last element and find the first one not equal to the largest
        int largest = arr[arr.length - 1]; // Last element after sorting is the largest
        for (int i = arr.length - 2; i >= 0; i--) {
            // Check if current element is different from the largest
            if (arr[i] != largest) {
                return arr[i]; // This is the second largest
            }
        }

        // All elements are the same, so no second largest exists
        System.out.println("No second largest element found (all elements might be equal).\n");
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 4};
        int result = findSecondLargest(arr);
        if (result != -1) {
            System.out.println("Second largest element is: " + result);
        }
    }
}
