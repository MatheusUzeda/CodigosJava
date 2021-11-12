package br.com.desafio.controller.business;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafio.form.ClienteForm;
import br.com.desafio.modelo.Resposta;
import br.com.desafio.repository.RespostasRepository;

	@Service
public class ValidacaoBusiness {
	
	@Autowired
	RespostasRepository respostasRepository;

	public  String validaEmprestimo(ClienteForm cliente) {
		int primeira = 0;
		int segunda = 0;
		int terceira = 0;
		String resposta;
		String crescimentoDificuldades;
		Optional<Resposta> primeiraResposta = respostasRepository.findById(cliente.getPrimeiraResposta());
		primeira = primeiraResposta.get().getValor();
		Optional<Resposta> segundaResposta = respostasRepository.findById(cliente.getSegundaResposta());
		segunda = segundaResposta.get().getValor();
		Optional<Resposta> terceiraResposta = respostasRepository.findById(cliente.getTerceiraResposta());
		terceira = terceiraResposta.get().getValor();
		if (primeira + segunda + terceira >= 2) {
			resposta = "Elegível, ";
		} else {
			resposta = "Não elegível, ";
		}
		if (primeira >= 0 && segunda >= 0 && terceira >= 0 || primeira >= 0 && segunda >= 0 && terceira < 0
				|| primeira >= 0 && segunda < 0 && terceira >= 0 || primeira < 0 && segunda >= 0 && terceira >= 0) {

			crescimentoDificuldades = "crescimento(2)";
		} else {
			crescimentoDificuldades = "dificuldades(2)";
		}
		return resposta + crescimentoDificuldades;
	}
}
