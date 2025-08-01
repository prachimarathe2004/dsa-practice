public class FindTargetIndexByLinearSearch {

    public static int findTargetIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i; // return the first (smallest) index where target is found
            }
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 1, 9, 2};
        int target = 2;

        int index = findTargetIndex(nums, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
