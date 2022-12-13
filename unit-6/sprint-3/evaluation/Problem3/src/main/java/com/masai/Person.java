package com.masai;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//@Service
public class Person {
//@Value("1")	
private int person_id;
//@Value("pradeep")
private String name;
//@Value("pk@gmail.com")
private String email;
//@Value("25")
private int age;
//@Value("654656465")
private String mobile;

public Person() {
	
}

public Person(int person_id, String name, String email, int age, String mobile) {
	super();
	this.person_id = person_id;
	this.name = name;
	this.email = email;
	this.age = age;
	this.mobile = mobile;
}

@Override
public String toString() {
	return "Person [person_id=" + person_id + ", name=" + name + ", email=" + email + ", age=" + age + ", mobile="
			+ mobile + "]";
}



}
