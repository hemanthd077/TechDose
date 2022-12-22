class Solution {
    public boolean exist(char[][] board, String word) {
        int r= board.length,c = board[0].length;
        char[] arr = word.toCharArray();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(bfs(board,arr,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean bfs(char[][] board ,char[] arr,int i,int j,int index){
        int r= board.length,c = board[0].length;
        if(index == arr.length)
            return true;
        if(i>=r || j>=c || j<0 || i<0 || board[i][j] != arr[index]){
            return false;
        }
        board[i][j]^=256;
        boolean a = bfs(board,arr,i,j+1,index+1)|| bfs(board,arr,i+1,j,index+1)|| bfs(board,arr,i,j-1,index+1)|| bfs(board,arr,i-1,j,index+1);
        board[i][j]^=256;
        return a;
    }
}