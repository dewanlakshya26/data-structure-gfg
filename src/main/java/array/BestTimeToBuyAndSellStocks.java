package array;

public class BestTimeToBuyAndSellStocks {

    public int maxProfit(int[] prices) {

        int profit = 0;
        int tortoise = 0;
        int rabbit = tortoise+1;
        while (rabbit<prices.length){
            int tempProfit = prices[rabbit] - prices[tortoise];
            if ( tempProfit < 0 ){
                tortoise++;
            }
            else if (tempProfit> profit){
                profit = tempProfit;

            }

            if (prices[rabbit]<prices[tortoise]){
                tortoise = rabbit;
            }
            rabbit++;

        }
         return profit;
    }
}
