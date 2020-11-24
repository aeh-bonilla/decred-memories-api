package com.decred.memories.dto;

import java.io.Serializable;

/** POJO que representa los atributos que se manipularán en el front-end
 *  @author alain.bonilla
 *  @since  23/11/2020
 * */

public class UserTokenDto implements Serializable {

    private static final long serialVersionUID = 2877167988065038250L;
    
    private String id_user;
    private String email_token;
    private String pin;
    private String status;
    
	public String getId_user() {
		return id_user;
	}
	public void setId_user(String id_user) {
		this.id_user = id_user;
	}
	public String getEmail_token() {
		return email_token;
	}
	public void setEmail_token(String email_token) {
		this.email_token = email_token;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
   
}
