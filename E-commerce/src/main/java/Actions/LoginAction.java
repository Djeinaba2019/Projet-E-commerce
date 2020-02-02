package Actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String nom_Utilisateur,mot_passe;

	public String getNom_Utilisateur() {
		return nom_Utilisateur;
	}

	public void setNom_Utilisateur(String nom_Utilisateur) {
		this.nom_Utilisateur = nom_Utilisateur;
	}

	public String getMot_passe() {
		return mot_passe;
	}

	public void setMot_passe(String mot_passe) {
		this.mot_passe = mot_passe;
	}
	
	public String execute() {
		if(nom_Utilisateur.equals("admin")&& mot_passe.equals("admin")) {
			return "SUCCESS";
		}
		else {
			return "ERROR";
		}
	}

}
