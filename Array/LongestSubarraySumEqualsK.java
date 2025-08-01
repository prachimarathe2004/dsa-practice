import java.util.HashMap;

public class LongestSubarraySumEqualsK {

    public static int maxSubArrayLen(int[] nums, int k) {
        // Map to store (prefixSum -> earliest index where it occurred)
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // Only store the first occurrence of this sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, -1, 5, -2, 3};
        int k = 3;
        int result = maxSubArrayLen(nums, k);
        System.out.println("Length of the longest subarray that sums to " + k + " is: " + result);
    }
}
