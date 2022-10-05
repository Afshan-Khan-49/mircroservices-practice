package com.test.microservice.practice.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.test.microservice.practice.currencyexchangeservice.model.CurrencyExchange;
import com.test.microservice.practice.currencyexchangeservice.service.CurrencyExchangeService;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @Autowired
    private CurrencyExchangeService currencyExchangeService;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from,@PathVariable String to) {
        CurrencyExchange currencyExchange = currencyExchangeService.findByFromAndTo(from, to);
        if(currencyExchange == null)
            throw new RuntimeException("No Entry found for given values of from : " + from
            + "and to : "+ to);
        currencyExchange.setEnvironment(environment.getProperty("local.server.port"));

		return currencyExchange;
		
	}
    
}
