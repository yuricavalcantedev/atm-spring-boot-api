package br.com.teste.atm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.teste.atm.model.ATM;

@Repository
public interface ATMRepository extends JpaRepository<ATM, Long>  {
	
	ATM findById(long id);
		
}