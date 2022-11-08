package br.com.mateusb23.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit");
	
	public ConnectionFactory() { }
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
}
