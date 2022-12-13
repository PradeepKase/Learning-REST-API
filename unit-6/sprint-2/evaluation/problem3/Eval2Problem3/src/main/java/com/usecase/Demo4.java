package com.usecase;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.utility.EMUtil;

public class Demo4 {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.proveidEntityManager();
		
		String jpql = "select FullTimeInstructor where instrucrId = 1";
		
		Query q = em.createQuery(jpql);
		
		Object obj = q.getSingleResult();
		
		System.out.println(obj);
		
		
	}

}
