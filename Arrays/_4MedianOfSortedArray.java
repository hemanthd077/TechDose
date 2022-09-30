class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int ans[]=new int[len1+len2];
        System.arraycopy(nums1,0,ans,0, len1);
        System.arraycopy(nums2,0,ans,len1, len2);
        Arrays.sort(ans);
        int len=ans.length;
        if(len%2==0){
            int x=ans[len/2];
            int y=ans[len/2-1];
            return (x+y)/2.0;
        }
        else{
            return (double)ans[len/2];
        }
        
    }
}