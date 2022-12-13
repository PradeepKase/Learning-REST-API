package com.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.model.FullTimeInstructor;
import com.model.PartTimeInstructor;
import com.utility.EMUtil;

public class Demo3 {
	
	public static void main(String[] args) {
		
        EntityManager em = EMUtil.proveidEntityManager();
		
		String jpql = "from PartTimeInstructor";
		
		Query q = em.createQuery(jpql);
		
		Object obj = q.getResultList();
		
		List<PartTimeInstructor> list =  (List<PartTimeInstructor>) obj;
		
		list.forEach(s -> System.out.println(s));
		
		em.close();
		
	}

}
