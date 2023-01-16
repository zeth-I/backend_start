package com.capgemini.start.api.resource.exceptions;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.capgemini.start.domain.service.exceptions.ObjectAlreadyExistsException;
import com.capgemini.start.domain.service.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException ex, HttpServletRequest request) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
				new StandardError(
							LocalDateTime.now(), 
							request.getMethod(),
							ex.getMessage(),
							HttpStatus.NOT_FOUND.value(), 
							request.getRequestURI(),
							null)

				);

	}
	
	@ExceptionHandler(ObjectAlreadyExistsException.class)
	public ResponseEntity<StandardError> objectAlreadyExists(ObjectAlreadyExistsException ex, HttpServletRequest request) {
		return ResponseEntity.status(HttpStatus.CONFLICT).body(
				new StandardError(
							LocalDateTime.now(), 
							request.getMethod(),
							ex.getMessage(),
							HttpStatus.CONFLICT.value(), 
							request.getRequestURI(),
							null)
				);

	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<StandardError> handleValidationExceptions(
	  MethodArgumentNotValidException ex, HttpServletRequest request) {
	    Map<String, String> errors = new HashMap<>();
	    ex.getBindingResult().getAllErrors().forEach(error -> {
	        String fieldName = ((FieldError) error).getField();
	        String errorMessage = error.getDefaultMessage();
	        errors.put(fieldName, errorMessage);
	    });
	    return ResponseEntity.badRequest().body(
	    		new StandardError(
						LocalDateTime.now(),
						request.getMethod(),
						"BAD REQUEST",
						HttpStatus.BAD_REQUEST.value(), 
						request.getRequestURI(),
						errors)
			);

	}

}
