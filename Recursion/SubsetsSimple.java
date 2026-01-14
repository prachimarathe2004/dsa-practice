public class SubsetsSimple {

    // Recursive function to generate subsets
    static void subsets(int index, int[] arr, String result) {

        // Base case: when we reach end of array
        if (index == arr.length) {
            System.out.println(result); // print current subset
            return;
        }

        // 1️⃣ TAKE the current element
        subsets(index + 1, arr, result + arr[index] + " ");

        // 2️⃣ SKIP the current element
        subsets(index + 1, arr, result);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        // Start recursion from index 0 with empty result
        subsets(0, arr, "");
    }
}
