package ca.ghildas.Metier;

import java.util.List;

import ca.ghildas.entity.Employe;

public interface IEmployeMetier {

public Employe saveEmploye(Employe e);
public List<Employe> getAllEmploye();

}
