package decred.memories.payload.response;

import java.io.Serializable;
import java.util.List;

public class TicketPriceChartResponse implements Serializable {
	
	private static final long serialVersionUID = 1020901852840156353L;
	
	private List<Integer> count;
	private List<Long> price;
	private List<Long> t;
	private Integer window;
	
	public TicketPriceChartResponse() {}

	public List<Integer> getCount() {
		return count;
	}

	public void setCount(List<Integer> count) {
		this.count = count;
	}

	public List<Long> getPrice() {
		return price;
	}

	public void setPrice(List<Long> price) {
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
