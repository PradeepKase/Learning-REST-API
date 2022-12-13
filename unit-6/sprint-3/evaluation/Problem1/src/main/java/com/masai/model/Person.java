package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int person_id; 
	private String name;
	private String email;
	private String mobile;
	
	@ManyToMany(mappedBy = "person", cascade = CascadeType.ALL)
	List<Gym>gym = new ArrayList<>();
	
	

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Person(int person_id, String name, String email, String mobile) {
		super();
		this.person_id = person_id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}



	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	

}
