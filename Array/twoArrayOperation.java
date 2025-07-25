public class twoArrayOperation{
    public static void main(String[] args) throws Exception{
        int[] arr;
        arr=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;

        int[] two=arr;
        two[2]=20;
        for(int i=0;i<two.length;i++){
            System.out.println(two[i]);
        }
    }
}
