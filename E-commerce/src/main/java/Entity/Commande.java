package Entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Commande")
public class Commande implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCommande;

@Column(name="Date_Commande")
private Date dateCommande;

@ManyToOne
@JoinColumn(name="idProduit")
private Produit Produit;

@OneToMany
private Collection<LigneCommande> ligneCommande;


//association bidirectionnelle avec le client
@OneToOne
@JoinColumn(name="idClient")
private Client client;

public Commande() {
	super();
	// TODO Auto-generated constructor stub
}

public Commande(Date dateCommande, Produit produit, Collection<LigneCommande> ligneCommande, Client client) {
	super();
	this.dateCommande = dateCommande;
	Produit = produit;
	this.ligneCommande = ligneCommande;
	this.client = client;
}

public Long getIdCommande() {
	return idCommande;
}

public void setIdCommande(Long idCommande) {
	this.idCommande = idCommande;
}

public Date getDateCommande() {
	return dateCommande;
}

public void setDateCommande(Date dateCommande) {
	this.dateCommande = dateCommande;
}

public Produit getProduit() {
	return Produit;
}

public void setProduit(Produit produit) {
	Produit = produit;
}

public Collection<LigneCommande> getLigneCommande() {
	return ligneCommande;
}

public void setLigneCommande(Collection<LigneCommande> ligneCommande) {
	this.ligneCommande = ligneCommande;
}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}





}
