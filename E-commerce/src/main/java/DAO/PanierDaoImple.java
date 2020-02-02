package DAO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;

import Entity.Commande;
import Entity.ConnexionDB;
import Entity.Produit;
import Entity.LigneCommande;

public class PanierDaoImple implements PanierDao{
private Map<Long,LigneCommande> articles = new HashMap<Long,LigneCommande>();
	
	public void AjouterPannier(Produit p, int quantity) {
		//vérification si le produit n'est pas dans le panier
		if(articles.get(p.getId_produit())==null) {
			LigneCommande ligne = new LigneCommande();
			ligne.setProduit(p);
			ligne.setQuantity(quantity);
			ligne.setPrix(p.getPrix());
		}
		else {
			//on ajoute le produit 
			LigneCommande ligne = articles.get(p.getId_produit());
			ligne.setQuantity(quantity);
		}
		
	}

	public Collection<LigneCommande> ListerPanier() {
		return articles.values();
		
	}

	public double Total() {
		double total=0;
		for(LigneCommande ligne : articles.values()) {
			total+=ligne.getPrix()*ligne.getQuantity();
		}
		return total;
	}

	
	

}
