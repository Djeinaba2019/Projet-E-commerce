package DAO;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Entity.Client;
import Entity.Commande;
import Entity.ConnexionDB;
import Entity.LigneCommande;
import Entity.Panier;

public class CommadeDaoImple implements CommandeDao{
	
	public Commande ConsulterCommande(Long idCommande) {
		EntityManager em =ConnexionDB.getEntityManeger();
		em.getTransaction().begin();
		em.getTransaction().commit();
		return em.find(Commande.class, idCommande);
		
	}

	public LigneCommande ConsulterLigneCommande(Long LigneCommande) {
		EntityManager em =ConnexionDB.getEntityManeger();
		em.getTransaction().begin();
		return em.find(LigneCommande.class, LigneCommande);
		
	}


	public List<Commande> ListerCommande() {
		EntityManager em =ConnexionDB.getEntityManeger();
		em.getTransaction().begin();
		Query requete = em.createQuery("select * from LigneCommande");
		return requete.getResultList();
	}

	public Commande EnregistrerCommande(PanierDao p, Client c) {
		EntityManager em =ConnexionDB.getEntityManeger();
		em.getTransaction().begin();
		em.persist(c);
		Commande cmd = new Commande();
		cmd.setDateCommande(new Date());
		cmd.setLigneCommande(p.ListerPanier());
		for(LigneCommande ligne : p.ListerPanier()) {
			em.persist(ligne);
		}
		em.persist(cmd);
		em.getTransaction().commit();
		return null;
	}
	
	

}
