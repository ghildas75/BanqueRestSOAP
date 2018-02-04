package ca.ghildas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ca.ghildas.Metier.ICompteMetier;
import ca.ghildas.entity.Compte;

@RestController
public class CompteRestService {
@Autowired
private ICompteMetier compteMetier;

@PostMapping(value="/comptes")
public Compte saveCompte(@RequestBody Compte c) {
	return compteMetier.saveCompte(c);
}
@GetMapping(value="/comptes/{code}")
public Compte getCompteById(@PathVariable String code) {
	return compteMetier.getCompteById(code);
}	

}
