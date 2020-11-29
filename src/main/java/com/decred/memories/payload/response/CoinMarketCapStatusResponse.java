package com.decred.memories.payload.response;

public class CoinMarketCapStatusResponse {

	private String timestamp;
	private Integer error_code;
	private String error_message;
	private Integer elapsed;
	private Integer credit_count;
	private String notice;
	private Integer total_count;
	
	public CoinMarketCapStatusResponse() {}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getError_code() {
		return error_code;
	}

	public void setError_code(Integer error_code) {
		this.error_code = error_code;
	}

	public String getError_message() {
		return error_message;
	}

	public void setError_message(String error_message) {
		this.error_message = error_message;
	}

	public Integer getElapsed() {
		return elapsed;
	}

	public void setElapsed(Integer elapsed) {
		this.elapsed = elapsed;
	}

	public Integer getCredit_count() {
		return credit_count;
	}

	public void setCredit_count(Integer credit_count) {
		this.credit_count = credit_count;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public Integer getTotal_count() {
		return total_count;
	}

	public void setTotal_count(Integer total_count) {
		this.total_count = total_count;
	}
}
