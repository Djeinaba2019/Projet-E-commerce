package DAO;

import java.util.List;

import Entity.Client;
import Entity.Utilisateur;

public interface UserDao {
	
	
	public Client Consulter(Long idClient);
	public List<Client> UsersList();
	public void UserValidation(Utilisateur u);
	public Client getClient(Long idClient);

}
