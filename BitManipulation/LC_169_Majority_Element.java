// LC 169. Majority Element
import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        return nums[len/2];
    }
}