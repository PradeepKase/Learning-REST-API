package com.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	
	private static EntityManagerFactory emf= Persistence.createEntityManagerFactory("instructorUnit");
	
	public static EntityManager proveidEntityManager() {
		return emf.createEntityManager();
	}

}
