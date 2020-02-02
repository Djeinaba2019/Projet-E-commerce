package DAO;

import java.util.List;

import Entity.Categorie;
import Entity.Client;
import Entity.Commande;
import Entity.LigneCommande;


public interface CommandeDao {
	
	public Commande ConsulterCommande(Long idCommande);
	public LigneCommande ConsulterLigneCommande(Long LigneCommande);
	public Commande EnregistrerCommande(PanierDao p, Client c);
	public List<Commande>  ListerCommande();
	
	
	

}
