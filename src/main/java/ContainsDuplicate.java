import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    /*
Given an integer array nums,
return true if any value appears at least twice in the array,
and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Example 2:
Input: nums = [1,2,3,4]
Output: false
Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109
     */
    public static boolean duplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
                if (map.get(num) > 1) {
                    return true;
                }
            } else {
                map.put(num, 1);
            }
        }
        return false;
    }
    public static void main(String[] args){
        int [] num1 = {1,2,3,1};
        System.out.println(duplicate(num1));

        int [] num2 = {1,2,3,4};
        System.out.println(duplicate(num2));
    }

}
