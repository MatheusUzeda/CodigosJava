package br.com.desafio.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.desafio.modelo.Perguntas;
import br.com.desafio.modelo.Resposta;

public class RespostaDto {
	private String respostas;

	public RespostaDto() {

	}

	public RespostaDto(Resposta resposta) {
		this.respostas = resposta.getResposta();
	}

	public RespostaDto(Perguntas perguntas) {
		perguntas.getRespostas();
	}

	public String getResposta() {
		return respostas;
	}

	public List<RespostaDto> converter(List<Resposta> perguntas) {
		return perguntas.stream().map(RespostaDto::new).collect(Collectors.toList());

	}

}
