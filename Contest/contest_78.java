class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0,val=0;
        for(int a : nums){
            sum+=a;
        }
        int len=nums.length,count=0;
        for(int i=0;i<len-1;i++){
            val +=nums[i];
            if(val>=(sum-val)){
                count++;
            }
        }
        return count;
    }
}
