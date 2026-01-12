import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        // HashMap to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array once
        for (int i = 0; i < arr.length; i++) {

            int currentNumber = arr[i];
            int requiredNumber = target - currentNumber;

            // Check if required number already exists
            if (map.containsKey(requiredNumber)) {
                System.out.println(
                    "Indices: " + map.get(requiredNumber) + " and " + i
                );
                return;
            }

            // Store current number with its index
            map.put(currentNumber, i);
        }

        System.out.println("No pair found");
    }
}
