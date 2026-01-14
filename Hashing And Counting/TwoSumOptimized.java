import java.util.HashSet;

public class TwoSumOptimized {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int required = target - num;

            // If required value already exists, pair found
            if (set.contains(required)) {
                System.out.println("Pair: " + required + ", " + num);
            }

            // Add current element to set
            set.add(num);
        }
    }
}
