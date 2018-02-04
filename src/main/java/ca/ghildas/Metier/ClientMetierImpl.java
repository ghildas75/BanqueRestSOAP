package ca.ghildas.Metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.ghildas.dao.ClientRepository;
import ca.ghildas.entity.Client;

@Service
public class ClientMetierImpl implements IClientMetier {

@Autowired
private ClientRepository clientRepository;

@Override
public Client saveClient(Client c) {
	// TODO Auto-generated method stub
	return clientRepository.save(c);
}

@Override
public List<Client> getAllCustomer() {
	// TODO Auto-generated method stub
	return clientRepository.findAll();
} 
}
