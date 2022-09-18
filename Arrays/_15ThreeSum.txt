class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len=nums.length;
        Set<List> set = new HashSet<>();
        if(len==0){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int j,k,sum;
        for(int i=0;i<len-2;i++){
            j=i+1;
            k=len-1;
            while(j<k){
                sum=(nums[i]+nums[j]+nums[k]);
                if(sum==0){
                    set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }
                else if(sum<0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
            }
        }
        for(List<Integer> a : set){
            res.add(a);
        }
        return res;
    }
}