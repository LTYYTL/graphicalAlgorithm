package com.test.array;

import com.array.StockII;

public class StockIITest {
    public static void main(String[] args) {
        StockII stockII = new StockII();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(stockII.maxProfit(prices));
    }
}
