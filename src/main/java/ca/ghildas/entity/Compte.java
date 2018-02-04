package ca.ghildas.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_compte",discriminatorType=DiscriminatorType.STRING, length=2)
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include=JsonTypeInfo.As.PROPERTY,property="type")
@JsonSubTypes({
	
	@Type(name="CC", value=CompteCourant.class),
	@Type(name="CE", value=CompteEpargne.class)
})
@XmlSeeAlso(
		{CompteCourant.class, CompteEpargne.class}	
		
		)

public abstract class  Compte implements Serializable {
@Id
	private  String numCompte;
	private Date dateCreation;
	private  double solde;
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;
	@ManyToOne
	@JoinColumn(name="employe_id")
	private Employe employe;
	@OneToMany(mappedBy="compte")
	private Collection<Operation> operations;
	
	
	
	
	public String getNumCompte() {
		return numCompte;
	}




	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}




	public Date getDateCreation() {
		return dateCreation;
	}




	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}




	public double getSolde() {
		return solde;
	}




	public void setSolde(double solde) {
		this.solde = solde;
	}




	public Client getClient() {
		return client;
	}




	public void setClient(Client client) {
		this.client = client;
	}




	public Employe getEmploye() {
		return employe;
	}




	public void setEmploye(Employe employe) {
		this.employe = employe;
	}



    @JsonIgnore
    @XmlTransient
	public Collection<Operation> getOperations() {
		return operations;
	}




	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
	}




	public Compte() {
		// TODO Auto-generated constructor stub
	}




	public Compte(String numCompte, Date dateCreation, double solde){
		super();
		this.numCompte = numCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
	
	}
	

}
