package DAO;

import java.util.Collection;

import Entity.Commande;
import Entity.LigneCommande;
import Entity.Produit;

public interface PanierDao {
	
	public void AjouterPannier(Produit p, int quantity);
	public Collection <LigneCommande> ListerPanier();
	public double Total();
}
