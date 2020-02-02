package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Entity.Categorie;
import Entity.ConnexionDB;

public class CategorieDaoImple implements CategorieDao{

	
	
	public Long AjouterCategorie(Categorie c) {
		EntityManager em =ConnexionDB.getEntityManeger();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		return c.getId_categorie();		
	}
	

	public void SupprimerCategorie(Long idCategorie) {
		EntityManager em =ConnexionDB.getEntityManeger();
		//chargement de la categorie		
		em.getTransaction().begin();
		Categorie c = em.find(Categorie.class, idCategorie);
		em.remove(idCategorie);
		em.getTransaction().commit();
	}
	

	public void ModifierCategorie(Categorie c) {
		EntityManager em =ConnexionDB.getEntityManeger();
		em.getTransaction().begin();
		em.merge(c);		
		em.getTransaction().commit();
	}

	public List<Categorie> Lister() {
		EntityManager em =ConnexionDB.getEntityManeger();
		em.getTransaction().begin();
		Query requete = em.createQuery("select * from Categorie");
		return requete.getResultList();
		
	}
	

}
