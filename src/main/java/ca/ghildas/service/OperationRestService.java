package ca.ghildas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ca.ghildas.Metier.IOperationMetier;
import ca.ghildas.Metier.OperationPage;

@RestController
public class OperationRestService {

@Autowired
private IOperationMetier operationMetier;

@PutMapping(value="/versment") 
public boolean verser(@RequestParam String code,@RequestParam double montant, @RequestParam Long employeId) {
	return operationMetier.verser(code, montant, employeId);
}
@PutMapping(value="/retrait") 
public boolean retirer(@RequestParam String code, @RequestParam double montant, @RequestParam Long employeId) {
	return operationMetier.retirer(code, montant, employeId);
}
@PutMapping(value="/virment") 
public boolean virer(@RequestParam String code1,@RequestParam  String code2, @RequestParam double montant,@RequestParam  Long employeId) {
	return operationMetier.virer(code1, code2, montant, employeId);
}	
@GetMapping(value="/operations")
public OperationPage getOperations(@RequestParam String codeCompte,@RequestParam int page, @RequestParam int size) {
	return operationMetier.getOperations(codeCompte, page, size);
}
}
