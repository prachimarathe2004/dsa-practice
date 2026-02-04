import java.util.HashMap;

public class MapSearchExample {

    public static void main(String[] args) {

        // HashMap stores key-value pairs
        HashMap<Integer, String> map = new HashMap<>();

        // Insert data into map
        map.put(101, "Prachi");
        map.put(102, "Amit");
        map.put(103, "Neha");

        int searchKey = 102;

        // Check if key exists
        if (map.containsKey(searchKey)) {
            System.out.println("Found: " + map.get(searchKey));
        } else {
            System.out.println("Key not found");
        }
    }
}



