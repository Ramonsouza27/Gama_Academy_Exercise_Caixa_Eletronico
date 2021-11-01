package com.example.bluebank.ibmchallenge.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(tags = " BlueBank API ")
@RestController
@RequestMapping(path = "/teste", produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloWorldController {

	@GetMapping
	public String getHelloWorld() {
		return "Hello Word Teste";
	}

}
