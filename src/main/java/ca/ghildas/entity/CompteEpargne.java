package ca.ghildas.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

@Entity
@DiscriminatorValue("CE")
@XmlType(name="CE")
public class CompteEpargne  extends Compte{

	private double tauxInteret;
	public CompteEpargne() {
		// TODO Auto-generated constructor stub
	}
	public double getTauxInteret() {
		return tauxInteret;
	}
	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
	public CompteEpargne(String numCompte, Date dateCreation, double solde, Client client, double tauxInteret) {
		super(numCompte, dateCreation, solde);
		this.tauxInteret=tauxInteret;
		// TODO Auto-generated constructor stub
	}
	
	

}
