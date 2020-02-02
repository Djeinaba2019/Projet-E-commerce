package Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Utilisateur")
public class Utilisateur  implements Serializable{

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_utilisateur;

@Column(name="Actived")
	private boolean Actived;

public long getId_utilisateur() {
	return id_utilisateur;
}
@OneToOne
@JoinColumn(name="idRole")
	private Role role;


public Role getRole() {
	return role;
}

public void setRole(Role role) {
	this.role = role;
}

public void setActived(boolean actived) {
	Actived = actived;
}

public void setId_utilisateur(Long id_utilisateur) {
	this.id_utilisateur = id_utilisateur;
}

public Utilisateur(String nom_utilisateur, String mot_passe, boolean actived) {
	super();
	this.nom_utilisateur = nom_utilisateur;
	Mot_passe = mot_passe;
	Actived = actived;
}

public Utilisateur() {
	super();
	// TODO Auto-generated constructor stub
}

@Column(name="Nom_Utilisateur")
private String nom_utilisateur;


@Column(name="Mot_Passe ")
private	String Mot_passe;

public String getNom_utilisateur() {
	return nom_utilisateur;
}

public void setNom_utilisateur(String nom_utilisateur) {
	this.nom_utilisateur = nom_utilisateur;
}

public String getMot_passe() {
	return Mot_passe;
}

public void setMot_passe(String mot_passe) {
	Mot_passe = mot_passe;
}

public boolean isActived() {
	return Actived;
}

public void setActive(boolean actived) {
	Actived = actived;
}

public Utilisateur(boolean actived, Role role, String nom_utilisateur, String mot_passe) {
	super();
	Actived = actived;
	this.role = role;
	this.nom_utilisateur = nom_utilisateur;
	Mot_passe = mot_passe;
}



}
