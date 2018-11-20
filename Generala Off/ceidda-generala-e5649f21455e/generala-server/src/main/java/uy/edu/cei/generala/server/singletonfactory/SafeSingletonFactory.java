package uy.edu.cei.generala.server.singletonfactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SafeSingletonFactory {
	
	private static SafeSingletonFactory instance;

	public static synchronized SafeSingletonFactory getInstance() {
		if (instance == null) {
			instance = new SafeSingletonFactory();
		}
		return instance;
	}

	private final EntityManager em;
	
	private SafeSingletonFactory() {
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("jpaDS");
		this.em = emf.createEntityManager();
	}

	public EntityManager getEM() {
		return em;
	}
	
}