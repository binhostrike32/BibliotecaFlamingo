package br.com.flamingo.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "Livro")
public class Livro {
	
	@Id
	@Column(name="tombo_livro")
	private String tomboCircular;
	
	@Id
	@Column(name="ISBN_livro")
	private int ISBN;
	
	@Column(name = "titulo_livro")
	@NotEmpty(message = "*Por favor, forneça o título do livro!")
	private String titulo;
	
	@Column(name = "autor_livro")
	@NotEmpty(message = "*Por favor, forneça o autor do livro!")
	private String autor;
	
	@Column(name = "edicao_livro")
	@NotEmpty(message = "*Por favor, forneça a edição do livro!")
	private String edicao;
	
	@Column(name = "ano_livro")
	@NotEmpty(message = "*Por favor, forneça o ano do livro!")
	private String ano;
	
	@Column(name = "quantidade_paginas")
	@NotEmpty(message = "*Por favor, forneça a quantidade de páginas do livro!")
	private String quantidadePaginas;
	
	@Column(name = "genero_livro")
	@NotEmpty(message = "*Por favor, forneça o gênero do livro!")
	private String genero;
	
	public String getTomboCircular() {
		return tomboCircular;
	}
	public void setTomboCircular(String tomboCircular) {
		this.tomboCircular = tomboCircular;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getQuantidadePaginas() {
		return quantidadePaginas;
	}
	public void setQuantidadePaginas(String quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
}
