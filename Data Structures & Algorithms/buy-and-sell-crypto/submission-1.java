class Solution {
    public int maxProfit(int[] prices) {
        
        int currBP = prices[0];
        int maxProfit = 0;
        for(int i = 1 ; i < prices.length ; i++){
            int currSP = prices[i];
            int currProfit = currSP - currBP;
            if(currProfit > 0){
                maxProfit = Math.max(maxProfit , currProfit);
            }
            else{
                currBP = currSP;
            }
        }
        return maxProfit;
    }
}
