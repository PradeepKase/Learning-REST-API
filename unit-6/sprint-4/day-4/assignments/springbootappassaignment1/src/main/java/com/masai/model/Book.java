package com.masai.model;

//import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer Bookid;
	private String name;
	private String author;
	private Integer price;
	public Integer getBookid() {
		return Bookid;
	}
	public void setBookid(Integer bookid) {
		Bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	public Book() {
		
	}
	
	public Book(Integer bookid, String name, String author, Integer price) {
		super();
		Bookid = bookid;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [Bookid=" + Bookid + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	

}
