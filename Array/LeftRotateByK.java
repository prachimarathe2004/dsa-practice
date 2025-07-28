public class LeftRotateByK {

    // Helper method to reverse elements from start to end
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Rotate the array to the left by k steps
    public static void rotateLeftByK(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0 || k % n == 0) return;

        k = k % n; // in case k > n

        // Step 1: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 2: Reverse the remaining elements
        reverse(nums, k, n - 1);

        // Step 3: Reverse the whole array
        reverse(nums, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;

        rotateLeftByK(nums, k);

        // Print the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
