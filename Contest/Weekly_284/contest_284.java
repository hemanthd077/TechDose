class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> a = new ArrayList<>();
        Set<Integer> b = new LinkedHashSet<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(Math.abs(i-j)<=k && nums[j]==key)
                    b.add(i);
            }
        }
        for(int val : b){
            a.add(val);
        }
        return a;
    }
}
