package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Entity.Categorie;
import Entity.Client;
import Entity.ConnexionDB;
import Entity.Utilisateur;

public class UserDaoImple implements UserDao{

	
	
	public Client Consulter(Long idClient) {
		EntityManager em =ConnexionDB.getEntityManeger();
		em.getTransaction().begin();
	 return  em.find(Client.class, idClient);
	}

	public List<Client> UsersList() {
		EntityManager em =ConnexionDB.getEntityManeger();
		em.getTransaction().begin();
		Query requete = em.createQuery("select * from Client");
		return requete.getResultList();
	}

	public void UserValidation(Utilisateur u) {
		EntityManager em =ConnexionDB.getEntityManeger();
		em.getTransaction().begin();
		 em.persist(u);
	}

	public Client getClient(Long idClient) {
		EntityManager em =ConnexionDB.getEntityManeger();
		em.getTransaction().begin();
		 return  em.find(Client.class, idClient);		 
	}

}
