package com.cuong.financialmanagementsystem.client;

import com.cuong.financialmanagementsystem.model.YahooStock;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.stream.Collectors;

@Slf4j
public class YahooClient {

    final String YAHOO_URL = "https://query1.finance.yahoo.com/v11/finance/quoteSummary/aapl?modules=financialData";

    public Mono getDataBySymbol(String symbol) {
        WebClient client = WebClient.create();

        WebClient.ResponseSpec responseSpec = client.get()
                .uri(YAHOO_URL)
                .retrieve();

        String responseBody = responseSpec.bodyToMono(String.class).block();
        log.info(responseBody);

        return Mono.just("test");
    }
}
