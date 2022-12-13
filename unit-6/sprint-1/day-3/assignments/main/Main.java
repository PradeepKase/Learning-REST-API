package com.problem1.main;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.problem1.bean.Product;



public class Main {
	public static void save(Product pro) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Product");
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
	em.persist(pro);
	
	em.getTransaction().commit();
	em.close();
	System.out.println("Data saved");
	}
	
	
	
	
	public static void SearchbyId(int Id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Product");
		EntityManager em=emf.createEntityManager();
		Product pro =em.find(Product.class, Id);
		if(pro!=null) {
			System.out.println(pro);
		}
		else {
			System.out.println("record not found with this id");
		}
		em.close();
	}
	
	public static String getAddressOfEmployee(int empId) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Product");
		EntityManager em=emf.createEntityManager();
		Product pro =em.find(Product.class, empId);
		String s = null;
		if(pro!=null) {
			 s =pro.getProductname();
		}
		else {
			System.out.println("record not found with this id");
		}
		em.close();
		return s;
		
		
	}
	public static void deletproductbyId(int Id1) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Product");
		EntityManager em=emf.createEntityManager();
		Product pro =em.find(Product.class, Id1);
		if(pro!=null) {
			em.getTransaction().begin();
			em.remove(pro);
			em.getTransaction().commit();
			System.out.println("Product removed");
		}
		else {
			System.out.println("record not found with this id");
		}
		em.close();
	}
	
	
	public static void increasepriceofproduct(int empId2, int bonus) {
//		return null;
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Product");
		EntityManager em=emf.createEntityManager();
		Product pro =em.find(Product.class, empId2);
//		String s = null;
		if(pro==null) {
		System.out.println("product is not fount with this id");
		}
		else {
			em.getTransaction().begin();
			pro.setPrice(pro.getPrice()+bonus);
			em.getTransaction().commit();
			System.out.println("product bonus price added succesfully");
		}
		em.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("to save data press1");
		System.out.println("to search product by id press2");
		System.out.println("to delet product by id press3");
		System.out.println("to get name of product by id press4");
		System.out.println("to increse price of product by id press5");
		Scanner sc=new Scanner(System.in);
		int ans=sc.nextInt();
		switch(ans) {
		case 1:	
		System.out.println("enter pname");
		String Pname=sc.next();
		System.out.println("enter pquantity");
		int Pquant=sc.nextInt();
		System.out.println("enter pprice");
		int pp=sc.nextInt();
		
		Product p =new Product(Pname,Pquant,pp);
		save(p);
		break;
		case 2:
			System.out.println("Enter product id to search");
			int Id=sc.nextInt();
			SearchbyId(Id);
			break;
			
		case 3:System.out.println("Enter product id to delet");
			int Id1=sc.nextInt();
			deletproductbyId(Id1);
			break;
			
		case 4:System.out.println("Enter product id to get name of product");
			int empId=sc.nextInt();
			System.out.println(getAddressOfEmployee(empId));
			break;
		case 5:System.out.println("Enter product id to increse price");
			int empId2=sc.nextInt();
			System.out.println("Enter bonus price to add to product price");
			int bonus=sc.nextInt();
			increasepriceofproduct( empId2, bonus);
			}

	

	
		
		
		


	
	}

}
