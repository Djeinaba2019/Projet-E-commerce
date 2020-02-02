package DAO;

import java.util.List;

import Entity.Categorie;


public interface CategorieDao {

	public Long AjouterCategorie(Categorie c);
	public void SupprimerCategorie(Long idCategorie);
	public void ModifierCategorie(Categorie c);
	public  List<Categorie> Lister();
}
