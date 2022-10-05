package com.test.microservices.practice.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.microservices.practice.limitsservice.config.Configuration;
import com.test.microservices.practice.limitsservice.model.Limit;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping(value = "/limits")
    public Limit getLimits(){
        return new Limit(configuration.getMinimum(), configuration.getMaximum());
    }
    
}
