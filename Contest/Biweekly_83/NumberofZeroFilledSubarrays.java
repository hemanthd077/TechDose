class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0,temp=0;
        for(int a : nums){
            if(a==0)
                count+=++temp;
            else
                temp=0;
        }
        return count;
    }
}