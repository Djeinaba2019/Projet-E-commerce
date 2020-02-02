package Metier;

import java.util.List;

import DAO.CategorieDao;
import DAO.CommandeDao;
import DAO.PanierDao;
import DAO.ProduitDAO;
import DAO.RoleDao;
import DAO.UserDao;
import Entity.Categorie;
import Entity.Client;
import Entity.Commande;
import Entity.LigneCommande;
import Entity.Produit;
import Entity.Role;
import Entity.Utilisateur;

public class AdministrateurImple implements Administrateur{
	
	private CategorieDao categorieDao;
	private CommandeDao commandeDao;
	private ProduitDAO produitDao;
	private RoleDao roleDao;
	private UserDao userDao;
	
	
	public Long AjouterCategorie(Categorie c) {
		return categorieDao.AjouterCategorie(c);
		
	}

	public void SupprimerCategorie(Long idCategorie) {
		categorieDao.SupprimerCategorie(idCategorie);
	}

	public void ModifierCategorie(Categorie c) {
		categorieDao.ModifierCategorie(c);	
	}

	public List<Categorie> Lister() {
		return categorieDao.Lister();
		
	}

	public Commande ConsulterCommande(Long idCommande) {
		return commandeDao.ConsulterCommande(idCommande);
		
	}

	public LigneCommande ConsulterLigneCommande(Long LigneCommande) {
		return commandeDao.ConsulterLigneCommande(LigneCommande);
			}

	public Commande EnregistrerCommande(PanierDao p, Client c) {
		return commandeDao.EnregistrerCommande(p, c);
		
	}

	public List<Commande> ListerCommande() {
		return commandeDao.ListerCommande();
	}

	public void AjouterProduit(Produit p, Long idCategorie) {
		produitDao.AjouterProduit(p, idCategorie);	
	}

	public void SupprimerProduit(Long idProduit) {
		produitDao.SupprimerProduit(idProduit);	
	}

	public List<Produit> ListerProduits() {
		return produitDao.ListerProduits();
		
	}

	public void modifierProduit(Produit p) {
		produitDao.modifierProduit(p);
		
	}

	public Produit ConsulterProduit(Long idProduit) {
		return produitDao.ConsulterProduit(idProduit);
	}

	public void attribuerRole(Role r, Long id_utilisateur) {
		roleDao.attribuerRole(r, id_utilisateur);
	}

	public Client Consulter(Long idClient) {
		return userDao.Consulter(idClient);
	}

	public List<Client> UsersList() {
		return userDao.UsersList();
	}

	public void UserValidation(Utilisateur u) {
		userDao.UserValidation(u);
	}

	public Client getClient(Long idClient) {
		
		return userDao.getClient(idClient);
	}

}
