package com.example.bluebank.ibmchallenge.factories;

import java.util.ArrayList;
import java.util.List;

import com.example.bluebank.ibmchallenge.dto.SaqueDto;
import com.example.bluebank.ibmchallenge.entities.Nota;
import com.example.bluebank.ibmchallenge.entities.Saque;

public class SaqueFactory {
	
	public static SaqueDto Create (Saque saque, List<Nota> nota) {
		return new SaqueDto (saque.getId(), saque.getValor(), nota);
	}
}
