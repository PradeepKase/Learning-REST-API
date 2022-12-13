package com.masai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.masai")
public class AppConfig {
	@Bean
	public List<Person> getPerson(){
		List<Person> person =new ArrayList<>();
		person.add(new Person(1,"paddu", "pk2@gmail.com", 25, "65432414"));
		person.add(new Person(2,"aaddu", "tr2@gmail.com", 25, "65432414"));
		person.add(new Person(2,"baddu", "tr2@gmail.com", 25, "65432414"));
		person.add(new Person(2,"caddu", "tr2@gmail.com", 25, "65432414"));
		person.add(new Person(2,"daddu", "tr2@gmail.com", 25, "65432414"));
		return person;
	}
	
	@Bean
	public Map <Person,Gym> getmap(){
		Map <Person,Gym> themap=new HashMap<>();
		
		themap.put(new Person(2,"daddu", "tr2@gmail.com", 25, "65432414"), new Gym(1,"kck",5000));
		themap.put(new Person(2,"jaddu", "tr2@gmail.com", 25, "65432414"), new Gym(1,"fg",5000));
		themap.put(new Person(2,"kaddu", "tr2@gmail.com", 25, "65432414"), new Gym(1,"oj",5000));
		return themap;
		
	};
}
