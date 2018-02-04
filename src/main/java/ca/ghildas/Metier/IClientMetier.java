package ca.ghildas.Metier;

import java.util.List;

import ca.ghildas.entity.Client;

public interface IClientMetier {

	public Client saveClient(Client c);
	public List<Client> getAllCustomer();
}
