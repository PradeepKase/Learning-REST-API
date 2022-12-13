package com.masai;

import org.springframework.stereotype.Service;

@Service
public class B {
	public void funB() {
		System.out.println("inside funB of B");
		}
	
	
	public Student GetStudent() {
		Student s=new Student(1,"pk",78);
		return s;
	}
	
}
