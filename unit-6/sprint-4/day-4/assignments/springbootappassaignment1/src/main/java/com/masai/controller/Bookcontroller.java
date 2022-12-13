package com.masai.controller;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.BookNotFount;
import com.masai.model.Book;
import com.masai.services.BookServices;
@RestController
public class Bookcontroller {
	@Autowired
	private BookServices bservice;
	
	
	@PostMapping("/books")
	public ResponseEntity<Book> createnewBook(@RequestBody Book b){
		Book Registerdbook= bservice.registerStudent(b);
		return new ResponseEntity<Book>(Registerdbook,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/books/{bookid}")
	public ResponseEntity<Book> getbookbybookidhandlre(@PathVariable("bookid") Integer bookid) throws BookNotFount{
		Book bk=bservice.getbookbybookid(bookid);
		
		return new ResponseEntity<Book>(bk, HttpStatus.OK);
	}
	
	@GetMapping("/allbooks")
	public ResponseEntity<List<Book>> getallbookshandler() throws BookNotFount{
		List<Book> l= bservice.getallbooks();
		return new ResponseEntity<List<Book>>(l,HttpStatus.OK);
	}
	@DeleteMapping("/deletbook/{bookid}")
	public ResponseEntity<Book> deletebookbybookidhandler(@PathVariable("bookid") Integer bookid) throws BookNotFount{
		Book deletedbook=bservice.deletbookbybookid(bookid);
		return new ResponseEntity<Book>(deletedbook, HttpStatus.OK);
	}
	
	@PutMapping("/updatebook")
	public ResponseEntity<Book> updatebookhander(@RequestBody Book b) throws BookNotFount{
		Book updatedbook=bservice.updatebooks(b);
		return new ResponseEntity<Book>(updatedbook, HttpStatus.ACCEPTED);
	}
}
