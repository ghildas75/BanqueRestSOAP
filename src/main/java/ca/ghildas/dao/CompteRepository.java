package ca.ghildas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.ghildas.entity.Compte;

public interface CompteRepository extends JpaRepository<Compte,String> {

}
