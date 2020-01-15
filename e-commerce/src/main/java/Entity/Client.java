package Entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Client")
public class Client implements Serializable {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long idClient;
	
@Column(name="Nom_Client")
private String nomClient;
	
@Column(name="Prenom_Client")
private String prenomClient;

@Column(name="Adresse_Client")
private String adresseClient;

@Column(name="Telephone")
private String Telephone;

@Column(name="Mail")
private String mail;

@Column(name="Code_Postal")
private String codePostal;
	
//un client peut effectuer une ou plusieurs commandes
@OneToMany(mappedBy="client")
private Collection<Commande> commande ;

public Long getIdClient() {
	return idClient;
}


public void setIdClient(Long idClient) {
	this.idClient = idClient;
}


public String getNomClient() {
	return nomClient;
}


public void setNomClient(String nomClient) {
	this.nomClient = nomClient;
}


public String getPrenomClient() {
	return prenomClient;
}


public void setPrenomClient(String prenomClient) {
	this.prenomClient = prenomClient;
}


public String getAdresseClient() {
	return adresseClient;
}


public void setAdresseClient(String adresseClient) {
	this.adresseClient = adresseClient;
}


public String getTelephone() {
	return Telephone;
}


public void setTelephone(String telephone) {
	Telephone = telephone;
}


public String getMail() {
	return mail;
}


public void setMail(String mail) {
	this.mail = mail;
}


public String getCodePostal() {
	return codePostal;
}


public void setCodePostal(String codePostal) {
	this.codePostal = codePostal;
}


public Collection<Commande> getCommande() {
	return commande;
}


public void setCommande(Collection<Commande> commande) {
	this.commande = commande;
}


public Client(String nomClient, String prenomClient, String adresseClient, String telephone, String mail,
		String codePostal, Collection<Commande> commande) {
	super();
	this.nomClient = nomClient;
	this.prenomClient = prenomClient;
	this.adresseClient = adresseClient;
	Telephone = telephone;
	this.mail = mail;
	this.codePostal = codePostal;
	this.commande = commande;
}


public Client() {
	super();
	// TODO Auto-generated constructor stub
}




}
