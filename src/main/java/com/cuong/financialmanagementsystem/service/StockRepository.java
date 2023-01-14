package com.cuong.financialmanagementsystem.service;

public interface StockRepository {

    String viewStock(String accountId);

    String addStock(String stockName);
}
