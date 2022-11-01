class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0;
        int curr = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            curr += nums[i] == 0 ? -1 : nums[i];
            if(map.containsKey(curr))
                max = Math.max(max, i - map.get(curr));
            else
                map.put(curr, i);
        }
        return max;
    }
}