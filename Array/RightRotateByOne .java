public class RightRotateByOne {

    public static void rotateRightByOne(int[] nums) {
        if (nums.length <= 1) return; // nothing to rotate

        int last = nums[nums.length - 1]; // store the last element

        // Shift elements one position to the right
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }

        nums[0] = last; // place last element at the beginning
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        rotateRightByOne(nums);

        // Print the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
