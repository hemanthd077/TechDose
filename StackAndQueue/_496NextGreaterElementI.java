class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length,ind=0;
        int arr[] = new int[len1];
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(nums1[i]==nums2[j]){
                    arr[ind++]=fun(nums2,nums1[i],len2,j);
                }
            }    
        }
        return arr;
    }
    int fun(int[] num,int val,int len,int j){
        for(int i=j;i<len;i++){
            if(val<num[i]){
                return num[i];
            }
        }
        return -1;
    }
}