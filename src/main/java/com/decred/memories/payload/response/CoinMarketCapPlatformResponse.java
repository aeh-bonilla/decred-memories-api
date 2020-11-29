package com.decred.memories.payload.response;

public class CoinMarketCapPlatformResponse {

	public Integer id;
	public String name;
	public String symbol;
	public String slug;
	private String token_address;
	
	public CoinMarketCapPlatformResponse() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getToken_address() {
		return token_address;
	}

	public void setToken_address(String token_address) {
		this.token_address = token_address;
	}
}
