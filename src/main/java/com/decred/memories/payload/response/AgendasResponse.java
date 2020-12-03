package com.decred.memories.payload.response;

import java.io.Serializable;
import java.util.Date;

public class AgendasResponse implements Serializable {

	private static final long serialVersionUID = 3833186036017908145L;
	private String  name;
	private String  description;
	private String  status;
	private Long    votingStarted;
	private Long    votingdone;
	private Long    activated;
	private Long    hardforked;
	private String    starttime;
	private String    expiretime;
	private Integer voteversion;
	private Short   mask;


	public AgendasResponse() {}

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

	//Long Types
	public Long getVotingStarted() {
		return votingStarted;
	}

	public void setVotingStarted(Long votingStarted) {
		this.votingStarted = votingStarted;
	}

	public Long getVotingDone() {
		return votingdone;
	}

	public void setVotingDone(Long votingdone) {
		this.votingdone = votingdone;
	}

	public Long getActivated() {
		return activated;
	}

	public void setActivated(Long activated) {
		this.activated = activated;
	}

	public Long getHardforked() {
		return hardforked;
	}

	public void setHardforked(Long hardforked) {
		this.hardforked = hardforked;
	}

	public Long getVotingdone() {
		return votingdone;
	}

	public void setVotingdone(Long votingdone) {
		this.votingdone = votingdone;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getExpiretime() {
		return expiretime;
	}

	public void setExpiretime(String expiretime) {
		this.expiretime = expiretime;
	}

	public Integer getVoteversion() {
		return voteversion;
	}

	public void setVoteversion(Integer voteversion) {
		this.voteversion = voteversion;
	}

	//Integer Types
	public Integer getVoteVersion() {
		return voteversion;
	}

	public void setVoteVersion(Integer voteversion) {
		this.voteversion = voteversion;
	}

	//Short Types
	public Short getMask() {
		return mask;
	}

	public void setMask(Short mask) {
		this.mask = mask;
	}
}
