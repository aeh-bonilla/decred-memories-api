package com.decred.memories.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/** Excepcion para sobreescribir el menssage enviado al front
 * 
 * @author alain.bonilla
 * @since 23/1/2020
 */

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UnauthorizedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public UnauthorizedException(String message){
	    super(message);
	  }


}
