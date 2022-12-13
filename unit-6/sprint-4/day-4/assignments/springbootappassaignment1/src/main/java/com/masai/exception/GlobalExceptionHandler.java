package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.masai.model.MyerrorDetails;

@ControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(BookNotFount.class)
	public ResponseEntity<MyerrorDetails> MyexceptionHandler(BookNotFount ie,WebRequest wr) {
	MyerrorDetails myerror=new MyerrorDetails();
	myerror.setDetails(wr.getDescription(false));
	myerror.setMessage(ie.getMessage());
	myerror.setTimestamp(LocalDateTime.now());
	return new ResponseEntity<MyerrorDetails>(myerror,HttpStatus.BAD_REQUEST);
	
	}

}
