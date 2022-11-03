class Solution {
    public void rotate(int[][] matrix) {
        int len=matrix.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int[] arr: matrix){
            reverse(arr);
        }
    }
        private void reverse(int[] a){
            int len=a.length;
            for(int i=0;i<len/2;i++){
                int temp=a[i];
                a[i]=a[len-i-1];
                a[len-i-1]=temp;
            }
        }
}