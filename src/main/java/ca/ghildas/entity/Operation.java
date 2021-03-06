package ca.ghildas.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(length=1)
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include=JsonTypeInfo.As.PROPERTY,property="type")
@JsonSubTypes({
	
	@Type(name="R", value=Retrait.class),
	@Type(name="V", value=Versement.class)
})
@XmlSeeAlso(
		{Versement.class, Retrait.class}	
	)	
public  abstract class Operation  implements Serializable{
public Long getNumOperation() {
		return numOperation;
	}
	public void setNumOperation(Long numOperation) {
		this.numOperation = numOperation;
	}
	public Date getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	@JsonIgnore
	@XmlTransient
	public Compte getCompte() {
		return compte;
	}
	@JsonSetter
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	@JsonIgnore
	@XmlTransient
	public Employe getEmploye() {
		return employe;
	}
	@JsonSetter
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
@Id
@GeneratedValue
	private Long numOperation;
	private Date dateOperation;
	private double montant;
	@ManyToOne
	@JoinColumn(name="code_compte")
	private Compte compte;
	@ManyToOne
	@JoinColumn(name="code_employe")
	private Employe employe;
	public Operation() {
		// TODO Auto-generated constructor stub
	}

}
