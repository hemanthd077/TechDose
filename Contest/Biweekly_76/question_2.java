class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long penscost=0,ways=0;
        while(penscost <= total) {
            long remainingAmount = total - penscost;
            long pencils = remainingAmount/cost2 + 1;
            ways += pencils;
            penscost += cost1;
        }
        return ways;
    }
}