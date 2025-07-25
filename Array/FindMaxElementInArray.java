class FindMaxElementInArray {
    public static int largestElement(int[] nums){
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;

    }
        public static void main(String[] args){
        int[] arr={2,45,66,7,8,0,9};
        int result=largestElement(arr);
        System.out.println(result);
    }

    }
