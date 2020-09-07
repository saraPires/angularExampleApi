package com.algaworks.comercial.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.algaworks.comercial.model.Oportunidade;
import com.algaworks.comercial.repository.OportunidadeRepository;

@CrossOrigin
@RestController
@RequestMapping("/oportunidades")
public class OportunidadeController {
	
	@Autowired
	private OportunidadeRepository oportunidadeRepository;
	
   @GetMapping
   public List<Oportunidade> listar() {
	   return oportunidadeRepository.findAll();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<Oportunidade> buscar(@PathVariable Long id){
	   Optional<Oportunidade> oportunidade = oportunidadeRepository.findById(id);
	   if (oportunidade.isEmpty()) {
		   return ResponseEntity.notFound().build();
	   }
	   
	   return ResponseEntity.ok(oportunidade.get());
   }
   
   @PostMapping
   public Oportunidade adicionar(@RequestBody Oportunidade oportunidade) {
	   return oportunidadeRepository.save(oportunidade);
   }
   
}
