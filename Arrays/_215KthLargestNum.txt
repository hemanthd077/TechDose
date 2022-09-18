class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> min=new PriorityQueue<>();
        for(int i : nums){
            min.add(i);
            if(min.size()>k){
                min.remove();
            }
        }
        return min.remove();
    }
}