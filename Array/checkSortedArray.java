public class checkSortedArray{
    public static boolean isSorted(int[] arr){
        if(arr.length<=1){
            return true;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={5,3,2,1};

        System.out.println("is arr1 sorted: " + isSorted(arr1));
        System.out.println("is arr2 sorted: " + isSorted(arr2));
    }
}
