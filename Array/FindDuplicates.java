public class FindDuplicates {

    public static void CheckDuplicates(int[]arr){
   

       System.out.println("Duplicate elements: ");

        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[]args){
        int[] arr = {1,1,2,3,3};
        CheckDuplicates(arr);
      
    }
}
