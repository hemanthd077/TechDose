class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        
        for(int i=1;i<num;i++){
            if((i+reverse(i))==num){
                return true;
            }
        }
        return false;
    }
    int reverse(int n){
        int total=0;
        while(n>0){
            total*=10;
            total+=n%10;
            n/=10;
        }
        return total;
    }
}