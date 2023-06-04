class Solution {
    public int maxProfit(int[] prices) {
        int cost=prices[0],mini=prices[0],profit=0;

        for(int i=0;i<prices.length;i++){
            cost=prices[i]-mini;
            mini=Math.min(prices[i],mini);
            profit=Math.max(profit,cost);
        }

        return profit;
    }
}