package br.com.desafio.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.controller.business.ValidacaoBusiness;
import br.com.desafio.form.ClienteForm;

@RestController
@RequestMapping("/valida")
public class ValidacaoController {
	@Autowired
	ValidacaoBusiness validacaoBusiness;

	@PostMapping
	public String validaCliente(@RequestBody @Valid ClienteForm cliente) {

		return validacaoBusiness.validaEmprestimo(cliente);
	}
}
