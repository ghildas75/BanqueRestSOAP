package ca.ghildas.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

@Entity
@DiscriminatorValue("V")
@XmlType(name="V")
public class Versement extends Operation {

	public Versement() {
		// TODO Auto-generated constructor stub
	}

}
