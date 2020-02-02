package Metier;

import java.util.List;

import DAO.PanierDao;
import Entity.Categorie;
import Entity.Client;
import Entity.Commande;
import Entity.LigneCommande;
import Entity.Produit;
import Entity.Role;
import Entity.Utilisateur;

public interface Administrateur {


	public Long AjouterCategorie(Categorie c);
	public void SupprimerCategorie(Long idCategorie);
	public void ModifierCategorie(Categorie c);
	public  List<Categorie> Lister();
	
	public Commande ConsulterCommande(Long idCommande);
	public LigneCommande ConsulterLigneCommande(Long LigneCommande);
	public Commande EnregistrerCommande(PanierDao p, Client c);
	public List<Commande>  ListerCommande();
	
	public void AjouterProduit(Produit p, Long idCategorie);
	public void SupprimerProduit(Long idProduit);
	public List<Produit> ListerProduits();
	public void modifierProduit(Produit p);
	public Produit ConsulterProduit(Long idProduit);
	public void attribuerRole(Role r ,Long id_utilisateur);
	
	public Client Consulter(Long idClient);
	public List<Client> UsersList();
	public void UserValidation(Utilisateur u);
	public Client getClient(Long idClient);
}
