package ca.ghildas.Metier;

import java.util.Date;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ca.ghildas.dao.CompteRepository;
import ca.ghildas.dao.EmployeRepository;
import ca.ghildas.dao.OperationRepository;
import ca.ghildas.entity.Compte;
import ca.ghildas.entity.Employe;
import ca.ghildas.entity.Operation;
import ca.ghildas.entity.Retrait;
import ca.ghildas.entity.Versement;

@Service
@Transactional
public class OperationMetierImpl  implements IOperationMetier{

	@Autowired
	private OperationRepository operationRepository;
	
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private EmployeRepository employeRepository;

	@Override
	public boolean verser(String code, double montant, Long employeId) {
		// TODO Auto-generated method stub
		Compte c=compteRepository.findOne(code);
		Employe e=employeRepository.findOne(employeId);
		Operation o= new Versement();
		o.setMontant(montant);
		o.setEmploye(e);
		o.setDateOperation(new Date());
	    o.setCompte(c);
	    operationRepository.save(o);
	    c.setSolde(c.getSolde()+montant);
		return true;
	}

	@Override
	public boolean retirer(String code, double montant, Long employeId) {
		Compte c=compteRepository.findOne(code);
		if(c.getSolde()<montant) throw new RuntimeException("Solde insuffisant");
		Employe e=employeRepository.findOne(employeId);
		Operation o= new Retrait();
		o.setMontant(montant);
		o.setEmploye(e);
		o.setDateOperation(new Date());
	    o.setCompte(c);
	    operationRepository.save(o);
	    c.setSolde(c.getSolde()-montant);
		return true;
		
	}

	@Override
	public boolean virer(String code1, String code2, double montant, Long employeId) {
         retirer(code1, montant, employeId);
         verser(code2, montant, employeId);
		return true;
	}

	@Override
	public OperationPage getOperations(String codeCompte, int numpage, int size) {
		// TODO Auto-generated method stub
		
		Page<Operation> ops=operationRepository.getOpretationByCompte(codeCompte, new PageRequest(numpage,size));
		
		OperationPage op= new OperationPage();
		op.setOperations(ops.getContent());
		op.setCurrentPage(ops.getNumber());
		op.setNbreOperations(ops.getNumberOfElements());
		op.setTotalPages(ops.getTotalPages());
		return op;
	}

}
