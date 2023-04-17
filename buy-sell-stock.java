/**
* https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
*/

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;

        for(int price: prices) {
            min = Math.min(price, min);
            profit = Math.max(profit, price - min);
        }

        return profit;
    }
}
