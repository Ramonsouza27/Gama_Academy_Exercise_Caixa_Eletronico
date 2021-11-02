package com.example.bluebank.ibmchallenge.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.bluebank.ibmchallenge.entities.Nota;
import com.example.bluebank.ibmchallenge.entities.Saque;
import com.example.bluebank.ibmchallenge.repositories.SaqueRepository;

@Service
public class SaqueService {
	
	@Autowired
	private SaqueRepository repository;
	
	public Saque add(Saque saque) {
		List<Nota> notas = new ArrayList<Nota>();
		Double valor = saque.getValor();
		int nota100 =0;
		int nota50 =0;
		int nota20 =0;
		int nota10 =0;
		int nota5 =0;
		
		while(valor-100d>=0d) {
			nota100++;
			valor-=100;
		}	
		if(nota100>0)notas.add(new Nota(100d,nota100));
		
		while(valor-50>=0d) {
			nota50++;
			valor-=50;
		}	
		if(nota50>0)notas.add(new Nota(50d,nota50));
			
		while(valor-20>=0d) {
			nota20++;
			valor-=20;
		}		
		if(nota20>0)notas.add(new Nota(20d,nota20));
		
		while(valor-10>=0d) {
			nota10++;
			valor-=10;
		}	
		if(nota10>0)notas.add(new Nota(10d,nota10));
		
		while(valor-5>=0d) {
			nota5++;
			valor-=5;
		}	
		if(nota5>0)notas.add(new Nota(5d,nota5));
		
		notas.forEach(nota->System.out.println(nota.qtd+" de "+nota.valor));
		
		repository.save(saque);	
		return saque;
	}
	
	public Page<Saque> findAll(Pageable pageable){ 
		
		int size = pageable.getPageSize();
	
		if(pageable.getPageSize() > 10) size = 10;
		else if(pageable.getPageSize() < 0) size = 0;
		
		Pageable _p = PageRequest.of(pageable.getPageNumber(), size,pageable.getSort());
		
		return repository.findAll(_p);
	}
}
