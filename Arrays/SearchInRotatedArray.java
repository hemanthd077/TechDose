public class SearchInRotatedArray {
    class Solution {
        public int search(int[] nums, int target) {
            int len=nums.length;
            int arr[] = new int[len];
            System.arraycopy(nums,0, arr,0, len);
            Arrays.sort(arr);
            System.out.println(len);
            for(int i: arr){
                System.out.print(i+" ");
            }
            for(int i=0;i<len;i++){
                if(target==arr[i] || target >= arr[i]){
                    for(int j=0;j<len;j++){
                        if(target == nums[j]){
                            return j;
                        }
                    }
                }
                else{
                    return -1;
                }
            }
            return -1;
        }
    }
}
