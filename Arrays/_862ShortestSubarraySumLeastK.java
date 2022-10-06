public class _862ShortestSubarraySumLeastK {
    public int shortestSubarray(int[] nums, int k) {
        int len= nums.length,res=len+1;
        long[] b = new long[len + 1];
        for (int i = 0; i < len; i++)
            b[i + 1] = b[i] + nums[i];
        Deque<Integer> d = new ArrayDeque<>();
        for(int i=0;i<=len;i++){
            while(d.size()>0 && b[i]-b[d.getFirst()] >=k){
                res = Math.min(res, i - d.pollFirst());
            }
            while(d.size()>0 && b[i]<=b[d.getLast()]){
                d.pollLast();
            }
            d.addLast(i);
        }
        return res<=len? res : -1;
    }
}
