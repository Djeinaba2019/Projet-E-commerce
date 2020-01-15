package Entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Categorie implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id_categorie;

@Column(name="Nom_Categorie")
private String nom_categorie;

@Column(name="Designation")
private String designation;

@Lob
@Column(name="Photo")
private byte[] photo;

@Column(name="nom_Photo")
private String nom_photo;

public String getNom_photo() {
	return nom_photo;
}

public void setNom_photo(String nom_photo) {
	this.nom_photo = nom_photo;
}

//une categorie contient un ou plusieurs produits ,association bidirectionnelle
@OneToMany(mappedBy="categorie")
private Collection<Produit> produit ;

public Long getId_categorie() {
	return id_categorie;
}

public void setId_categorie(Long id_categorie) {
	this.id_categorie = id_categorie;
}

public String getNom_categorie() {
	return nom_categorie;
}

public Categorie(String nom_categorie, String designation, byte[] photo, String nom_photo) {
	super();
	this.nom_categorie = nom_categorie;
	this.designation = designation;
	this.photo = photo;
	this.nom_photo = nom_photo;
}

public void setNom_categorie(String nom_categorie) {
	this.nom_categorie = nom_categorie;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public byte[] getPhoto() {
	return photo;
}

public void setPhoto(byte[] photo) {
	this.photo = photo;
}

public Categorie() {
	super();
	// TODO Auto-generated constructor stub
}

public Collection<Produit> getProduit() {
	return produit;
}

public void setProduit(Collection<Produit> produit) {
	this.produit = produit;
}



	

}
