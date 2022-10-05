package com.test.microservice.practice.currencyexchangeservice.service;

import com.test.microservice.practice.currencyexchangeservice.model.CurrencyExchange;

public interface CurrencyExchangeService {

    CurrencyExchange findByFromAndTo(String from, String to);
    
}
