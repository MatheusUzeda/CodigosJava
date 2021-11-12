package br.com.desafio.form;

import org.hibernate.validator.constraints.br.CNPJ;

public class ClienteForm {

	private Long primeiraPergunta;

	private Long segundaPergunta;

	private Long terceiraPergunta;

	private Long primeiraResposta;

	private Long segundaResposta;

	private Long terceiraResposta;

	public Long getPrimeiraPergunta() {
		return primeiraPergunta;
	}

	public void setPrimeiraPergunta(Long primeiraPergunta) {
		this.primeiraPergunta = primeiraPergunta;
	}

	public Long getSegundaPergunta() {
		return segundaPergunta;
	}

	public void setSegundaPergunta(Long segundaPergunta) {
		this.segundaPergunta = segundaPergunta;
	}

	public Long getTerceiraPergunta() {
		return terceiraPergunta;
	}

	public void setTerceiraPergunta(Long terceiraPergunta) {
		this.terceiraPergunta = terceiraPergunta;
	}

	public Long getPrimeiraResposta() {
		return primeiraResposta;
	}

	public void setPrimeiraResposta(Long primeiraResposta) {
		this.primeiraResposta = primeiraResposta;
	}

	public Long getSegundaResposta() {
		return segundaResposta;
	}

	public void setSegundaResposta(Long segundaResposta) {
		this.segundaResposta = segundaResposta;
	}

	public Long getTerceiraResposta() {
		return terceiraResposta;
	}

	public void setTerceiraResposta(Long terceiraResposta) {
		this.terceiraResposta = terceiraResposta;
	}

	@CNPJ(message = "Cnpj Inválido")
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}
}
