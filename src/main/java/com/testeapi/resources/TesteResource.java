package com.testeapi.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteResource {

	@GetMapping
	public String getFirstEndPoint() {
		return "Você acesso o diretório raiz";
	}

	@GetMapping(value = "/oi")
	public String getOi() {
		return "Oi Pessoal";
	}

	@GetMapping("/ola")
	public String getOla() {
		return "Olá Pessoal";
	}

}
