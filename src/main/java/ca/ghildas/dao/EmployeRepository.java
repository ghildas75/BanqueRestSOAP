package ca.ghildas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.ghildas.entity.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Long> {

}
