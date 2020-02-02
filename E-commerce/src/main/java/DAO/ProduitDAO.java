package DAO;

import java.util.List;

import Entity.Produit;

public interface ProduitDAO {
	
	public void AjouterProduit(Produit p, Long idCategorie);
	public void SupprimerProduit(Long idProduit);
	public List<Produit> ListerProduits();
	public void modifierProduit(Produit p);
	public Produit ConsulterProduit(Long idProduit);
	public List<Produit> Recherche(String Designation);
	

}
