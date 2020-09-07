package com.algaworks.comercial.repository;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.comercial.model.Oportunidade;

public interface OportunidadeRepository extends JpaRepository<Oportunidade, Long> {
	
	//Optional<Oportunidade> findByDescricaoAndNomeProspecto(Long id, String descricao,
	//		String nomeProspecto, BigDecimal valor);

}
