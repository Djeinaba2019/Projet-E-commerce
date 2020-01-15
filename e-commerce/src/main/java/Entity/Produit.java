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
@Table(name="Produits")
public class Produit implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_produit;

	@Column(name="Designation")
	private String designation ;

	@Column(name="Description")
	private String description ;
	
	
	@Column(name="Prix_produit")
	private double prix;

	@Column(name="Quantite")
	private int quantite ;

	@Column(name="Selectionné")
	private boolean selected;

	@Column(name="Photo")
	private String photo ;


//association bidirectionnelle , un produit apartient à une et une seul  categorie

	@ManyToOne
	@JoinColumn(name="idCategorie")
	private Categorie categorie;



public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}

public Categorie getCategorie() {
	return categorie;
}

public Long getId_produit() {
	return id_produit;
}

public void setId_produit(Long id_produit) {
	this.id_produit = id_produit;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public double getPrix() {
	return prix;
}

public void setPrix(double prix) {
	this.prix = prix;
}

public int getQuantite() {
	return quantite;
}

public void setQuantite(int quantite) {
	this.quantite = quantite;
}

public boolean isSelected() {
	return selected;
}

public void setSelected(boolean selected) {
	this.selected = selected;
}

public String getPhoto() {
	return photo;
}

public void setPhoto(String photo) {
	this.photo = photo;
}

public Produit( String designation, String description, double prix, int quantite, boolean selectionne,
		String photo) {
	super();
	
	this.designation = designation;
	this.description = description;
	this.prix = prix;
	this.quantite = quantite;
	this.selected= selected;
	this.photo = photo;
}

public Produit() {
	super();
	
}



	
	
}
