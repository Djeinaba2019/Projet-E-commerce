package DAO;

import javax.persistence.EntityManager;

import Entity.ConnexionDB;
import Entity.Role;
import Entity.Utilisateur;

public class RoleDaoImple implements RoleDao{

	public void attribuerRole(Role r, Long id_utilisateur) {
		EntityManager em =ConnexionDB.getEntityManeger();
		em.getTransaction().begin();
		Utilisateur u = em.find(Utilisateur.class, id_utilisateur);
		u.setRole(r);
		em.persist(r);
		em.getTransaction().commit();
	}

}
