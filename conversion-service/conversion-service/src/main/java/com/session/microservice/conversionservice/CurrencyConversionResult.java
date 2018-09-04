package com.session.microservice.conversionservice;

import java.math.BigDecimal;

public class CurrencyConversionResult {
	String from;
	String to;
	BigDecimal conversionMultiple;
	int port;
	BigDecimal qty;
	BigDecimal totalCalculatedAmout;
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
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public BigDecimal getQty() {
		return qty;
	}
	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}
	public BigDecimal getTotalCalculatedAmout() {
		return totalCalculatedAmout;
	}
	public CurrencyConversionResult(String from, String to, BigDecimal conversionMultiple,  BigDecimal qty,
			BigDecimal totalCalculatedAmout) {
		super();
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		
		this.qty = qty;
		this.totalCalculatedAmout = totalCalculatedAmout;
	}
	public CurrencyConversionResult() {
		super();
	}
	public void setTotalCalculatedAmout(BigDecimal totalCalculatedAmout) {
		this.totalCalculatedAmout = totalCalculatedAmout;
	}

}
