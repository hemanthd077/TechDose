class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> a = new ArrayList<>();
        int r=nums.length;
        for(int i=1;i<=1000;i++){
            int count=0;
            for(int m=0;m<r;m++){
                int c=nums[m].length;
                for(int n=0;n<c;n++){
                    if(nums[m][n]==i){
                        count++;
                        break;
                    }
                }
            }
            if(count==r){
                a.add(i);
            }
        }
        return a;
    }
}