
public class LongestSubarraySumK {
    public static int maxSubArrayLen(int[] nums, int k) {
        int n = nums.length;
        int maxLen = 0;

        // Check every subarray starting at index 'start'
        for (int start = 0; start < n; start++) {
            int sum = 0; // Reset sum for each new start

            // Extend subarray to index 'end'
            for (int end = start; end < n; end++) {
                sum += nums[end]; // Add current element

                if (sum == k) { // If subarray sum equals k
                    int len = end - start + 1;
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

        int[] nums3 = {1, -1, 5, -2, 3};
        int k3 = 3;
        System.out.println("Longest subarray length: " + maxSubArrayLen(nums3, k3));
    }
}

