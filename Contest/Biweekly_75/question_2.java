class Solution {
    public int minBitFlips(int start, int goal) {
        int sbit[] = new int[32];
        int gbit[] = new int[32];
        int ind1=0,ind2=0;
        while(start>0){
            sbit[ind1++]=start%2;
            start/=2;
        }
        while(goal>0){
            gbit[ind2++]=goal%2;
            goal/=2;
        }
        int count=0;
        for(int i=0;i<32;i++){
            if(sbit[i] != gbit[i]){
                count++;
            }
        }
        return count;
    }
}
