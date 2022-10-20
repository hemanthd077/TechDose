class Solution {
    public int[] findArray(int[] pref) {
        int len = pref.length;
        int arr[] = new int[len];
        arr[0]=pref[0];
        for(int i=1;i<len;i++){
            arr[i] = pref[i-1] ^ pref[i];
        }
        return arr;
    }
}