package ca.ghildas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ca.ghildas.Metier.IClientMetier;
import ca.ghildas.entity.Client;
@RestController
public class ClientService {
@Autowired
private IClientMetier  clientMetier;
@RequestMapping(value="/clients", method=RequestMethod.POST)
public Client saveClient(@RequestBody Client c) {
	return clientMetier.saveClient(c);
}

@RequestMapping(value="/clients")
public List<Client> getAllCustomer() {
	return clientMetier.getAllCustomer();
}  




}
