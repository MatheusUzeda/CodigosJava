package br.com.desafio.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.desafio.modelo.Perguntas;

public class PerguntasDto {

	private String pergunta;
	private List<RespostaDto> respostas;

	public PerguntasDto() {

	}

	public PerguntasDto(Perguntas perguntas) {
		this.pergunta = perguntas.getPergunta();
		RespostaDto resposta = new RespostaDto(perguntas);
		this.respostas = resposta.converter(perguntas.getRespostas());
	}

	public static List<PerguntasDto> converter(List<Perguntas> perguntas) {
		return perguntas.stream().map(PerguntasDto::new).collect(Collectors.toList());
	}

	public String getPergunta() {
		return pergunta;
	}

	public List<RespostaDto> getRespostas() {
		return respostas;
	}

}
