package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Entity.Categorie;
import Entity.ConnexionDB;
import Entity.Produit;

public class ProduitDAOImple implements ProduitDAO{

	
	public void AjouterProduit(Produit p, Long idCategorie) {
		EntityManager em =ConnexionDB.getEntityManeger();
		em.getTransaction().begin();
		Categorie c = em.find(Categorie.class, idCategorie);
		p.setCategorie(c);
		em.persist(p);	
		em.getTransaction().commit();
	}

	
	public void SupprimerProduit(Long idProduit) {
		EntityManager em =ConnexionDB.getEntityManeger();
		em.getTransaction().begin();
		Produit p = em.find(Produit.class, idProduit);
		em.remove(idProduit);
		em.getTransaction().commit();
	}

	public List<Produit> ListerProduits() {
		EntityManager em =ConnexionDB.getEntityManeger();
		em.getTransaction().begin();
	Query requete = em.createQuery("select p from Produits ");
		return requete.getResultList();
	}

	public void modifierProduit(Produit p) {
		EntityManager em =ConnexionDB.getEntityManeger();
		em.getTransaction().begin();
		em.merge(p);	
		em.getTransaction().commit();
	}

	public Produit ConsulterProduit(Long idProduit) {
		EntityManager em =ConnexionDB.getEntityManeger();
		em.getTransaction().begin();
		return em.find(Produit.class, idProduit);
	}


	public List<Produit> Recherche(String Designation) {
		EntityManager em =ConnexionDB.getEntityManeger();
		em.getTransaction().begin();
		Query requete = em.createQuery("select Produits.Description, Produits.Prix_produit from Produits where Produits.Designation=" +Designation+"");
		return requete.getResultList();
	}

}
