package com.casadocodigo.loja.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String titulo;
	@Lob
	private String descricao;
	private int nropaginas;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getNropaginas() {
		return nropaginas;
	}
	public void setNropaginas(int nropaginas) {
		this.nropaginas = nropaginas;
	}
	
	public String toString() {
		String saida = "Titulo: "+titulo +
				       "Descrição: "+descricao +
				       "Número de páginas: "+nropaginas;
		
		return saida;
	}
}
