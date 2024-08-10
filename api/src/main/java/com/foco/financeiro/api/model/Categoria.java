package com.foco.financeiro.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "categoria")
public class Categoria {

	@Id
	private Long id;
	private String nome;
	private String descricao;
	private Boolean indRenda;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getIndRenda() {
		return indRenda;
	}

	public void setIndRenda(Boolean indRenda) {
		this.indRenda = indRenda;
	}

}
