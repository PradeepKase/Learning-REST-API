package javabean;

import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String email;
private String address;
private double balance;
private DateTimeFormatter created_date;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public DateTimeFormatter getDtf() {
	return created_date;
}
public void setDtf(DateTimeFormatter dtf) {
	this.created_date = dtf;
}

public account() {
	
}



public account(String email, String address, double balance, DateTimeFormatter dtf) {
	super();
	this.email = email;
	this.address = address;
	this.balance = balance;
	this.created_date = dtf;
}
@Override
public String toString() {
	return "account [id=" + id + ", email=" + email + ", address=" + address + ", balance=" + balance + ", dtf=" + created_date
			+ "]";
} 


}
