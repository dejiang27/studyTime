package LeetCode;

public class FinalPricesWithASpecialDiscount {
    public int[] finalPrices(int[] prices){

        int n = prices.length;
        for(int i = 0; i < n-1; i ++){
            int x = prices[i];
            for(int j = i+1; j < n; j ++){
                if(prices[i] >= prices[j]){
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }

        return prices;
    }
}
