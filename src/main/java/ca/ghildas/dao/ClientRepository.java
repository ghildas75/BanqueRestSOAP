package ca.ghildas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.ghildas.entity.Client;

public interface ClientRepository  extends JpaRepository<Client, Long>{

	

}
