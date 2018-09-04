package com.session.microservice.conversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConversionServiceController {
	@GetMapping("/getCurrencyconvesion/from/{from}/to/{to}/quantity/{qty}")
	public CurrencyConversionResult getCurrencyExchangeConversionProps(@PathVariable String from,
			@PathVariable String to, @PathVariable BigDecimal qty) {
		Map<String,String> uriVariables= new HashMap<>();
		uriVariables.put("from", from);		
		uriVariables.put("to", to);

		ResponseEntity<CurrencyConversionResult> entity = new RestTemplate().getForEntity(
				"http://localhost:8001/getCurrencyExchange/from/{from}/to/{to}", CurrencyConversionResult.class,
				uriVariables);
		
		return new CurrencyConversionResult(from, to, BigDecimal.valueOf(65), BigDecimal.valueOf(100),
				BigDecimal.valueOf(65));

	}
}
