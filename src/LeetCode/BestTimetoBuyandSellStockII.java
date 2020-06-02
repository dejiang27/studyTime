package LeetCode;

import java.util.Stack;

public class BestTimetoBuyandSellStockII {


    public int maxProfit(int[] prices){

        //Stack<Integer> stack = new Stack<>();

        int count = 0, ans = 0;
        int n = prices.length;
        if(n == 1){
            return 0;
        }

        while(count < n-1){
            if(prices[count]< prices[count+1]){
                ans+=(prices[count+1] - prices[count]);
            }
            count ++;
        }
        System.out.println(ans);
        return ans;
    }


    public static void main(String[] args){
        BestTimetoBuyandSellStockII bt = new BestTimetoBuyandSellStockII();

        bt.maxProfit(new int[]{7,1,5,3,6,4});
        bt.maxProfit(new int[]{1,2,3,4,5});
        bt.maxProfit(new int[]{7,6,4,3,1});

    }
}
