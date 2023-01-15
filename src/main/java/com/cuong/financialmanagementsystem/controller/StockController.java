package com.cuong.financialmanagementsystem.controller;

import com.cuong.financialmanagementsystem.service.StockImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class StockController {

    private StockImpl stockImpl;

    @GetMapping(value = "/view-stocks", produces = "application/json")
    public ResponseEntity<String> viewStocks(String accountId) {
        stockImpl = new StockImpl();
        stockImpl.viewStock("test");

        return ResponseEntity.status(HttpStatus.OK).body("test");
    }
}
