class Solution {
    public int maxProfit(int[] prices) {
   int min=prices[0];
   int maxprofit=0;
   for(int i=1;i<prices.length;i++ ){
  int profit=prices[i]-min;
  if(profit>maxprofit){
    maxprofit=profit;
  }
  if(min>prices[i]){
    min=prices[i];
  
  }
   }
   return maxprofit;
    }

}