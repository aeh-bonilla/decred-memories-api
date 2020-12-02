package com.decred.memories.payload.response;

import java.math.BigDecimal;

public class DecredMemoriesPriceResponse {

	private Long buyedTickets;
	private BigDecimal ticketPrice;
	private Long timeInSeconds;
	private String dateForPrice;
	private Integer window;
	
	public DecredMemoriesPriceResponse() {}

	public DecredMemoriesPriceResponse(Long buyedTickets, BigDecimal ticketPrice, Long timeInSeconds,
			String dateForPrice, Integer window) {
		super();
		this.buyedTickets = buyedTickets;
		this.ticketPrice = ticketPrice;
		this.timeInSeconds = timeInSeconds;
		this.dateForPrice = dateForPrice;
		this.window = window;
	}

	public Long getBuyedTickets() {
		return buyedTickets;
	}

	public void setBuyedTickets(Long buyedTickets) {
		this.buyedTickets = buyedTickets;
	}

	public BigDecimal getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(BigDecimal ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Long getTimeInSeconds() {
		return timeInSeconds;
	}

	public void setTimeInSeconds(Long timeInSeconds) {
		this.timeInSeconds = timeInSeconds;
	}

	public String getDateForPrice() {
		return dateForPrice;
	}

	public void setDateForPrice(String dateForPrice) {
		this.dateForPrice = dateForPrice;
	}

	public Integer getWindow() {
		return window;
	}

	public void setWindow(Integer window) {
		this.window = window;
	}
}
