package br.com.desafio.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Cliente {
	@Id
	private String cnpj ;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
