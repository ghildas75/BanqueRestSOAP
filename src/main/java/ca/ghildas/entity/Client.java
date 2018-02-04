package ca.ghildas.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Client implements Serializable {
@Id
@GeneratedValue (strategy=GenerationType.AUTO)
	private Long clientID;
	private String name;
	@OneToMany(mappedBy="client")
	private Collection<Compte> comptes;
	public Client() {
		// TODO Auto-generated constructor stub
	}
	
	public Client(String name) {
		super();
		this.name = name;
		
	}

	public Long getClientID() {
		return clientID;
	}
	public void setClientID(Long clientID) {
		this.clientID = clientID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JsonIgnore
	@XmlTransient
	public Collection<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	

}
