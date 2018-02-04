package ca.ghildas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.ghildas.entity.Groupe;

public interface GroupeRepositoy extends JpaRepository<Groupe,Long> {

}
