public class LinearSearchOptimized {

    // Binary Search method (only for sorted arrays)
    public static int binarySearch(int[] arr, int target) {

        int low = 0;                  // starting index
        int high = arr.length - 1;    // ending index

        // Loop until search space is valid
        while (low <= high) {

            int mid = low + (high - low) / 2; // avoid overflow

            // If middle element is target
            if (arr[mid] == target) {
                return mid; // found
            }

            // If target is greater, ignore left half
            else if (arr[mid] < target) {
                low = mid + 1;
            }

            // If target is smaller, ignore right half
            else {
                high = mid - 1;
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 30, 45, 60}; // must be sorted
        int target = 30;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
