package com.cuong.financialmanagementsystem.controller;

import com.cuong.financialmanagementsystem.model.YahooStock;
import com.cuong.financialmanagementsystem.service.StockImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class StockController {

    @GetMapping(value = "/view-stocks", produces = "application/json")
    public Mono viewStocks(@RequestParam String stockSymbol) {
        try {
            String YAHOO_URL = "https://query1.finance.yahoo.com/v11/finance/quoteSummary/" + stockSymbol + "?modules=financialData";
            WebClient client = WebClient.create();

            WebClient.ResponseSpec responseSpec = client.get()
                    .uri(YAHOO_URL)
                    .retrieve();

            return responseSpec.bodyToMono(YahooStock.class);
        } catch (Exception e) {
            log.error(e.getMessage());
            return Mono.just("Exception: " + e.getMessage());
        }
    }
}
