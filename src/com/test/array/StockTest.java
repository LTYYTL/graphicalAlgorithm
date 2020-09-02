package com.test.array;

import com.array.Stock;

public class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(stock.maxProfit(prices));
    }
}
