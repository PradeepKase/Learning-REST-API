package Main;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import DAO.DAOImpl;
import javabean.account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("to save data press1");
		System.out.println("to search product by id press2");

//			DAOImpl daoImpl = new DAOImpl();
//			daoImpl.findAccountById(id);
//		
		Scanner sc=new Scanner(System.in);
		int ans=sc.nextInt();
		switch(ans) {
		case 1:	
		System.out.println("enter id to find acount");
		int id=sc.nextInt();
		DAOImpl daoImpl = new DAOImpl();
		daoImpl.findAccountById(id);
		break;
		
		case 2: 
			System.out.println("enter id to delet acount");
			int id1=sc.nextInt();
			DAOImpl daoImp2 = new DAOImpl();
			System.out.println( daoImp2.deleteaccountById(id1));
			
//		String email=sc.next();
//		System.out.println("enter address");
//		int address=sc.nextInt();
//		System.out.println("enter balance");
//		double balance=sc.nextDouble();
//		System.out.println("enter date");
//		String created_date=sc.next();
//		account p =new account(email,address,balance,created_date);
//		daoImpl.saveAccount(p);
//		break;
		
		
		
//		case 2:
//			System.out.println("Enter product id to search");
//			int Id=sc.nextInt();
//			SearchbyId(Id);
//			break;

	}

}
}