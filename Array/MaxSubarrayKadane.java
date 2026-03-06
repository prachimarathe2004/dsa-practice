public class MaxSubarrayKadane {

    // Method to find maximum subarray sum using Kadane's Algorithm
    public static int maxSubarraySum(int[] arr) {

        int currentSum = arr[0]; // Best subarray sum ending at current index
        int maxSum = arr[0];     // Maximum subarray sum found so far

        // Start from second element
        for (int i = 1; i < arr.length; i++) {

            // Decide whether to carry forward or restart
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update global maximum if needed
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum; // Return maximum subarray sum
    }

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Maximum Subarray Sum = " + maxSubarraySum(arr));
    }
}
