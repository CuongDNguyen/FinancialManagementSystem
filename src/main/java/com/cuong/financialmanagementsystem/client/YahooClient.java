package com.cuong.financialmanagementsystem.client;

import com.cuong.financialmanagementsystem.model.YahooStock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
public class YahooClient {

    WebClient webClient = WebClient.builder().build();

    public void getStocksBySymbol(String symbol) {
        try {
            YahooStock yahooStock = webClient.get()
                    .uri("https://query1.finance.yahoo.com/v11/finance/quoteSummary/aapl?modules=financialData")
                    .retrieve().bodyToMono(YahooStock.class).block();
            log.info(String.valueOf(yahooStock));

        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}
