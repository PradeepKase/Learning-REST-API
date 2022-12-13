package com.masai.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.beans.Address;
import com.masai.beans.Employee;
import com.masai.beans.Student;

//@Controller //sterio type annotaion register with spring contaner
@RestController  //now response body is not required
public class Mycontroller { // this is called root resource
@RequestMapping("/hello")	
//@ResponseBody
public String sayHello() {  // this is called resource
	return "Hello folks...";
}

@RequestMapping("/hi")
//@ResponseBody
public String sayHello2() {
	
	return "Welcome to Spring boot......";
	
	//logical name of physical jsp page
}

@RequestMapping("/student")
public Student getstudentss() {
 Student s =new Student(1,"pradeep",new Address("mdl", "ka", 587313),544);
return s;
}


@RequestMapping("/Liststudents")
public Set<Student> Listgetstudentss() {
	Set students=new HashSet<>();
	
	 students.add(new Student(1,"pradeep",new Address("mdl", "ka", 587313),544));
	 students.add(new Student(1,"paddu",new Address("mdl", "ka", 587313),544));
	 students.add(new Student(1,"pradeep",new Address("mdl", "ka", 587313),544));
	 students.add(new Student(1,"pradeep",new Address("mdl", "ka", 587313),544));
	 students.add(new Student(1,"pradeep",new Address("mdl", "ka", 587313),544));
	 return students;
	}

@RequestMapping("/Listemp")
public List<Employee> getEmployees() {
	List<Employee> l=new ArrayList<>();
	l.add(new Employee(2, "a", "p", 0));
	l.add(new Employee(3, "b", "q", 0));
	l.add(new Employee(4, "c", "r", 0));
	l.add(new Employee(5, "d", "s", 0));
	l.add(new Employee(6, "e", "t", 0));
//	Employee e=new Employee(2,"paddu","mdl",800000);
	return l;
}

@RequestMapping("/emp")
public Employee getEmplyee() {
	Employee e=new Employee(2,"paddu","mdl",800000);
	return e;
}

}

