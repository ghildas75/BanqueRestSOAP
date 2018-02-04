package ca.ghildas.Metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.ghildas.dao.CompteRepository;
import ca.ghildas.entity.Compte;
@Service
public class CompteMetierImpl implements ICompteMetier {
@Autowired
	private CompteRepository compteRepository;
	@Override
	public Compte saveCompte(Compte c) {
		// TODO Auto-generated method stub
		return compteRepository.save(c);
	}

	@Override
	public Compte getCompteById(String code) {
		// TODO Auto-generated method stub
		return compteRepository.findOne(code);
	}

	

}
