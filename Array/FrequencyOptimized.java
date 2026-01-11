import java.util.HashMap;

public class FrequencyOptimized {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 4, 2};

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        // Key   -> element
        // Value -> frequency count

        for (int num : arr) {

            // If element already exists, increase count
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } 
            // If element appears first time
            else {
                freqMap.put(num, 1);
            }
        }

        // Print frequencies
        for (int key : freqMap.keySet()) {
            System.out.println(key + " -> " + freqMap.get(key));
        }
    }
}
