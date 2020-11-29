package com.decred.memories.payload.response;

import java.util.Map;
import java.util.List;
import java.math.BigDecimal;

public class CoinMarketCapDataResponse {

	private Integer id;
    private String name;
    private String symbol;
    private String slug;
    private Integer num_market_pairs;
    private String date_added;
    private List<String> tags;
    private BigDecimal max_supply;
    private BigDecimal circulating_supply;
    private BigDecimal total_supply;
    private CoinMarketCapPlatformResponse platform;
    private Integer cmc_rank;
    private String last_updated;
    
    /*private CoinMarketCapQuoteResponse quote;*/
    
    private Map<String, Object> quote;
    
    public CoinMarketCapDataResponse() {}

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

	public Integer getNum_market_pairs() {
		return num_market_pairs;
	}

	public void setNum_market_pairs(Integer num_market_pairs) {
		this.num_market_pairs = num_market_pairs;
	}

	public String getDate_added() {
		return date_added;
	}

	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public BigDecimal getMax_supply() {
		return max_supply;
	}

	public void setMax_supply(BigDecimal max_supply) {
		this.max_supply = max_supply;
	}

	public BigDecimal getCirculating_supply() {
		return circulating_supply;
	}

	public void setCirculating_supply(BigDecimal circulating_supply) {
		this.circulating_supply = circulating_supply;
	}

	public BigDecimal getTotal_supply() {
		return total_supply;
	}

	public void setTotal_supply(BigDecimal total_supply) {
		this.total_supply = total_supply;
	}

	public CoinMarketCapPlatformResponse getPlatform() {
		return platform;
	}

	public void setPlatform(CoinMarketCapPlatformResponse platform) {
		this.platform = platform;
	}

	public Integer getCmc_rank() {
		return cmc_rank;
	}

	public void setCmc_rank(Integer cmc_rank) {
		this.cmc_rank = cmc_rank;
	}

	public String getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}

	public Map<String, Object> getQuote() {
		return quote;
	}

	public void setQuote(Map<String, Object> quote) {
		this.quote = quote;
	}
}
