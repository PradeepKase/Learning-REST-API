package com.masai;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentServiceUsecase {

	
	@Autowired
	private StudentService sService;
	
	
	public void insertStudent() {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter student roll no");
//		int roll=sc.nextInt();
		System.out.println("Enter student name");
		String name=sc.next();
		System.out.println("Enter student marks");
		int marks=sc.nextInt();
		Student s=new Student();
		s.setName(name);
		s.setMarks(marks);
		String result=sService.SaveStudent(s);
		System.out.println(result);
	}
}
