package com.cuong.financialmanagementsystem.service;

import com.cuong.financialmanagementsystem.client.YahooClient;
import com.cuong.financialmanagementsystem.model.YahooStock;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StockImpl implements StockRepository{

    private YahooClient yahooClient = new YahooClient();

    public String viewStock(String accountId) {
        yahooClient.getDataBySymbol("test");
        return "view stock";
    }

    @Override
    public String addStock(String stockName) {
        return null;
    }
}
