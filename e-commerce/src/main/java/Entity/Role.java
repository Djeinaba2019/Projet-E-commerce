package Entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Role implements Serializable {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id_role;

@Column(name="Nom_Role")
private String Nom_Role;

@OneToMany(mappedBy="role")
private List <Utilisateur> utilisateurs;

public List<Utilisateur> getUtilisateurs() {
	return utilisateurs;
}

public void setUtilisateurs(List<Utilisateur> utilisateurs) {
	this.utilisateurs = utilisateurs;
}

public Long getId_role() {
	return id_role;
}

public void setId_role(Long id_role) {
	this.id_role = id_role;
}

public String getNom_Role() {
	return Nom_Role;
}

public void setNom_Role(String nom_Role) {
	Nom_Role = nom_Role;
}

public Role() {
	super();
	// TODO Auto-generated constructor stub
}

public Role(String nom_Role) {
	super();
	Nom_Role = nom_Role;
}

}
