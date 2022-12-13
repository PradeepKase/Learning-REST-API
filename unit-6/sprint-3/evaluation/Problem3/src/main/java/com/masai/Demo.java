package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		PersonService obj=ctx.getBean(PersonService.class);
		obj.printList();
		obj.printMap();
		obj.printAppName();
	}

}
