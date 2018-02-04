package ca.ghildas.Metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.ghildas.dao.EmployeRepository;
import ca.ghildas.entity.Employe;
@Service
public class EmployeMetierImpl implements IEmployeMetier {
@Autowired
private EmployeRepository employeRepository;
	@Override
	public Employe saveEmploye(Employe e) {
		// TODO Auto-generated method stub
		return employeRepository.save(e);
	}

	@Override
	public List<Employe> getAllEmploye() {
		// TODO Auto-generated method stub
		return employeRepository.findAll();
	}

	

}
