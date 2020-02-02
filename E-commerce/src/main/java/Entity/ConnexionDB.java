package Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnexionDB {
	private static final EntityManagerFactory emf;
	private static final String PERSISTENCE_UNIT_NAME="E-commerce";
	
	static{
    	emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

	public static EntityManager getEntityManeger(){
		return emf.createEntityManager();
	}
}
