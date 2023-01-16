package com.capgemini.start.api.resource.exceptions;

import java.time.LocalDateTime;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StandardError {
	
	private LocalDateTime timestamp;
	private String method;
	private String error;
	private Integer status;
	private String path;
	
	private Map<String, String> details;

	public StandardError(LocalDateTime timestamp, String method, String error, Integer status, String path,
			Map<String, String> details) {
		super();
		this.timestamp = timestamp;
		this.method = method;
		this.error = error;
		this.status = status;
		this.path = path;
		this.details = details;
	}
	
	

}
