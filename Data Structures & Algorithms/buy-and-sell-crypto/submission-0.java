class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;

        int left=0;
        int right=left+1;

        while(left<right && right<prices.length){

            if(prices[left]>=prices[right]){
                left=right;
                right++;
            }
            else{
                int p=prices[right]-prices[left];
                profit=Math.max(profit,p);
                right++;   
            }
        }
        return profit;
    }
}
