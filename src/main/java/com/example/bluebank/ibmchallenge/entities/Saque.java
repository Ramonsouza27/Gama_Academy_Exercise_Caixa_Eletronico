package com.example.bluebank.ibmchallenge.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Saque {
	
	@Id
	private UUID id;
	@NotNull
	private Integer valor;
	private LocalDateTime data;
	
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
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
	}
	
	public Saque (Integer valor) {
		this.id = UUID.randomUUID();
		this.data = LocalDateTime.now();
		this.valor = valor;
	}

}
