package com.session.microservice.exchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangerServiceController {
	@Autowired
	Environment env;

	@GetMapping("/getCurrencyExchange/from/{from}/to/{to}")
	public ExchangeProp getCurrencyExchangeConversionProps(@PathVariable String from,@PathVariable String to) {
		ExchangeProp exchangeProp = new ExchangeProp(from, to, BigDecimal.valueOf(65));
		exchangeProp.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return exchangeProp;
	}

}
