package com.masai.exception;

//import org.apache.logging.log4j.message.Message;

public class BookNotFount extends Exception{

	public BookNotFount(){
		
	}
	
	public BookNotFount(String Message ){
		super(Message);
	}
	
}
