package com.decred.memories.payload.response;

import java.math.BigDecimal;

public class CoinMarketCapCurrencyResponse {

	private String currency;
	private BigDecimal price;
	private BigDecimal volume_24h;
	private BigDecimal percent_change_1h;
	private BigDecimal percent_change_24h;
	private BigDecimal percent_change_7d;
	private BigDecimal market_cap;
	private String last_updated; 
	
	public CoinMarketCapCurrencyResponse() {}
	
	public CoinMarketCapCurrencyResponse(String currency, BigDecimal price, BigDecimal volume_24h,
			BigDecimal percent_change_1h, BigDecimal percent_change_24h, BigDecimal percent_change_7d,
			BigDecimal market_cap, String last_updated) {
		super();
		this.currency = currency;
		this.price = price;
		this.volume_24h = volume_24h;
		this.percent_change_1h = percent_change_1h;
		this.percent_change_24h = percent_change_24h;
		this.percent_change_7d = percent_change_7d;
		this.market_cap = market_cap;
		this.last_updated = last_updated;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getVolume_24h() {
		return volume_24h;
	}

	public void setVolume_24h(BigDecimal volume_24h) {
		this.volume_24h = volume_24h;
	}

	public BigDecimal getPercent_change_1h() {
		return percent_change_1h;
	}

	public void setPercent_change_1h(BigDecimal percent_change_1h) {
		this.percent_change_1h = percent_change_1h;
	}

	public BigDecimal getPercent_change_24h() {
		return percent_change_24h;
	}

	public void setPercent_change_24h(BigDecimal percent_change_24h) {
		this.percent_change_24h = percent_change_24h;
	}

	public BigDecimal getPercent_change_7d() {
		return percent_change_7d;
	}

	public void setPercent_change_7d(BigDecimal percent_change_7d) {
		this.percent_change_7d = percent_change_7d;
	}

	public BigDecimal getMarket_cap() {
		return market_cap;
	}

	public void setMarket_cap(BigDecimal market_cap) {
		this.market_cap = market_cap;
	}

	public String getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
