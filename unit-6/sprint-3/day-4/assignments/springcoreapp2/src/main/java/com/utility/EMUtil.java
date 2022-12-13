package com.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	

	public static EntityManager provideManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student-unit");

		EntityManager em = emf.createEntityManager();

		return em;
	}
}
