import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    /*
          Given an integer array nums and an integer k,
          return true if there are two distinct indices i and j
          in the array such that nums[i] == nums[j] and abs(i - j) <= k.

            Example 1:

            Input: nums = [1,2,3,1], k = 3
            Output: true
            Example 2:

            Input: nums = [1,0,1,1], k = 1
            Output: true
            Example 3:

            Input: nums = [1,2,3,1,2,3], k = 2
            Output: false


            Constraints:

            1 <= nums.length <= 105
            -109 <= nums[i] <= 109
            0 <= k <= 105
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i < nums.length;i++){

            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateII solution = new ContainsDuplicateII();

        int[] nums = {1, 2, 3, 1};
        int k = 3;


        System.out.println(solution.containsNearbyDuplicate(nums, k)); // Output: true

        int[] nums2 = {1, 2, 3, 1};
        int k2 = 1;
        System.out.println(solution.containsNearbyDuplicate(nums2, k2)); // Output: false

        int[] nums3 = {99,99};
        int k3 = 1;
        System.out.println(solution.containsNearbyDuplicate(nums3, k3)); // Output: true
    }
}
