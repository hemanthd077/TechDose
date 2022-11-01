class Solution {
    public String bestHand(int[] ranks, char[] s) {
        int freq[] = new int[14];
        for(int i=0;i<ranks.length;i++){
            freq[ranks[i]]++;
        }
        int max=0;
        for(int i=0;i<14;i++){
            if(max<freq[i]){
                max=freq[i];
            }
        }
        if(s[0]==s[1] && s[1]==s[2] && s[2]==s[3] && s[3]==s[4]){
            return "Flush";
        }
        else if(max>=3){
            return "Three of a Kind";
        }
        else if(max>=2){
            return "Pair";
        }
        else{
            return "High Card";
        }
    }
}