class Solution {
    public int findKthNumber(int m, int n, int k) {
        int arr[] = new int[m*n];
        int ind=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(j==0){
                    arr[ind++]=(i+1);
                }
                else{
                    arr[ind]=arr[ind-1]+(i+1);
                    ind++;
                }
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}