class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int arr[] = new int[k];
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b) -> map.get(b)-map.get(a));
        for(int i=0;i<k;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}