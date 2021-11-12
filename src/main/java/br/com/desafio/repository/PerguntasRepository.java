package br.com.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafio.modelo.Perguntas;



public interface PerguntasRepository extends JpaRepository<Perguntas, Long> {

}
