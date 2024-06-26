class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            if(min<prices[i]){
                max += prices[i]-min;
            }
            min=prices[i];
        }
        return max;
    }
}
