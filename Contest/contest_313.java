class Solution {
    public int maxSum(int[][] grid) {
        int c=grid[0].length;
        int r=grid.length;
        long max=0,val=0;
        Solution obj = new Solution();
        for(int i=0;i<r-2;i++){
            for(int j =0;j<c-2;j++){
               val=find(grid,i,j);
                if(val>max){
                    max=val;
                }
            }
        }
         return (int)max;
    }
    
    public long find(int[][] arr,int a,int b){
        long sum=0;
        for(int i=a;i<a+3;i++){
            for(int j=b;j<b+3;j++){
                if((i!=a+1 && j!=b) || (i!=a+1 && j!=b+2) || (i==a+1 && j==b+1)){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
}