package com.swaggyj.gettingstarted.api.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.swaggyj.gettingstarted.exception.InternalException;
import com.swaggyj.gettingstarted.exception.NotFoundException;

@ControllerAdvice
class DefaultControllerAdvice {

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 500
	@ExceptionHandler(Exception.class)
	public void handleDefault() {
		// Nothing to do
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 500
	@ExceptionHandler(InternalException.class)
	public void handleInternal() {
		// Nothing to do
	}

	@ResponseStatus(HttpStatus.NOT_FOUND) // 404
	@ExceptionHandler(NotFoundException.class)
	public void handleNotFound() {
		// Nothing to do
	}
}
