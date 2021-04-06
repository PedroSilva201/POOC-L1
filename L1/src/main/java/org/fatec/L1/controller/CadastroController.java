package org.fatec.L1.controller;

import org.fatec.l1b.db.PessoaRepository;
import org.fatec.l1b.mobel.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class CadastroController {
	@Autowired
	private PessoaRepository pr;
	
	@GetMapping("/cadastrar")
	public String paginaCadastro() {
		return "cadastro";
	}
	
	@PostMapping("/cadastrar")
	public String paginaCadastro(Pessoa p) {
		pr.save(p);
		return "cadastro";
	}
}
