// LC 461 Hamming Distance

class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        for(int i=0;i<31;i++){
            if((x&1)!=(y&1)){
                count++;
            }
            x >>= 1;
            y >>= 1;
        }
        return count;
    }
}