package ca.ghildas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ca.ghildas.Metier.IEmployeMetier;
import ca.ghildas.entity.Employe;

@RestController
public class EmployeRestService {
@Autowired
private IEmployeMetier employeMetier;
@PostMapping(value="/employes")
public Employe saveEmploye(@RequestBody Employe e) {
	return employeMetier.saveEmploye(e);
}
@GetMapping(value="/employes")
public List<Employe> getAllEmploye() {
	return employeMetier.getAllEmploye();
}


	
}
