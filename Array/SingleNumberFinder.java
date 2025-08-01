public class SingleNumberFinder {

    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR cancels out duplicates
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, 5, 3, 4};
        int singleNumber = findSingleNumber(nums);
        System.out.println("The number that appears once is: " + singleNumber);
    }
}
