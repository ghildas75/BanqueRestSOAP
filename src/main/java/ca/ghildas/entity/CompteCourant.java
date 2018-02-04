package ca.ghildas.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

@Entity
@DiscriminatorValue("CC")
@XmlType(name="CC")
public class CompteCourant extends Compte {
private double decouvert;
	public CompteCourant() {
		// TODO Auto-generated constructor stub
	}
	
	public double getDecouvert() {
		return decouvert;
	}
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public CompteCourant(String numCompte, Date dateCreation, double solde, Client client, double decouvert) {
		super(numCompte, dateCreation, solde);
		this.decouvert=decouvert;
		// TODO Auto-generated constructor stub
	}

}
