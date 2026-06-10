package com.ismail.springboot.learn_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServiceController {

    @Autowired
    CurrencyService currencyService;

    @RequestMapping("/currency-service")
    public CurrencyService getCurrencyService(){
        return currencyService;
    }
}
