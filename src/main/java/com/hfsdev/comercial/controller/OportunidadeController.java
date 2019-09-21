package com.hfsdev.comercial.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hfsdev.comercial.model.Oportunidade;
import com.hfsdev.comercial.repository.OportunidadeRepository;



@RestController
@RequestMapping("/oportunidades")
public class OportunidadeController {

	@Autowired
	private OportunidadeRepository oportunidade;
	
	@GetMapping
	public List<Oportunidade> listar() {
		
		return oportunidade.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Oportunidade> buscaPorId(@PathVariable Long id){
		return oportunidade.findById(id);
	}
}