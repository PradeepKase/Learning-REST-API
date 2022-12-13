package com.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.model.FullTimeInstructor;
import com.utility.EMUtil;

public class Demo2 {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.proveidEntityManager();
		
		String jpql = "from FullTimeInstructor";
		
		Query q = em.createQuery(jpql);
		
		Object obj = q.getResultList();
		
		List<FullTimeInstructor> list =  (List<FullTimeInstructor>) obj;
		
		list.forEach(s -> System.out.println(s));
		
		em.close();
		
		
		
		
		
	}

}
