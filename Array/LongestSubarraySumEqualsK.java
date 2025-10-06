public class LongestSubarraySumEqualsK {
    public static int maxSubArrayLen(int[] nums, int k) {
        int n = nums.length;
        int maxLen = 0;

        // Start index of subarray
        for (int start = 0; start < n; start++) {
            int sum = 0; // Reset sum for each starting point

            // End index of subarray
            for (int end = start; end < n; end++) {
                sum += nums[end]; // Add current element to sum

                if (sum == k) {  // Check if sum equals k
                    int len = end - start + 1; // Length of this subarray
                    if (len > maxLen) {
                        maxLen = len; // Update max length
                    }
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 5, 2, 7, 1, 9};
        int k1 = 15;
        System.out.println("Longest subarray length: " + maxSubArrayLen(nums1, k1));

        int[] nums2 = {-3, 2, 1};
        int k2 = 6;
        System.out.println("Longest subarray length: " + maxSubArrayLen(nums2, k2));
    }
}
