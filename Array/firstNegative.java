public class firstNegative {
    public static void main(String[]args){
        int[]arr={1,3,-5,-7,9};

        for(int num:arr){
            if(num<0){
                System.out.println("first negative number is " +num);
                break;
            }
        }

    }
    
}
