package com.cuong.financialmanagementsystem.service;

import com.cuong.financialmanagementsystem.client.YahooClient;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StockImpl implements StockRepository{

    private YahooClient stockClient = new YahooClient();

    public String viewStock(String accountId) {
        stockClient.getStocksBySymbol("AAPL");
        return "view stock";
    }

    @Override
    public String addStock(String stockName) {
        return null;
    }
}
