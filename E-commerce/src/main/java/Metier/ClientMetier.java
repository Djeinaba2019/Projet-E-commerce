package Metier;

import java.util.Collection;
import java.util.List;

import DAO.PanierDao;
import Entity.Categorie;
import Entity.Client;
import Entity.Commande;
import Entity.LigneCommande;
import Entity.Produit;


public interface ClientMetier {
	
	public  List<Categorie> Lister();
	public Commande EnregistrerCommande(PanierDao p, Client c);
	public void AjouterPannier(Produit p, int quantity);
	public Collection <LigneCommande> ListerPanier();
	public double Total();

}
