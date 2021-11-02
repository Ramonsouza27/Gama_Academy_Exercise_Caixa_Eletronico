package com.example.bluebank.ibmchallenge.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Saque {
	
	@Id
	private UUID id;
	private Double valor;
	private LocalDateTime data;
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public UUID getId() {
		return id;
	}
	
	public Saque () {
		this.id = UUID.randomUUID();
		this.data = LocalDateTime.now();
		this.valor = 200d;
	}
	
	public Saque (Double valor) {
		this.id = UUID.randomUUID();
		this.data = LocalDateTime.now();
		this.valor = valor;
	}

}
