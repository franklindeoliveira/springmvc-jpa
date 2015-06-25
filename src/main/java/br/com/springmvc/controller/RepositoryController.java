package br.com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.springmvc.servicos.Servico1;

@Controller
public class RepositoryController {
	
	@Autowired
	private Servico1 servico;

	@RequestMapping("/repository")
	public String conexaoEstabelecida() {
		servico.testeCrud();
		return "home";
	}

}