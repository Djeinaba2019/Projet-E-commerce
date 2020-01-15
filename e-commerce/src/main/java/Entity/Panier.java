package Entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Panier implements Serializable {
	private Long idPanier;

	public Panier() {
		super();
		 
	}
	private Map<Long,LigneCommande>  article = new HashMap<Long,LigneCommande>() ; ;
	
 public void AJouterProduit(Produit p, int quantite) {
	 // on verifie si  le produit n'est pas dans le panier
	 if(article.get(p.getId_produit())==null) {
		 // on cree une ligne de commande et on ajoute le produit
		 LigneCommande ligneC = new LigneCommande();
		 ligneC.setProduits(p);
		 ligneC.setPrix(p.getPrix());
		 ligneC.setQuantity(quantite);}
	 else {
		 
		 LigneCommande ligneC = article.get(p.getId_produit()); 
		 ligneC.setQuantity(p.getQuantite()+quantite);
	 }}	
 
 //supprimer un produit
 public void SupprimerProduit(Long id_produit) {
	 article.remove(id_produit);
 }
 
	 //Methode pour lister le contenu du panier 
public  Collection<LigneCommande>  ListerPanier(){
	// retourne le contenu de Map 
	return article.values();
}


	
}
	 
	 
