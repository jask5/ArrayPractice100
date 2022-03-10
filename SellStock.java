import java.util.*;


class Solution7 {
    public int maxProfit(int[] prices) {
        //edge cases
        if(prices == null || prices.length == 0) {
            return 0;
        }

        int profit = 0;
        for(int i = 0; i < prices.length-1; i++) {
            if(prices[i+1] > prices[i]) {
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }
}

public class SellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        Solution7 sol = new Solution7();
        System.out.println(sol.maxProfit(prices));

    }



}
