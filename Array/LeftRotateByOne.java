public class LeftRotateByOne {

    public static void rotateLeftByOne(int[] nums) {
        if (nums.length <= 1) return; // nothing to rotate

        int first = nums[0]; // store the first element

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1]; // shift each element to the left
        }

        nums[nums.length - 1] = first; // place first element at the end
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        rotateLeftByOne(nums);

        // Print the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
