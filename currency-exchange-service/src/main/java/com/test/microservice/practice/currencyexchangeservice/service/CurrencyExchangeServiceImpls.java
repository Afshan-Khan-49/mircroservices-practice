package com.test.microservice.practice.currencyexchangeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.microservice.practice.currencyexchangeservice.model.CurrencyExchange;
import com.test.microservice.practice.currencyexchangeservice.repository.CurrencyExchangeRepository;

@Service
public class CurrencyExchangeServiceImpls implements CurrencyExchangeService{

    @Autowired
    private CurrencyExchangeRepository currencyExchangeRepository;

    @Override
    public CurrencyExchange findByFromAndTo(String from, String to) {
        return currencyExchangeRepository.findByFromAndTo(from, to);
    }
    
}
