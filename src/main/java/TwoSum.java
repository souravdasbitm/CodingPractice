import java.util.Arrays;


public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int [] retArr = new int[2];

        for(int i = 0 ; i< nums.length;i++){
            for(int j=i+1 ; j<nums.length;j++){
                int sum = nums[i]+nums[j];
                if(sum==target){
                    retArr[0]=i;
                    retArr[1]=j;

                }
            }
        }
        return retArr;
    }

    public static void main(String[] args){
        TwoSum twoSum = new TwoSum();
        int []  nums ={1,2,7,15};
        int target = 9 ;
        Arrays.stream(twoSum.twoSum(nums,target)).forEach(num -> System.out.println(num +" "));

        int []  nums1 ={3,2,4};
        int target1= 6 ;
        Arrays.stream(twoSum.twoSum(nums1,target1)).forEach(num -> System.out.println(num +" "));

    }
}
