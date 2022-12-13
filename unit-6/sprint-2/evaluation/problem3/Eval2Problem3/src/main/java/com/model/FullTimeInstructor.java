package com.model;

import javax.persistence.Entity;

@Entity
public class FullTimeInstructor extends Instructor{
	
	private int salary;
	private String email;
	
	
	
	public FullTimeInstructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FullTimeInstructor(int salary, String email) {
		super();
		this.salary = salary;
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "FullTimeInstructor [salary=" + salary + ", email=" + email + "]";
	}
	
	
	
	
	

}
