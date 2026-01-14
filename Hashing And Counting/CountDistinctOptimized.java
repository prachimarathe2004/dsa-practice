import java.util.HashSet;
public class CountDistinctOptimized {

    public static int CountDistinct(int[] arr){
        HashSet<Integer>set=new HashSet<>();

        for(int num:arr){
            set.add(num);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] arr={1,2,1,3,4,4,5,6,0};
        int result=CountDistinct(arr);
        System.out.println(result);
    }
}
