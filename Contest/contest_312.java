class Solution {
    public int longestSubarray(int[] nums) {
        int max = nums[0];
        for (int n : nums) {
            max = Math.max(n, max);
        }
        
        int ans = 0;
        int len = 0;
        for (int n : nums) {
            if (n == max) {
                len++;
                ans = Math.max(ans, len);
            }
            else {
                len = 0;
            }
        }
        
        return ans;
    }
}
