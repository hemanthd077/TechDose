class Solution {
    public int maxProfit(int[] prices) {
        int max=prices[0],profit=0;
        int len=prices.length;
        for(int i=0;i<len;i++){
            if(max>prices[i]){
                max=prices[i];
            }
            profit = Math.max(profit,prices[i]-max);
        }
        return profit;
    }
}