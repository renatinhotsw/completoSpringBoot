package com.casadocodigo.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.casadocodigo.loja.models.Produto;

@Controller
public class ProdutosController {
	
	
	
	
	@RequestMapping("/produtos")
	public String save(Produto prod) {
		System.out.println("Cadastrando o produto "+prod);
		return "produtos/ok";
	}
	
	@RequestMapping("produtos/form")
	public String form() {
		return "produtos/form";
	}
}
