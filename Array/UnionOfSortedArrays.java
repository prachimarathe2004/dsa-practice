import java.util.*;

public class UnionOfSortedArrays {

    public static List<Integer> findUnion(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            // Skip duplicates in nums1
            while (i > 0 && i < nums1.length && nums1[i] == nums1[i - 1]) i++;
            // Skip duplicates in nums2
            while (j > 0 && j < nums2.length && nums2[j] == nums2[j - 1]) j++;

            if (i >= nums1.length || j >= nums2.length) break;

            if (nums1[i] < nums2[j]) {
                result.add(nums1[i]);
                i++;
            } else if (nums1[i] > nums2[j]) {
                result.add(nums2[j]);
                j++;
            } else { // equal
                result.add(nums1[i]);
                i++;
                j++;
            }
        }

        // Remaining elements in nums1
        while (i < nums1.length) {
            if (i == 0 || nums1[i] != nums1[i - 1]) {
                result.add(nums1[i]);
            }
            i++;
        }

        // Remaining elements in nums2
        while (j < nums2.length) {
            if (j == 0 || nums2[j] != nums2[j - 1]) {
                result.add(nums2[j]);
            }
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 4, 5};
        int[] nums2 = {2, 3, 5, 6};

        List<Integer> union = findUnion(nums1, nums2);
        System.out.println("Union of arrays: " + union);
    }
}

