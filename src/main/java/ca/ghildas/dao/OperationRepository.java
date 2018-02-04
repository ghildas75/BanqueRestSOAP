package ca.ghildas.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import ca.ghildas.entity.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long> {
@Query("select o from Operation o where o.compte.numCompte=:x")
	public Page<Operation> getOpretationByCompte(@Param("x")String code,Pageable page);
   // public Page<Operation> findByCompte(Compte c, Pageable page);
}
