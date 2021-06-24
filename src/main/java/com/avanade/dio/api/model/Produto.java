package com.avanade.dio.api.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "PRODUTOS")
public class Produto {

	@Id
	private Integer codigo;
	private String descricao;
	private LocalDate dataValidade;
	private String ean;
	private Boolean indInativo;

	public Produto(Integer codigo, String descricao, LocalDate dataValidade, String ean, Boolean indInativo) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.dataValidade = dataValidade;
		this.ean = ean;
		this.indInativo = indInativo;
	}

	public Produto(String descricao, LocalDate dataValidade, String ean, Boolean indInativo) {
		super();
		this.descricao = descricao;
		this.dataValidade = dataValidade;
		this.ean = ean;
		this.indInativo = indInativo;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", dataValidade=" + dataValidade + ", ean="
				+ ean + ", indInativo=" + indInativo + "]";
	}

}