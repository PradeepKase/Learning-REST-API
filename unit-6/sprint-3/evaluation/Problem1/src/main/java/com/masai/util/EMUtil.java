package com.masai.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("problem1db");

	
	public static EntityManager provedEntityManager() {
		return emf.createEntityManager();
	}
}
