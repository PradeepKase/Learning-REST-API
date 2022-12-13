package Main;

import java.util.Scanner;

import Exception.EmployeeException;
import Usecases.GetAllEmployee;
import Usecases.InsertEmployee;
//import usecases.AddEmployeeUsecase;
//import usecases.Getemployeenames;

public class Main {

	public static void main(String[] args) throws EmployeeException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for add employee");
		System.out.println("enter 2 for getting all employee");
		int ans=sc.nextInt();	
		switch(ans) {
		
		case 1:InsertEmployee.addemployee();
		break;
		case 2:GetAllEmployee.GetAllemployee();
		break;
		

	}

}
}