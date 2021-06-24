package com.avanade.dio.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@IdClass(PrecoId.class)
public class Preco {
	@Id
	private Integer codigo;
	private Long valor;
	private Date dataInicio;
	private Date dataFim;
	private Boolean indInativo;

	@Id
	@JsonBackReference // Evita loop infinito
	@ManyToOne
	@JoinColumn(name = "CODIGO_FILIAL", nullable = false)
	private Produto codigoProduto;

	public Preco(Integer codigo, Long valor, Date dataInicio, Date dataFim, Boolean indInativo) {
		super();
		this.codigo = codigo;
		this.valor = valor;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.indInativo = indInativo;
	}

	@Override
	public String toString() {
		return "Preco [codigo=" + codigo + ", valor=" + valor + ", indInativo=" + indInativo + ", dataInicio="
				+ dataInicio + ", dataFim=" + dataFim + "]";
	}

}