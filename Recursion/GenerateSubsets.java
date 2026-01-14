import java.util.ArrayList;
import java.util.List;

public class GenerateSubsets {

    static void generateSubsets(int index, int[] arr, List<Integer> current) {

        // Base case: reached end of array
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Include current element
        current.add(arr[index]);
        generateSubsets(index + 1, arr, current);

        // Backtrack: remove last added element
        current.remove(current.size() - 1);

        // Exclude current element
        generateSubsets(index + 1, arr, current);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        generateSubsets(0, arr, new ArrayList<>());
    }
}
