class Solution {
    public int countDistinctIntegers(int[] nums) {
        int len=nums.length;
        Set<Integer> arr = new HashSet<>();
        for(int i=0;i<len;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<len;i++){
            arr.add(reverse(nums[i]));
        }
        return arr.size();
    }
    int reverse(int n){
        int total=0;
        while(n>0){
            total*=10;
            total+=n%10;
            n/=10;
        }
        return total;
    }
}
