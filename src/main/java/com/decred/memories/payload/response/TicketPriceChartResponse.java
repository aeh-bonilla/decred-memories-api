package com.decred.memories.payload.response;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.List;

public class TicketPriceChartResponse implements Serializable {
	
	private static final long serialVersionUID = 1020901852840156353L;
	
	private List<Long> count;
	private List<BigDecimal> price;
	private List<Long> t;
	private Integer window;
	
	public TicketPriceChartResponse() {}

	public List<Long> getCount() {
		return count;
	}

	public void setCount(List<Long> count) {
		this.count = count;
	}

	public List<BigDecimal> getPrice() {
		return price;
	}

	public void setPrice(List<BigDecimal> price) {
		this.price = price;
	}

	public List<Long> getT() {
		return t;
	}

	public void setT(List<Long> t) {
		this.t = t;
	}

	public Integer getWindow() {
		return window;
	}

	public void setWindow(Integer window) {
		this.window = window;
	}
}
