class Solution {
    public boolean isStrictlyPalindromic(int n) {
        int copy=n;
        for(int i=2;i<n;i++){
            int arr[]=new int[1000],ind=0;
            copy=n;
            int decimal_num = 0, base = 1; 
            while(copy>0){
                ind++;
                arr[ind++]=copy%i;
                copy/=2;
            }
            for(int j=0;j<ind;j++){
                decimal_num = decimal_num + arr[j] * base;  
                base = base * i;  
            }
            if(decimal_num!=n){
                return false;
            }
        }
        return true;
    }
}
