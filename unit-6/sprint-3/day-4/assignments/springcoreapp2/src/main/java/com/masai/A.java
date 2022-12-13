package com.masai;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype")
public class A {
	@Autowired
//	@Qualifier("b5") 
	private B b1;
	
//	@Autowired
//	List<String> cities;
	
	@Autowired
	private List<String> list;
	
	@Autowired
	private Student s1;
	

	
	
	@Value("100")
	private int id;
	@Value("pradeep")
	private String name;
	@Value("80000")
	private int salary;
	
	@PostConstruct
	public void mysetup() {
		System.out.println("inside mysetup");
	}
	
	@PreDestroy
	public void tearDown(){
	System.out.println("inside tear down method");
	}

	
	
	public void funA() {
		System.out.println("inside funA of A");
		System.out.println(b1);
//		b1.funB();
		System.out.println(list);
		System.out.println(s1);
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		}
}
