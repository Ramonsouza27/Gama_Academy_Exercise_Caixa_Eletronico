package com.example.bluebank.ibmchallenge.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.bluebank.ibmchallenge.entities.Nota;

public class SaqueDto {
	public UUID id;
	public Double valor;
	public List<Nota> notas = new ArrayList<Nota>();
	
	public SaqueDto (UUID id, Double valor, List<Nota> notas) {
		this.id = id;
		this.valor = valor;
		this.notas = notas;
	}
}
