package main;

import java.util.Scanner;

import usecases.Addcourse;
import usecases.getCourse;
import usecases.getstudent;

public class Main {
	
	static Scanner sc = new Scanner( System.in);
	public static void main(String[] args) throws Exception {
		
		System.out.println("enter 1 to add course");
		System.out.println("enter 2 to get student");
		System.out.println("enter 3 to assaign employee to department");
		System.out.println("enter 4 to get all empolyee from department");
		int ans=sc.nextInt();
		
		switch (ans) {
		case 1:Addcourse.addcourse(sc);
		break;
		case 2:getstudent.Getstudent(sc);
		break;
		case 3:getCourse.getcourse();
		break;
//		case 4: GetAllEmployeeWithDeptName.getAllEmployeeWithDeptName(sc);;
//		break;
//		default:
//			break;
		}
		
		
	}
}
