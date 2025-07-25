public class largestElement{
    public static void main(String[] args){
        int[] arr;
        arr=new int[3];
        arr[0]=2;
        arr[1]=56;
        arr[2]=7;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
         if(arr[i]>max){
            max=arr[i];
         }
   
    }
          System.out.println("Largest element is: " +max);
}
}
