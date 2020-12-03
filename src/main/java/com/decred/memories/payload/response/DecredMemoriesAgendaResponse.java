package com.decred.memories.payload.response;

import java.util.Date;

public class DecredMemoriesAgendaResponse {

	private String  name;
	private String  description;
	private String  status;
	private String    startTime;
	private String    expireTime;

	public DecredMemoriesAgendaResponse() {}

	public DecredMemoriesAgendaResponse(String name, String description, String status, String startTime,
			String expireTime) {
		super();
		this.name = name;
		this.description = description;
		this.status = status;
		this.startTime = startTime;
		this.expireTime = expireTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	//String Types
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setStartTime(Date starttime) {
		this.startTime = startTime;
	}

	public void setExpireTime(Date expiretime) {
		this.expireTime = expireTime;
	}
	
	public String getStartTime() {
		return startTime;
	}

	public String getExpireTime() {
		return expireTime;
	}
}
