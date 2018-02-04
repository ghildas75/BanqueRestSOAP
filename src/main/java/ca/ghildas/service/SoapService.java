package ca.ghildas.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ca.ghildas.Metier.ICompteMetier;
import ca.ghildas.Metier.IOperationMetier;
import ca.ghildas.Metier.OperationPage;
import ca.ghildas.entity.Compte;

@Component
@WebService
public class SoapService {
@Autowired
private ICompteMetier compteMetier;
@Autowired
private IOperationMetier operationMetier;
@WebMethod
public boolean verser(@WebParam(name="code")String code,
		@WebParam(name="montant")double montant, 
		@WebParam(name="employeId")Long employeId) {
	return operationMetier.verser(code, montant, employeId);
}
@WebMethod
public boolean retirer(@WebParam(name="code")String code,
		@WebParam(name="montant")double montant, 
		@WebParam(name="employeId")Long employeId) {
	return operationMetier.retirer(code, montant, employeId);
}
@WebMethod
public boolean virer(@WebParam(name="code1")String code1, @WebParam(name="code")String code2, 
		@WebParam(name="montant")double montant,
		@WebParam(name="employeId")Long employeId) {
	return operationMetier.virer(code1, code2, montant, employeId);
}
@WebMethod
public OperationPage getOperations(@WebParam(name="codeCompte")String codeCompte, 
		@WebParam(name="page")int page, 
		@WebParam(name="size")int size) {
	return operationMetier.getOperations(codeCompte, page, size);
}
/*@WebMethod
public Compte saveCompte(Compte c) {
	return compteMetier.saveCompte(c);
}*/
@WebMethod
public Compte getCompteById(@WebParam(name="numCompte")String numCompte) {
	return compteMetier.getCompteById(numCompte);
}



}
