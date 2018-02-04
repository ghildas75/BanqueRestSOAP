package ca.ghildas.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

@Entity
@DiscriminatorValue("R")
@XmlType(name="R")
public class Retrait extends Operation{

	public Retrait() {
		// TODO Auto-generated constructor stub
	}

}
