package Metier;

import java.util.Collection;
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

public class ClientMetierImple implements ClientMetier{


	private CategorieDao categorieDao;
	private CommandeDao commandeDao;
	private ProduitDAO produitDao;
	private RoleDao roleDao;
	private UserDao userDao;
	private PanierDao pannier;
	
	public List<Categorie> Lister() {	
		return categorieDao.Lister();
	}

	public Commande EnregistrerCommande(PanierDao p, Client c) {
		return commandeDao.EnregistrerCommande(p, c);
	}

	public void AjouterPannier(Produit p, int quantity) {
		pannier.AjouterPannier(p, quantity);
	}

	public Collection<LigneCommande> ListerPanier() {
		return pannier.ListerPanier();
	}

	public double Total() {
		return pannier.Total();
	}

}
