package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	StudentServiceUsecase obj=ctx.getBean("studentServiceUsecase", StudentServiceUsecase.class);
	obj.insertStudent();

}
}
