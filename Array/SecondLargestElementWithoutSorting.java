public class SecondLargestWithoutSorting {

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements might be equal).\n");
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {22,33,33,56,78,78,59,4}; // second largest should be 3
        int result = findSecondLargest(arr);
        if (result != -1) {
            System.out.println("Second largest element is: " + result);
        }
    }
}
