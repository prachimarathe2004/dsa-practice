public class FindFirstIndex {

    public static int findFirstIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i; // return the first index where target is found
            }
        }
        return -1; // if not found
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 2, 5, 9};
        int target = 2;

        int result = findFirstIndex(nums, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
