package lk.ac.vau.controller.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.dao.DuplicateKeyException;

import lk.ac.vau.model.Error;

@RestControllerAdvice
public class GenericExceptionHandler {
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<Error> EntitiyNotFoundException(EntityNotFoundException exception) {
		Error error=new Error(404,"NOT FOUND",exception.getMessage());
		return new ResponseEntity<Error>(error, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(DuplicateKeyException.class)
	public ResponseEntity<Error> DuplicateKeyException(DuplicateKeyException exception){
		Error error=new Error(406,"NOT Acceptable",exception.getMessage());
		return new ResponseEntity<Error>(error, HttpStatus.NOT_ACCEPTABLE);
	}

}
