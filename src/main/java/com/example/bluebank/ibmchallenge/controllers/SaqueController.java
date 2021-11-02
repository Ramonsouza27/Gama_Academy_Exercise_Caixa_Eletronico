package com.example.bluebank.ibmchallenge.controllers;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.bluebank.ibmchallenge.entities.Saque;
import com.example.bluebank.ibmchallenge.services.SaqueService;


@RestController
@RequestMapping("/saque")
public class SaqueController {
	
	@Autowired
	private SaqueService service;
	
	@GetMapping
	public ResponseEntity<Page<Saque>> findAll(Pageable pageable){	
		
		return  ResponseEntity.ok(service.findAll(pageable));
	}
	
	@PostMapping
	public ResponseEntity<Saque> add(@RequestBody Saque saque, UriComponentsBuilder uriBuilder) {
		var retorno = service.add(saque);
		URI uri = uriBuilder.path("/cars/{id}").buildAndExpand(retorno.getId()).toUri();
		return ResponseEntity.created(uri).body(retorno);    
	}
	
}