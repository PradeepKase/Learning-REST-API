package com.masai.services;

import java.util.List;

import com.masai.exception.BookNotFount;
import com.masai.model.Book;

public interface BookServices {

	public Book registerStudent(Book b);
	public Book getbookbybookid(Integer bookid)throws BookNotFount ;
	public List<Book> getallbooks()throws BookNotFount;
	public Book deletbookbybookid(Integer bookid)throws BookNotFount;
	public Book updatebooks(Book book)throws BookNotFount;
}
