package com.interview;

public class BestTimeToBuySellStock {
    static void main() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            //find the min bying price
            if (price < minPrice) {
                minPrice = price;
            }
            // calculate current profit
            int profit = price - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        System.out.println(maxProfit);
    }
}
