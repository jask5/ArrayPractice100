package JK.company;
import java.util.*;

class Price {
    public int maxProfit(int[] prices) {

        //minPrice to buy stocks
        int minPrice = Integer.MAX_VALUE; //taking max value that will be replaced later if prices[i] < minPrice
        int maxProfit = 0; //initializing max profit

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else if((prices[i] - minPrice) > maxProfit) {
                maxProfit = (prices[i] - minPrice);
            }

        }
        return maxProfit;
    }
}


public class BuySellStock {
    public static void main(String[] args) {
        Price p1 = new Price();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //taking arrays size from user

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(p1.maxProfit(arr));
    }

}
