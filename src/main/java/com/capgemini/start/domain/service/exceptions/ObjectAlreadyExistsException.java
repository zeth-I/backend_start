package com.capgemini.start.domain.service.exceptions;

public class ObjectAlreadyExistsException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ObjectAlreadyExistsException() {
		super();
	}
	
	public ObjectAlreadyExistsException(String message) {
		super(message);
	}

}