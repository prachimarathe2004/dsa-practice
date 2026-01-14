import java.util.HashSet;

public class RemoveDuplicates {

    public static void RemoveDuplicates(int[] arr) {

        // HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        System.out.print("elements after removing duplicates : ");

        for (int num : arr) {

            // If element already exists in set → duplicate
            if (set.add(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3};

        RemoveDuplicates(arr);
    }
}

    

