class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
        if(target >= Integer.MAX_VALUE || target <= Integer.MIN_VALUE) 
            return new ArrayList<>();
            System.out.print(Integer.MAX_VALUE+" "+Integer.MIN_VALUE+" "+target+"\n");
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = nums.length - 1; j >= 3; j--) {
                int left = i + 1, right = j - 1;
                while (left < right) {
                    int tmp = nums[i] + nums[j] + nums[left] + nums[right];
                    if (tmp == target) {
                        set.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    } else if (tmp > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}