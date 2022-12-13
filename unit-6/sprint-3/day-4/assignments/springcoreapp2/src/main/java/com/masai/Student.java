package com.masai;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Service;

@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int roll;
private String name;
private int marks;
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}

public Student() {
	
}

public Student(int roll, String name, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
}



}
