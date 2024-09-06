package com.example.SpringBootMongoDB.Test;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

public class YahooFinanceExample {
    public static void main(String[] args) {
        try {
            // Fetch single stock data
            Stock stock = YahooFinance.get("AAPL"); // Apple Inc.
            BigDecimal price = stock.getQuote().getPrice();
            BigDecimal change = stock.getQuote().getChangeInPercent();
            BigDecimal peg = stock.getStats().getPeg();
            BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();

            System.out.println("Price: " + price);
            System.out.println("Change: " + change);
            System.out.println("PEG: " + peg);
            System.out.println("Dividend: " + dividend);

            // Fetch multiple stocks at once
            String[] symbols = new String[] {"AAPL", "GOOG", "AMZN"};
            Map<String, Stock> stocks = YahooFinance.get(symbols);

            for (Map.Entry<String, Stock> entry : stocks.entrySet()) {
                Stock s = entry.getValue();
                System.out.println(s.getName() + ": " + s.getQuote().getPrice());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}