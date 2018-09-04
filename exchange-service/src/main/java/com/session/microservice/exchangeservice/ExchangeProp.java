package com.session.microservice.exchangeservice;

import java.math.BigDecimal;

public class ExchangeProp {


	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private int port;
	
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public ExchangeProp(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}

	public ExchangeProp() {
		super();
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public ExchangeProp(String from, String to, BigDecimal conversionMultiple) {
		super();
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}


}
