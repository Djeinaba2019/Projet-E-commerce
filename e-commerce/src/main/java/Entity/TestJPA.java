package Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJPA {
	private static final EntityManagerFactory emf;
	private static final String PERSISTENCE_UNIT_NAME="e-commerce";
	
	static{
    	emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

	public static EntityManager getEntityManeger(){
		return emf.createEntityManager();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = getEntityManeger();
		em.getTransaction().begin();
		
		em.getTransaction().commit();

	}

}
