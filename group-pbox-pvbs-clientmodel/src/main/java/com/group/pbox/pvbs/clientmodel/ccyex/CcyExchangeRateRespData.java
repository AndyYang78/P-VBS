package com.group.pbox.pvbs.clientmodel.ccyex;

import java.math.BigDecimal;

public class CcyExchangeRateRespData {

	private String id;
	
	private String currencyCode;
	
	private BigDecimal exchangeRate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

}
