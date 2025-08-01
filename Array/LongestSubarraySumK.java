import java.util.HashMap;

public class LongestSubarraySumK {

    public static int maxSubArrayLen(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // Case 1: If entire sum equals k
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: If sum - k is already seen
            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // Store first occurrence of a prefix sum
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
        System.out.println("Length of the longest subarray: " + result);
    }
}
