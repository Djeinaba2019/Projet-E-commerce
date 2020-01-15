package Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Ligne_de_Commande")
public class LigneCommande implements Serializable {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long idLigneCommande;

@Column(name="Quantité")
private int quantity;

@Column(name="Prix")
private double prix; 


//association bidirectionnelle
@ManyToOne
@JoinColumn(name="idCommande")
private Commande commande;

public Long getIdLigneCommande() {
	return idLigneCommande;
}

public void setIdLigneCommande(Long idLigneCommande) {
	this.idLigneCommande = idLigneCommande;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public double getPrix() {
	return prix;
}

public void setPrix(double prix) {
	this.prix = prix;
}


public Commande getCommande() {
	return commande;
}

public void setCommande(Commande commande) {
	this.commande = commande;
}

public LigneCommande(int quantity, double prix, Commande commande) {
	super();
	this.quantity = quantity;
	this.prix = prix;
	this.commande = commande;
}

public LigneCommande() {
	super();
	
}



}
