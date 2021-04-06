package org.fatec.l1b.db;

import java.util.List;
import java.util.Optional;

import org.fatec.l1b.mobel.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	List<Pessoa> findAll();

	
}
