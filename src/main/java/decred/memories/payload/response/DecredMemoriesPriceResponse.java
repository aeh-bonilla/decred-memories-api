package decred.memories.payload.response;

public class DecredMemoriesPriceResponse {

	private Integer buyedTickets;
	private Long ticketPrice;
	private Long timeInSeconds;
	private String dateForPrice;
	private Integer window;
	
	public DecredMemoriesPriceResponse() {}

	public DecredMemoriesPriceResponse(Integer buyedTickets, Long ticketPrice, Long timeInSeconds, String dateForPrice,
			Integer window) {
		super();
		this.buyedTickets = buyedTickets;
		this.ticketPrice = ticketPrice;
		this.timeInSeconds = timeInSeconds;
		this.dateForPrice = dateForPrice;
		this.window = window;
	}

	public Integer getBuyedTickets() {
		return buyedTickets;
	}

	public void setBuyedTickets(Integer buyedTickets) {
		this.buyedTickets = buyedTickets;
	}

	public Long getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Long ticketPrice) {
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
