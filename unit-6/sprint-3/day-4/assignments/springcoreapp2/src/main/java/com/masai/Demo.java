//package com.masai;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.stereotype.Service;
////@Service
//public class Demo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
//		
//		A ob=ctx.getBean(A.class);
//		ob.funA();
//		
////		((ClassPathXmlApplicationContext)ctx)
//		((AnnotationConfigApplicationContext) ctx).close();
//		//if our spring bean is in prototype scope then the spring container will
//		//not manage the life-cycle of spring bean after giving the object
//		//to the client  i.e destroyed method will not be calle dspring bean object
//		//in prototype scope
//		
//		}
//
//}
