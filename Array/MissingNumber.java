public class MissingNumber {

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;  // Sum of numbers from 0 to n
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum; // The difference is the missing number
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5}; // Missing number is 3
        int missing = findMissingNumber(nums);
        System.out.println("Missing number: " + missing);
    }
}
