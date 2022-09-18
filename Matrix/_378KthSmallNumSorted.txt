class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int len=matrix.length,ind=0;
        int arr[]=new int[len*len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                arr[ind++]=matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}