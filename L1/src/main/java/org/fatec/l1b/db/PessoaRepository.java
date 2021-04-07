package org.fatec.l1b.db;

import org.fatec.l1b.mobel.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	
}
