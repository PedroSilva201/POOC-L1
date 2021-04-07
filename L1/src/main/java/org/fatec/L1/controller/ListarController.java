package org.fatec.L1.controller;

import java.util.List;
import java.util.Optional;

import org.fatec.l1b.db.PessoaRepository;
import org.fatec.l1b.mobel.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;





@Controller

public class ListarController {
	@Autowired
	private PessoaRepository pr;
	
	@GetMapping("/listar-clientes")
	public ModelAndView listarPessoas() {
		List<Pessoa> pessoas = pr.findAll();
		ModelAndView mv = new ModelAndView("listar");
		mv.addObject("pessoas",pessoas);
		return mv;
	}
	@GetMapping("/listar-cliente{id}")
	public ModelAndView listarCliente(long id) {
	    Optional<Pessoa> pessoa = pr.findById(id);
		ModelAndView mv = new ModelAndView("listar");
		mv.addObject("pessoas",pessoa);
		return mv;
	}
}
