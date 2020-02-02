package Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJPA {
	private static final EntityManagerFactory emf;
	private static final String PERSISTENCE_UNIT_NAME="E-commerce";
	
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
		Produit p = new Produit("P1","nettoyant mains",100,50,false,"photo1");
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
