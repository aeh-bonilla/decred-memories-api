package com.decred.memories.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiParam;

/**
 * Represents user information
 *
 * @author abonilla
 * @version 1.0
 * @since 1.0
 */
public class UserCoreInfoRequestDto implements Serializable {

    private static final long serialVersionUID = 2877167988065038250L;
	
    @ApiParam(value = "User's core info identifier.", required = true)
    private Long idUserCoreInfo;

    @ApiParam(value = "User's tax identifier.", required = true)
    private String userRfc;
     
    @ApiParam(value = "User's name", required = false)
    private String userName;
    
    @ApiParam(value = "User's tax identifier.", required = false)
    private String userNameHint;
    
    private String userNubaNumber;
    
    private String payeeName;
    
    private String payeeRelationship;
    
    private String firstThreeNubaNumbers;
    
    private String lastThreeNubaNumbers;
    
    private String termInvestmentPlan;
    
    @ApiParam(value = "User's account identifier.", required = false)
    private String clabe;
    
    public UserCoreInfoRequestDto() {}

	public Long getIdUserCoreInfo() {
		return idUserCoreInfo;
	}

	public void setIdUserCoreInfo(Long idUserCoreInfo) {
		this.idUserCoreInfo = idUserCoreInfo;
	}

	public String getUserRfc() {
		return userRfc;
	}

	public void setUserRfc(String userRfc) {
		this.userRfc = userRfc;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNameHint() {
		return userNameHint;
	}

	public void setUserNameHint(String userNameHint) {
		this.userNameHint = userNameHint;
	}

	public String getUserNubaNumber() {
		return userNubaNumber;
	}

	public void setUserNubaNumber(String userNubaNumber) {
		this.userNubaNumber = userNubaNumber;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayeeRelationship() {
		return payeeRelationship;
	}

	public void setPayeeRelationship(String payeeRelationship) {
		this.payeeRelationship = payeeRelationship;
	}

	public String getFirstThreeNubaNumbers() {
		return firstThreeNubaNumbers;
	}

	public void setFirstThreeNubaNumbers(String firstThreeNubaNumbers) {
		this.firstThreeNubaNumbers = firstThreeNubaNumbers;
	}

	public String getLastThreeNubaNumbers() {
		return lastThreeNubaNumbers;
	}

	public void setLastThreeNubaNumbers(String lastThreeNubaNumbers) {
		this.lastThreeNubaNumbers = lastThreeNubaNumbers;
	}

	public String getTermInvestmentPlan() {
		return termInvestmentPlan;
	}

	public void setTermInvestmentPlan(String termInvestmentPlan) {
		this.termInvestmentPlan = termInvestmentPlan;
	}

	public String getClabe() {
		return clabe;
	}

	public void setClabe(String clabe) {
		this.clabe = clabe;
	}
}

