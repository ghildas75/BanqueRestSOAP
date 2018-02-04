package ca.ghildas.Metier;

public interface IOperationMetier {

	public boolean verser(String code, double montant,Long employeId);
	public boolean retirer(String code, double montant,Long employeId);
	public boolean virer(String code1, String code2, double montant,Long employeId);
	public OperationPage getOperations(String codeCompte, int page,int size);
}
