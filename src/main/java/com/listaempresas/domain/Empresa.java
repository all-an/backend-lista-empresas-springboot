package com.listaempresas.domain;

import java.util.Objects;

public class Empresa {
	
	private Integer id;
	private String nome;
	private String descricao;
	
	private RamoDeAtividade ramoDeAtividade;

	public Empresa() {
	}

	public Empresa(Integer id, String nome, String descricao, RamoDeAtividade ramoDeAtividade) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.ramoDeAtividade = ramoDeAtividade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public RamoDeAtividade getRamoDeAtividade() {
		return ramoDeAtividade;
	}

	public void setRamoDeAtividade(RamoDeAtividade ramoDeAtividade) {
		this.ramoDeAtividade = ramoDeAtividade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
