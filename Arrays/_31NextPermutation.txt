class Solution {
    public void nextPermutation(int[] nums) {
        int flag=0;
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=nums.length-1;
            while(nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int arr[],int i){
        int j= arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        
    }
}