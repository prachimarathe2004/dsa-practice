import java.util.HashMap;



public class CountFrequency  {
    public static void main(String[] args) {

        String s = "programming";

        // HashMap to store character frequency
        HashMap<Character, Integer> freqMap = new HashMap<>();
        // Key   -> character
        // Value -> frequency count

        // Traverse the string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i); // get character at index i

            // If character already exists, increase count
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch) + 1);
            }
            // If character appears first time
            else {
                freqMap.put(ch, 1);
            }
        }

        // Print frequencies
        for (char key : freqMap.keySet()) {
            System.out.println(key + " -> " + freqMap.get(key));
        }
    }
}
     
