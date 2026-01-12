import java.util.HashMap;

public class TwoSum{
    public static void main(String[] args) {
        int[]arr={2,7,8,4};

        int target=11;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int CurrentNumber=arr[i];
            int RequiredNumber=target-CurrentNumber;

            if(map.containsKey(RequiredNumber)){
                System.out.println("Indices are " + map.get(RequiredNumber) + " , " +i);
                return;
            };
            
            map.put(CurrentNumber,i);
        }
      
        System.out.println("No pair found");
    }

}
