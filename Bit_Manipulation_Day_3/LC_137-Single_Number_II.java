// LC 137. Single Number II

class Solution {
    public int singleNumber(int[] nums) {
        int one=0,two=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            one=(one^nums[i])&(~two);
            two=(two^nums[i])&(~one);
        }
        return one;
    }
}