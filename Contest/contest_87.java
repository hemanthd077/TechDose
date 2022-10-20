class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count=0;
        int len1=players.length;
        int len2=trainers.length;
        for(int i=0;i<len1;i++){
            for(int j=i;j<len2;j++){
                if(players[i]<=trainers[j] && trainers[j]!=-1){
                    count++;
                    trainers[j]=-1;
                    break;
                }
            }
        }
        return count;
    }
}