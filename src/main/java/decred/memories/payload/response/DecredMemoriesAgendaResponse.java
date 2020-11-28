package decred.memories.payload.response;

import java.util.Date;

public class DecredMemoriesAgendaResponse {

	private String  name;
	private String  description;
	private String  status;
	private Date    startTime;
	private Date    expireTime;


	public DecredMemoriesAgendaResponse() {}

	public DecredMemoriesAgendaResponse(String name, String description, String status, Date startTime, Date expireTime) {
		super();
		this.name = name;
		this.description = description;
		this.status = status;
		this.startTime = startTime;
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

	//Date Types
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date starttime) {
		this.startTime = startTime;
	}

	public Date getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Date expiretime) {
		this.expireTime = expireTime;
	}
}
