public class SwapArray{

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) throws Exception{
        int[] arr;
        arr=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;


        swap(arr,0,2);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
