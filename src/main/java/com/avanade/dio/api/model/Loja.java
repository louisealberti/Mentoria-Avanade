package com.avanade.dio.api.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "LOJAS")
public class Loja {

	@Id
	private Integer codigo;
	private String nome;
	private Boolean indInativo;

	@JsonManagedReference // Evita loop infinito
	@OneToMany(mappedBy = "codigoFilial")
	private List<Estoque> estoque;

	public Loja(Integer codigo, String nome, Boolean indInativo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.indInativo = indInativo;
	}

	public Loja(String nome, Boolean indInativo) {
		super();
		this.nome = nome;
		this.indInativo = indInativo;
	}

	@Override
	public String toString() {
		return "Loja [codigo=" + codigo + ", nome=" + nome + ", indInativo=" + indInativo + "]";
	}

}