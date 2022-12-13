package com.problem1.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int productId;
private String productname;
private int quantity;
private int price;

public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

public Product() {
	
}

public Product(String productname, int quantity, int price) {
	super();
	
	this.productname = productname;
	this.quantity = quantity;
	this.price = price;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productname=" + productname + ", quantity=" + quantity + ", price="
			+ price + "]";
}


}
