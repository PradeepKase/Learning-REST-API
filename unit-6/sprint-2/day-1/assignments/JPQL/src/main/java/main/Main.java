package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import beans.Employee;
import usecases.AddEmployeeUsecase;
import usecases.DeletEmployee;
import usecases.GetEmployeeByid;
import usecases.Getemployeenames;
import usecases.RegisterEmployeeusecase;

public class Main {

	
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
System.out.println("enter  1 to add new employee");
System.out.println("enter  2 to get names of all employee");
System.out.println("enter  3 to get employee by id");
System.out.println("enter  4 to register employee");
System.out.println("enter  5 to delet employee by id");
int ans=0;
try {
	 ans=sc.nextInt();	
}
catch(InputMismatchException e) {
	System.out.println("enter valid integer");
	main(args);
}


switch(ans) {
case 1:AddEmployeeUsecase.addemployee();
break;
case 2:Getemployeenames.getEmployeenames();
break;
case 3 :GetEmployeeByid.getemployeebyid();
break;
case 4: RegisterEmployeeusecase.RegisterEmployee();
break;
case 5:DeletEmployee.deletemployeeByid();
break;
}



//case 2:
   }
}
