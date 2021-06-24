package com.avanade.dio.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.avanade.dio.api.model.Estoque;
import com.avanade.dio.api.model.Loja;
import com.avanade.dio.api.model.Produto;

public interface EstoqueRepository extends CrudRepository<Estoque, String> {

	public Estoque findByCodigoFilial(Integer códigoFilial);

	public Estoque findByCodigoProduto(Integer códigoProduto);

	public Estoque findByCodigoFilialAndCodigoProduto(Loja codigoFilial, Produto codigoProduto);

}
