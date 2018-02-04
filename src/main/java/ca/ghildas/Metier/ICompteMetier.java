package ca.ghildas.Metier;

import ca.ghildas.entity.Compte;

public interface ICompteMetier {

	public Compte saveCompte(Compte c);
	public Compte getCompteById(String code);
}
