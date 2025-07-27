public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;  // pointer for the place to insert unique elements

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];  // overwrite with unique element
            }
        }

        return i + 1;  // Number of unique elements
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Modified array (first " + k + " elements): ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
