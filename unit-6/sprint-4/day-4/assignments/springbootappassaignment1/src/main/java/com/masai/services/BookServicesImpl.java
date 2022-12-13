package com.masai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.DAO.BookDAO;
import com.masai.exception.BookNotFount;
import com.masai.model.Book;
@Service
public class BookServicesImpl implements BookServices{
	
	@Autowired
	private BookDAO bdao;

	@Override
	public Book registerStudent(Book b) {
		// TODO Auto-generated method stub
		Book savedbook= bdao.save(b);
		return savedbook;
		
	}

	@Override
	public Book getbookbybookid(Integer bookid) throws BookNotFount {
		// TODO Auto-generated method stub
//	 Optional<Book> opt= bdao.findById(bookid);
//	 if(opt.isPresent()) {
//		 Book b=opt.get();
//		 return b;
//	 }
//	 else {
//		 throw new BookNotFount("book not found with this id"+ bookid);
//	 }
		
		return bdao.findById(bookid).orElseThrow(()->new BookNotFount("book not found with this id\"+ bookid"));

	}

	@Override
	public List<Book> getallbooks() throws BookNotFount {
		// TODO Auto-generated method stub
		
		List<Book> listbooks = bdao.findAll();
		if(listbooks.size()==0) {
			throw new BookNotFount("no books");
		}else {
			return listbooks;
		}
	}

	@Override
	public Book deletbookbybookid(Integer bookid) throws BookNotFount {
		Optional<Book> opt= bdao.findById(bookid);
		if(opt.isPresent()) {
			Book deletedbook=opt.get();
			bdao.delete(deletedbook);
			return deletedbook;
		}
		else{
			throw new BookNotFount("book not found with this id:" +bookid);
		}
	}

	@Override
	public Book updatebooks(Book book) throws BookNotFount {
		// TODO Auto-generated method stub
		Optional<Book> opt =bdao.findById(book.getBookid());
		if(opt.isPresent()) {
			Book updatedbook= bdao.save(book);
			return updatedbook;
		}else {
			throw new BookNotFount("book not updated");
		}
	}

	
	
	
	
}
