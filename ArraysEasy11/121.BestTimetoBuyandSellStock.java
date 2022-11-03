class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length; 
        int profit = 0;
        int minElement = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            profit = Math.max(profit,prices[i]-minElement);
            minElement = Math.min(prices[i],minElement);
        }
        return profit;
    }
}
