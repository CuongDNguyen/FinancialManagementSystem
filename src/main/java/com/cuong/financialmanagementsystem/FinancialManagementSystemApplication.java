package com.cuong.financialmanagementsystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class FinancialManagementSystemApplication {

    public static void main(String[] args) {
        log.info("Financial management system app started...");
        SpringApplication.run(FinancialManagementSystemApplication.class, args);
    }
}
