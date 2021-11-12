package br.com.desafio.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.controller.dto.PerguntasDto;
import br.com.desafio.form.ClienteForm;
import br.com.desafio.repository.PerguntasRepository;

@RestController
@RequestMapping("/lista")
public class ListaPerguntaRespostaController {
	@Autowired
	PerguntasRepository perguntasRepository;

	@PostMapping
	public List<PerguntasDto> valida(@RequestBody @Valid ClienteForm cliente) {
		return PerguntasDto.converter(perguntasRepository.findAll());
	}
}
