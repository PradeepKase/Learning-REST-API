package DAO;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javabean.account;

public class DAOImpl implements stateBankDAO{

	public account findAccountById(int id) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
		EntityManager em= emf.createEntityManager();
		em.getTransaction().begin();
		account ac=em.find(account.class, id);
		if(ac==null) {
			System.out.println("the id is not found");
		}
		return ac;
	}

	@Override
	public String saveAccount(account account) {
		// TODO Auto-generated method stub
		String s=null;
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("account");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(account);
		s="saved";
		em.getTransaction().commit();
		em.close();
		System.out.println("Data saved");
		return s;
	}

	@Override
	public String deleteaccountById(int id) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("account");
		EntityManager em=emf.createEntityManager();
		account pro =em.find(account.class, id);
		String s=null;
		if(pro!=null) {
			em.getTransaction().begin();
			em.remove(pro);
			s="removed";
			em.getTransaction().commit();
		}
		em.close();
		return s;
	}

	@Override
	public String withdrawFromaccount(double amount, int accountId) {
		// TODO Auto-generated method stub
		String message = "Invailed credational";
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("account");
         EntityManager em = emf.createEntityManager();
         
         account ac = em.find(account.class, accountId);
         
         if(ac != null) {
        	 
        	 em.getTransaction().begin();
        	 
        	 ac.setBalance(ac.getBalance()-amount);
        	 
        	 em.getTransaction().commit();
        	 
        	 message = "balance withdraw " + amount;
         
         
         return message;
	}
		return message;
}
}
